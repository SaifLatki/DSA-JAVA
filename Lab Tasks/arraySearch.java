import java.util.Random;
import java.util.Scanner;
public class ArraySearchRecursive {
    public void recursiveArraySearch(int arr[],int i){
        if(i==arr.length){
            return;
        }
        Random r2=new Random();
        Scanner sc=new Scanner(System.in);
        arr[i]=r2.nextInt(15);


        System.out.print(arr[i]+" ");
        recursiveArraySearch(arr,i+1);
        System.out.println("\nEnter the number to find: ");
        int search=sc.nextInt();
        boolean found=false;
        for(int j=0; j<i; j++){
            if(search==arr[j]){
                found=true;
                break;
            }
        }
        if(found){
            System.out.println(search+"Number is present");
        }
        else{
            System.out.println(search+"Number is not present");
        }

    }
    public static void main(String args[]){

        int size=5;
        int arr[]=new int[size];
        ArraySearchRecursive as=new ArraySearchRecursive();
        as.recursiveArraySearch(arr,0);


    }
}
