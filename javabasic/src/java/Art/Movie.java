package java.Art;

public class Movie extends AbstractArt{

	Movie(String name) {
		this.name = name;
	}
	public void watch() {
		System.out.println("보다");
	}
}
