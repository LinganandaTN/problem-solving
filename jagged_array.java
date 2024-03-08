
import java.util.Scanner;

public class jagged_array
{ 
 public static void main(String[]args)
 {
	 int a[][][]= new int[2][3][4];
     System.out.println(a.length);
     System.out.println(a[0].length);
     System.out.println(a[0][0].length);
     System.out.println(a[1].length);
     System.out.println(a[0][1].length);
	 Scanner sc = new Scanner(System.in);
	 for(int i =0;i<a.length;++i)
	 {
		 
		 for(int j =0; j<a[i].length;++j)
		 {
			 
		   for(int k=0;k<a[i][j].length;++k)
		    {
			 System.out.print("enter the school "+i+" of class "+j+" of student " +k+": ");
			 a[i][j][k]=sc.nextInt();
		     }
	 }
		 System.out.println();
 }
 
 for(int i=0;i<a.length;++i)
 {
	 System.out.println("School-"+(i+1));
	 for(int j=0;j<a[i].length;++j)
	 {
		 System.out.print("Class-"+ (j + 1) +" :");
		 for(int k=0;k<a[i][j].length;++k)
		 {
			 System.out.print(a[i][j][k]+" ");
		 }
		 
		 System.out.println();
	 
	 }
	 
	 System.out.println();
	 
 }
 
}
}