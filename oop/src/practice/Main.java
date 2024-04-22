package practice;

public class Main {

	public static void main(String[] args) {
		
		Cat cat = new Cat("고양이","캣캣이",10,"야용야옹");
		Dog dog = new Dog("강아지","갱갱이",10,"왈왕로아");
		
		System.out.println(cat.makeSound());
		System.out.println(dog.makeSound());
		
		
	}

}
