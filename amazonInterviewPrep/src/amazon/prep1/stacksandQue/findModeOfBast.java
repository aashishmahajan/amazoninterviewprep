package prep1.stacksandQue;

public class findModeOfBast {
    static class TreeNode{
        TreeNode left,right;
        int val;
         TreeNode(int val ){
            this.val= val;
        }
    }
    /**
     * Definition for a binary amazon.tree node.
     * public class TreeNode {
     *     int val;
     *     TreeNode left;
     *     TreeNode right;
     *     TreeNode(int x) { val = x; }
     * }
     */
    public static class Solution {
        int curcount=0;
        int curval=0;
        int max =0;
        int[] modes;
        int curmodes;

        public int[] findMode(TreeNode node){
            helper(node);
            modes = new int[curmodes];
            curval =0;
            curcount =0;
            return modes;
        }

        void helper(TreeNode node){
            if(node == null){
                return ;
            }
            helper(node.left);
            if(node.val != curval){
                curcount=1;
                curval = node.val;
            }else{
                curcount++;
            }

            if(max< curcount){
                max =curcount;
                curmodes =1;
            }else if (curcount == max){
                if(modes != null){
                    modes[curmodes] = node.val;
                }
                curmodes ++;
            }
            helper(node.right);
        }
    }

    public static void main(String[] args) {
        TreeNode a = new TreeNode(10);
        a.left = new TreeNode(4);
        a.left.right = new TreeNode(5);
        a.left.left = new TreeNode(4);
        a.right = new TreeNode(12);
        a.right.right = new TreeNode(15);
        a.right.left = new TreeNode(11);

        Solution s = new Solution();
        s.findMode(a);

    }
}
