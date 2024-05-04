package java.Animal;

public abstract class AbstractAnimal implements IAnimal {

	String name;
	
	@Override
	public void breathe() {
		System.out.println(name + "숨을 쉰다!");
	}

	@Override
	public void growth() {
		System.out.println(name + "성장한다!");
	}

	@Override
	public void eat() {
		System.out.println(name + "먹는다!");
	}

	@Override
	public void move() {
		System.out.println(name + "움직인다!");
	}
	
	@Override
	public void light() {
		
	}

}
