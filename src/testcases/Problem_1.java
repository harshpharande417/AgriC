package testcases;


	import java.util.Arrays;
	
	
	public class Problem_1 {

		 
		    static final int NO_OF_CHARS = 256;
		 
		    static int longestUniqueSubsttr(String str)
		    {
		        int n = str.length();
		 
		        int res = 0; // result
		 
		        int [] lastIndex = new int[NO_OF_CHARS];
		        Arrays.fill(lastIndex, -1);
		 
		        int i = 0;
		 
		        for (int j = 0; j < n; j++) {
		 
		            i = Math.max(i, lastIndex[str.charAt(j)] + 1);

		            res = Math.max(res, j - i + 1);
		 
	     lastIndex[str.charAt(j)] = j;
		        }
		        return res;
		    }
		 
		 
		    public static void main(String[] args)
		    {
		        String str = "mynameisharshad";
		        System.out.println("The input string is " + str);
		        int len = longestUniqueSubsttr(str);
		        System.out.println("The length of " + "the longest non repeating character is " + len);
		    }
		}
		

