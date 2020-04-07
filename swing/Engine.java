package com.jse.swing;
import java.util.Scanner;
public class Engine {
// "[%s : 총점 %d 점, 평균 %d 점,학점 : %s]"
	public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			GradeService gradeService = new GradeService();
			MemberService memberService = new MemberService();
			while(true) {
				System.out.println("0.종료  1.성적표입력  2.성적표출력  3.성적등수  4.회원명단 입력  5.회원 나이순 정렬  6.회원명단 출력");
				switch(scanner.nextInt()) {
				case 0: System.out.println("종료");return;
				case 1: System.out.println("성적표 입력");
				for(int i=0; i<3; i++) {
					System.out.println("이름,국어점수, 영어점수, 수학점수 입력");
					gradeService.add(new GradeBean(scanner.next(),scanner.nextInt(),
													scanner.nextInt(),scanner.nextInt()));
				}
						break;	
				case 2:// 성적표 출력
					GradeBean[] grades = gradeService.getGrades();					
					for(int i=0; i<3; i++) {
					System.out.println(String.format("[%s : 총점 %d 점, 평균 %d 점,학점 : %s]", 
							grades[i].getName(), 
							grades[i].sumSubject(), 
							grades[i].avgSubject(), 
							grades[i].gradeResult()));
					}
						break;
					case 3:// 총점 높은 순 1,2,3등으로 이름 출력
//						System.out.println("성적 순");
//						if(grades[0].sumSubject()>grades[1].sumSubject()) {
//							
//							if(grades[1].sumSubject()>grades[2].sumSubject()) {
//								System.out.println(String.format("%s, %s, %s", 
//										members[0].getName(), members[1].getName(), members[2].getName()));
//							}else if(grades[0].sumSubject()>grades[2].sumSubject()) {
//								System.out.println(String.format("%s, %s, %s", 
//										members[0].getName(), members[2].getName(), members[1].getName()));
//							}else {
//								System.out.println(String.format("%s, %s, %s", 
//										members[2].getName(), members[0].getName(), members[1].getName()));
//							}
//							
//						}else if(grades[0].sumSubject()>grades[2].sumSubject()) {
//							System.out.println(String.format("%s, %s, %s", 
//									members[1].getName(), members[0].getName(), members[2].getName()));
//						}else if(grades[1].sumSubject()>grades[2].sumSubject()){
//							System.out.println(String.format("%s, %s, %s", 
//									members[1].getName(), members[2].getName(), members[0].getName()));
//						}else {
//							System.out.println(String.format("%s, %s, %s", 
//									members[2].getName(), members[1].getName(), members[0].getName()));
//						}
						
					break;
					case 4: // 회원가입
						System.out.println("회원 가입");
						for(int i=0; i<3; i++) {
							System.out.println("이름,ID,PW,나이를 입력하세요");
						memberService.add(new MemberBean(scanner.next(),scanner.next(),scanner.next(),scanner.nextInt()));
						}
						break;
					case 5://나이순으로 회원 이름 출력
						System.out.println("나이순으로 정렬");
//						if(members[0].getAge()>members[1].getAge()) {
//							if(members[0].getAge()>members[2].getAge()) {
//								if(members[1].getAge()>members[2].getAge()) {
//									System.out.println(String.format("%s\n %s\n %s\n", 
//											members[0].getName(), members[1].getName(), members[2].getName()));
//								}else {
//									System.out.println(String.format("%s\n %s\n %s\n", 
//											members[0].getName(), members[2].getName(), members[1].getName()));
//								}
//							}else if(members[1].getAge()>members[2].getAge()){
//								System.out.println(String.format("%s\n %s\n %s\n", 
//										members[2].getName(), members[0].getName(), members[1].getName()));
//							}else {
//								System.out.println(String.format("%s\n %s\n %s\n", 
//										members[2].getName(), members[1].getName(), members[0].getName()));
//							}
//						}else if(members[0].getAge()>members[2].getAge()){
//							System.out.println(String.format("%s\n %s\n %s\n", 
//									members[1].getName(), members[0].getName(), members[2].getName()));
//						}else {
//							System.out.println(String.format("%s\n %s\n %s\n", 
//									members[1].getName(), members[2].getName(), members[0].getName()));
//						}
						break;
					case 6: //회원 명단 출력
						System.out.println("회원 명단");
						for(int i=0; i<3; i++) {
							MemberBean[] members = memberService.getMemeberBean();
							System.out.println(String.format("[%s: ID:%s 나이:%s]", 
								members[i].getName(), members[i].getUserid(), members[i].getAge()));
						}
						break;
					}
				}
		}
//	public static GradeBean input(Scanner scanner) {
//		System.out.println("이름,국어점수, 영어점수, 수학점수 입력");
//		return new GradeBean(scanner.next(),scanner.nextInt(),scanner.nextInt(),scanner.nextInt());
//	}
//	public static MemberBean join(Scanner scanner) {
//		System.out.println("이름,ID,PW,나이를 입력하세요");
//		return new MemberBean(scanner.next(),scanner.next(),scanner.next(),scanner.nextInt());
//	}
}