package chapter3;
																										
public class TestSwap {
	public static void main(String[] args){
		int i = 2;
		int j = 5;
		System.out.println("main�����У����÷���swap(int a,int b)ǰ��");
		System.out.println("i="+i+"\tj="+j);
		swap(i,j);
		System.out.println("main�����У����÷���swap(int a,int b)��");
		System.out.println("i="+i+"\tj="+j);
	}
	
	static void swap(int a,int b){
		int temp;
		System.out.println("swap�����У�����a��b��ֵ����ǰ��");
		System.out.println("a="+a+"\tb="+b);
		temp = a;
		a = b;
		b = temp;
		System.out.println("swap�����У�����a��b��ֵ������");
		System.out.println("a="+a+"\tb="+b);
	}
}
