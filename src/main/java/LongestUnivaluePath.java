public class LongestUnivaluePath {
    public static void main(String[] args) {
        TreeNode root = TreeNode.create(new Integer[]{4, 4, 4, 1, null, 5, 5});
        System.out.println(longestUnivaluePath(root));
    }

    private static int length = 0;
    public static int longestUnivaluePath(TreeNode root) {
        longestUnivaluePathSub(root);
        return length;
    }

    public static int longestUnivaluePathSub(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int sub = 1+longestUnivaluePathSub(root.right);
        int right = (root.right!=null && root.val == root.right.val) ? sub : 0;

        sub = 1+longestUnivaluePathSub(root.left);
        int left = (root.left!=null && root.val == root.left.val) ? sub : 0;

        length = Math.max(length, left+right);

        return Math.max(left, right);
    }
}
