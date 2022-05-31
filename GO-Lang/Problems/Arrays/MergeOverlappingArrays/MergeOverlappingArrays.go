package main

import "fmt"

/**
 * Merge Overlapping Intervals
 *
 * Given a list of intervals, merge them to get a list of non-overlapping intervals.
 *
 * intervali = [starti, endi]
 *
 * Example:
 * Intervals: [[1, 2], [2, 3], [1, 4], [5, 6]]
 *
 * [1, 2] and [2, 3] can be merged to form [1, 3].
 * Now, [1, 3] and [1, 4] can be merged to form [1, 4].
 * [1, 4] and [5, 6] have no intersection.
 * Hence above intervals are merged to form:
 * [[1, 4], [5, 6]]
 *
 * Note that the final list should be in ascending order.
 */

func MergeIntervals(A *[][]int) [][]int {
	C := [][]int{}
	flag := false
	for {
		flag = false
		for i, v := range *A {
			for j := i + 1; j < len(*A); j++ {
				if (*A)[j][0] == v[0] || (*A)[j][1] == v[0] || (*A)[j][0] == v[1] || (*A)[j][1] == v[1] {
					C = append(C, []int{v[0], (*A)[j][1]})
					flag = true
					break
				}
			}
			if flag {
				break
			}
		}
		if !flag {
			break
		}
	}

	return C
}

func main() {
	A := [][]int{{1, 4}, {6, 7}, {4, 5}}
	fmt.Println("-------->", MergeIntervals(&A))
}
