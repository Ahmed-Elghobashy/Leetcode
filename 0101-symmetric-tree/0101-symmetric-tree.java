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
   
    
    public boolean isSymmetric(TreeNode root) {
     Stack<TreeNode> stackLeft=new Stack<TreeNode>();
     Stack<TreeNode> stackRight=new Stack<TreeNode>();
     if(root.left!=null)
     stackLeft.push(root.left);
     if(root.right!=null)   
     stackRight.push(root.right);
    return isSymmetricTwoTrees(stackLeft,stackRight);
    }
    
public boolean isSymmetricTwoTrees(Stack<TreeNode> stackLeft,Stack<TreeNode> stackRight)
    {
     
    if(stackLeft.size()!=stackRight.size())
            return false;
    
        if(stackLeft.isEmpty() && stackRight.isEmpty())
        {
                System.out.println("Hereee 1 ");
                return true;
        }   
     
         
        if(!stackLeft.isEmpty() && stackRight.isEmpty())
        {
            System.out.println("Hereee ");
            return false;
        }
        if(stackLeft.isEmpty() && !stackRight.isEmpty())
            return false;
        TreeNode left = stackLeft.pop();
        TreeNode right = stackRight.pop();
        
        if(left==null &&right ==null)
              return isSymmetricTwoTrees(stackLeft,stackRight);
        else if(left==null && right !=null)
            return false;
        else if(left!=null && right ==null)
            return false;
        else if(left.val!=right.val)
            return false;
        if(left!=null)
        {
            // if(left.left!=null)
                stackLeft.push(left.left);
           // if(left.right!=null)
                stackLeft.push(left.right);
        }
     if(right!=null)
        {
          //  if(right.right!=null)
                stackRight.push(right.right);
          //  if(right.left!=null)
                stackRight.push(right.left);
        }
    
    return isSymmetricTwoTrees(stackLeft,stackRight);
    }
    
    // [34][34]
}