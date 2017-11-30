import java.util.Scanner;

//insert element at specific position array
public class second
{
    public static void main(String[] args) {

        int arr[]=new int[10];
        Scanner sc=new Scanner(System.in);
                for(int i=0;i<arr.length;i++)
                {
                    arr[i]=sc.nextInt();
                }
                System.out.println("Enter the number position");
                int x=sc.nextInt();
                temp(arr,x);
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }
    static int temp(int[] arr,int x){
for(int i=arr.length-1;i>=x;i--){
    arr[i]=arr[i-1];

}
arr[x-1]=30;

        return 0;
}
}