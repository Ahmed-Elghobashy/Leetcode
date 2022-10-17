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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        Stack<TreeNode> stack1= new Stack<TreeNode>();
        Stack<TreeNode> stack2 = new Stack<TreeNode>();
        
        stack1.push(root);
        boolean left =true;
        
    while(!stack1.isEmpty() || !stack2.isEmpty())
    {
        
      
       
           if(!stack1.isEmpty())
           {
               rec(stack1,stack2,list,left);
           }
        else{
            rec(stack2,stack1,list,left);
        }
        
     //    System.out.println(newList.toString() +"  size : "+ newList.size());
    //    list.add(newList);
        left=!left;
    }
     
        return list;
    }
        
    
    public void rec(Stack<TreeNode> stack1,Stack<TreeNode> stack2,List list,boolean left)
    {
          ArrayList<Integer> newList = new ArrayList<Integer>();
        while(!stack1.isEmpty())
               {
                  TreeNode node = stack1.pop();
                  if(node==null)
                      continue;
                  newList.add(node.val);
                 
                if(left)
                   {
                       stack2.add(node.left);
                       stack2.add(node.right);
                   }
                  else{
                         stack2.add(node.right);
                         stack2.add(node.left);
                       }
              }
        if(!newList.isEmpty())
            list.add(newList);
        
    }
    
   
}