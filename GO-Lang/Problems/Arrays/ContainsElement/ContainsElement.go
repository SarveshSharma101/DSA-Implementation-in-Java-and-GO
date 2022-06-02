package main

import "fmt"

/**
 * Contains Element?
 * Easy
 * 30 / 30
 * Given a sorted array and a number key, return whether the key is present in the array or not.
 *
 * Expected Time Complexity: O(log n)
 * @param arr
 * @param key
 * @return
 */

func ContainsElement(A *[]int, key int) bool {
	l, h := 0, len(*A)-1

	for l < h {
		if (*A)[l] == key {
			return true
		} else if (*A)[h] == key {
			return true
		} else {
			mid := (l + h) / 2
			if (*A)[mid] == key {
				return true
			} else if key > (*A)[mid] {
				l = mid + 1
			} else {
				h = mid - 1
			}
		}
	}
	return false
}

func main() {
	A := []int{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}

	fmt.Println("------>", ContainsElement(&A, 13))
}
