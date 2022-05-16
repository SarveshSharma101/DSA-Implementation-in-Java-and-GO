package service

func merge(array *[]int, l int, mid int, h int) {
	i, j, k := l, mid+1, l
	B := make([]int, 100)

	for i <= mid && j <= h {
		if (*array)[i] < (*array)[j] {
			B[k] = (*array)[i]
			i++
			k++
		} else {
			B[k] = (*array)[j]
			j++
			k++
		}
	}

	for j <= h {
		B[k] = (*array)[j]
		j++
		k++
	}

	for i <= mid {
		B[k] = (*array)[i]
		i++
		k++
	}

	for i := l; i < h+1; i++ {
		(*array)[i] = B[i]
	}
}

func MergeSort(array *[]int, l int, h int) {
	if l < h {
		mid := (l + h) / 2
		MergeSort(array, l, mid)
		MergeSort(array, mid+1, h)
		merge(array, l, mid, h)
	}
}
