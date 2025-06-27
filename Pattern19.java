import java.util.Scanner;

public class Pattern19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter num");
        int num = sc.nextInt();
        int mid = num/2 + 1;

        for(int i= 1;i<=num;i++){
            for(int j =1;j<=num;j++){
                if( i == mid || j == mid){
                    System.out.print("* ");                
                }
                else if( j < mid && i == 1 || j > mid && i == num){
                    System.out.print("* ");
                }
                else if( i > mid && j == 1 ||i < mid && j == num ){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
