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
    private static void helper(TreeNode root, List<Integer> res){
        if(root != null){
            helper(root.left, res);
            res.add(root.val);
            helper(root.right, res);
        }
    }

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        // TreeNode dump = root;
        // Deque<Integer> stack = new ArrayDeque<>();
        // while(dump.left != null && !stack.isEmpty()){
        //     stack.push(dump.val);
        //     if(dump.left != null)
        //         dump = dump.left;
        //     else {
        //         res.add(dump.val);
        //     }
        // }
        helper(root, res);
        

        return res;
    }
}