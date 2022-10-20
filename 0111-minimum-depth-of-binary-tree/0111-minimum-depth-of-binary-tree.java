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
    int depth = Integer.MAX_VALUE;
    public int minDepth(TreeNode root) {
        
        if(root==null)
            return 0;
        rec(root,0);
        return depth+1;
        
        
    }
    
    public void rec(TreeNode node,int currDepth)
    {
        if(node==null)
            return;
        if(node.left== null && node.right==null && currDepth<depth)
        {
            depth = currDepth;
            return;
        }
        
        rec(node.left,currDepth+1);
        rec(node.right,currDepth+1);
        
    }
}