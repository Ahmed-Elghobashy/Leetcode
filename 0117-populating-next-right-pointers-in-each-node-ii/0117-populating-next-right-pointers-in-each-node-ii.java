/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
        
        if(root==null)
            return null;
        Queue<Node> queue = new LinkedList<Node>();
        Queue<Node> queue2 = new LinkedList<Node>();
        
        queue.add(root);
        
        while(!queue.isEmpty() || !queue2.isEmpty())
        {
            Node prev=null;
            if(!queue.isEmpty())
            {
               while(!queue.isEmpty()){
                Node curr = queue.remove();
                if(prev!=null)
                {
                    prev.next=curr;
                
                }
                    prev=curr;
                if(curr.left!=null)
                    queue2.add(curr.left);
                if(curr.right!=null) 
                    queue2.add(curr.right);
               }
            }
            else{
                while(!queue2.isEmpty())
                {
                Node curr = queue2.remove();
                if(prev!=null)
                {
                    prev.next=curr;
                
                }
                    prev=curr;
                if(curr.left!=null)
                    queue.add(curr.left);
                if(curr.right!=null) 
                    queue.add(curr.right);
                }
            }
            
        }
        
        
        return root;
        
        
    }
}