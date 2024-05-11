public class FibonacciA {
    public void methodIteration(int a){

        int num1=0;
        int num2=1;
        int total;
        for(int i=0; i<a;i++){
            total=num1+num2;
            num1=num2;
            num2=total;
            System.out.print(num2+ " ");
        }
    }
    public void methodRecursive(int n){
        int n1=0;
        int n2=1;
        int total;
        if(n>0){
            methodRecursive(n-1);
            total=n1+n2;
            n1=n2;
            n2=total;
            System.out.print(n+" ");
        }


    }


    public static void main (String args[]){
        FibonacciA f1=new FibonacciA();
        f1.methodIteration(10);
        f1.methodRecursive(10);

    }
}
