package chapter4;

public class PassObject{
	public static void main(String[] args){
	Num1 n1 = new Num1();
	Num1 n2 = n1;
	int x = 10;
	n1.i = 0;
	System.out.println("���÷���method1ǰ��n1.i="+n1.i+"\tx="+x);
	method1(n1,x);
	System.out.println("���÷���method1��n1.i="+n1.i+"\tx="+x);
	System.out.println((n1==n2)?"n1��n2����ͬһ����":"n1��n2���ò�ͬ����");
	method2(n1);
	System.out.println("���÷���method2��n1.i="+n1.i);
	System.out.println((n1==n2)?"n1��n2����ͬһ����":"n1��n2���ò�ͬ����");
	}
	static void method1(Num1 num,int y){
		num.i+=10;
		y--;
		System.out.println("�˳�����method1ʱ��num.i="+num.i+"\ty="+y);
	}
	static void method2(Num1 num){
		num = new Num1();
		num.i = 100;
		System.out.println("�˳�method2����ʱ��num.i="+num.i);
	}
}
class Num1{
	int i;
}
