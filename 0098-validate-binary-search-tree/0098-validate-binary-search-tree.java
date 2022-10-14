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
      public boolean isValidBST(TreeNode root) {
        
          if(root.right==null && root.left==null)
              return true;
          // if(root.val==-2147483648)
          //     return true;
 
          return isValidBSTrec(root,Long.MIN_VALUE,Long.MAX_VALUE);
    }
    public boolean isValidBSTrec(TreeNode root,long min,long max) {
        
        if(root==null)
            return true;
        // if(root.val==Integer.MIN_VALUE || root.val==Integer.MAX_VALUE)
        // {
        //       if(root.val<=min || root.val>max)
        //  {
        //     System.out.println("From here ");
        //     return false;
        //   }
        // }
        // else
        if(root.val<=min || root.val>=max)
        {
            System.out.println("From here ");
            return false;
        }
        if(root.right==null && root.left==null)
            return true;
        if(root.left!=null && root.left.val >= root.val)
            return false;
        if(root.right!=null && root.right.val <= root.val)
            return false;
        return isValidBSTrec(root.left,min,root.val) && isValidBSTrec(root.right,root.val,max);
    }
}