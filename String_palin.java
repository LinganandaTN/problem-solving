import java.lang.String;
import java.util.Scanner;
class String_palin{
    public static void main(String a[]){
        System.out.println("enter the String ");
        Scanner s= new Scanner(System.in);
        String str= s.next();
        System.out.println(palin(str));
    }    
    static String palin(String str) {
        if(str.length()>0){
            int left=0;
            int right = str.length()-1;
            while(left!= right){
                if(str.charAt(left) != str.charAt(right)){ 
                  return "not palindrome" ;
                }
                left++;
                right--;
            }
            return "palindrome";
        }
        return "invalid";
       }   
}                