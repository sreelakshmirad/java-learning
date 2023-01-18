package Week4;

public class NumbersDivisibleby5and6 {

	public static void main(String[] args) {
		
		final int START_NUM = 100;
		final int END_NUM = 1000;
		int Counter = 0;
		
		
		
		
		for (int i = START_NUM ; i <= END_NUM ; i++ ) {
			if (i%5 ==0  &&  i%6 ==0){
				Counter ++;


				if (Counter <= 10) {
					System.out.printf("%d \t",i);
					
				}else {
					System.out.printf("\n");
					Counter =0;	
				}
					
			}
	
		}

	}

}
