package test02;

public class Fortest3_0106 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0; i<10; i++) {
			for(int j=0; j<=10; j++){
				System.out.print("*");	
			}
			System.out.println();
		}
		for(int i=0; i<10; i++) {
			for(int j=0; j<=i; j++){
				System.out.print("*");	
			}
			System.out.println();
		}
		for(int i=0; i<10; i++) {
			for(int j=0; j<10-i; j++){
				System.out.print("*");	
			}
			System.out.println();
		}
		for(int i=0; i<10; i++) {
			for(int j=-10; j<=10; j++){
				if(Math.abs(j)<=i)
				System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		for(int i=-10; i<=10; i++) {
			for(int j=-10; j<=10; j++){
				if(Math.abs(j)<=10-Math.abs(i))
				System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();

	}

}
}
