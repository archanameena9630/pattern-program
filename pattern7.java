// 11111
// 2222
// 333
// 44
// 5
 
 import java.util.Scanner;
  public class pattern7{
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println(" enter a number");
        int num=obj.nextInt();
                for (int i=1;i<=num;i++){
                 for ( int j=1;j<=num-i+1;j++){

             System.out.print(i+"");
            }
         System.out.println();
        }
    }
}

