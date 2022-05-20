package service

func Sort(arr *[]int) {
	j := 0

	for i, v := range *arr {
		j = i - 1

		for j >= 0 && v < (*arr)[j] {
			(*arr)[j+1] = (*arr)[j]
			j--
		}
		(*arr)[j+1] = v
	}
}
