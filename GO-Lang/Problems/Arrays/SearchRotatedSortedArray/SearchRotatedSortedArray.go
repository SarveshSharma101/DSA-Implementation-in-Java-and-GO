package main

import "fmt"

/**
 * Search Rotated Sorted Array
 * Medium
 * 50 / 50
 * You are given a list of unique integers which are sorted but rotated at some pivot.
 * You are also given a target value and you have to find its index in the list.
 * If it is not present in the list, return -1.
 *
 * Example:
 * List: [4, 5, 6, 7, 1, 2, 3]
 * Target value: 6
 * Resultant index: 2
 * @param a
 * @param x
 * @return
 */

func LinearSearch(a *[]int, x int) int {
	for i, v := range *a {
		if v == x {
			return i
		}
	}
	return -1
}

func main() {
	a := []int{4, 5, 6, 7, 1, 2, 3}
	fmt.Println("-->", LinearSearch(&a, 6))
}
