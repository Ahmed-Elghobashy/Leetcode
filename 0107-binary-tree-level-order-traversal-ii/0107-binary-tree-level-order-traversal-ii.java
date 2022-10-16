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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        
        recLevelOrder(root,list,0);
        
        for(int i=0;i<list.size();i++)
        {
            List<Integer> tempList =list.get(i);
            if(tempList.size()==0)
            {
                list.remove(tempList);
                System.out.println("Here " + i);
                i--;
            }
        }
       
   Collections.reverse(list);

        return list;
        
    }
    
    public void recLevelOrder(TreeNode node,List<List<Integer>> list, int height)
    {
        
        if(node==null)
            return;
        if(node!=null)
        {
            if(list.size()<height)
            {
                list.get(height).add(node.val);
            }
            else
            {
                list.add(new ArrayList<Integer>());;
                list.get(height).add(node.val);
            }
            
            recLevelOrder(node.left,list,height+1);
            recLevelOrder(node.right,list,height+1);
        }
    }
}