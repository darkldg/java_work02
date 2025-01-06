package test02;

public class continuetest_0106 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		for(int i=1; i<=100; i++) {
			if(i%2==0)//%는  홀수 짝수를 판단하는데 사용하는데 짝수는 무조건 0이 되기때문에 홀수만 실행된다.
				continue;
			sum+=i;
			System.out.println("i="+i+",sum"+sum);
		}
		System.out.println("sum="+sum);

	}

}
