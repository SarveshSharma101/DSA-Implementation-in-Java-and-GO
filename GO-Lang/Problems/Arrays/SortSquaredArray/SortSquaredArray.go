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

func GetSquaredSortedArray(arr *[]int) []int {
	C := make([]int, len(*arr))

	temp := 0
	j := 0

	for i, v := range *arr {
		temp = v * v
		j = i - 1
		if i == 0 {
			C[i] = temp
		} else {
			for j >= 0 && C[j] > temp {
				C[j+1] = C[j]
				j--
			}
			C[j+1] = temp
		}
	}

	return C
}

func main() {
	arr := []int{1, 3, 5, 7, 9, 11, 0, 4, 6, 8}
	C := GetSquaredSortedArray(&arr)
	fmt.Println("------->", C)
}
