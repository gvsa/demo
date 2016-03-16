package demo;

public class DemoTest {
	
	public static void main(String args[]){
		String[] str1 = {"a","b","c"};
		String[] str2 = {"a"};
		ClassB newobj = new ClassB();

		System.out.println("main function");
//		System.out.println(newobj.check(true));
//		System.out.println("str1 1st object="+newobj.getFirst(str1));
//		System.out.println("str1 2nd object="+newobj.getSecond(str1));
//		System.out.println("str2 1st object="+newobj.getFirst(str2));
//		System.out.println("str2 2nd object="+newobj.getSecond(str2));
//		System.out.println("random msg: " + newobj.printme("sample msg");
		int strlength=newobj.getLength(newobj.getSecond(str2));
	}
	
}
