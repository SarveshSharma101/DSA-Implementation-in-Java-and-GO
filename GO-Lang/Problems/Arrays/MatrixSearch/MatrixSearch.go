package main

import "fmt"

func SearchMatrix(matrix *[][]int, key int) bool {

	for i := 0; i < len(*matrix); i++ {
		if key > (*matrix)[i][len((*matrix)[0])-1] {
			continue
		} else if key < (*matrix)[i][0] {
			return false
		} else {
			return binarySearch((*matrix)[i], key)
		}
	}
	return false
}

func binarySearch(i []int, key int) bool {

	low := 0
	high := len(i) - 1
	mid := 0
	for low < high {
		if i[high] == key {
			return true
		} else if i[low] == key {
			return true
		}
		mid = (low + high) / 2
		if i[mid] == key {
			return true
		} else if i[mid] > key {
			high = mid - 1
		} else {
			low = mid + 1
		}
	}

	return false
}

func main() {
	matrix := [][]int{{10, 13, 15, 17}, {20, 24, 31, 40}, {41, 44, 45, 48}, {90, 102, 111, 134}}

	fmt.Println("13->", SearchMatrix(&matrix, 13))
	fmt.Println("134->", SearchMatrix(&matrix, 134))
	fmt.Println("1->", SearchMatrix(&matrix, 1))
	fmt.Println("23->", SearchMatrix(&matrix, 23))
	fmt.Println("44->", SearchMatrix(&matrix, 44))
	fmt.Println("88->", SearchMatrix(&matrix, 88))
	fmt.Println("20->", SearchMatrix(&matrix, 20))
	fmt.Println("48->", SearchMatrix(&matrix, 48))
	fmt.Println("10->", SearchMatrix(&matrix, 10))
}
