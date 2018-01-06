public class TreeNode {

    public int val;

    public TreeNode left;
    public TreeNode right;
    public TreeNode(int x) {
        val = x;
    }

    public static TreeNode create (Integer[] arr) {
        if (arr == null || arr.length == 0) {
            return null;
        }
        return create(arr, 0, arr.length-1);
    }

    private static TreeNode create (Integer[] arr, int start, int end) {
        if (start > end) {
            return null;
        }
        int mid = (start+end)/2;
        if (arr[mid] == null) {
            return null;
        }

        TreeNode root = new TreeNode(arr[mid]);
        root.left = create(arr, start, mid-1);
        root.right = create(arr, mid+1, end);
        return root;
    }
 }
