package Introduction;

import java.util.ArrayList;
import java.util.HashSet;

public class GFG {
    // Function to check if all the
// string characters are unique
    static boolean check(String s)
    {
        HashSet<Character> a = new HashSet<>();

        // Check for repetition in
        // characters
        for(int i = 0; i < s.length(); i++)
        {
            if (a.contains(s.charAt(i)))
            {
                return false;
            }
            a.add(s.charAt(i));
        }
        return true;
    }
            // Function to generate all possible
           // strings from the given array
    static ArrayList<String> helper(ArrayList<String> arr,
                                    int ind)
    {
        ArrayList<String> fin = new ArrayList<>();
        fin.add("");

        // Base case
        if (ind == arr.size() )
            return fin;

        // Consider every string as
        // a starting substring and
        // store the generated string
        ArrayList<String> tmp = helper(arr, ind + 1);

        ArrayList<String> ret = new ArrayList<>(tmp);

        // Add current string to result of
        // other strings and check if
        // characters are unique or not
        for(int i = 0; i < tmp.size(); i++)
        {
            String test = tmp.get(i) +
                    arr.get(ind);

            if (check(test))
                ret.add(test);
        }
        return ret;
    }

    // Function to find the maximum
// possible length of a string
    static int maxLength(ArrayList<String> arr) {
        ArrayList<String> tmp = helper(arr, 0);

        int len = 0;

        // Return max length possible
        for(int i = 0; i < tmp.size(); i++)
        {
            len = len > tmp.get(i).length() ? len :
                    tmp.get(i).length();
        }

        // Return the answer
        return len;
    }

    // Driver code
    public static void main (String[] args)
    {
        ArrayList<String> s = new ArrayList<>();
        s.add("eva");
        s.add("jqw");
        s.add("tyn");
        s.add("jan");
        System.out.println(GFG.helper(s,0));
       System.out.println(maxLength(s));
    }
}
