package movieProject01;

import java.util.Scanner;

public class Ticket {
	int [][] seat = new int[11][15];
	char row;
	int col;
	int i,j,k;
	int r_number;
	String movietitle;
	int movienum;
	Scanner sc = new Scanner(System.in);
	
	public Ticket() {
		col = 0;
		for(i=0;i<11;i++) {
			for(j=0;j<15;j++) {
				seat[i][j] = 0;
			}
		}
	}
	
	public void ticketing() {
		System.out.print("영화 번호 선택: ");
		movienum = sc.nextInt();
		PrintSeat();
		sc.nextLine();
		while(true) {
			
			System.out.print("열(A~K) 선택: ");
			row = sc.nextLine().charAt(0);
			k = (int)row - 65;
			System.out.print("행(1~15) 선택: ");
			col = sc.nextInt();
			if(seat[k][col-1] == 0) {
				seat[k][col-1] = 1;
			
				//
				System.out.println("예약확인시 사용할 비밀번호 4자리를 입력하세요.");
				r_number = sc.nextInt();
				//
				
				System.out.println("예매가 완료되었습니다.");
				PrintSeat();
				break;
			}
			else if(seat[k][col-1] == 1) {
				System.out.println("이미 예약이 된 좌석입니다. 다시 선택해 주시기 바랍니다.");
				sc.nextLine();
			}
		}
	}
	
	public void setTicket(User u) {
		u.moviename = this.movietitle;
		u.row = this.row;
		u.col = this.col;
		u.number = this.r_number;
	}
	
	public void PrintSeat() {
		System.out.println(" 1 2 3 4 5 6 7 8 9 101112131415");
		for(i=0;i<11;i++) {
			System.out.print((char)(i+65)+" ");
			for(j=0;j<15;j++) {
				if(seat[i][j] == 0)
					System.out.print("□ ");
				else if(seat[i][j] == 1)
					System.out.print("■ ");
			}
			System.out.println("\n");
		}
	}
}
