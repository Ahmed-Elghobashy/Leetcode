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
List<List<Integer>> list;
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        list = new ArrayList<List<Integer>>();
        rec2(root,targetSum,new ArrayList<Integer>(),0);
        
            return list;
    }
    
    public void rec2(TreeNode node, int targetSum,List<Integer> currList,int currSum)
    {
        if(node==null)
            return;
        currList.add(node.val);
        currSum+=node.val;
         if(targetSum==currSum && node.left==null && node.right==null)
         {
             list.add(currList);
             return;
         }
        ArrayList<Integer> left = new ArrayList<Integer>();
        ArrayList<Integer> right = new ArrayList<Integer>();
        left.addAll(currList);
        right.addAll(currList);
        rec2(node.left,targetSum,left,currSum);
        rec2(node.right,targetSum,right,currSum);
        
        
    }
    
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