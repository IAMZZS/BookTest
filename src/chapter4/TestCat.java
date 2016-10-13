package chapter4;

public class TestCat {
	public static void main(String[] args){
		System.out.println("调用类TextCat中的main方法");
		Cat cat = new Cat();
			cat.age = 2;
			cat.weight = 5;
			
			System.out.println("CAT");
			cat.meow();
			System.out.println("Age="+cat.age+"\tWeight="+cat.weight);
			System.out.println("\n在类TestCat中显式调用类中的main方法");
			cat.main(args);
	}
}
class Cat{
	int age;
	int weight;
	public static void main(String[] args){
		System.out.println("调用类Cat中的main方法");
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
