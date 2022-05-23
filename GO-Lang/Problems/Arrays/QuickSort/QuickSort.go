package main

import "fmt"

//Given an array, sort it using quicksort.

func Sort(arr *[]int, low int, high int) {
	if low < high {
		pt := partition(arr, low, high)
		Sort(arr, low, pt-1)
		Sort(arr, pt+1, high)
	}
}

func partition(arr *[]int, low, high int) int {
	pivot := (*arr)[high]
	i, j := 0, high-1

	for {
		for (*arr)[i] < pivot {
			i++
		}
		for j >= 0 && (*arr)[j] > pivot {
			j--
		}
		if i >= j {
			break
		}
		temp := (*arr)[i]
		(*arr)[i] = (*arr)[j]
		(*arr)[j] = temp
	}
	temp := (*arr)[i]
	(*arr)[i] = pivot
	(*arr)[high] = temp
	return i
}

func main() {
	arr := []int{1, 3, 5, 7, 9, 11, 0, 4, 6, 8}
	Sort(&arr, 0, len(arr)-1)
	fmt.Println("------->", arr)
}
