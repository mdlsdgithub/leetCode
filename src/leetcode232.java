import java.util.Stack;

public class leetcode232 {
    private Stack<Integer> inputStack;
    private Stack<Integer> outputStack;
    public leetcode232() {
         inputStack = new Stack();
         outputStack = new Stack();

    }
    public void push(int x) {
        inputStack.push(x);
    }
    public int pop() {
        if(outputStack.isEmpty()){
            while(!inputStack.empty()){
                outputStack.push(inputStack.pop());
            }
        }
        return outputStack.pop();
    }
    public int peek() {
        if(outputStack.isEmpty()){
            while(!inputStack.isEmpty()){
                outputStack.push(inputStack.pop());
            }
        }
        return outputStack.peek();
    }
    public boolean empty() {
        return inputStack.isEmpty()&&outputStack.isEmpty();
    }
}
