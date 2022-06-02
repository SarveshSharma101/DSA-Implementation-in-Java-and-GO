package main

import "fmt"

func checkIfAsc(A *[]int) bool {
	for i, v := range *A {
		if i == len(*A)-1 {
			return false
		}
		if v > (*A)[i+1] {
			return false
		}
	}
	return true
}

func sort(A *[]int, low, high int) {
	j := 0
	key := 0
	for i := low + 1; i < high; i++ {
		key = (*A)[i]
		j = i - 1
		for j >= low && (*A)[j] >= key {
			(*A)[j+1] = (*A)[j]
			j = j - 1
		}
		(*A)[j+1] = key
	}
}

func NextGreatedPermutation(A *[]int) {
	if checkIfAsc(A) {
		swap(A, len(*A)-1, len(*A)-2)
		return
	} else {
		for i := len(*A) - 2; i >= 0; i-- {
			if (*A)[i] < (*A)[i+1] {
				swap(A, i, len(*A)-1)
				sort(A, i+1, len(*A))
				return
			}
		}
	}
	sort(A, 0, len(*A))
}

func swap(A *[]int, i1, i2 int) {
	temp := (*A)[i1]
	(*A)[i1] = (*A)[i2]
	(*A)[i2] = temp
}

func main() {
	A := []int{3, 2, 1}
	NextGreatedPermutation(&A)
	fmt.Println("---------->", A)

	B := []int{2, 2, 9}
	NextGreatedPermutation(&B)
	fmt.Println("---------->", B)

	C := []int{2, 9, 9}
	NextGreatedPermutation(&C)
	fmt.Println("---------->", C)

	D := []int{4}
	NextGreatedPermutation(&D)
	fmt.Println("---------->", D)
}
