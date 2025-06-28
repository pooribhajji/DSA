import java.util.Scanner;

public class AnyBaseSubtraction {

    public static long subtract(long num1,long num2, long base){
        long carry = 0;
        long ans = 0;
        long sub = 0;
        long index = 0;
        while (num1 > 0 || num2 > 0) {
 

            long remainder1 = num1 % 10;
            long remainder2 = num2 % 10;
            num1 = num1/10;
            num2 = num2/10;

            

            if(remainder1 < remainder2 ){
                sub = remainder1 + base - remainder2 - carry;
                carry =  1;
                
            }else{
                sub = remainder1 - remainder2 - carry;
                carry=0;
            }

            ans = ans + sub*(long)Math.pow(10,index);

            index++;
            
        }

        ans = ans + carry*(long)Math.pow(10,index);           
  
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter num 1");
        long num1 = sc.nextLong();
        System.out.println("enter num2");
        long num2 = sc.nextLong();
        System.out.println("enter the base");
        long base = sc.nextLong();


        System.out.printf("ANSWER : %d", (int)subtract(num1, num2, base));

    }
}