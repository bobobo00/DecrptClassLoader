package ClassLoad;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class EncrptUtil {
	public static void main(String[] args) {
		encrpt(new File("E:/javac/Hi.class"),new File("E:/javac/temp/Hi.class"));
		
	}
	public static void encrpt(File src,File dest) {
		FileInputStream fis=null;
		FileOutputStream fos=null;
		
		try {
			fis=new FileInputStream(src);
			fos=new FileOutputStream(dest);
			int temp=-1;
			while((temp=fis.read())!=-1) {
				fos.write(temp^0xff);
			}
			fos.flush();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				if (null != fis) {
					fis.close();
				} 
			} catch (Exception e2) {
				// TODO: handle exception
			}
			try {
				if (null != fos) {
					fos.close();
				} 
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
}
