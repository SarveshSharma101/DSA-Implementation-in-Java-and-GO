package Tree.BinarySearchTree;

import Tree.Util.TreeNode;

public class BinarySearchTree {

    public boolean search(TreeNode root, int data){
        if (root==null) return false;
        else {
            if (root.getData()==data) return true;
            else if (root.getData()>data) return search(root.getLeft(), data);
            else return search(root.getRight(), data);
        }
    }

    public void insert(TreeNode root, int data, TreeNode prev){
        if (root==null) {
            TreeNode newNode = new TreeNode(data);
            if (prev.getData()>data) prev.setLeft(newNode);
            else prev.setRight(newNode);
        }else {
            if (root.getData()==data){
                System.out.println("Duplicate value error");
                return;
            } else if (root.getData()>data) {
                insert(root.getLeft(), data, root);
            }
            else {
                insert(root.getRight(), data, root);
            }
        }
    }

    public void inOrderTraverse(TreeNode root){
        if (root!=null){
            inOrderTraverse(root.getLeft());
            System.out.println(root.getData());
            inOrderTraverse(root.getRight());
        }
    }

    public TreeNode delete(TreeNode root, int data){
        if (root == null){
            System.out.println("Tree is empty");
            return null;
        } else if (root.getRight()==null && root.getLeft()==null) {
            root = null;
            return null;
        } else if (root.getData()>data) {
            root.setLeft(delete(root.getLeft(), data));
        } else if (root.getData()<data) {
            root.setRight(delete(root.getRight(), data));
        }else {
            TreeNode iPre = getInOrderPre(root);
            root.setData(iPre.getData());
            root.setLeft(delete(iPre, iPre.getData()));
        }
        return root;
    }

    private TreeNode getInOrderPre(TreeNode root) {
        root = root.getLeft();
        while (root.getRight()!=null) root = root.getRight();
        return root;
    }
}
