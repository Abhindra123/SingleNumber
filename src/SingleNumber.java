import java.util.Scanner;

public class SingleNumber {
    public static int singleNumber(int arr[]){
        int num=0;
        for(int i=0;i<arr.length;i++){
            num=num^arr[i];
        }
        return num;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int n=sc.nextInt();
        int arr[]=new int[n];

        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int val=singleNumber(arr);
        System.out.println("the value is: "+val);
    }
}