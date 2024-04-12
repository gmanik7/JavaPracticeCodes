package prp;

import java.util.Arrays;
import java.util.Scanner;

public class PersonsAndTokens {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input1 = 5;
        String[] input2 = {"sai","apoorva","meena","vani","neeraj"};
        int[] input3 = {56,21,4,32,46};
        PersonsAndTokens tokens = new PersonsAndTokens();
        tokens.findSequence(input1,input2,input3);
    }


    public String findSequence(int input1,String[] input2,int[] input3){

        int i;
        int x = 0,y = 0,z = 0,isSequencePresent=0;
        int[] tokensArr = input3.clone();
        Arrays.sort(tokensArr);

        for(i=0;i<input1-2;i++){
            if(tokensArr[i+1]-tokensArr[i] == 1 && tokensArr[i+2]-tokensArr[i+1] == 1){
                isSequencePresent = 1;
                x=tokensArr[i];
                y=tokensArr[i+1];
                z=tokensArr[i+2];
                break;
            }
        }
        if(isSequencePresent == 0){
            return "NONE";
        }

        int first = 0,second = 0,third=0;

        //checkingthe position of given input token array for the result obtained above from sorted array of input3 (line no 29,30,31)
        for(i=0;i<input1;i++){
            if(x==input3[i]){
                first=i;
            }
            if(y==input3[i]){
                second=i;
            }
            if(z==input3[i]){
                third=i;
            }
        }
        return input2[first]+":"+input2[second]+":"+input2[third];
    }

}
