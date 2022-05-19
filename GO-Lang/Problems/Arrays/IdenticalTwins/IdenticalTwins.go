package main

import "fmt"

func GetIdenticalTwins(arr *[]int) int64 {
	var count int64 = 0
	for i, v := range *arr {
		for j := i + 1; j < len(*arr); j++ {
			if (*arr)[j] == v {
				count++
			}
		}
	}
	return count
}

func main() {
	arr1 := []int{1, 1, 1, 1}
	count1 := GetIdenticalTwins(&arr1)

	fmt.Println("--->", count1)

	arr2 := []int{1, 2, 2, 3, 2, 1}
	count2 := GetIdenticalTwins(&arr2)

	fmt.Println("--->", count2)
}
