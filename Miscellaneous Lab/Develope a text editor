import java.util.Stack;

public class TextEditor {
    Stack<String> storeHistory=new Stack<String>();

    public void pushNewAction(String action){
        storeHistory.push(action);

    }
    public void popLastAction(){
        storeHistory.pop();
    }
    public void display(){
        System.out.println("====User actions History====");
        for (int i=0; i<storeHistory.size(); i++){
            System.out.println(storeHistory.get(i)+"  ");
        }
    }

    public static void main(String[] args) {
        TextEditor t=new TextEditor();
        t.pushNewAction("type anything");
        t.pushNewAction("removing something");
        t.pushNewAction("un doing last one");
        t.display();
        t.popLastAction();
        t.display();
    }
}
