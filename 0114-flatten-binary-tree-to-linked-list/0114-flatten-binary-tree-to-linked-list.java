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
class Solution {
    
    TreeNode list;
    TreeNode listTail;
    Queue<TreeNode> queue;
    public void flatten(TreeNode root) {
        
        if(root==null)
            return;
        queue=new LinkedList<TreeNode>();
        rec(root);
        
        TreeNode t=queue.remove();
        t.left=null;
        while(!queue.isEmpty())
        {
            t.right=queue.remove();
            t.left=null;
            t=t.right;
        }
        
    
        
    }
    
    public void rec(TreeNode node)
    {
        
        if(node==null)
            return;
//         if(list==null)
//         {
//             list=new TreeNode(node.val);
//             listTail=list;
//         }
            
//         else
//         {
//             listTail.right=new TreeNode(node.val);
//              listTail=listTail.right;
//         }
          
        queue.add(node);
        rec(node.left);
        rec(node.right);
      
      
        
    }
}