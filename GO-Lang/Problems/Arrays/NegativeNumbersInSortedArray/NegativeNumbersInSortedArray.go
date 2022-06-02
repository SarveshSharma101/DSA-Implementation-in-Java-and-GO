package main

import "fmt"

/**
 * Negative numbers in sorted array
 * Easy
 * 30 / 30
 * Given a sorted array of integers, find the number of negative numbers.
 *
 * Expected Time Complexity: O(log n)
 * @param arr
 * @return
 */
func NegativeNumbersInSortedArray(A *[]int) int {
	var count int = 0

	for _, v := range *A {
		if v >= 0 {
			break
		}
		count++
	}
	return count
}

func main() {
	A := []int{-5, -3, -2, 3, 4, 6, 7, 8}

	fmt.Println("-------------->", NegativeNumbersInSortedArray(&A))
}
