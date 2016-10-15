package chapter3;

import java.util.Scanner;

public class HanoiTower {
	public static void main(String[] args){
		int num;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("请输入金币的个数：");
		num = scanner.nextInt();
		
		hanoi('A','C','B',num);
	}
	
	static void hanoi(char from,char to,char temp,int n){
		if(n == 1){
			System.out.println(from+" muve to "+to);
			System.out.println("1"+from+to+temp+n);
		}else{
			System.out.println("2"+from+to+temp+n);
			hanoi(from,temp,to,n-1);
			System.out.println(from+" move to "+to);
			System.out.println("3"+from+to+temp+n);
			hanoi(temp,to,from,n-1);
		}
	}

}




