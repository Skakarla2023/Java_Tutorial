package g;

import java.util.*;
import java.lang.*;

public class Vowelcount {
	public static void main(String[] args) {
		String s=new String("This is my first code");
		System.out.println(s.toLowerCase()); 
		int v=0,c=0;
		int n=s.length();
		for(int i=0;i<n;i++){
			if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u') {
				v++;
			}
			else
			{
				c++;
			}
		}
		System.out.println("Vowels count:"+v);
		System.out.println("Consonants sound:"+c);
	}
}
