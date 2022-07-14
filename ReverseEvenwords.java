package week1.day2.assignments.mandatory;

public class ReverseEvenwords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Declaring the string 
		String str="I ma a erawtfos tester";
	    String[] words=str.split(" ");
	    for (int i=0; i<words.length;i++) {
	    	if(i%2 !=0)
	    	{
	    		char[]ch=words[i].toCharArray();
	    		for(int j=ch.length-1;j>=0;j--)
	    		{
	    			System.out.print(ch[j]);
	    		}
	    		System.out.print(" ");
	    	}
	    	else
	    	{
	    		char[]ch=words[i].toCharArray();
	    		for (int j=0; j<ch.length;j++)
	    		{
	    			System.out.print(ch[j]);
	    		
	    		}
	    		System.out.print(" ");
	    	}
	    
	    
	    }

	}

}
