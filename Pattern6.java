import java.util.Scanner;

public class Pattern6 {

    public static void main(String[] args) {
        for(int i = 1;i<4;i++){
            for(int j=1;j<=4-i;j++){
                System.out.print("*\t");
            }
            for(int k = 1;k<=i;k++){
                System.out.print("\t");
            }

            for(int a = 1;a<=i;a++){
               System.out.print("\t");
            }
            for(int b=1;b<=4-i;b++){
              System.out.print("*\t");
            }






            System.out.println();
        }
        for(int i = 2;i>0;i--){
            for(int j = 1;j<=4-i;j++){
                System.out.print("*\t");
               
            }
            for(int k = i ;k > 0;k--){
                System.out.print("\t");
            }




            for(int a = i ; a> 0;a--){
                System.out.print("\t");
            }
            for(int b = 1;b<=4-i;b++){
                System.out.print("*\t");
            }
                   System.out.println();
        }

 
    }

    
 
}