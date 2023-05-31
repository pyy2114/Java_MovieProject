package movieProject01;

import java.util.ArrayList;
import java.util.Arrays;

public class Movie {
	int movieNum = 0;
	String title;
	String[] genre = new String[2];

	private ArrayList<Movie> movies;
	private ArrayList<String> genres;	

	
	public Movie() {
	
		movies = new ArrayList<>();
		genres = new ArrayList<>();
		
		movies.add(new Movie(1,"범죄도시3","액션","범죄"));
		movies.add(new Movie(2,"분노의 질주","액션",""));
		movies.add(new Movie(3,"마리오 브라더스","애니메이션","어드벤쳐"));
		movies.add(new Movie(4,"인어공주","뮤지컬","드라마"));
		movies.add(new Movie(5,"가디언즈 오브 갤럭시","액션","코미디"));
		movies.add(new Movie(6,"아기공룡 둘리: 얼음별 대모험 리마스터링","애니메이션","어드벤쳐"));
		movies.add(new Movie(7,"슬픔의 삼각형","드라마","코미디"));
		movies.add(new Movie(8,"남은 인생의 10년","로맨스","멜로"));
		movies.add(new Movie(9,"존 윅4","액션",""));
		movies.add(new Movie(10,"드림","드라마","코미디"));
		
		genres.add("액션");
		genres.add("범죄");
		genres.add("드라마");
		genres.add("애니메이션");
		genres.add("뮤지컬");
		genres.add("코미디");
		genres.add("로맨스");
		genres.add("멜로");
		genres.add("어드벤쳐");
	}
	
	public Movie(int movieNum,String title, String genre1, String genre2) {
		this.movieNum = movieNum;
		this.title = title;
		this.genre[0] = genre1;
		this.genre[1] = genre2;
	}
	

	public ArrayList<Movie> getMList(){
		return movies;
	}
	public ArrayList<String> getGList(){
		return genres;
	}	
	
	@Override
	public String toString() {
		return this.movieNum + "." + this.title + "\t" + this.genre[0] +" / "+ this.genre[1];
	}
}
