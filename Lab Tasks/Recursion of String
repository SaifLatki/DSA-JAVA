public class RecursionB {
    public void forword(String id,int i){

        if(i>=id.length()){
            return;
        }
        else{
            char ch=id.charAt(i);
            System.out.print(ch);
            forword(id,i+1);
        }
    }
    public void backward(String id2,int j){

        if(j<0){
            return;
        }
        else{
            char ch2=id2.charAt(j);
            System.out.print(ch2);
            backward(id2,j-1);
        }
    }
    public static void main(String args[]){
        RecursionB r1=new RecursionB();
        System.out.println("Forward");
        r1.forword("36237",0);
        System.out.println();
        String str="36237";
        int i=str.length()-1;
        System.out.println("Backward");
        r1.backward(str,i);

    }

}
