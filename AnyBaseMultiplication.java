import java.util.Scanner;

public class AnyBaseMultiplication {
    public static long add(long num1,long num2, long base){
        long carry = 0;
        long ans = 0;
        long sum = 0;
        long index = 0;
        while (num1 > 0 || num2 > 0) {
 

            long remainder1 = num1 % 10;
            long remainder2 = num2 % 10;
            num1 = num1/10;
            num2 = num2/10;

            sum = remainder1 + remainder2 + carry;

            if(sum>= base){
                carry =  1;
                sum = sum - base ;
            }else{
                carry=0;
            }

            ans = ans + sum*(long)Math.pow(10,index);

            index++;
            
        }

        ans = ans + carry*(long)Math.pow(10,index);           
  
        return ans;
    }

    
    public static long multiply(long num1 , long num2 , long base){
        long  multiplier = 0;
        long index = 0;
        long prevImmediateSum = 0;
        long currImmediateSum = 0;
        long result = 0;
        long i = 1;
        long num1Copy = num1;

        while (num2 > 0) {
            multiplier = num2 % 10;
            num2 = num2 / 10;
            
            long immediateSum = 0;
            long carry = 0;
 

            while (num1 > 0) {
                long multiplicant = num1 % 10;
                num1 = num1 / 10;

                long immediateResult = multiplicant * multiplier + carry;
                long immediateAnswer = immediateResult % base;
                carry = immediateResult / base ;

                immediateSum = immediateSum + immediateAnswer*(long)Math.pow(10, index);
                index++ ;

            }
            immediateSum = immediateSum + carry*(long)Math.pow(10,index);

            currImmediateSum = immediateSum;

            result = add( currImmediateSum , prevImmediateSum , base );
            index = i;
            i++;
            prevImmediateSum = result;
            num1 = num1Copy;
        }

        return result;
        
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("enter num 1");
        long num1 = sc.nextLong();
        System.out.println("enter num2");
        long num2 = sc.nextLong();
        System.out.println("enter the base");
        long base = sc.nextLong();


        System.out.printf("ANSWER : %d", (int)multiply(num1, num2, base));
    }
}
