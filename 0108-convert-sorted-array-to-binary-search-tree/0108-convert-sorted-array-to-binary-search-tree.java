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
    public TreeNode sortedArrayToBST(int[] nums) {
        
        return rec(0,nums.length-1,nums);
    }
    public TreeNode rec(int startIndex,int endIndex,int[] nums)
    {
        if(startIndex>endIndex)
            return null;
        
        if(endIndex>nums.length)
            return null;
        
          if(startIndex>nums.length)
            return null;
        
        if(startIndex==endIndex)
            return new TreeNode(nums[startIndex]);
        
        TreeNode node = null;
        
        int index =startIndex+ ((int) Math.ceil((endIndex-startIndex+0.0)/2)) ;
        System.out.println(index);
        node=new TreeNode(nums[index]);   
        System.out.println(startIndex+" "+ endIndex+" "+index);
        node.left=rec(startIndex,index-1,nums);
        node.right=rec(index+1,endIndex,nums);
        
        return node;
    }
}