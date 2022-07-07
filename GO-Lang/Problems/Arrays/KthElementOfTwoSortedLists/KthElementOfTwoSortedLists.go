package main

import "fmt"

/**
 * Kth element of two sorted lists
 * Medium
 * 50
 * Given two sorted arrays A and B, and another value k,
 * print the kth element of the resultant sorted array.
 *
 * Example
 * A: [1, 2, 3, 4, 5, 6]
 * B: [3, 4, 4, 5, 6, 6]
 * Result: [1, 2, 3, 3, 4, 4, 4, 5, 5, 6, 6, 6]
 * 3rd element in the array is 3.
 * 6th element in the array is 4.
 * @param firstArr
 * @param secondArr
 * @param k
 * @return
 */

func KthElementOfTwoSortedLists(A *[]int, B *[]int, k int) int {
	k = k - 1
	i, j, l := 0, 0, 0

	for i < len(*A) && j < len(*B) {
		if (*A)[i] < (*B)[j] {
			if l == k {
				return (*A)[i]
			}
			i++
			l++
		} else {
			if l == k {
				return (*B)[j]
			}
			j++
			l++
		}
	}

	if i == len(*A) {
		return (*B)[k]
	} else {
		return (*A)[k]
	}
}

func main() {
	A := []int{1, 2, 3, 4}
	B := []int{2, 3, 4, 5}

	fmt.Println("-->", KthElementOfTwoSortedLists(&A, &B, 3))
}
