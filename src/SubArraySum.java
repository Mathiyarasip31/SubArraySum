import java.util.Scanner;

public class SubArraySum {
    static void sumArray(int arr[],int n)
    {
        int result=0;
        int sum=0;
        for (int i=0;i<n;i++)
        {
            for (int j=i;j<n;j++)
            {
                for (int k=i;k<=j;k++)
                {
                    sum=sum+arr[k];
                }
            }
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int size=scanner.nextInt();
        int arr[]=new int[size];
        for (int i= 0;i<size;i++)
        {
            arr[i]=scanner.nextInt();
        }
        sumArray(arr,size);
    }
}