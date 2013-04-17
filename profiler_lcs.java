//import java.util.arrays;
import java.util.*;
class profiler_lcs
{
	public static void main(String args[])
	{
		longest l1 = new longest();
		int randomNum;
		int minimum=0;
		int maximum=2;
		int minimum_length = 10;
		int maximum_length = 20;
		int n = minimum_length + (int)(Math.random()*maximum_length);
		int[] a = new int[n];
		for(int i=0;i<n;i++)
		a[i] = minimum + (int)(Math.random()*maximum);

		String s1="";
		for(int i=0;i<10;i++)
		s1+=Integer.toString(a[i]);
	
		
		
		int m = minimum_length + (int)(Math.random()*maximum_length);
		int[] b = new int[m];
		for(int j=0;j<m;j++)
		b[j] = minimum + (int)(Math.random()*maximum);
		
		String s2="";
		for(int j=0;j<10;j++)
		s2+=Integer.toString(b[j]);
	
		
		String s3 = l1.lcs(s1,s2);
		System.out.println("LCS of "+s1+" and "+s2+" is "+s3);
        
        //Now generating random strings and passing it to LCS.
        
        longest l2 = new longest();
        
		int min_length=10;
		int max_length=20;
        
        int len = min_length+ (int)(Math.random()*max_length);
         s1 = randomwordGenerator(len);

        
        len = min_length+(int)(Math.random()*max_length);
         s2 = randomwordGenerator(len);

        

         s3 = l2.lcs(s2,s1);
        System.out.println("LCS of "+s1+" and "+s2+" is "+s3);
	}
    public static String randomwordGenerator(int wordlength){
		Random rnd=new Random();
		StringBuilder sb=new StringBuilder(wordlength);
		for(int i = 0; i < wordlength; i++) {
            char tmp = (char) ('a' + rnd.nextInt('z' - 'a'));
            sb.append(tmp);
		}
		//System.out.println(sb.toString());
		return sb.toString();
	}
}
