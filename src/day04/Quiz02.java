package day04;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int choice;
		String home="";
		String company="";
		
//		while(true) {
//			System.out.println("1. �츮�� ���\n2. ȸ�� ���\n3. ��� ����\n4. ���α׷� ����");
//			choice = scan.nextInt();
//			scan.nextLine();
//			if(choice == 1) {
//				System.out.print("�츮���� ����մϴ�.\n�ּ� �Է� : ");
//				home = scan.nextLine();
//			}else if(choice == 2) {
//				System.out.print("ȸ�縦 ����մϴ�.\n�ּ� �Է� : ");
//				company = scan.nextLine();				
//			}else if(choice == 3) {
//				System.out.println("�츮�� : "+home);
//				System.out.println("ȸ�� : "+company);
//			}else if(choice == 4){
//				System.out.println("���α׷��� �����մϴ�.");
//				break;
//			}else {
//				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
//				continue;
//				
//			}
//		}
		
		while(true) {
			System.out.println("1. �츮�� ���\n2. ȸ�� ���\n3. ��� ����\n4. ���α׷� ����");
			choice = scan.nextInt();
			scan.nextLine();
			
			switch(choice) {
			case 1:
				System.out.print("�츮���� ����մϴ�.\n�ּ� �Է� : ");
				home = scan.nextLine();
				break;
			case 2:
				System.out.print("ȸ�縦 ����մϴ�.\n�ּ� �Է� : ");
				company = scan.nextLine();
				break;
			case 3:
				System.out.println("�츮�� : "+home);
				System.out.println("ȸ�� : "+company);
				break;
			case 4:
				System.out.println("���α׷��� �����մϴ�.");				
				System.exit(0);
			default:
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
				continue;
			}
		}

	}

}
