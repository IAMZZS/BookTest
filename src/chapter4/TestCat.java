package chapter4;

public class TestCat {
	public static void main(String[] args){
		System.out.println("������TextCat�е�main����");
		Cat cat = new Cat();
			cat.age = 2;
			cat.weight = 5;
			
			System.out.println("CAT");
			cat.meow();
			System.out.println("Age="+cat.age+"\tWeight="+cat.weight);
			System.out.println("\n����TestCat����ʽ�������е�main����");
			cat.main(args);
	}
}
class Cat{
	int age;
	int weight;
	public static void main(String[] args){
		System.out.println("������Cat�е�main����");
		Cat cat = new Cat();
		cat.age = 1;
		cat.weight = 2;
		System.out.println("CAT");
		cat.meow();
		System.out.println("Age="+cat.age+"\tWeight="+cat.weight);
	}
	
	void meow(){
		System.out.println("Meow...");
	}
}
