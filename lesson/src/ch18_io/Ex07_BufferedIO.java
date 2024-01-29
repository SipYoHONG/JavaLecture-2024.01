package ch18_io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Ex07_BufferedIO {

	public static void main(String[] args) throws Exception {
		// bufferedIO를 쓴것과 안쓴것 비교

		// Case 1) 미사용
		InputStream is = new FileInputStream("c:/Temp/bigben.jpg");
		OutputStream os = new FileOutputStream("c:/Temp/빅벤.jpg");
		
		long noBufferTime = copy(is, os);
		System.out.println("버퍼 미사용" + noBufferTime + " ns");	// 1.13초
		is.close(); os.close();
		
		// Case 2) 사용
		is = new BufferedInputStream(new FileInputStream("c:/Temp/bigben.jpg"));
		os = new BufferedOutputStream(new FileOutputStream("c:/Temp/빅벤.jpg"));
		
		long BufferTime = copy(is, os);
		System.out.println("버퍼 미사용" + BufferTime + " ns");		//0.005초
		is.close(); os.close();
		
	}

	static long copy(InputStream is, OutputStream os) throws IOException {
		long startTime = System.nanoTime();
		// 1바이트씩 읽고 쓰기
		while (true) {
			int data = is.read();
			if (data == -1)
				break;
			os.write(data);
		}
		os.flush();
		long endTime = System.nanoTime();
		return endTime - startTime;
	}

}
