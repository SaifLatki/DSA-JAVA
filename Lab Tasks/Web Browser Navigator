class Stack1 {
    private String arr[];
    private int top;
    private int size;
    private int capacity;
    int count1 = 0;

    Stack1(int size) {
        arr = new String[size];
        capacity = size;
        top = -1;
    }

    public int size() {
        return count1;
    }

    public void push(String x) {
        System.out.println("Inserting " + x);
        if (size() == arr.length) {
            System.out.println("Stack is Full");
        } else {
            arr[++top] = x;
        }
        count1++;
    }
    public String pop() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
            return null;
        }
        String temp = arr[top];
        System.out.println("Removing " + temp);
        arr[top] = null;
        top--;
        count1--;
        return temp;
    }

    public boolean isEmpty() {
        return count1 == 0;
    }
}

class Stack2 {
    private int size2;
    private String arr2[];
    private int top2;
    private int capacity2;
    int count2 = 0;

    Stack2(int size2) {
        arr2 = new String[size2];
        capacity2 = size2;
        top2 = -1;
    }
    public void push(String x) {
        System.out.println("Open the " + x);
        if (size2 == arr2.length) {
            System.out.println("Stack is Full");
        } else {
            arr2[++top2] = x;
        }
        count2++;
    }

    public String pop() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
            return null;
        }
        String temp = arr2[top2];
        System.out.println("closing the " + temp);
        arr2[top2] = null;
        top2--;
        count2--;
        return temp;
    }

    public boolean isEmpty() {
        return count2 == 0;
    }
}

public class WebBrowserNavigator {
    Stack1 forwardStack;
    Stack2 backwardStack;
    String currt_Url;

    public WebBrowserNavigator() {
        forwardStack = new Stack1(10);  // You can specify the size you want for your stacks.
        backwardStack = new Stack2(10);
        currt_Url = "";
    }

    public void visitPage(String url) {
        if (!currt_Url.isEmpty()) {
            backwardStack.push(currt_Url);  // Push the current URL to the backward stack.
        }
        currt_Url = url;  // Update the current URL.
        System.out.println("Current page: " + url);
    }

    public void back() {
        String previousUrl = backwardStack.pop();
        if (previousUrl != null) {
            forwardStack.push(currt_Url);
            currt_Url = previousUrl;
            System.out.println("Move back to: " + previousUrl);
        } else {
            System.out.println("No backward history available.");
        }
    }

    public void forward() {
        String nextUrl = forwardStack.pop();
        if (nextUrl != null) {
            backwardStack.push(currt_Url);
            currt_Url = nextUrl;
            System.out.println("Move forward to: " + nextUrl);
        } else {
            System.out.println("No forward history available.");
        }
    }

    public static void main(String[] args) {
        WebBrowserNavigator navigator = new WebBrowserNavigator();
        navigator.visitPage("www.google.com");
        navigator.visitPage("www.youtube.com");
        navigator.back();
        navigator.forward();
    }
}
