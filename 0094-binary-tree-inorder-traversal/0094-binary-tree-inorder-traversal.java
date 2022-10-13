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
    public List<Integer> inorderTraversal(TreeNode root) {
        
        List<Integer> list = new ArrayList<Integer>();
        rec(list,root);
        return list;
    }
    
    public void rec(List<Integer> list,TreeNode node)
    {
        if(node==null)
            return;
        else{
            rec(list,node.left);
            list.add(node.val);
            rec(list,node.right);
        }
    }
}