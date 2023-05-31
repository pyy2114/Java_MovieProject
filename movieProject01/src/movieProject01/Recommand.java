package movieProject01;

import java.util.ArrayList;

public class Recommand {

	Movie m = new Movie();
	
	ArrayList<Movie> movieList = m.getMList();
	ArrayList<String> genreList = m.getGList();
	
	public Recommand() {
		
	}
	
	public void recommand(int num) {	
		System.out.println("\n선택하신 장르의 영화 목록입니다.");
		for(Movie m : movieList) {
			if((genreList.get(num-1) == m.genre[0])||(genreList.get(num-1) == m.genre[1])){
				System.out.println(m);
			}
		}
		System.out.println();
	}
}
