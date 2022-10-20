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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        
        return rec(root,targetSum,0);
    }
    
    public boolean rec(TreeNode node,int targetSum ,int currSum)
    {
        if(node==null)
            return false;
        currSum+=node.val;
        if(targetSum==currSum && node.left==null && node.right==null)
            return true;
        return rec(node.left,targetSum,currSum) || rec(node.right,targetSum,currSum) ;
    }
}