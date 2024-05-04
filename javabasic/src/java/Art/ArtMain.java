package java.Art;

public class ArtMain {

	public static void main(String[] args) {
		
		IArt drawing = new Drawing("그림");
		IArt music = new Music("음악");
		IArt movie = new Movie("영화");
		
		drawing.make();
		music.make();
		movie.make();
		
		drawing.fun();
		music.fun();
		movie.fun();
		
		
		
	}//main

}//class
