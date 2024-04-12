public class StringReversal {
    public static void main(String[] args) {
        String str1 = "welcome";
        String str2 = "";
        char[] ch =  str1.toCharArray();
        for(int i = str1.length()-1;i>=0;i--){
            //converting char to string using String.valueOf
            str2= str2+ String.valueOf(str1.charAt(i));
        }
        System.out.println(str2);

        System.out.println("----------------------------------------------------------------");

        String str = "MyJava";

        //1. Using StringBuffer Class

        StringBuffer sbf = new StringBuffer(str);

        System.out.println(sbf.reverse());    //Output : avaJyM

        System.out.println("----------------------------------------------------------------");

        //2. Using iterative method

        char[] strArray = str.toCharArray();

        for (int i = strArray.length - 1; i >= 0; i--)
        {
            System.out.print(strArray[i]);    //Output : avaJyM
        }

        System.out.println();

        System.out.println("----------------------------------------------------------------");

        //3. Using Recursive Method

        System.out.println(recursiveMethod(str));    //Output : avaJyM
    }

    //Recursive method to reverse string

    static String recursiveMethod(String str)
    {
        if ((null == str) || (str.length() <= 1))
        {
            return str;
        }

        return recursiveMethod(str.substring(1)) + str.charAt(0);
    }
    }
