package practice;

public class Dog extends Animal {
	private String bark;
	
	// 생성자
		public Dog(String species,String name,int age, String bark ) {
			super(species,name,age);
			this.bark = bark;
		}
		
		public String makeSound(){
			return super.makeSound()+bark;
		}
		
}
