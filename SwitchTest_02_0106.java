package ch04_2;

public class SwitchTest_02_0106 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score=85;
		char grad;
		//특정 범위에 들어가는 건  if else 이 좋고 그이외 지정된 수나 정해진 것은 switch를 쓰는게 좋다.
		switch(score) {
		case 90 : grad='A';break;
		case 80 : grad='B';break;
		case 70 : grad='C';break;
        default:grad = 'F';
		//F가 출력되는 이유는 지정된 케이스의 값(90,80,70)이 아닌 다른 정수(85)가 나왔기 때문에 이외의 것을 출력하게 된 F가 출력되는것이다.
        //switch를 사용하게 되면 안되는 케이스다.
		}
		System.out.println(grad);
		
		
		
		
		if(score>=90) {
			grad='A';
		}else if(score>=80) {//80~89
			grad='B';
			
		}else if(score>=70) {//70~79
			grad='C';
		}else {//70미만
			grad='F';
		}
		System.out.println(grad);

	}

}
