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
      return istrue( root ,Integer.MIN_VALUE,Integer.MAX_VALUE);  
    }
    private boolean istrue(TreeNode root,int min,int max){
        if(root ==null) return true;
        if(root.val >=max || root.val<=min) return false;
        return istrue(root.left,min,root.val)
        && istrue(root.right,root.val,max);

    }
}
