package chapter2;

import java.util.Scanner;

public class TestIfElse {
	public static void main(String[] args){
		int score;
		Scanner scanner=new Scanner(System.in);
				
		System.out.print("�������ĳɼ��Ƕ��٣���0~100��");
		score=scanner.nextInt();
		
		if((score>100)||(score<0))
			System.out.println("�������!");
		else if(score>=90)
			System.out.println("���ĳɼ����ţ�");
		else if(score>=80)
			System.out.println("���ĳɼ�������");
		else if(score>=60)
			System.out.println("���ĳɼ��Ǽ���");
		else
			System.out.println("���ĳɼ��ǲ����񣬱��벹����");
	}

}
