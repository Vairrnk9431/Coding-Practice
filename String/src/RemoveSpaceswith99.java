import java.util.Scanner;

public class RemoveSpaceswith99 {
    public static void main(String[] args) {
    	Scanner scan=new Scanner(System.in);
    	System.out.println("Enter the string");
    	String str=scan.nextLine();
    	StringBuffer modified=new StringBuffer();
    	for(int i=0;i<str.length();i++) {
    		char current=str.charAt(i);
    	    if(current==' ') {
    	    	modified.append("99");
    	    }else {
    	    	modified.append(current);
    	    }
    	}
    
    	System.out.println(modified);
      
    }
}
