package mysql.sec03_song;

import java.util.List;

public class Main {

	public static void main(String[] args) {
		SongDao songDao = new SongDao();
		
		Song song = songDao.getSongBySid(102);
		System.out.println(song);
		
//		song = songDao.getSongByTitle("Gee");
//		System.out.println(song);
//		System.out.println("=====================================================================================");
//		
//		List<Song> list = songDao.getSongListAll();
		
//		song = new Song(117, "비행기", "비행기를 타고가요");
//		songDao.insertSong(song);

//		song = songDao.getSongBySid(118);
//		song.setTitle("주문");
//		song.setLyrics("넌 내게 빠져");
//		songDao.updateSong(song);
//
//		songDao.deleteSong(119);
//		
//		list = songDao.getSongListByLyrics("뉴예삐오");
//		list.forEach(x -> System.out.println(x));
		
		
		
		
		
		
		
	}

}
