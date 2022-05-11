package service

func swap(array *[]int, i int, j int) {
	temp := (*array)[i]
	(*array)[i] = (*array)[j]
	(*array)[j] = temp
}

func partition(array *[]int, low int, high int) int {

	pivot := (*array)[high]
	var i, j = low, high - 1

	for {
		for (*array)[i] < pivot {
			i++
		}
		for j >= 0 && (*array)[j] > pivot {
			j--
		}
		if i >= j {
			break
		} else {
			swap(array, i, j)
		}
	}
	swap(array, i, high)

	return i
}

func QuickSort(array *[]int, low int, high int) {
	if low < high {
		p := partition(array, low, high)
		QuickSort(array, low, p-1)
		QuickSort(array, p+1, high)
	}
}
