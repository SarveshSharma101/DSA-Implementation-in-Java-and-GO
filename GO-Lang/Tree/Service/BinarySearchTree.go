package service

import "fmt"

type (
	TreeNode struct {
		data  int
		right *TreeNode
		left  *TreeNode
	}
)

func InitBST(data int) *TreeNode {
	return &TreeNode{data: data}
}

func Search(root *TreeNode, value int) bool {
	if root.data == value {
		return true
	} else if root == nil {
		return false
	} else if root.data > value {
		return Search(root.left, value)
	} else {
		return Search(root.right, value)
	}
}

func InOrder(root *TreeNode) {
	if root != nil {
		InOrder(root.left)
		fmt.Println("-->", root.data)
		InOrder(root.right)
	}
}

func Insert(root *TreeNode, value int, prev *TreeNode) {
	if root == nil {
		root = &TreeNode{data: value}
		if prev.data > value {
			prev.left = root
		} else {
			prev.right = root
		}
	} else {
		if root.data > value {
			Insert(root.left, value, root)
		} else {
			Insert(root.right, value, root)
		}
	}
}

func Delete(root *TreeNode, value int) *TreeNode {
	if root == nil {
		return nil
	}
	if root.left == nil && root.right == nil {
		root = nil
		return root
	}
	if root.data > value {
		root.left = Delete(root.left, value)
	} else if root.data < value {
		root.right = Delete(root.right, value)
	} else {
		iPre := getInorderPre(root)
		root.data = iPre.data
		root.left = Delete(iPre, iPre.data)
	}
	return root
}

func getInorderPre(root *TreeNode) *TreeNode {
	root = root.left
	for root.right != nil {
		root = root.right
	}
	return root
}
