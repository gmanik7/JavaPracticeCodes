import java.util.HashMap;

public class FinNumbOfOccurrence {
    public static void main(String[] args) {
        String inputStr = "WELCOME TO JAVA PROGRAMMING";

        //Creating a HashMap containing char as a key and occurrences as a value
        HashMap<Character,Integer> hashMap = new HashMap<>();

        //Converting given string to char array
        char[] ch = inputStr.toCharArray();

        //checking each char of strArray
        for (Character c : ch){
            if(hashMap.containsKey(c)){

                //If char 'c' is present in charCountMap, incrementing it's count by 1
                hashMap.put(c,hashMap.get(c)+1);
            }
            else {
                //If char 'c' is not present in charCountMap,
                //putting 'c' into charCountMap with 1 as it's value
                hashMap.put(c, 1);
            }
        }

        //Printing inputString and charCountMap
        System.out.println(inputStr+": "+hashMap);
    }
}
