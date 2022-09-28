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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        // if(n==0)
        // {
        //     return head.next;
        // }
        // if(head.next==null && n==1)
        // {
        //     return null;
        // }
        ListNode t= head;
        int c=0;
        while(t!=null)
        {
            c++;
            t=t.next;
        }
        System.out.println("Size is "+ c);
        int index=c-n;
        t=head;
        if(c==n)
        {
            return head.next;
            // System.out.println("we here");
            // while(c>2)
            // {
            //     t=t.next;
            //     c--;
            // }
            // t.next=null;
            // return head;
        }
        int i=1;
        while(i<index)
        {
            t=t.next;
            i++;
        }
        if(t.next==null)
        {
            return head;
        }
        t.next=t.next.next;
        
//         while(c>0)
//         {
            
//             if(c==size-n)
//             {
//                 t.next=t.next.next;
//                 break;
//             }
//             c--;
//             t=t.next;
            
//         }
        
        return head;
    }
}