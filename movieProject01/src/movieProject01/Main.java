package movieProject01;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 0;
				
		Scanner sc = new Scanner(System.in);
		Manager M = new Manager();
		
//@@@@@@@@@@@TEST@@@@@@@@@@@@///////////	
//		M.displayMovieList();
//		M.displayGenreList();

		do {
			try {
				sc = new Scanner(System.in);
				//메인 선택창
				M.displayMainMenu();
				System.out.printf("번호를 입력해 주세요: ");
		
				num = sc.nextInt();
				
				if(num > 4) {
					System.out.println("잘못 입력했습니다.");
					continue;
				}
				switch (num) {
					case 1:	//예매
						System.out.println("<< 영화 예매 >>\n");
						M.ticket();
						break;
					case 2:	//추천
						System.out.println("<< 영화 추천 >>\n");
						M.displayGenreList();
						M.recommand();
						break;
					case 3:	//확인
						System.out.println("<< 예매 확인 >>\n");
						M.confirm();
						break;
					default:	//끝
						break;	
				}
			}catch(InputMismatchException e){
				System.out.println("잘못 입력했습니다.");
			}		
		}while(num != 4);
			System.out.println("끝");
		
		
	}

}
