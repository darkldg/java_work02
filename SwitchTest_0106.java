package ch04_2;

public class SwitchTest_0106 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rank=1;
		char color;
		switch(rank) {
		case 1 : color='G';
		break;
		case 2 : color='S';
		break;
		case 3 : color='B';
		break;
		default:
		
		     color='A';
		
		}
		System.out.println(color);
		
		if(rank==1) {
			color='G';
		}else if(rank==2){
			color='S';
		}else if(rank==3){
			color='B';
		}else {
			color='A';

	} 
	 System.out.println(color);

	}
}
