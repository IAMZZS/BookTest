package chapter1;

import java.util.Scanner;

public class TestInput {
	public static void main(String[] args){
		int age;
		double weight;
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("请问你的年龄是多少岁？");
		age=scanner.nextInt();
		
		System.out.println("请问你的体重是多少公斤？");
		weight=scanner.nextDouble();
		
		System.out.println("你的年龄是"+age+"岁,体重是"+weight+"公斤。");
	}

}
