package main

import "fmt"

/**
 * Kth Largest Element
 *
 * Given a list of numbers below:
 * 4, 3, 6, 4, 1
 *
 * What is the largest element in the list? → 6
 *
 * What is the 3rd largest element in the list? → 4
 *
 * Given a list of numbers, find the kth largest element in the list.
 *
 * A simple solution is to sort the array and get the kth largest element.
 * The best sorting algorithms have an average case time complexity of O(n log n).
 *
 * Try to solve this problem with an average time complexity of O(n).
 * Hint: Quickselect
 * @param A
 * @param k
 * @param low
 * @param high
 * @return
 */

func QuickSelect(A *[]int, key int, low, high int) int {
	pi := partition(A, low, high)
	if pi == key-1 {
		return (*A)[pi]
	} else if key-1 > pi {
		return QuickSelect(A, key, pi+1, high)
	} else {
		return QuickSelect(A, key, low, pi-1)
	}
}

func partition(A *[]int, low, high int) int {
	pivot := (*A)[high]
	i, j, temp := low, high-1, 0
	for {
		for (*A)[i] > pivot {
			i++
		}
		for j >= 0 && (*A)[j] < pivot {
			j--
		}
		if i >= j {
			break
		}
		temp = (*A)[i]
		(*A)[i] = (*A)[j]
		(*A)[j] = temp
	}

	temp = (*A)[high]
	(*A)[high] = (*A)[i]
	(*A)[i] = temp

	return i
}

func main() {
	A := []int{4, 3, 2, 1}
	fmt.Println("------>", QuickSelect(&A, 2, 0, len(A)-1))

	B := []int{1, 2, 3, 4, 5}
	fmt.Println("------>", QuickSelect(&B, 1, 0, len(B)-1))

}
