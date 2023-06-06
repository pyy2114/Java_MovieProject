package movieProject01;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Manager {
	
	String [][] movieList = {
			{"범죄도시3","액션","범죄"},
			{"분노의 질주","액션",""},
			{"마리오 브라더스","애니메이션","어드벤쳐"},
			{"인어공주","뮤지컬","드라마"},
			{"가디언즈 오브 갤럭시","액션","코미디"},
			{"아기공룡 둘리: 얼음별 대모험 리마스터링","애니메이션","어드벤쳐"},
			{"슬픔의 삼각형","드라마","코미디"},
			{"남은 인생의 10년","로맨스","멜로"},
			{"존 윅4","액션",""},
			{"드림","드라마","코미디"}
	};
	
	String []genreList= {"액션","범죄","드라마","애니메이션","뮤지컬","코미디","로맨스","멜로","어드벤쳐"};	
	
	//객체 생성
	Scanner sc = new Scanner(System.in);
	Ticket ticket = new Ticket();
	Movie m = new Movie();

	//리스트 생성
	private ArrayList<Movie> movies = new ArrayList<>();
	private ArrayList<String> genres = new ArrayList<>();	
	
	//변수 설정
	int num = 0;
	
	
	//생성자
	public Manager() {
		
		for(int i = 0; i < movieList.length; i++)
		{
			movies.add(new Movie(i+1,movieList[i][0],movieList[i][1],movieList[i][2]));
		}

		for(int i = 0; i < genreList.length; i++)
		{
			genres.add(genreList[i]);
		}		
	}
	
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
		for(Movie m : movies) {
			System.out.println(m);
		}
	}
	public void displayGenreList() {
		for(int i = 0; i < genres.size(); i++) {
			System.out.printf((i+1)+"."+genres.get(i)+" ");
		}
		System.out.println();
	}

//	public ArrayList<Movie> getMList(){
//	return movies;
//}
//public ArrayList<String> getGList(){
//	return genres;
//}
//	
	// 은영
	public void ticekt() {
		ticket.ticketing();
	}
	
	//윤영
	public void recommand() {
		
		int i = 0;
		
		try {	
			sc = new Scanner(System.in);	
			System.out.printf("\n선호하는 장르의 번호를 입력해주세요: ");
			num = sc.nextInt();	

			if(num > 9) {
				System.out.println("잘못 입력했습니다. 번호를 다시 입력해주세요\n");
				recommand();
			}
			else {
				System.out.println("\n선택하신 장르의 영화 목록입니다.");
				for(Movie m : movies) {
					if((genres.get(num-1) == m.genre[0])||(genres.get(num-1) == m.genre[1])){
						System.out.println(m);
					}
				}
				System.out.println();
				
				System.out.printf("예매 하시겠습니까? (1.예 2. 아니오) : ");
				i = sc.nextInt();
				
				if(i == 1) {
					ticket.ticketing();
				}
				else
					return;
			}
		}catch(InputMismatchException e){
			System.out.println("잘못 입력했습니다. 번호를 다시 입력해주세요\n");
			recommand();
		}
		
	}
	
	//서현
	public void confirm() {	
		
		
	}



}
