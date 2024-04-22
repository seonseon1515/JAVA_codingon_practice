package practice;

public class Animal {
	private String species;
	protected String name;
	private int age;

	public Animal(String species,String name,int age) {
		this.species = species;
		this.name = name;
		this.age = age;
	}
	


	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}




	public String makeSound(){
		return species+" "+ age +"세, "+name+ "(이)가" + " 동물 소리를 낸다.";
	}
	
}
