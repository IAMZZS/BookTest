package chapter4;

public class PassObject{
	public static void main(String[] args){
	Num1 n1 = new Num1();
	Num1 n2 = n1;
	int x = 10;
	n1.i = 0;
	System.out.println("调用方法method1前：n1.i="+n1.i+"\tx="+x);
	method1(n1,x);
	System.out.println("调用方法method1后：n1.i="+n1.i+"\tx="+x);
	System.out.println((n1==n2)?"n1和n2引用同一对象":"n1和n2引用不同对象");
	method2(n1);
	System.out.println("调用方法method2后：n1.i="+n1.i);
	System.out.println((n1==n2)?"n1和n2引用同一对象":"n1和n2引用不同对象");
	}
	static void method1(Num1 num,int y){
		num.i+=10;
		y--;
		System.out.println("退出方法method1时：num.i="+num.i+"\ty="+y);
	}
	static void method2(Num1 num){
		num = new Num1();
		num.i = 100;
		System.out.println("退出method2方法时：num.i="+num.i);
	}
}
class Num1{
	int i;
}
