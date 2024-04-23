import java.util.*;

public class TimeFabonacci {
    public static void main(String[] args) {
        FabonacciB obj = new FabonacciB();
        FabonacciB obj1 = new FabonacciB();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number for Factorial --> ");
        int num = sc.nextInt();
        System.out.println();
        long startTime = System.nanoTime();
        System.out.print("Factorial is --> ");
        obj.recursiveFactorial(num);
        System.out.println();
        long endTime = System.nanoTime();
        long duration = endTime - startTime;
        System.out.println("Time taken by iterative approach is --> " + duration + " nanoseconds");
        startTime = System.nanoTime();
        System.out.println("Factorial is --> " + obj1.recursiveFactorial(num));
        endTime = System.nanoTime();
        long duration2 = endTime - startTime;
        System.out.println("Time taken by recursive approach is --> " + duration2 + " nanoseconds");
        if(duration2 < duration) {
            System.out.println("Recursive approach is best");
        }
        else {
            System.out.println("Iterative appraoch is best");
        }


    }
}

class FabonacciA {
    public void factorial(int num) {
        int mul = 1;
        for (int i = 1; i <= num; i++) {
            mul *= i;
        }
        System.out.println("Factorial of " + num + " is --> " + mul);
    }
}

class FabonacciB {
    static int temp = 1;

    public static int recursiveFactorial(int num) {
        if (num < 1) {
            return temp;
        }
        temp = num * recursiveFactorial(num - 1);
        return temp;
    }


}
