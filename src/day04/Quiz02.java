package day04;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int choice;
		String home="";
		String company="";
		
//		while(true) {
//			System.out.println("1. 우리집 등록\n2. 회사 등록\n3. 등록 보기\n4. 프로그램 종료");
//			choice = scan.nextInt();
//			scan.nextLine();
//			if(choice == 1) {
//				System.out.print("우리집을 등록합니다.\n주소 입력 : ");
//				home = scan.nextLine();
//			}else if(choice == 2) {
//				System.out.print("회사를 등록합니다.\n주소 입력 : ");
//				company = scan.nextLine();				
//			}else if(choice == 3) {
//				System.out.println("우리집 : "+home);
//				System.out.println("회사 : "+company);
//			}else if(choice == 4){
//				System.out.println("프로그램을 종료합니다.");
//				break;
//			}else {
//				System.out.println("잘못 입력하셨습니다.");
//				continue;
//				
//			}
//		}
		
		while(true) {
			System.out.println("1. 우리집 등록\n2. 회사 등록\n3. 등록 보기\n4. 프로그램 종료");
			choice = scan.nextInt();
			scan.nextLine();
			
			switch(choice) {
			case 1:
				System.out.print("우리집을 등록합니다.\n주소 입력 : ");
				home = scan.nextLine();
				break;
			case 2:
				System.out.print("회사를 등록합니다.\n주소 입력 : ");
				company = scan.nextLine();
				break;
			case 3:
				System.out.println("우리집 : "+home);
				System.out.println("회사 : "+company);
				break;
			case 4:
				System.out.println("프로그램을 종료합니다.");				
				System.exit(0);
			default:
				System.out.println("잘못 입력하셨습니다.");
				continue;
			}
		}

	}

}
