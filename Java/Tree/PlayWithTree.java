package Tree;

import Services.DsaRunner;
import Tree.BinarySearchTree.BinarySearchTree;
import Tree.Util.TreeNode;

import java.util.Scanner;

public class PlayWithTree implements DsaRunner {


    public static void main(String[] args) {
        new PlayWithTree().run();
    }


    @Override
    public void run() {
        TreeNode root = null;
        Scanner scanner = new Scanner(System.in);
        BinarySearchTree bst = new BinarySearchTree();
        while (true) {
            System.out.println("1. Insert\n2.Search\n3.InOrder Traverse\n4.Delete\n5.exit\nChoose any one option from above: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1: {
                    System.out.println("Enter the data to put in the tree");
                    int data = scanner.nextInt();
                    if (root == null)
                        root = new TreeNode(data);
                    else
                        bst.insert(root, data, root);
                    break;
                }
                case 2: {
                    System.out.println("Enter the data to search in the tree");
                    int data = scanner.nextInt();
                    if (bst.search(root, data)) {
                        System.out.println("Data is present in the tree");
                    } else System.out.println("Data not found");
                    break;
                }
                case 3: {
                    bst.inOrderTraverse(root);
                    break;
                }
                case 4:{
                    System.out.println("Enter the data to delete in the tree");
                    int data = scanner.nextInt();
                    bst.delete(root, data);
                    break;
                }
                default: System.exit(0);

            }
        }
    }
}
