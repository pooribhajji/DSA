import java.util.Scanner;

public class Pattern17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter odd num");
        int num = sc.nextInt();
        int mid = num/2 + 1;

        for(int i =1;i<=num;i++){
            for(int j = 1;j<=num;j++){
                if(i == mid || j == mid){
                    System.out.print("*\t");
                }
                else if(j>mid && j<num && (i >= mid-(num-j) && i <= mid+(num-j) ) ){
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
