package restAPI.Basics;

public class PracticeBasics {
	
  int[] M = {0,1,2,3,4,5,6};
  static int age = 52;
	
	public void evenRodd() {
		for (int i = 0; i<M.length; i++) {
		  int j = M[i];
		 if (j%2 == 0) {System.out.println("even number " + j);}
		 else {System.out.println("odd number" + j);}
		 }	
     }
	
	
	public static String checkEvenOdd (int num){
	    
		if (num == 0 || num == 1) {
			return "given number is " + num;
		}
		else if(num%2 == 0) {
			
			return "given number is even number" + num;
			
		}else {
			return "given number is odd number" + num;
		}
		
	}
	public static void main(String[]args) {
		
		//PracticeBasics a= new PracticeBasics();
		//a.evenRodd();
	System.out.println(PracticeBasics.checkEvenOdd(10));
	System.out.println(PracticeBasics.age);			
	}
	

}
