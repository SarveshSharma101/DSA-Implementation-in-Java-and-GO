package main

import "fmt"

/**
 * Max Consecutive Ones
 * Given an array A, find the maximum number of consecutive 1s in the array.
 *
 * Examples
 * A: [1, 1, 3, 2, 3, 1, 1, 1]
 * Max consecutive 1s: 3
 * @param A
 * @return
 */

func GetMaxConsecutiveOnes(arr *[]int) int {

	max := 0
	count := 0
	for i, v := range *arr {
		if v == 1 {
			count++
			if i == len(*arr)-1 && count > max {
				max = count
				count = 0
			}
		} else if count > max {
			max = count
			count = 0
		}
	}
	return max
}

func main() {
	arr := []int{1, 1, 3, 2, 3, 1, 1, 1}
	max := GetMaxConsecutiveOnes(&arr)
	fmt.Println("------->", max)
}
