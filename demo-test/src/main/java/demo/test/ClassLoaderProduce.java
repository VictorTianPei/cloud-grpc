package demo.test;

public class ClassLoaderProduce {
	static int d=3;
	static{
		System.out.println("我是ClassLoaderProduce类");
	}
	public static void main(String [] args){
		int b=0;
		String c="hello";
		//SimpleClass simpleClass=new SimpleClass();
		//simpleClass.run();
		System.out.println(SimpleClass.a + 40);
	}
}

class SimpleClass{
	static int  a=3;
	static{
		a=100;
		System.out.println(a);
	}

	public SimpleClass(){
		System.out.println("对类进行加载！");
	}

	public void run(){
		System.out.println("我要跑跑跑！");
	}
}