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
    long min=Integer.MIN_VALUE;
    long max=Integer.MAX_VALUE;
    public boolean isValidBST(TreeNode root) {
        if(isvalid(root,min,max)){
            return true;
        }
        return false;
        
    }
    public boolean isvalid(TreeNode root,long min,long max){
        
        if(root==null) return true;
        TreeNode cur=root;
       
        if(cur.val>=max||cur.val<=min) return false;
        return isvalid(root.left,min,root.val)&&
        isvalid(root.right,root.val,max);


    }
}
