package mysql.sec01_basic;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class Ex04_Properties {

	public static void main(String[] args) {
		// 절대 경로
		Properties prop = new Properties(); // Map<String, String>
		String path = "C:/Users/ghghg/Documents/GitHub/JavaLecture-2024.01/lesson/src/mysql/mysql.properties";
		try {
			InputStream is = new FileInputStream(path);
			prop.load(is);
			is.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		String host = prop.getProperty("host");
		String port = prop.getProperty("port");
		String database = prop.getProperty("database");
		String user = prop.getProperty("user");
		String password = prop.getProperty("password");

		String connStr = "jdbcLmysql://" + host + ":" + port + "/" + database;
		System.out.println(connStr);
		System.out.println("DriverManager.getConnection(connStr, user, password);");
	}
}
