
public class leetcode24 {
    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        //ListNode node5 = new ListNode(5);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
       // node4.next = node5;
        new leetcode24().swapPairs(node1);

    }
    public ListNode swapPairs(ListNode head) {
       ListNode previousNode = new ListNode(0);
       ListNode savePreviousNode = previousNode;
       previousNode.next=head;
       while(previousNode.next!=null&&previousNode.next.next!=null){
           ListNode thisNode = previousNode.next;
           ListNode nextNode = thisNode.next;
           previousNode.next = nextNode;
           thisNode.next=nextNode.next;
           nextNode.next=thisNode;
           previousNode = thisNode;
       }
       return savePreviousNode.next;

    }
}
