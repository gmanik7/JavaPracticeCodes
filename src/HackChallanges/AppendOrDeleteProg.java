package HackChallanges;

import java.io.*;
import java.util.Scanner;

class Result {
    public static String appendAndDelete(String s, String t, int k) {
        // Write your code here

        int s_len = s.length();
        int t_len = t.length();


        if ((s_len + t_len) <= k) return "Yes";

        int count = 0;


        for (int i = 0; i < t.length() && i < s.length(); i++) {
            if (s.charAt(i) == t.charAt(i)) {
                count++;
            } else {
                break;
            }
        }
            int op = ((t_len - count) + (s_len - count));

            if (op <= k && (k - op) % 2 == 0) return "Yes";


            return "No";
        }
    }




public class AppendOrDeleteProg {
    public static void main(String[] args) throws IOException {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//
//
//        String s = bufferedReader.readLine();
//
//        String t = bufferedReader.readLine();
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = sc.nextLine();

       int k = sc.nextInt();



      //  int k = Integer.parseInt(bufferedReader.readLine().trim());

        String result = Result.appendAndDelete(s, t, k);
        System.out.println(result);

//        bufferedWriter.write(result);
//        bufferedWriter.newLine();
//
//        bufferedReader.close();
//        bufferedWriter.close();
    }
}
