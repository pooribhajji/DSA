import java.util.Scanner;

public class Pattern10{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter num");
        int num = sc.nextInt();
        int mid = num / 2;

        for(int i = 1; i<= num ;i++){
            if (i == 1 || i == num ){

                for(int space = 1;space<=mid;space++){
                    System.out.print("\t");
                }
                System.out.print("*\t");
            }else if( i <= mid + 1){
                for(int space = 1;space<= (mid+1)-i;space++){
                    System.out.print("\t");
                }
                System.out.print("*\t");
                for(int space=1;space<=2*(i-1)-1;space++){
                    System.out.print("\t");
                }
                System.out.print("*\t");
            }
            else{
                for(int space = 1;space<= (mid+1)-(num + 1 - i);space++){
                    System.out.print("\t");
                }
                System.out.print("*\t");
                for(int space=1;space<=2*(num -i)-1;space++){
                    System.out.print("\t");
                }
                System.out.print("*\t");                
            }
            System.out.println();
        }
    }
}