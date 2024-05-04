package java.Art;

public abstract class AbstractArt implements IArt{

	String name;
	
	@Override
	public void fun() {
		System.out.println(name + "은 재미있다.");

	}

	@Override
	public void make() {
		System.out.println(name + "를 만든다.");
	}
	
}
