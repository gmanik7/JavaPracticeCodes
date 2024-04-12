public class NumberOfOccurences {
    public static void main(String[] args) {
         final int MAX_CHAR = 256;
        String str ="manikantasai";

        int[] arr = new int[MAX_CHAR];

        int len = str.length();

        for (int i=0;i<len;i++) {
            arr[str.charAt(i)]++;
        }
            char[] ch = new char[str.length()];
            for(int i=0;i<len;i++){

            ch[i] = str.charAt(i);

            int find = 0;
            for(int j=0;j<=i;j++){
                if(str.charAt(i) == ch[j]){
                    find++;
                }
                if(find == 1){
                    System.out.println("Number of occurences of "+str.charAt(i)+" is: "+arr[str.charAt(i)]);
                }
            }
        }
    }
}

/**
 * // Java program for the above approach
 * class NoOfOccurrenceOfCharacters {
 * 	static final int MAX_CHAR = 256;
 *
 * 	static void getOccurringChar(String str)
 *        {
 *
 * 		// Create an array of size 256
 * 		// i.e. ASCII_SIZE
 * 		int count[] = new int[MAX_CHAR];
 *
 * 		int len = str.length();
 *
 * 		// Initialize count array index
 * 		for (int i = 0; i < len; i++)
 * 			count[str.charAt(i)]++;
 *
 * 		// Create an array of given String size
 * 		char ch[] = new char[str.length()];
 * 		for (int i = 0; i < len; i++) {
 * 			ch[i] = str.charAt(i);
 * 			int find = 0;
 * 			for (int j = 0; j <= i; j++) {
 *
 * 				// If any matches found
 * 				if (str.charAt(i) == ch[j])
 * 					find++;
 *            }
 *
 * 			if (find == 1)
 * 				System.out.println("Number of Occurrence of "+ str.charAt(i)+ " is:" + count[str.charAt(i)]);
 * 				}
 *    }
 *
 * 	// Driver Code
 * 	public static void main(String[] args)
 *    {
 * 		String str = "geeksforgeeks";
 * 		getOccurringChar(str);
 *    }
 * }
 */