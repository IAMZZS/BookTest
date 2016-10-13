package chapter3;

public class ComputerArea {
	public static void main(String[] args){
	
	int length=10;
	int width=5;
	int area=area(length,width);
	System.out.println("length="+length+"width="+width+" area="+area);
	}
	
	static int area(int a,int b){
		return a*b;
	}
}
