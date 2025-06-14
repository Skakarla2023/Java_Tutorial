package g;

public class Stringrev1
{
	
		public static void main(String[] args)
		{
			String str1="madam";
			System.out.println("Original String:"+str1);
			StringBuilder sb=new StringBuilder(str1);
			sb.reverse();
			String str2=sb.toString();
			System.out.println("Reversed string:"+sb.toString());
			if(str1.equals(str2))
			{
				System.out.println("palindrome");
			}
		}
	}