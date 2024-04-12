package HackChallanges;

public class PiggyBankDemo {
    public static void main(String[] args) {
        PiggyBankDemo demo = new PiggyBankDemo();
        System.out.println(demo.piggyBank(10,4));
    }
    public String piggyBank(int days,int amount){
        int total_odd_savings = 0;
        int total_even_savings = 0;
        int odd_sum = 0;
        int even_sum=0;

        for(int i = 1;i<=days;i++) {

            if(i == 1){
                total_odd_savings = amount;
                odd_sum = odd_sum+total_odd_savings;
                System.out.println("Day"+i +": "+total_odd_savings);
            }
            else if (i % 2 != 0) {
                total_odd_savings = total_odd_savings + total_odd_savings;
                odd_sum = odd_sum + total_odd_savings;
                System.out.println("Day"+i +": "+total_odd_savings);

            }

            if (i % 2 == 0) {
                total_even_savings = total_odd_savings / 2;
                even_sum = even_sum + total_even_savings;
                System.out.println("Day"+i +": "+total_even_savings);

            }
        }
            return "\n"+odd_sum+":"+even_sum;

    }
}
