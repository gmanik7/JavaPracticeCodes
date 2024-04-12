package JavaPyramidsPatterns;

import java.util.Scanner;

public class PyramidOne {
    public static void main(String[] args) {

        System.out.println("Enter the no of rows do u want to print the pyramid? ");
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();

        int rowCount = 1;


        for(int i = rows;i>0;i--){
            for (int j=1;j<=i;j++){
                System.out.print(" ");
            }

            for(int j =1;j<=rowCount;j++){
                System.out.print(rowCount+" ");
            }
            System.out.println();
            rowCount++;
        }

    }
}
