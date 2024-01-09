package Trees;
class Solution {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> l1=new ArrayList<>();
        List<Integer> l2=new ArrayList<>();
        collectleaf(root1,l1);
        collectleaf(root2,l2);
        return l1.equals(l2);
    }
    private void collectleaf(TreeNode root,List<Integer> l){
        if(root==null) return ;
        if(root.left==null && root.right==null) l.add(root.val);
        collectleaf(root.left,l);
        collectleaf(root.right,l); 
    }
}