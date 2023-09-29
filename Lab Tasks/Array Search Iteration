import java.util.Random;
import java.util.Scanner;
public class ArraySearch {
    public void arrayItreation(int size) {
        Scanner sc=new Scanner(System.in);
        int arr[] = new int[size];

        Random r = new Random();
        for(int j=0; j<size; j++){
            arr[j]= r.nextInt(15);
            System.out.print(arr[j]+" ");
        }
        System.out.println("\nEnter to search the number: ");
        int search=sc.nextInt();
        boolean found=false;

        for(int i=0; i<size; i++){
            if(search==arr[i]){
                found=true;
                break;
            }
        }
        if(found){
            System.out.println(search+" Number is Present");
        }
        else{
            System.out.println(search+"Number is not present");
       }

    }

    public static void main(String args[]){

        ArraySearch a=new ArraySearch();
        a.arrayItreation(5);



    }
}
