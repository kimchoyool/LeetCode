/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
import java.util.*;
class Solution {
    public ListNode middleNode(ListNode head) {
        ArrayList<ListNode> answer = new ArrayList<>();
        int length=0;
        while(head!=null){
            answer.add(head);
            head=head.next;
            length++;
        }
        return answer.get(length/2);
    }
}