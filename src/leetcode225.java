import java.util.LinkedList;
import java.util.Queue;

public class leetcode225 {
    private Queue<Integer> inputQueue;
    private Queue<Integer> outputQueue;

    public static void main(String[] args) {
        leetcode225 leetcode225 = new leetcode225();
        leetcode225.push(1);
        leetcode225.push(2);
        leetcode225.top();
        leetcode225.pop();
        leetcode225.empty();
    }
    public leetcode225() {
        inputQueue = new LinkedList<>();
        outputQueue = new LinkedList<>();
    }
    public void push(int x) {
        inputQueue.add(x);
    }
    public int pop() {
        if(outputQueue.isEmpty()){
            while(!inputQueue.isEmpty()){
                outputQueue.add(inputQueue.poll());
            }
        }
        return outputQueue.poll();
    }
    public int top() {
        if(outputQueue.isEmpty()){
            while(!inputQueue.isEmpty()){
                outputQueue.add(inputQueue.poll());
            }
        }
        return outputQueue.peek();
    }
    public boolean empty() {
        return inputQueue.isEmpty()&&outputQueue.isEmpty();
    }

}
