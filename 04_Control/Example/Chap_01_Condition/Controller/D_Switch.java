package com.kh.example.chap01.condition;

import java.util.Scanner;

public class D_Switch {
	// 조건식의 결과 값을 case에서 찾아 명령을 수행하는 조건문
	// 해당하는 값이 case에 없을 경우에는 default의 명령문 수행
	
	//case와 수행문 사이에는 콜론(:)을 써야 하며 
	//break가 없으면 멈추지 않고 계속 수행함
	
	public void method1() {
		// 정수 두 개와 연산 기호 문자 1개를 입력 받아서
		// 연산 기호 문자에 해당하는 계산을 수행하고 출력하세요
		/*
		 	첫 번째 값 : 
		 	두 번째 값 : 
		 	연산자(+,-,*,/) : 
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("첫 번째 값 : ");
		int first = sc.nextInt();
		
		System.out.print("두 번째 값 : ");
		int second = sc.nextInt();
		sc.nextLine();
		
		System.out.print("연산자(+ , - , * ,/) : ");
		char op = sc.nextLine().charAt(0);
		//java.lang.StringIndexOutOfBoundsException: String index out of range: 0
		//위에 nextInt 이후 nextLine 은 줄바꿈을 갖고 오는 건데 그 줄바꿈만 남은 상태에서 charAt(0)을 하니까 에러가 발생했다는 내용
		//** nextInt가 위에 100번 있다고 버퍼에 줄바꿈이 100번 있는 것은 아님 - 마지막 nextInt에서 남긴 줄바꿈 하나만 남아있음
		//에러 해결 : 위에 sc.nextLine() 해서 줄바꿈 갖고 오기! 
		//배열에서도 많이 나오는 에러이자 애플리케이션(?)만들때도 종종 보게 될 에러
		
		int result = 0; // 연산 결과 저장해놓은 변수
		
		switch(op) {
		case '+' :
			result = first + second;
			break;
		case '-' :
			result = first - second;
			break;
		case '*' :
			result = first * second;
			break;
		case '/' : 
			result = first / second;	
		}
		
		System.out.println(first + " " + op + " " + second + " = " + result);
	}
	
	public void method2() {
		// 과일을 입력하여 사과는 1000, 바나나는 3000, 복숭아는 2000, 키위는 5000,
		// 과일가게에 없는 과일을 입력했을때는 "잘못입력하였습니다." 출력하게 하여라
		// 과일 이름을 입력하세요 : 
		
		Scanner sc = new Scanner(System.in);
		System.out.print("과일 이름을 입력하세요 : ");
		String fruit = sc.nextLine();
		
		int price = 0;
		
		switch(fruit){
		case "사과" :
			price = 1000;
			break;
		case "바나나" :
			price = 3000;
			break;
		case "복숭아" :
			price = 2000;
			break;
		case "키위" :
			price = 5000;
			break;
		default :
			System.out.println("잘못입력하였습니다.");
			return;
			// break는 만나면 case문을 빠져나가게 하는 역할인데
			// return은 나를 호출한 메소드에게 돌아가는 기능. 
			// 이 때, 값을 가지고 돌아갈 수도 있고 아무것도 없이 돌아갈 수도 있음
			// 호출한다는 것은 run 클래스에서 main 메소드가 호출하고 있는 것을 의미하고
			// ds.method2(); 를 호출 후 다른 것이 없기 때문에 그냥 종료된다?
			
			//return 밑에 의미 없는 코드면 실행되지 않기 때문에 에러가 발생하는데
			//이 경우에는 return이 포함되는 default가 아닌 다른 case에서는 이 아래줄의 system.out.println(~~)이 의미 있는 코드이기 때문에 빨간줄 에러가 발생하지 않음
		}
		
		System.out.println(fruit + "의 가격은 " + price + "원 입니다.");
		// 다른 과일을 입력하면 price의 초기화 값이 0이므로 그냥 0으로 출력됨
	}
	
	public void method3() {
		//사용자가 입력한 메뉴 번호에 따라서 메뉴가 출력되게 하시오
		/*
		 	1. 회원 등록
		 	2. 회원 수정
		 	3. 회원 삭제
		 	메뉴 번호를 입력하세요 : 
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("1. 회원 등록");
		System.out.println("2. 회원 수정");
		System.out.println("3. 회원 삭제");
		System.out.print("메뉴 번호를 입력하세요 : ");
		int menu = sc.nextInt();
		
		switch(menu) {
		case 1:
			System.out.println("회원 등록 메뉴입니다.");
			break;
		case 2:
			System.out.println("회원 수정 메뉴입니다.");
			break;
		case 3:
			System.out.println("회원 삭제 메뉴입니다.");
			break;
		default:
			System.out.println("잘못 입력하셨습니다.");
		}
	}
	public void method4() {
		//1월부터 12월까지 입력 받아 해당하는 달의 마지막 날짜를 출력하세요
		// 입력하신 달은 00일까지 입니다.
		Scanner sc = new Scanner(System.in);
		System.out.print("1월~12월까지 중 하나를 입력하세요 : ");
		int num = sc.nextInt();
		
		
		switch(num) {
		case 1 :
			System.out.println("입력하신 달은 31일까지 입니다.");
			break;
		case 2:
			System.out.println("입력하신 달은 28일 혹은 29일까지 입니다.");
			break;
		case 3:
			System.out.println("입력하신 달은 31일까지 입니다.");
		case 4:
			System.out.println("입력하신 달은 30일까지 입니다.");
			break;
		case 5:
			System.out.println("입력하신 달은 31일까지 입니다.");
			break;
		case 6:
			System.out.println("입력하신 달은 30일까지 입니다.");
			break;
		case 7:
			System.out.println("입력하신 달은 31일까지 입니다.");
			break;
		case 8:
			System.out.println("입력하신 달은 31일까지 입니다.");
			break;
		case 9:
			System.out.println("입력하신 달은 30일까지 입니다.");
			break;
		case 10:
			System.out.println("입력하신 달은 31일까지 입니다.");
			break;
		case 11:
			System.out.println("입력하신 달은 30일까지 입니다.");
			break;
		case 12:
			System.out.println("입력하신 달은 31일까지 입니다.");
			break;
		default:
			System.out.println("반드시 1~12 사이의 숫자를 입력해주세요.");
			
		/* 1,3,5,7,8,10,12는 모두 31일까지 있을때에는 (즉, 같은 것들이 반복되는 경우에는)
		 * case 1:
		 * case 3:
		 * ........
		 * case 12:
		 * System.out.println("입력하신 달은 31일까지 입니다.");
		 * break;
		 * case 2:
		 * System.out.pritnln("입력하신 달은 28일 혹은 29일까지 입니다.");
		 * break;
		 * case 4: case 6 :case 9: case 11: (위의 1,3 등등 처럼 세로로 나열할 수도 있지만 가로로 나열해도 상관없다)
		 * System.out.println("입력하신 달은 30일까지 입니다.");
		 * break;
		 * default:
		 * System.out.println("반드시 1~12 사이의 숫자를 입력해주세요.");
		 */
		}
		
	}
}
