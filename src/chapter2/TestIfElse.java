package chapter2;

import java.util.Scanner;

public class TestIfElse {
	public static void main(String[] args){
		int score;
		Scanner scanner=new Scanner(System.in);
				
		System.out.print("请问您的成绩是多少？（0~100）");
		score=scanner.nextInt();
		
		if((score>100)||(score<0))
			System.out.println("输入错误!");
		else if(score>=90)
			System.out.println("您的成绩是优！");
		else if(score>=80)
			System.out.println("您的成绩是良！");
		else if(score>=60)
			System.out.println("您的成绩是及格！");
		else
			System.out.println("您的成绩是不及格，必须补考！");
	}

}
