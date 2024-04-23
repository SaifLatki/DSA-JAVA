public class Factorial {
    public void methodItreation(int num){
        int result=1;
        for(int i=1;i<=num; i++){
            result *=i;
        }
        System.out.println("Factorial is= "+result);

    }
    public int methodRecursion(int n) {
        int fac;

        if (n == 0) {
            return 1;
        }
        else if(n<0){
            System.out.println("Invalid Number ");
        }
        else{
            fac=n* methodRecursion(n - 1);
            System.out.print(" * "+fac);
            return fac;

        }
        return 0;
    }
    public static void main(String args[]){
        Factorial f=new Factorial();
        System.out.println("Iteration ");
        f.methodItreation(5);
        System.out.println("Recursive " );
        System.out.println(" Factorial= "+ f.methodRecursion(5));


    }
}
