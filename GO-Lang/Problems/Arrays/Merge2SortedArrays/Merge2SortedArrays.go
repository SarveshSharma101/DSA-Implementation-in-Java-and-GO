package main

import "fmt"

/**
* Merge Two Sorted Arrays
*
* Given two sorted arrays A and B, find the merged sorted array C by merging A and B.
*
* Example:
* A: [1, 2, 3, 4, 4]
* B: [2, 4, 5, 5]
* C: [1, 2, 2, 3, 4, 4, 4, 5, 5]
**/

func Merge2SortedArrays(A *[]int, B *[]int) []int {

	C := make([]int, len(*A)+len(*B))

	i, j, k := 0, 0, 0
	fmt.Println("************", len(*A))
	fmt.Println("************", len(*B))
	for i < len(*A) && j < len(*B) {
		if (*A)[i] <= (*B)[j] {
			C[k] = (*A)[i]
			k++
			i++
		} else {
			C[k] = (*B)[j]
			k++
			j++
		}
	}

	for i < len(*A) {
		C[k] = (*A)[i]
		k++
		i++
	}

	for j < len(*B) {
		C[k] = (*B)[j]
		k++
		j++
	}

	return C
}

/**
 * Consider an array that is divided into two parts and both of the parts are sorted individually.
 * Given the mentioned array and the end index of the first part,
 * merge them to create a sorted array. Update the same array with the merged elements.
 * You can use extra auxiliary space.
 *
 * Expected Time Complexity: O(n) where n denotes the size of the array.
 *
 * Example
 * Array: [1, 3, 5, 7, 9, 11, 0, 4, 6, 8]
 * End Index: 5
 * Array after merging: [0, 1, 3, 4, 5, 6, 7, 8, 9, 11]
 */

func Merge(arr *[]int, index int) {
	C := make([]int, len(*arr))

	i, j, k := 0, index+1, 0

	for i <= index && j < len(*arr) {
		if (*arr)[i] <= (*arr)[j] {
			C[k] = (*arr)[i]
			k++
			i++
		} else {
			C[k] = (*arr)[j]
			k++
			j++
		}
	}

	for i <= index {
		C[k] = (*arr)[i]
		k++
		i++
	}

	for j < len(*arr) {
		C[k] = (*arr)[j]
		k++
		j++
	}

	for i2, v := range C {
		(*arr)[i2] = v
	}
}

func main() {
	A := []int{1, 2, 3, 4, 4}
	B := []int{2, 4, 5, 5}

	C := Merge2SortedArrays(&A, &B)

	fmt.Println("-------->", C)

	arr := []int{1, 3, 5, 7, 9, 11, 0, 4, 6, 8}
	Merge(&arr, 5)
	fmt.Println("------->", arr)

}
