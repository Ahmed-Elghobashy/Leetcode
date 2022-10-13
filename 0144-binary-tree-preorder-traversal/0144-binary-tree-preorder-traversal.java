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
    public List<Integer> preorderTraversal(TreeNode root) {
        
        List<Integer> list = new ArrayList<Integer>();
        rec(list,root);
        return list;
        
    }
    
      public void rec(List<Integer> list,TreeNode node)
    {
        if(node==null)
            return;
        else{
            list.add(node.val);
            rec(list,node.left);
            rec(list,node.right);
        }
    }
}