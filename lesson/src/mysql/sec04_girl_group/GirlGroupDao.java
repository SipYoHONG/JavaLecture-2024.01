package mysql.sec04_girl_group;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class GirlGroupDao {
	private String connStr;
	private String user;
	private String password;
	private Connection conn;

	public GirlGroupDao() {
//		String path = "C:/Users/ghghg/Documents/GitHub/JavaLecture-2024.01/lesson/src/mysql/mysql.properties";
		String path = "C:/Users/human-02/Documents/GitHub/JavaLecture-2024.01/lesson/src/mysql/mysql.properties";
		try {
			Properties prop = new Properties();
			prop.load(new FileInputStream(path));

			String host = prop.getProperty("host");
			String port = prop.getProperty("port");
			String database = prop.getProperty("database");
			this.connStr = "jdbc:mysql://" + host + ":" + port + "/" + database;
			this.user = prop.getProperty("user");
			this.password = prop.getProperty("password");
			this.conn = DriverManager.getConnection(connStr, user, password);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void close() {
		try {
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public GirlGroup getGirlGroupByGid(int gid) {
		String sql = "select * from girl_group where gid=?";
		GirlGroup gg = new GirlGroup();
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, gid);

			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				gg.setGid(rs.getInt(1));
				gg.setName(rs.getString(2));
				// gg.setDebut(LocalDate)
				String debutStr = rs.getString(3); // yyyy-mm-dd
				gg.setDebut(LocalDate.parse(debutStr));
				gg.setHitSongId(rs.getInt(4));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return gg;
	}

	public GirlGroup getGirlGroupByName(String name) {
		String sql = "SELECT l.gid, l.name, l.debut, r.title FROM girl_group l" + " JOIN song r ON l.hit_song_id=r.sid"
				+ " WHERE l.name LIKE ?";
		GirlGroup gg = new GirlGroup();
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "%" + name + "%");

			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				gg.setGid(rs.getInt(1));
				gg.setName(rs.getString(2));
				gg.setDebut(LocalDate.parse(rs.getString(3)));
				gg.setHitSongTitle(rs.getString(4));
			}
			rs.close();
			pstmt.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return gg;
	}

	public List<GirlGroup> getGirlGroupByDebut(int fromYear, int toYear) {
		String sql = "SELECT l.gid, l.name, l.debut, r.title FROM girl_group l "
				+ " JOIN song r ON l.hit_song_id=r.sid " + " WHERE debut BETWEEN ? AND ? ";
		List<GirlGroup> list = new ArrayList<GirlGroup>();
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, fromYear + "-01-01");
			pstmt.setString(2, toYear + "-12-31");

			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				GirlGroup gg = new GirlGroup(rs.getInt(1), rs.getString(2), LocalDate.parse(rs.getString(3)),
						rs.getString(4));
				list.add(gg);
			}
			rs.close();
			pstmt.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return list;

	}

	public void insertGirlGroup(GirlGroup gg) {
		String sql = "insert into girl_group values(default, ?, ?, ?)";
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, gg.getName());
			pstmt.setString(2, gg.getDebut().toString());
			pstmt.setInt(3, gg.getHitSongId());

			pstmt.executeUpdate();
			pstmt.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}