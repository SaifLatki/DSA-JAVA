public class SelectionSorting {
    public void selectionMethod(int arr[],int n){
        for(int i=0; i<n-1; i++){
            int imin=i;
            for(int j=i+1;j<n; j++){
                if(arr[j]<arr[imin]){
                    imin=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[imin];
            arr[imin]=temp;
        }
        for(int k=0; k<n; k++){
            System.out.print(arr[k]+" ");
        }
    }

    public static void main(String[] args) {
        SelectionSorting s=new SelectionSorting();
        int arr[]={1,4,5,2,6,3};
        System.out.println("Unsorted");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("Selection Sorted");
        s.selectionMethod(arr,6);

    }
}
