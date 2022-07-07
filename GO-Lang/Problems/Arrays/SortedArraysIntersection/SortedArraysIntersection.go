package main

import "fmt"

/**
 * Sorted Arrays Intersection
 * Easy
 * 0 / 30
 * Given 2 sorted arrays, return the intersection of both the arrays.
 * The intersection of 2 arrays means all the elements which are present in both.
 * @param A
 * @param B
 * @return
 */

func Intersection(A *[]int, B *[]int) []int {

	C := []int{}
	lA, sA := []int{}, []int{}
	if len(*A) < len(*B) {
		sA = (*A)
		lA = (*B)
	} else {
		sA = (*B)
		lA = (*A)
	}

	for _, v := range sA {
		if binarySearch(&lA, v) {
			C = append(C, v)
		}
	}
	return C
}

func binarySearch(A *[]int, x int) bool {

	mid := 0
	l := 0
	h := len(*A) - 1

	for l < h {
		if (*A)[l] == x {
			return true
		} else if (*A)[h] == x {
			return true
		} else {
			mid = (l + h) / 2
			if (*A)[mid] == x {
				return true
			} else if (*A)[mid] < x {
				l = mid + 1
			} else {
				h = mid - 1
			}
		}
	}
	return false
}

func main() {
	A := []int{1, 3, 4, 5, 5, 6, 6, 7}
	B := []int{2, 5, 6, 6, 7, 8}
	fmt.Println("-->", Intersection(&A, &B))
}
