package ClassLoad;

public class TestEncrptFileClassLoader {
	public static void main(String[] args) throws Exception {
		//加密后的直接使用会出现ClassFormatError异常
		
		/*FileSystemClassLoader loader=new FileSystemClassLoader("E:/javac");
		Class c=loader.findClass("copy-Hi");
		System.out.println(c);*/
		
		//使用DecrptClassLoader加载器，进行解密处理。
		DecrptClassLoader loader1=new DecrptClassLoader("E:/javac/temp");
		Class c1=loader1.findClass("Hi");
		System.out.println(c1);
		
	}

}
