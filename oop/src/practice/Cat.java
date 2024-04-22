package practice;

public class Cat extends Animal{
	private String meow;
	
	public String getMeow() {
		return meow;
	}

	public void setMeow(String meow) {
		this.meow = meow;
	}

	// 생성자
	public Cat(String species,String name,int age, String meow) {
		super(species,name,age);
		this.meow = meow;
	}
	
	public String makeSound(){
		return super.makeSound()+meow + getName()+"protected 호출방법";
	}
	
	// 그냥 바로 private나 protected로 선언한 변수를 사용하지 말고 getName 이용하기!
	
	
}
