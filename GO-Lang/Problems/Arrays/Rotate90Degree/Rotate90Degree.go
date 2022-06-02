package main

import "fmt"

/**
 *
 * Matrix Rotation
 *
 * Given a matrix, rotate the matrix 90 degrees clockwise.
 * @param matrix
 *
 * Examples
 * Matrix:
 * 1 2 3
 * 4 5 6
 * 7 8 9
 * After rotation:
 * 7 4 1
 * 8 5 2
 * 9 6 3
 * Matrix:
 * 1 2
 * 3 4
 * 5 6
 * After rotation:
 * 5 3 1
 * 6 4 2
 *
 *
 * @return
 */
func RotateMatrix(matrix *[][]int) [][]int {

	C := make([][]int, len((*matrix)[0]))
	for i := range C {
		C[i] = make([]int, len(*matrix))
	}

	size := len(*matrix)
	for i := range *matrix {
		size = size - 1
		for j := 0; j < len((*matrix)[0]); j++ {
			C[j][size] = (*matrix)[i][j]
		}
	}
	return C
}

func main() {
	var row, col int
	fmt.Println("Enter the number of rows: ")
	fmt.Scan(&row)

	fmt.Println("Enter the number of columns: ")
	fmt.Scan(&col)

	C := make([][]int, row)
	for i := range C {
		C[i] = make([]int, col)
	}

	for i := 0; i < row; i++ {
		for j := 0; j < col; j++ {
			fmt.Print("--->")
			fmt.Scan(&C[i][j])
		}
		fmt.Println("")
	}

	for i := 0; i < row; i++ {
		for j := 0; j < col; j++ {
			fmt.Print(C[i][j], " ")
		}
		fmt.Println("")
	}

	A := RotateMatrix(&C)
	fmt.Println("--------------------")

	for i := 0; i < len(A); i++ {
		for j := 0; j < len(A[0]); j++ {
			fmt.Print(A[i][j], " ")
		}
		fmt.Println("")
	}
}
