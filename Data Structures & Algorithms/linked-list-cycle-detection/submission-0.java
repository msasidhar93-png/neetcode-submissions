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

class Solution {
    public boolean hasCycle(ListNode head) {
        List<Integer> list = new ArrayList();
        ListNode curr = head;
        if(curr == null || curr.next ==null){
            return false;
        }
        while(curr.next != null){
            if(list.contains(curr.next.val)){
                return true;
            }else{
                list.add(curr.next.val);
            }
            curr = curr.next;
        }
        return false;
    }
}
