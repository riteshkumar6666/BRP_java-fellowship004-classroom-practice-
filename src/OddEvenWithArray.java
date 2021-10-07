////***BRP-java fellowship_004***
//Program to Count Even and Odd Numbers in an Array
public class OddEvenWithArray {
    public static void main(String[] args) {
        int a[]={1,4,5,6,8,9};

        for (int i=0;i<a.length;i++)
        {
            if (a[i]%2==0)
            {
                System.out.println("even" +a[i]);
            }
            else
            {
                System.out.println("odd" +a[i]);
            }
        }

    }
}
