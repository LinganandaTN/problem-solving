import java.util.Scanner;
public class upstairs {
    public static void main(String a[]){
        System.out.println("enter the number of rows u want");
        Scanner s= new Scanner(System.in);
        int n= s.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=i;j<n;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();

        }
    }    
}
