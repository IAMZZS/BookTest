package chapter2;

import java.util.Scanner;

public class TestSwitch {
	public static void main(String[] args){
		int score;
		Scanner scanner=new Scanner(System.in);
		
		System.out.print("请问您的成绩是多少？（0~100)");
		score=scanner.nextInt();
		
		if((score>100)||(score<0)){
			System.out.println("输入错误！");
		}
		else{
			switch(score/10){
				case 10:
				case 9:
					System.out.println("您的成绩是优！");
					break;
				case 8:
					System.out.println("您的成绩是良！");
					break;
				case 7:
				case 6:
					System.out.println("您的成绩是及格！");
					break;
					default:
						System.out.println("您的成绩是不及格，必须补考！");
						break;
			}
		}
	}

}
