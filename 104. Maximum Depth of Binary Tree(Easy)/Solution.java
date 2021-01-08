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
  public int maxDepth(TreeNode root) {
	    return helper(root,0);
    }
	
	public int helper(TreeNode node,int depth){
		if(node == null)
			return depth;
		int l = helper(node.left,depth + 1);
		int r = helper(node.right,depth + 1) ;
		return l > r ? l : r;
		
	}
	
}
