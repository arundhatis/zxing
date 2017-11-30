import com.sun.corba.se.impl.oa.NullServantImpl;
//to delete from array
import java.util.Scanner;
public class first {
   // int n;
    public static void main(String[] args)  {
        int arr[]=new int[10];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<10;i++)
        {
            arr[i]=sc.nextInt();
        }
        remove(arr);
        for(int i:arr)
            System.out.println(i);

    }
    static int remove(int[] arr) {

        int i;
        int flag=0;
        if(arr == null)
            return -1;
    else

        {
            System.out.println("hello");
            for (i = 0; i < arr.length-1; i++) {
                if (arr[i] == 25)
                    flag = 1;
                if (flag == 1)
                    arr[i] = arr[i + 1];

                //if(flag==1&&i==9)


            }

        }

        return 0;

    }
}
