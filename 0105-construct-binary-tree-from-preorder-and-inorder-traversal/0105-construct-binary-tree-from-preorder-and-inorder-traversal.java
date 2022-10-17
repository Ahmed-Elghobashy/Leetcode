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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
     
//         for()
//         {
//             TreeNode node = new TreeNode(preorder[i]);
//             for(int j =0;j<inorder.length;j++)
//             {
//                 if(inorder[j]==numAfter)
//                 {
//                     if(inorder[j+1]==mainNum)
//                     {
//                         node.left=new TreeNode(preorder[j+1]);
//                     }
//                 }
//             }
//         }
        
        
      return  rec(0,0,preorder.length-1,preorder,inorder);
    }
    
    public TreeNode rec(int firstIndex,int i,int j,int[] preorder, int[] inorder)
    {
        
        if(j<i)
            return null;
        if(j==i)
            return new TreeNode(inorder[i]);
        TreeNode node = new TreeNode(preorder[firstIndex]);
        // System.out.println(preorder[i]);
        int counter=0;
        for(;counter<preorder.length;counter++)
        {
            if(inorder[counter]==node.val)
            {
                node.left=rec(firstIndex+1,i,counter-1,preorder,inorder);
                node.right=rec(firstIndex+counter-i+1,counter+1,j,preorder,inorder);
                break;
            }
        }
        return node;
        
    }
    
    
//     public constructNodeChildren(TreeNode node,int i,int[] preorder, int[] inorder)
//     {
//         if(i>=preorder.length-1)
//             return
//         int afterNode = preOrder[i+1];
//         for(int j=0;inorder.length();j++)
//         {
//             if(inorder[j]==afterNode)
//             {
//                 if(inorder[j+1]==node.val)
//                 {
                    
//                 }
//             }
//         }
//     }
}