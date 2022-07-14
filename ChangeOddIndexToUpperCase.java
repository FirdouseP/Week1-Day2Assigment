package week1.day2.assignments.mandatory;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Declare String Input as Follow
		  
		 String test = "ChAnGeMe";
		 char[] ab=test.toCharArray();
		 System.out.println("length of the string : " +ab.length);
		 for(int i=0; i<= ab.length-1; i++)
		 {
			 if(i%2!=0)
			 {
				 System.out.print(ab[i]);
			 }
			 else
			 {
				 System.out.print(ab[i]);
			 }
		 }
	}
	

}
