package chapter3;
																										
public class TestSwap {
	public static void main(String[] args){
		int i = 2;
		int j = 5;
		System.out.println("main方法中，调用方法swap(int a,int b)前：");
		System.out.println("i="+i+"\tj="+j);
		swap(i,j);
		System.out.println("main方法中，调用方法swap(int a,int b)后：");
		System.out.println("i="+i+"\tj="+j);
	}
	
	static void swap(int a,int b){
		int temp;
		System.out.println("swap方法中，变量a和b的值交换前：");
		System.out.println("a="+a+"\tb="+b);
		temp = a;
		a = b;
		b = temp;
		System.out.println("swap方法中，变量a和b的值交换后；");
		System.out.println("a="+a+"\tb="+b);
	}
}
