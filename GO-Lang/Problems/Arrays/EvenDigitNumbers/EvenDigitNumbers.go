package main

import "fmt"

/***
 * Given an array of integers, find the elements which have an even number of digits.
 *
 * Array: [42, 564, 5775, 34, 123, 454, 1, 5, 45, 3556, 23442]
 * Answer: 42, 5775, 34, 45, 3556
 *
 * The order of the returned elements should be the same as the order of the initial array.
 */

func GetEvenDigitNumbers(arr *[]int) []int {
	b := make([]int, 0, len(*arr))

	for _, v := range *arr {
		digits := CountDigits(v)
		if digits%2 == 0 {
			b = append(b, v)
		}
	}
	return b
}

func CountDigits(value int) int {
	count := 1

	for value/10 != 0 {
		value = value / 10
		count++
	}
	return count
}

func main() {
	arr := []int{42, 564, 5775, 34, 123, 454, 1, 5, 45, 3556, 23442, 45234234, -34}
	fmt.Println("----->", GetEvenDigitNumbers(&arr))

}
