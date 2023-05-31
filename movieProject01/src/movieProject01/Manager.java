package movieProject01;

import java.util.ArrayList;
import java.util.Scanner;

public class Manager {
	//객체 생성
	Scanner sc = new Scanner(System.in);
	Ticket ticket = new Ticket();
	Recommand rec = new Recommand();
	Movie m = new Movie();

	ArrayList<Movie> movieList = m.getMList();
	ArrayList<String> genreList = m.getGList();
	
	//변수 설정
	int num = 0;
	
	
	//생성자
	public Manager() {}
	
	//메소드
	
	public void displayMainMenu() {
		System.out.println("\n-----------------");
		System.out.println("1. 영화 예매");
		System.out.println("2. 영화 추천");
		System.out.println("3. 예약 확인");
		System.out.println("4. 나가기");
		System.out.println("-----------------\n");
		
	}
	public void displayMovieList() {
		for(Movie m : movieList) {
			System.out.println(m);
		}
	}
	public void displayGenreList() {
		for(int i = 0; i < genreList.size(); i++) {
			System.out.printf((i+1)+"."+genreList.get(i)+" ");
		}
		System.out.println();
	}

	
	public void findMovie(int num) {


	}
	
	// 은영
	public void ticekt() {

	}
	
	//윤영
	public void recommand() {	
		int i = 0;
		System.out.println("<< 영화 추천 >>\n");
		displayGenreList();
		System.out.printf("\n선호하는 장르의 번호를 입력해주세요: ");
		num = sc.nextInt();
		
		rec.recommand(num);
		
		System.out.printf("예매 하시겠습니까? (1.예 2. 아니오) : ");
		i = sc.nextInt();
		
		if(i == 1) {
			ticket.ticketing();
		}
		else
			return;
		
		
		
	}
	
	//서현
	public void confirm() {	
		
		
	}



}
