package main

import "fmt"

// Next Greater Element In Sorted Array
// Easy
// 30 / 30
// Given a sorted array and a number key,
// find the smallest array element which is greater than the key.
// If the key is greater than or equal to the largest element then return the key itself.
// Expected Time Complexity: O(log n)

func NextGreaterElementInSortedArray(A *[]int, key int) int {
	C := key
	if key >= (*A)[len(*A)-1] {
		return key
	}
	for _, v := range *A {
		if v > key {
			return v
		}
	}
	return C
}

func main() {
	A := []int{1, 2, 3, 3, 4, 4, 8, 10}
	fmt.Println("--------->", NextGreaterElementInSortedArray(&A, -120))
}
