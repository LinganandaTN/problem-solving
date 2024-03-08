import java.util.Scanner;
class gcd{
    public static void main(String a[]){
        System.out.println("enter the first number");
        Scanner s =new Scanner(System.in);
        int num1= s.nextInt();
        System.out.println("enter the second number");
        int num2 = s.nextInt();

        while(num2!=0)
        {
            int temp = num2;
            num2 = num1 % num2;
            num1 = temp;
        }
        System.out.println(num1);
    }

}