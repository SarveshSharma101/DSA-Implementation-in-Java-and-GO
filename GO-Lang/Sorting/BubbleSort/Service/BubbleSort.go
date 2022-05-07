package service

func Sort(array *[]int, desc int) {
	var condition bool

	for i := 0; i < len(*array); i++ {
		for j := 0; j < len(*array)-i-1; j++ {
			condition = (*array)[j] > (*array)[j+1]
			if desc == 1 {
				condition = (*array)[j] < (*array)[j+1]
			}
			if condition {
				temp := (*array)[j]
				(*array)[j] = (*array)[j+1]
				(*array)[j+1] = temp
			}
		}
	}
}
