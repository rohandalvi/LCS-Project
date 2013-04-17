//To calculate the longest common subsequence of two strings. 
public class longest {
	public static void main(String args[])
	{
		String str1 = args[0];
		String str2 = args[1];
		long t1 = System.currentTimeMillis();
        
		String str3 = lcs(str2,str1);
        
		System.out.println(str3);
		
	}
	public static String lcs(String a, String b) {
	    int[][] indexes = new int[a.length()+1][b.length()+1];
	    for (int i = 0; i < a.length(); i++)
	        for (int j = 0; j < b.length(); j++)
	            if (a.charAt(i) == b.charAt(j)){
	                indexes[i+1][j+1] = indexes[i][j] + 1;
	                
	            }
	            else{
	            	
	                indexes[i+1][j+1] =Math.max(indexes[i+1][j], indexes[i][j+1]);
	            }
	 
	    int i=a.length();
	    int j=b.length();
	    StringBuffer sb = new StringBuffer();
	    
        while(i!=0 && j!=0) {
	        if (indexes[i][j] == indexes[i-1][j])
	            i--;
	        else if (indexes[i][j] == indexes[i][j-1])
	            j--;
	        else {
	            sb.append(a.charAt(i-1));
	            i--;
	            j--;
	        }
	    }
	    return sb.reverse().toString();
	}
}
