package java.Animal;

public abstract class AbstractPlant implements ILife {

	String name;

	@Override
	public void breathe() {
		System.out.println(name + "숨을 쉰다!");
	}

	@Override
	public void growth() {
		System.out.println(name + "숨을 쉰다!");
	}

	@Override
	public void light() {
		System.out.println(name + "광합성 한다!");
	}

}
