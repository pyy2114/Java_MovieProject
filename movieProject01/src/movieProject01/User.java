package movieProject01;

import java.util.Scanner;

public class User {
	Scanner sc = new Scanner(System.in);
	String moviename, time;
	char row;
	int col;
	int number, user_number; // number: ticketing에서 받아올 정보, user_number: user가 입력할 정보

	public User() {
		// TODO Auto-generated constructor stub
		String moviename, time, seat = "";
		int number, user_number = 0;
	}

	public void information() { // main, switch case3에 들어갈 함수
		
		while (true) {
			System.out.print("예약 확인용 비밀번호 4자리를 입력하세요: ");
			user_number = sc.nextInt();
			
			if (user_number == number) {
				System.out.println();
				System.out.println("<< 예약 정보 >>");
				System.out.println("영화: " + moviename);
				System.out.println("시간: " + time);
				System.out.println("자리: " + row + col);
				System.out.println();
				System.out.println("즐거운 관람 되세요.");
				break;
			}
			
			else {
				System.out.println("비밀번호가 다릅니다. 다시 입력해주세요.");
				System.out.println();
			}
			
		}
	}
}
