package chapter2;

public class TestFor {
	public static void main(String[] args){
		System.out.println("                                 ³Ë·¨¿Ú¾÷±í");
		System.out.println("-----------------------------");
		System.out.print(" |");
		
		for(int i=1;i<10;i++){
			System.out.print("  "+i);
		}
		System.out.println("\n-----------------------------");
		
		for(int i=1;i<10;i++){
			System.out.print(i+"|");
			for(int j=1;j<10;j++){
				if(i*j<10){
					System.out.print("  "+i*j);
				}else{
					System.out.print(" "+i*j);
				}
			}
			System.out.println();
		}
	}

}
