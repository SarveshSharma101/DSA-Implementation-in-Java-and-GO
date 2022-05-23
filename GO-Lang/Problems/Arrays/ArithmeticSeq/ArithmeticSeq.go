package main

import (
	"fmt"
	"math"
	"sort"
)

/**
 * Arithmetic Sequence
 *
 * An Arithmetic progression (AP) or arithmetic sequence is a sequence of numbers such that
 * the difference between the consecutive terms is constant.
 * For instance, the sequence 5, 7, 9, 11, 13, 15, . . .
 * is an arithmetic progression with a common difference of 2.
 *
 * Given an unsorted array, find if it can be reordered to form an arithmetic sequence.
 * @param arr
 */
func IsArithmeticSeq(arr *[]int) bool {
	sort.Slice((*arr), func(i, j int) bool {
		return (*arr)[i] < (*arr)[j]
	})
	dif := int(math.Abs(float64((*arr)[0] - (*arr)[1])))
	x := 0
	for i := 2; i < len(*arr); i++ {
		x = int(math.Abs(float64((*arr)[0] - (*arr)[i])))
		if dif == 0 && !(x == 0) {
			return false
		} else if dif != 0 && !(x == i*dif) {
			return false
		}
	}
	return true
}

func main() {
	fmt.Println("----->", IsArithmeticSeq(&[]int{9, 13, 5, 15, 7, 11}))
}
