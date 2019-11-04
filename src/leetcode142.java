import java.util.HashSet;
import java.util.Set;

public class leetcode142 {
    public ListNode detectCycle(ListNode head) {
        if(head == null || head.next == null){
            return null;
        }
        Set<ListNode> set = new HashSet<>();
        while(head!=null){
            if(!set.contains(head)){
                set.add(head);
                head = head.next;
            }else{
                return head;
            }
        }
        return null;
    }
}
