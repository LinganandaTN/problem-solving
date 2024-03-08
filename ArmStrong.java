import java.util.Scanner;

class ArmStrong{
    public static void main(String a[]){
    System.out.println("enter  the number");
    Scanner s =new Scanner(System.in);
    int n= s.nextInt();
    int d=0;

    while(n>0){
        n=n/10;
        d++;
    }
    int sum = 0;
    System.out.println(d);
    while(n>0){
        int r=n%10;
        System.out.print('r');
        int sq = (int)Math.pow(r,d);
        System.out.print(sq);

        sum= sum + sq ;
       
        n=n/10;
    }
    System.out.print(sum);
}
}