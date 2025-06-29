import java.util.Scanner;

public class SumOfTwoArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the number of elements in array 1");

        int num1 = sc.nextInt();
        int[]  arr1 = new int[num1];

        System.out.println("enter the elements");

        for(int i =0;i<num1;i++){
            arr1[i] = sc.nextInt();
        }

        System.out.println("enter the number of elements in array 1");
        
        int num2 = sc.nextInt();
        int[]  arr2 = new int[num2];

        
        System.out.println("enter the elements");

        for(int i =0;i<num2;i++){
            arr2[i] = sc.nextInt();
        }

        int max = num1 > num2 ? num1 : num2 ;
        int[]  arr3 = new int[max];


        num1--;
        num2--;
        max--;

        while(num1 >= 0 && num2 >= 0){
            
            arr3[max] = arr1[num1] + arr2[num2];

            num1--;
            num2--;
            max--;
        }

        while(max >= 0){
            if(num1>= 0){
                arr3[max] = arr1[max];
            }
            else
            {
                arr3[max] = arr2[max];                
            }
            max--;
        }

        System.out.println("result:");

        for(int i =0;i<arr3.length;i++){
            System.out.printf("%d",arr3[i]);
        }

    }
}
