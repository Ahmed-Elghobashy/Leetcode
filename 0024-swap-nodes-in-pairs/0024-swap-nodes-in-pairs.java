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
    public ListNode swapPairs(ListNode head) {
        
        ListNode before =null;
        ListNode iterator =head;
        
        while(iterator!=null && iterator.next!=null)
        {
            ListNode after =iterator.next;
            if(before!=null)
            {
                before.next=after;
                
            }
            else{
                head=after;
            }
            iterator.next=after.next;
            after.next=iterator;
            before=iterator;
            iterator=iterator.next;
            
        }
        
        return head;
    }
}