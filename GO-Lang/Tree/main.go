package main

import (
	bstService "DSA/GO-Lang/Tree/Service"
	"fmt"
	"os"
)

func main() {
	run()
}

func run() {
	var root *bstService.TreeNode

	for {
		fmt.Printf("1.%s\n2.%s\n3.%s\n4.%s\n5.Exit\n%s\n", "Insert", "Search", "InOrder", "Delete", "Choose any one of the option: ")
		var choice int
		fmt.Scan(&choice)

		switch choice {
		case 1:
			var value int
			fmt.Println("Enter the value to insert in the bst")
			fmt.Scan(&value)
			fmt.Println("---------->", root)
			if root == nil {
				root = bstService.InitBST(value)
			} else {
				bstService.Insert(root, value, nil)
			}
		case 2:
			var value int
			fmt.Println("Enter the value to Search in the bst")
			fmt.Scan(&value)
			bstService.Search(root, value)
		case 3:
			bstService.InOrder(root)
		case 4:
			var value int
			fmt.Println("Enter the value to Delete in the bst")
			fmt.Scan(&value)
			bstService.Delete(root, value)
		case 5:
			os.Exit(0)
		}
	}

}
