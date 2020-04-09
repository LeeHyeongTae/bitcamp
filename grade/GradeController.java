package com.jse.grade;

import javax.swing.JOptionPane;
import com.jse.util.Constants;
public class GradeController {
// "[%s : 총점 %d 점, 평균 %d 점,학점 : %s]"
	public static void main(String[] args) {
			GradeService gradeService = new GradeServiceImpl();
			Grade grade = null;
			while(true) {
				switch(JOptionPane.showInputDialog(Constants.GRADE_MENU)) {
				case "0": ;return;
				case "1": //System.out.println("성적표 입력");
				for(int i=0; i<3; i++) {
					String[] values =JOptionPane.showInputDialog(Constants.GRADEINPUT).split(",");
					//System.out.println("이름,국어점수, 영어점수, 수학점수 입력");
					grade = new Grade();
					grade.setName(values[0]);
					grade.setKorean(Integer.parseInt(values[1]));
					grade.setEnglish(Integer.parseInt(values[2]));
					grade.setMath(Integer.parseInt(values[3]));
					gradeService.add(grade);
					
//					gradeService.add(new Grade(scanner.next(),scanner.nextInt(),
//													scanner.nextInt(),scanner.nextInt()));
				}
						break;	
				case "2":// 성적표 출력
					JOptionPane.showMessageDialog(null, gradeService.printGrades());
//					System.out.println(gradeService.printGrades());
						break;
					case "3":// 총점 높은 순 1,2,3등으로 이름 출력
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
//					case "4": // 회원가입
//						System.out.println("회원 가입");
//						for(int i=0; i<3; i++) {
//							System.out.println("이름,ID,PW,나이를 입력하세요");
//						memberService.add(new Member(scanner.next(),scanner.next(),scanner.next(),scanner.nextInt()));
//						}
//						break;
//					case "5"://나이순으로 회원 이름 출력
//						System.out.println("나이순으로 정렬");
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
////						}
//						break;
//					case "6": //회원 명단 출력
//						System.out.println("회원 명단");
//						for(int i=0; i<3; i++) {
//							Member[] members = memberService.getMemeberBean();
//							System.out.println(String.format("[%s: ID:%s 나이:%s]", 
//								members[i].getName(), members[i].getUserid(), members[i].getAge()));
//						}
//						break;
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