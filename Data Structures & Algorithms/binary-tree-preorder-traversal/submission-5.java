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
    // private static void helper(TreeNode root, List<Integer> res){
    //     if(root != null){
    //         res.add(root.val);
    //         helper(root.left, res);
    //         helper(root.right, res);
    //     }
    // }

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        Deque<TreeNode> stack = new ArrayDeque<>();
        TreeNode dump = root;

        while(dump != null || !stack.isEmpty()){
            if(dump != null){
                result.add(dump.val);
                if(dump.right != null)
                    stack.push(dump.right);
                dump = dump.left;
            } else {
                TreeNode temp = stack.pop();
                result.add(temp.val);
                if(temp.right == null && temp.left == null && !stack.isEmpty())
                    dump = stack.pop();
                else {
                    if(temp.right != null && temp.left != null){
                        dump = temp.left;
                        stack.push(temp.right);
                    }
                    else if(temp.left != null)
                        dump = temp.left;
                    else 
                        dump = temp.right;
                }
            }
        }
        return result;
    }
}