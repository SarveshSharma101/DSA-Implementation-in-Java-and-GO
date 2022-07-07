package main

import (
	"fmt"
	"math"
)

func HasTwoSumZero(A *[]int) bool {
	index := 0

	for i, v := range *A {
		index = binarySearch(A, i, v)
		if index != -1 && v+(*A)[index] == 0 {
			return true
		}
	}
	return false
}

func binarySearch(A *[]int, l, x int) int {
	x = int(math.Abs(float64(x)))
	index := -1
	h := len(*A) - 1
	mid := 0

	for l < h {
		if (*A)[l] == x {
			index = l
			break
		} else if (*A)[h] == x {
			index = h
			break
		} else {
			mid = (l + h) / 2
			if (*A)[mid] == x {
				index = mid
				break
			} else if (*A)[mid] < x {
				l = mid + 1
			} else {
				h = mid - 1
			}
		}
	}

	return index
}

func main() {
	A := []int{-3, 1, 3, 4}
	B := []int{-2, 1, 3, 4}
	fmt.Println("A->", HasTwoSumZero(&A))
	fmt.Println("B->", HasTwoSumZero(&B))
}
