import java.util.HashMap;
import java.util.Map;

public class leetcode141 {
    public boolean hasCycle(ListNode head) {
        if (head.next == null) {
            return false;
        }
        Map<ListNode,Integer> map = new HashMap<>();
        while(head!=null){
            if(!map.containsKey(head)){
                map.put(head,1);
                head = head.next;
            }else{
                return true;
            }
        }
        return false;
    }
}
