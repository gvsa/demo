package demo;

public class ClassB extends ClassA {

	public ClassA check(boolean param){
		ClassA a= new ClassA();
		return a;
	}
	
	public String getSecond(String[] param){
		return param[1];
	}

	public static void show(){
		System.out.println("Show() called statically");
	}
	
	public int getLength(String param) throws Exception {
		
		if(param==null || param.equals("")){
			throw new Exception("null/empty String passed");
		}else{
			return param.trim().length();
		}
	}
	
}
