import java.util.Scanner;

public class Task2 {
    void extractBoundries(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of Rows: ");
        int r= sc.nextInt();
        System.out.println("Enter the number of column: ");
        int c= sc.nextInt();
        int arr2[][]=new int[r][c];

        for(int a=0; a<r; a++){
            System.out.println();
            for (int b=0; b<c; b++){
                arr2[a][b]= sc.nextInt();


            }
        }
        for(int i=0; i<r; i++){
            System.out.println();
            for(int j=0; j<c; j++){
                //System.out.print("  "+arr2[i][j]);
                if(i==0 || j==0 || i==(r-1) || j==(c-1)) {
                    System.out.print(" " + arr2[i][j]);
                }
                else {
                    System.out.print("  ");
                }
            }
        }

    }
    public static void main(String args[]){

    Task2 t2=new Task2();
    t2.extractBoundries();

    }
}
