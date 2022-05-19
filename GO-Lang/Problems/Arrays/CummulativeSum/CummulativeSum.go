package main

import "fmt"

func GetCumulative(arr *[]int, positive bool) []int {
	sum := 0
	b := make([]int, 0, len(*arr))

	for i := 0; i < len(*arr); i++ {
		for j := 0; j <= i; j++ {
			sum += (*arr)[j]
		}
		if positive && sum > 0 {
			b = append(b, sum)
		} else if !positive {
			b = append(b, sum)
		}
		sum = 0
	}
	return b
}

func main() {

	arr1 := []int{1, 3, 5, 7, 9}
	brr1 := GetCumulative(&arr1, false)

	fmt.Println("--->", brr1)

	arr2 := []int{1, -1, -1, -1, 1}
	brr2 := GetCumulative(&arr2, true)

	fmt.Println("--->", brr2)
}
