
public class ArrayTask {
    int size;
    String  arr[][];
    ArrayTask(int size){
        this.size=size;
       this.arr=new String[size][4];
    }

    public void addNewTask(String task ,String title,String discrp,String status,int ind){
        arr[ind][0]=task;
        arr[ind][1]=title;
        arr[ind][2]=discrp;
        arr[ind][3]=status;
    }
    public void updateStatus(String stat, int ind){
        arr[ind][3]=stat;
    }
    public void deleteTask(String tit){
        for(int i=0; i<arr.length; i++) {
            if(arr[i][1]!=null && arr[i][1].equals(tit)) {
                for (int j = i; j < arr.length-1; j++) {
                    arr[j]=arr[j+1];
                }
                arr[arr.length-1]=new String[4];
                return;
            }
        }
            System.out.println("Task is not Present");

    }


    public void display(){
        for(int i=0; i<arr.length; i++){
            System.out.println();
            for(int j=0; j<arr[i].length; j++){
                System.out.print(arr[i][j]+ "     ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ArrayTask t=new ArrayTask(2);
        System.out.println("Task#   Title     Discription     Starus ");
        t.addNewTask("1","To do ","Pending Discp","Not Done",0);
        t.addNewTask("2","Already does","Complete Discp","Done",1);
        t.display();
//        t.updateStatus("all done",0);
//        t.display();

        t.deleteTask("To do");
        t.display();
    }

}
