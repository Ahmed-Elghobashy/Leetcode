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
    static int maxHeight=0;
    public int maxDepth(TreeNode root) {
        // if(root==null)
        //     return 0;
        // if(root.val==1 && root.right.val==2 && root.left==null)
        //     return 2;
        maxHeight=0;
        rec(root,1);
        System.out.println(maxHeight);
        
        return maxHeight;
        
    }
    public void rec(TreeNode node,int height)
    {
         if(node==null)
            return;
        if(height>maxHeight)
            maxHeight=height;
        
        rec(node.left,height+1);
        rec(node.right,height+1);
    }
}