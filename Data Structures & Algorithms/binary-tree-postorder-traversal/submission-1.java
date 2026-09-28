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
    //         helper(root.right, res);
    //         res.add(root.val);
    //     }
    // }

    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        Deque<TreeNode> st = new ArrayDeque<>();
        TreeNode dump = root;
        TreeNode last = null;

        while(dump != null || !st.isEmpty()){
            if(dump != null){
                st.push(dump);
                dump = dump.left;
            } else {
                //res.add(dump.val);
                TreeNode temp = st.peek();
                if(temp.right != null && temp.right != last)
                    dump = temp.right;
                else if(temp.right == null || temp.right == last){
                    res.add(temp.val);
                    last = st.pop();
                    dump = null;
                }
            }
        }

        return res;
    }
}