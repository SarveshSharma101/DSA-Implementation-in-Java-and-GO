package main

import "fmt"

/**
 * Given an array of numbers,
 * return an array that contains the squares of all the numbers in non-decreasing order.
 *
 * Square sorted array
 *
 * Example
 * Array: [6, -8, 3, -1, 4]
 * Answer: [1, 9, 16, 36, 64]
 * @param arr
 * @return
 */

func SqauredSortedArray(A *[]int) []int {
	C := make([]int, len(*A))
	j := 0
	for i, v := range *A {
		v2 := v * v
		j = i - 1
		for j >= 0 && C[j] >= v2 {
			C[j+1] = C[j]
			j--
		}
		C[j+1] = v2
	}
	return C
}

func main() {
	A := []int{11, 12, 9, 4, 5, 6, 7}
	fmt.Println("------>", SqauredSortedArray(&A))
}
