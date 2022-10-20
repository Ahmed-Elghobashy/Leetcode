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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        
        return rec(inorder.length-1,0,0,inorder.length-1,inorder,postorder);
    }
    
    public TreeNode rec(int postIndex,int postMin,int startIndex,int endIndex,int[] inorder, int[] postorder)
    {
        
        
        if(postIndex==postMin)
            return new TreeNode(postorder[postIndex]);
        if(postIndex<postMin)
            return null;
        if(endIndex<startIndex)
            return null;
        if(postIndex<0)
            return null;
        int postNum = postorder[postIndex];
        TreeNode node= new TreeNode(postNum);
        
        int index=0;
        for(int i=0;i<inorder.length;i++)
        {
            if(inorder[i]==postNum)
                index=i;
        }
        
        //left
        if(node.val==15)
        {
            System.out.println(postIndex+""+ postMin +"" +endIndex);
        }
       node.left= rec(postIndex-(endIndex-index)-1,postMin,startIndex,index-1,inorder,postorder);
       node.right=rec(postIndex-1,postIndex-(endIndex-index),index+1,endIndex,inorder,postorder);
        
        return node;
    }
}