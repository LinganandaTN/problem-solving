import java.util.Scanner;
public class diamond {
    public static void main(String a[]){
        System.out.println("enter the number of rows u want ");
        Scanner s = new Scanner (System.in);
        int n= s.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=i;j<n;j++){
                System.out.print(" ");
            }
            for(int j=1;j<i;j++){
                System.out.print("*");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(" ");
            }
            for(int j=i;j<n-1;j++){
                System.out.print("*");
            }
            for(int j=i;j<=n-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=1;i<=n;i++){
            for(int j=1;j<i;j++){
                System.out.print(" ");
            }
            for(int j=i;j<n;j++){
                System.out.print("*");
            }
            for(int j=i;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=1;i<=n;i++){
            for(int j=i;j<n;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }

            System.out.println();
        }

        for(int i=1;i<=n;i++){
            for(int j=i;j<n;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }

            System.out.println();
        }
        for(int i=1;i<=n;i++){
            {
                for(int j=1;j<=n*2-1;j++){
                    System.out.print("*");

                }
                System.out.println();

            }

        }


        for(int i=1;i<=n;i++){
            for(int j=i;j<n;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }

            System.out.println();
        }
        for(int i=1;i<=n*2-1;i++){
            {
                for(int j=1;j<=n*2-1;j++){
                    System.out.print("*");

                }
                System.out.println();

            }

        }

        for(int i=0;i<n;i++) {
            for(int j=0;j<=1;j++) {
                System.out.print(" ");
            }
            for(int j=0;j<=n;j++) {
                System.out.print("*");
            }
        System.out.println();
        }
    } 
}
