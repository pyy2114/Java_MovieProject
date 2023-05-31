package movieProject01;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 0;
				
		Scanner sc = new Scanner(System.in);
		Manager M = new Manager();
		
		
		do {
			//메인 선택창
			M.displayMainMenu();
			System.out.printf("번호를 입력해 주세요: ");
			num = sc.nextInt();
			
			switch (num) {
				case 1:	//예매
					M.ticekt();
					break;
				case 2:	//추천
					M.recommand();
					break;
				case 3:	//확인
					M.confirm();
					break;
				default:	//끝
					break;	
			}
		}while(num != 4);
	
	}

}
