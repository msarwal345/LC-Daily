class Solution {
    public int rangeSumBST(TreeNode root, int low, int high) {
        if(root==null) return 0;
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        int sum=0;
        while (!q.isEmpty()){
           TreeNode temp=q.poll();
           if(temp!=null && temp.val >=low && temp.val<=high){
               sum+=temp.val;
           }
           if(temp.left!=null){
               q.add(temp.left);
           }
           if(temp.right!=null){
               q.add(temp.right);
           }
        }
        return sum;
    }
}