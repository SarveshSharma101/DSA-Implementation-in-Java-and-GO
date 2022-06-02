package main

import "fmt"

/**
 * Row Column Zero
 *
 * Given a matrix, if any of the cells in the matrix is 0,
 * set all the elements in its row and column to 0.
 *
 * Examples
 * 1 1 1        1 0 1
 * 1 0 1   =>   0 0 0
 * 1 1 1        1 0 1
 *
 * 0 1 2        0 0 0
 * 3 4 5   =>   0 4 5
 * 1 2 3        0 2 3
 *
 * 0 1 0        0 0 0
 * 3 4 5   =>   0 4 0
 * 1 2 3        0 2 0
 *
 * 0 1 0        0 0 0
 * 3 0 5   =>   0 0 0
 * 1 2 3        0 0 0
 * @param matrix
 */

func SetRowColumnZeroes(matrix *[][]int) {

	C := [][2]int{}
	for i, v := range *matrix {
		for j, v := range v {
			if v == 0 {
				C = append(C, [2]int{i, j})
			}
		}
	}

	for _, v := range C {
		for i := 0; i < len((*matrix)[0]); i++ {
			(*matrix)[v[0]][i] = 0
		}
		for i := 0; i < len(*matrix); i++ {
			(*matrix)[i][v[1]] = 0
		}
	}
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

	SetRowColumnZeroes(&C)
	fmt.Println("--------------------")

	for i := 0; i < len(C); i++ {
		for j := 0; j < len(C[0]); j++ {
			fmt.Print(C[i][j], " ")
		}
		fmt.Println("")
	}

}
