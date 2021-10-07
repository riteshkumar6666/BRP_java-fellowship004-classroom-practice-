//***BRP-java fellowship_004***
//Sum of all elements of an array
import java.util.Scanner;

public class A {
    public static void main(String[] args) {

        int a[]=new int[5];
        int sum=0;

        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER ELEMENTS IN ARRAY ");

        for (int i=0;i<a.length;i++)
        {
            a[i]= sc.nextInt();
        }
        System.out.println("ARRAY ELEMENTS");

        for (int i=0;i<a.length;i++)
        {
            System.out.println(a[i]+" ");
            sum=a[i]+sum;
        }
        System.out.println("\nADDITION "+sum);
    }
}
