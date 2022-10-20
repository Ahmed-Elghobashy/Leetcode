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
    int left=0;
    int right=0;
    public boolean isBalanced(TreeNode root) {
        
        if(root==null)
            return true;
        
        return rec(root);
        
    }
    
    public boolean rec(TreeNode node)
    {
        if(node==null)
            return true;
        if(Math.abs(recCheckHeight(node.right,0)-recCheckHeight(node.left,0))<2)
            return rec(node.left) && rec(node.right);
        
        return false;
    }
    
    public int recCheckHeight(TreeNode node,int height)
    {
        if(node==null)
        {
            return height;
        }
        
        return Math.max(recCheckHeight(node.left,height+1),recCheckHeight(node.right,height+1));
    }
}