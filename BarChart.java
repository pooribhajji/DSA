import java.util.Scanner;

public class BarChart {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the number of elements");
        int num = sc.nextInt();
        int[] arr = new int[num];

        System.out.println("enter the  elements");
        
        
        for(int i=0;i<num;i++){
            arr[i] = sc.nextInt();
        }

        int max = arr[0];

        for(int i =0;i<num;i++){
            if(max < arr[i]){
                max = arr[i];
            }
        }


        for(int i = max;i>=1;i--){
            for(int j = 1;j<=max;j++ ){
                if(arr[j-1] >= i ){
                    System.out.print("*\t");
                }
                else{
                    System.out.print("\t");
                }
            }
            System.out.println();
        }


    }
}
