package ClassLoad;

public class TestEncrptFileClassLoader {
	public static void main(String[] args) throws Exception {
		//���ܺ��ֱ��ʹ�û����ClassFormatError�쳣
		
		/*FileSystemClassLoader loader=new FileSystemClassLoader("E:/javac");
		Class c=loader.findClass("copy-Hi");
		System.out.println(c);*/
		
		//ʹ��DecrptClassLoader�����������н��ܴ���
		DecrptClassLoader loader1=new DecrptClassLoader("E:/javac/temp");
		Class c1=loader1.findClass("Hi");
		System.out.println(c1);
		
	}

}
