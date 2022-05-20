package main

import "fmt"

func merge(arr *[]int, low int, mid int, high int) {
	C := make([]int, len(*arr))

	i, j, k := low, mid+1, low

	for i <= mid && j <= high {
		if (*arr)[i] <= (*arr)[j] {
			C[k] = (*arr)[i]
			k++
			i++
		} else {
			C[k] = (*arr)[j]
			k++
			j++
		}
	}

	for i <= mid {
		C[k] = (*arr)[i]
		k++
		i++
	}

	for j <= high {
		C[k] = (*arr)[j]
		k++
		j++
	}

	for i := low; i <= high; i++ {
		(*arr)[i] = C[i]
	}
}

func MergeSort(arr *[]int, low int, high int) {
	if low < high {
		mid := (low + high) / 2
		MergeSort(arr, low, mid)
		MergeSort(arr, mid+1, high)

		if (*arr)[mid] > (*arr)[mid+1] {
			merge(arr, low, mid, high)
		}
	}
}

func main() {
	arr := []int{1, 3, 5, 7, 9, 11, 0, 4, 6, 8}
	MergeSort(&arr, 0, len(arr)-1)
	fmt.Println("------->", arr)
}
