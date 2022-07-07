package main

import "fmt"

/**
 * Unique Elements in Sorted Array
 * Easy
 * 30 / 30
 * Given a sorted array A, find the size of array A after removing the duplicate elements.
 *
 * Examples:
 * A: [1 2 3 3 3 4 5 5]
 *
 * Size of A after removing duplicate elements: 5
 * @param A
 * @return
 */

func RemoveDuplicates(A *[]int) int {
	count := 0
	x := 0
	for i := 0; i < len(*A); i++ {
		x = (*A)[i]
		for i+1 < len(*A) && (*A)[i+1] == x {
			i++
			count++
			(*A)[i] = 0
		}
	}
	return len(*A) - count
}

func main() {
	A := []int{1, 2, 3, 3, 3, 4, 5, 5}
	B := []int{1, 1, 1, 2, 2, 2}
	C := []int{1, 1, 3, 3, 4, 4, 4}
	D := []int{1, 2, 3, 4, 5}
	E := []int{1, 2, 3, 4, 5, 6, 6, 6}

	fmt.Println("A--->", RemoveDuplicates(&A))
	fmt.Println("B--->", RemoveDuplicates(&B))
	fmt.Println("C--->", RemoveDuplicates(&C))
	fmt.Println("D--->", RemoveDuplicates(&D))
	fmt.Println("E--->", RemoveDuplicates(&E))
}
