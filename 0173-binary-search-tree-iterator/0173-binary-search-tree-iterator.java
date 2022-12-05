/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class BSTIterator {
    
   Queue<TreeNode> q =  new LinkedList<>();

    public BSTIterator(TreeNode root) {
        if(root !=null)
        {
           createQ(root);
        }   
       
        for(TreeNode n:q)
        {
            System.out.println(n.val);
        }
    }
    
    public void createQ(TreeNode node){
        TreeNode curr=node;
        if(node==null )
            return;
        if(curr.left!=null )
            createQ(curr.left);
        q.add(curr);
        if(curr.right!=null )
            createQ(curr.right);
        
        
    }
    
    public int next() {
        
        
        TreeNode pop = q.remove();
        
        return pop.val;
        
        
    }
    
    public boolean hasNext() {
        
        return !q.isEmpty();
        
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */