package chapter2;

import java.util.Scanner;

public class TestSwitch {
	public static void main(String[] args){
		int score;
		Scanner scanner=new Scanner(System.in);
		
		System.out.print("�������ĳɼ��Ƕ��٣���0~100)");
		score=scanner.nextInt();
		
		if((score>100)||(score<0)){
			System.out.println("�������");
		}
		else{
			switch(score/10){
				case 10:
				case 9:
					System.out.println("���ĳɼ����ţ�");
					break;
				case 8:
					System.out.println("���ĳɼ�������");
					break;
				case 7:
				case 6:
					System.out.println("���ĳɼ��Ǽ���");
					break;
					default:
						System.out.println("���ĳɼ��ǲ����񣬱��벹����");
						break;
			}
		}
	}

}
