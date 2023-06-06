package movieProject01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Ticket {
	ArrayList<String> r_array = new ArrayList<String>(Arrays.asList("0"));
	
	int [][] seat = new int[11][15];
	char row;
	int col;
	int i,j,k;
	int p = 0;
	String r_number;
	int p_number = 0;
	String movietitle;
	int movienum;
	Scanner sc = new Scanner(System.in);
	String[] strings;
	
	//pyy
	public Ticket() {}
	
	public void ticketing(User u,int [][]seat) {//pyy

		//rnumber();  //비밀번호 확인
		System.out.print("예약할 인원 수를 입력하세요: ");
		p_number = sc.nextInt();
		
		while(true) {
			sc.nextLine();
			PrintSeat(seat);	//pyy
			strings = checkList();   //중복 입력 확인.
			if(strings.length == p_number) {
				for(int i = 0;i<strings.length;i++) {
					row = strings[i].charAt(0);
					if(row>=65 && row<=75)
						k = (int)row - 65;
					else if(row>=97 && row<=107)
						k = (int)row - 97;
					col = Integer.parseInt(strings[i].substring(1));
					if(seat[k][col-1] == 0) {
						seat[k][col-1] = 1;
					}
				}	
				break;
			}
			else {
				System.out.println("입력한 좌석 수와 인원 수가 맞지 않습니다. 다시 입력해주세요.");
				continue;
			}
		}
		rnumber();
		
		System.out.println("예약이 완료 되었습니다.");
		PrintSeat(seat);	//pyy
		u.setUser(r_array.get(p), movietitle, strings);
	}
	
	public boolean checkSeat(String[] strings) {
		int checkfalse = 0;
		for(int i=0;i<strings.length;) {
			row = strings[i].charAt(0);
			if(row>=65 && row<=75)
				k = (int)row - 65;
			else if(row>=97 && row<=107)
				k = (int)row - 97;
			col = Integer.parseInt(strings[i].substring(1));
			if(seat[k][col-1] == 0) {
				System.out.println(strings[i]+"는 예약 가능한 좌석입니다.");
			}
			else if(seat[k][col-1] == 1) {
				System.out.println(strings[i]+"는 이미 예약이 된 좌석입니다. 다시 선택해 주시기 바랍니다.");
				checkfalse++;
			}
			i++;
		}
		if(checkfalse>0)
			return false;
		return true;
	}
	
	public String[] checkList() {    //중복 입력 체크
		while(true) {
			String inputLine = sc.nextLine();
			String[] strings = inputLine.split(",");
			HashSet<String> uniqueStrings = new HashSet<>();
			boolean check = false;
	        for (String str : strings) {
	            if (!uniqueStrings.add(str)) {
	                System.out.println("중복으로 입력하셨습니다. 다시 선택해주세요.");
	                check = true;
	                break;
	            }
	         }
	         if (!check) {
	             if(checkSeat(strings)) {
	            	 return strings;
	             }
	             else
	            	 continue;
	         }  
		}
	}
	
	
	public void rnumber() {// 예약번호 입력받고 겹치는지 확인

		System.out.println("예약 확인시 사용할 비밀번호 4자리를 입력해주세요.");

		boolean a = true;
		boolean b = false;

		while (a == true) {

			r_number = sc.next();

			while (true) {
				
				if (r_number.length() == 4) {
					
					for (int index = 0; index < r_array.size(); index++) {

						if (r_number.equals(r_array.get(index))) {
							//System.out.println("no1, index is " + index + " and thing is "+ r_array.get(index));
							System.out.println("이미 사용중인 비밀번호입니다. 다른 비밀번호를 입력해주세요.");
							break;
						}

						else {

							if (index != (r_array.size() - 1)) {
								//System.out.println("no2, index is " + index + " and thing is "+ r_array.get(index));
								continue;
							}

							else {
								//System.out.println("no3, index is " + index +" and thing is "+ r_array.get(index));
								System.out.println("사용 가능한 비밀번호입니다.");
								a = false;
								b = true;
								break;
							}

						}
						
					}
					}
				
				else System.out.println("비밀번호는 4자리입니다. 다시 입력해주세요."); break;

			}
			if (b == true) {p++; r_array.add(r_number);}
			
			/*System.out.println("array size is" + r_array.size());
			
			for (int aa = 0; aa < r_array.size(); aa++) {
				System.out.println(aa + "번째 원소는 " + r_array.get(aa));
			}*/
		}
	}
	/*public void setTicket(User u, int a) {
		u.moviename = this.movietitle;
		u.strings = this.strings;  //여러명 들어간 배열
		u.p_number = this.p_number; //배열 출력을 위한 인원수 
		u.number = this.r_array.get(a); 
	}*/
	
	public void PrintSeat(int [][]seat) {	//pyy
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
