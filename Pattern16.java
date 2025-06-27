import java.util.Scanner;

public class Pattern16 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter num");
        int num = sc.nextInt();
        int x = 2*num - 1;  //Gives total of spaces and nums in each row(fixed)

        for(int i = 1;i<=num;i++){  //i==>Gives number of rows
            if(i<num){
                for(int j=1;j<=i;j++){  //before space nums
                   System.out.printf("%d\t",j);
                }
                for(int spaces=1;spaces<=x-2*i;spaces++){
                   System.out.print("\t");
                }
                for(int k=i;k>=1;k--){  //after space nums
                   System.out.printf("%d\t",k);
                }
                System.out.println();

            }else{
                for(int j=1;j<i;j++){  //before num  nums
                   System.out.printf("%d\t",j);
                }
                System.out.printf("%d\t",num);
                for(int k=i-1;k>=1;k--){  //initial num nums
                   System.out.printf("%d\t",k);
                }      
                System.out.println();          

            }
        }
    }
}