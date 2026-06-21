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
        List<List<Integer>> result = new ArrayList<>();

        // Base condition
        if(root == null){
            return result;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty()){
            int size = queue.size();
            List<Integer> list= new ArrayList<>(size); // list for store the leve node value.

            for(int i=0; i < size; i++){
                TreeNode currentNode = queue.poll(); // remove one node for front side.
                list.add(currentNode.val); // add the leve node value in list
                
                if(currentNode.left != null){ // if left child is exist.
                    queue.offer(currentNode.left);
                }
                if(currentNode.right != null){  // if right child is exist.
                    queue.offer(currentNode.right);
                }                
            }

            // add the list in final list at index 0. -> [[3]] -> [[9,20],[3]] -> [[15,7],[9,20],[3]]
            result.add(0, list); 
        }

        return result;
    }
}