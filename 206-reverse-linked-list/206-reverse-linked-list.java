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
    public ListNode reverseList(ListNode head) {
        
        if(head==null || head.next==null)
            return head;
        
        ListNode t=head;
        ListNode n=head.next;
        t.next=null;
        while(n.next!=null)
        {
//             if(n.next==null)
//             {
                
//             }
             ListNode n2=n.next;
            n.next=t;
            //t.next=;
            t=n;
            n=n2;
            
        }
        if(n.next==null)
        {
            n.next=t;          
         }
        return n;
    }
}