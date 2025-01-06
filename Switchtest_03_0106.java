package ch04_2;


public class Switchtest_03_0106 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//3~5:봄 6~8여름  9~11:가을 12,1,2:겨울
		
		String b="";
		int a = 1;
		
		
		switch(a) {
		case 3,4,5:b="봄"; break;
		case 6,7,8:b="여름"; break; 
		case 9,10,11:b="가을";break;
		case 12,1,2:b="겨울";break;
		default:
			System.out.println("없는달입니다.");
		
		
		
		}
		System.out.println(b);

	}

}
