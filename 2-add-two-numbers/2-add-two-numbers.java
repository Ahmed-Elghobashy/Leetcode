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
    public ListNode addTwoNumbers2(ListNode l1, ListNode l2) {
        ListNode res =new ListNode(0);
        long firstNum = getNumFromLinkedList(l1);
        long secondNum = getNumFromLinkedList(l2);
        int sum =(int) (firstNum + secondNum);
        System.out.println(firstNum);
        System.out.println(secondNum);
        System.out.println(sum);

        ListNode curr = res;
         if(sum==0)
            return res;
       
     while(sum>0)
        {
            curr.next=new ListNode();
            curr.next.val=sum%10;
            curr =curr.next;
            sum=sum/10;   


        }
       
        return res.next;
    }
    
    public static long getNumFromLinkedList(ListNode list)
    {

        return rec(list,0,0);
    }
    
    public static long rec(ListNode list ,long sum,int i){
        if(list == null)
            return sum;
        sum=sum+(list.val* ((long) Math.pow(10,i)));
        
        return rec(list.next,sum,i+1);
        
    }
    
        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            
            ListNode c = new ListNode();
            rec2(l1,l2,0,c);
            System.out.print(c);
            return c;
        }
    
    public static void rec2(ListNode l1,ListNode l2,int carry,ListNode c)
    {
        int newCarry=0;
      
       
        int l1val=0;
        int l2val=0;
        ListNode l1Next=null;
        ListNode l2Next=null;
        if(l1!=null)
        {
            l1val=l1.val;
            l1Next=l1.next;
        }
        if(l2!=null)
        {   
            l2val=l2.val;
            l2Next=l2.next;
        }
        int num = l1val+l2val+carry;
        if(num>=10)
         {
            newCarry=1;
         }
        c.val=num%10;
          if(l1Next==null && l2Next==null)
        {
            if(newCarry==1)
                c.next=new ListNode(1);
            return;
        }
        ListNode cNext= new ListNode();
        c.next=cNext;
        
        rec2(l1Next,l2Next,newCarry,cNext);

    }
}