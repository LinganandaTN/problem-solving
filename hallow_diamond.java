import java.util.Scanner;
public class hallow_diamond {
    public static void main(String a[]){
        System.out.println("enter the number of rows u want");
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=i;j<n;j++){
                System.out.print(" ");
            }
            for(int j=1;j<i;j++){
                if(j==1)
                System.out.print("*");
                else
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                if(j==i)
                System.out.print("*");
                else
                System.out.print(" ");
            }
            System.out.println();
        }
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(" ");
            }
            for(int j=i;j<n-1;j++){
                if(j==i)
                System.out.print("*");
                else
                System.out.print(" ");
            }
            for(int j=i;j<=n-1;j++){
                if(j==n-1)
                System.out.print("*");
                else
                System.out.print(" ");               
            }
            System.out.println();
        }

        for(int i=1;i<=n;i++){
            for(int j=i;j<n;j++){
                System.out.print(" ");
            }
            for(int j=1;j<i;j++){
                if(j==1)
                System.out.print("*");
                else
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                if(j==i)
                System.out.print("*");
                else
                System.out.print(" ");
            }
            System.out.println();
        }
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(" ");
            }
            for(int j=i;j<n-1;j++){
                if(j==i)
                System.out.print("*");
                else
                System.out.print(" ");
            }
            for(int j=i;j<=n-1;j++){
                if(j==n-1)
                System.out.print("*");
                else
                System.out.print(" ");               
            }
            System.out.println();
        }
    }
}
