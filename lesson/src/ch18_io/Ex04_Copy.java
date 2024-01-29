package ch18_io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class Ex04_Copy {

	public static void main(String[] args) throws Exception {
		String srcFile = "c:/Temp/suyu.jpg", dstFile = "c:/Temp/강아지.jpg";
		InputStream is = new FileInputStream(srcFile);
		OutputStream os = new FileOutputStream(dstFile);
		
		byte[] buffer = new byte[4096];
		while (true) {
			int num = is.read(buffer);
			if (num == -1)
				break;
			os.write(buffer, 0, num);
		}
		os.flush(); os.close(); is.close();
		System.out.println("Copy is done!");
	}

}
