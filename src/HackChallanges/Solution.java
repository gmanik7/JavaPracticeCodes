package HackChallanges;

class Solution {
    public static void main(String[] args) {
        System.out.println(Solution.numberOfSteps(123));
    }
    public static int numberOfSteps(int num) {
        int count = 0;

        if (num == 0) {
            count = 0;
        }

        if (num % 2 != 0) {
            while (num != 0) {
                int res;
                if(num%2 !=0){
                     res = (num - 1);
                    num = res;
                    count++;
                }

                if(num == 0){
                    count=count+0;
                }
                else if(num % 2 == 0) {
                    res = num / 2;
                    num = res;
                    count++;
                }
            }
        }

        if (num % 2 == 0) {
            while (num != 0) {
                int res = 0;

                if (num % 2 == 0) {
                    res = num / 2;
                    num = res;
                    count++;
                }

                if (res % 2 != 0) {
                    res = res - 1;
                    num = res;
                    count++;
                }
            }
        }

        return count;
    }
}
