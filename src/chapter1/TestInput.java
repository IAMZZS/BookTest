package chapter1;

import java.util.Scanner;

public class TestInput {
	public static void main(String[] args){
		int age;
		double weight;
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("������������Ƕ����ꣿ");
		age=scanner.nextInt();
		
		System.out.println("������������Ƕ��ٹ��");
		weight=scanner.nextDouble();
		
		System.out.println("���������"+age+"��,������"+weight+"���");
	}

}
