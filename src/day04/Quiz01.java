package day04;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(true) {
			int date;
			String day;
			System.out.print("날짜 입력 : ");
			date = scan.nextInt();
			
			if(date % 7 == 1) {
				day = "월";
			}else if(date % 7 == 2) {
				day = "화";
			}else if(date % 7 == 3) {
				day = "수";
			}else if(date % 7 == 4) {
				day = "목";
			}else if(date % 7 == 5) {
				day = "금";
			}else if(date % 7 == 6) {
				day = "토";
			}else {
				day = "일";
			}
			
			switch(date%7) {
			case 1 :
				System.out.println(date+" "+day);
				break;
			case 2:
				System.out.println(date+" "+day);
				break;
			case 3:
				System.out.println(date+" "+day);
				break;
			case 4:
				System.out.println(date+" "+day);
				break;
			case 5:
				System.out.println(date+" "+day);
				break;
			case 6:
				System.out.println(date+" "+day);
				break;
			case 0:
				System.out.println(date+" "+day);
				break;
				
			}
	}

	}

}
