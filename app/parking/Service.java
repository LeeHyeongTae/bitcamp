package org.des.parking;
/*객체의 ID
 * 자료형@주소
 * instanceof{클래스명}
 *  car c = list[i];
 *  String number = c.number;
 *  number;
 */
import org.des.MathUtill;
// 배열을 차번호(string)와 시간(int) 다른 종류의 자료형 데이터가 필요함.
class Car{
		String number;//(default):동일패키지에서 접근 가능 제한적 공개 private 와 pubilc 사이
		int time_in;
		int time_out;
}

public class Service {
		private MathUtill util;
		private Car[] list = new Car[20]; //배열 공간
		
		
		public String getTable() {//면번호:차번호
			String table = "[";
			//for-each : 각 요소를 하나씩 꺼낸다. (번호를 사용하지 않음)
//			for(Car c : list) {
//				if(c != null) {
//					table += c.number+":";
//				}
//			}
			for(int i=0; i<list.length; ++i) {
				Car c = list[i];
				if(c != null) {
					table += i+":"+c.number+",";
				}
			}
			table += "]"; //문자열을 합친다.
			return table; //함수반환타입과 맞춰야함
		}

		public int input(String number, int inputtime) {
			// 주차 : 차정보 저장(등록)
			int index = -1; //EOF end of file
			Car car = new Car(); //java스러운 문장. 잘 봐야한다. 
			car.number = number;
			car.time_in = inputtime; //MathUtlis.
			// 빈자리를 찾는다. 검색
			for(int i=0; i<list.length;++i) {
				if(list[i] == null) {
					index = i;//저장(주차)
					break;
				}
			}
				if(index > -1) {// != -1
					list[index] = car;
					//Full 
				}
				
			return index;
		}

		public double output(String number, int outputtime) {
			double price = 0;// 나갈때는 이미 들어온 정보를 찾아서 내보내야 한다.
			Car car = null;
			int index = -1;
			for(int i=0; i<list.length; ++i) {
					Car c = list[i];
					if(c != null) {
						if(c.number.equals(number) ) {// 문자열은 상수로 취급해서 같은 문자열이면 참조해서 사용, 위치를 같게 위치가 달라도 문자열이 같을 수 있어 equals 사용
							//참조변수 간의 같다 비교 때는 ==보다는 메서드를 사용 권장 (equals)
							car = c;
							index = i;
							//list[index] = null;
							break;
						}
					}
			}
			if( car != null) {
			//1. 요금 계산
			car.time_out = outputtime;
			int units = MathUtill.diffMinutes(car.time_in,car.time_out ) / 10;
			price = 5000.0 + (units*500.0);
			//2. 비우기
			list[index] = null;
			}
			return price;
		}
		
		//주차 요금 계산 기능
}
