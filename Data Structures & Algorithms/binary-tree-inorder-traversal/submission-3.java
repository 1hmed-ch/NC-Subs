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
    //         helper(root.left, res);
    //         res.add(root.val);
    //         helper(root.right, res);
    //     }
    // }

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        TreeNode dump = root;
        Deque<TreeNode> stack = new ArrayDeque<>();
        while(dump != null || !stack.isEmpty()){
            if(dump != null){
                stack.push(dump);
                dump = dump.left;
            }
            else {
                var temp = stack.pop();
                res.add(temp.val);
                if(temp.right != null)
                    dump = temp.right;
            }
        }
        

        return res;
    }
}