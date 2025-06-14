package g;

public class Stringrev 
{
	
	    public static void main(String[] args) {
	        String str = "Hello, World!";
	        
	        // Using StringBuilder to reverse the string
	        StringBuilder sb = new StringBuilder(str);
	        sb.reverse();
	        
	        System.out.println("Reversed string using StringBuilder: " + sb.toString());
	        // Output: "!dlroW ,olleH"
	    }
	}

