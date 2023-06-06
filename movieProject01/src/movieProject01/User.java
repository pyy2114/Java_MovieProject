package movieProject01;

import java.util.ArrayList;
import java.util.Scanner;

public class User {
    
	ArrayList<User> user = new ArrayList<User>();
	
	Scanner sc = new Scanner(System.in);
	String movietitle, number, user_number; // number: ticketing에서 받아올 정보, user_number: user가 입력할 정보
	String [] strings;
	int p_number, i;
	
	public User() {
		// TODO Auto-generated constructor stub
		
		movietitle = " ";
		number = " ";
		user_number = " ";
	}
	
	/*public void setTicket(int a) {
		u.moviename = this.movietitle;
		u.strings = this.strings;  //여러명 들어간 배열
		u.p_number = this.p_number; //배열 출력을 위한 인원수 
		u.number = this.r_array.get(a);
	}*/
	
	public void setUser(String string, String movietitle, String[] strings) {
		// TODO Auto-generated method stub                                 
		//user.add(new User());
		//System.out.println(i_check.get(0)[0]); // 
		this.number = string;
		this.movietitle = movietitle;
		this.strings = strings;
	}

	public void information() {
		
//		while (true) {
//			System.out.print("예약 확인용 비밀번호 4자리를 입력하세요: ");
//			user_number = sc.next();
//			
//			//for (int i=0;i<;i++)
//			if (user_number.equals()) {
//				System.out.println();
//				System.out.println("<< 예약 정보 >>");
//				System.out.println("영화: " + movietitle);
//				System.out.println("인원: " + p_number);
//				
//				System.out.print("자리: ");
//				for (int i = 0 ; i<strings.length ; i++ )
//				System.out.print(strings[i]+ " ");
//				//System.out.print(Collections.sort(strings)+ " ");
//				
//				System.out.println();
//				
//				System.out.println("즐거운 관람 되세요.");
//				break;
//			}
//			
//			else {
//				System.out.println("비밀번호가 다릅니다. 다시 입력해주세요.");
//				System.out.println();
//			}
//			
//			/*
//			 if (user_number.equals(number)) {
//				System.out.println();
//				System.out.println("<< 예약 정보 >>");
//				System.out.println("영화: " + movietitle);
//				System.out.println("인원: " + p_number);
//				
//				System.out.print("자리: ");
//				for (int i = 0 ; i<strings.length ; i++ )
//				System.out.print(strings[i]+ " ");
//				//System.out.print(Collections.sort(strings)+ " ");
//				
//				System.out.println();
//				
//				System.out.println("즐거운 관람 되세요.");
//				break;
//			}
//			
//			else {
//				System.out.println("비밀번호가 다릅니다. 다시 입력해주세요.");
//				System.out.println();
//			}
//			*/
//		}
	}
}
