package main

import "fmt"

/**
 *
 * Pascal's Triangle
 *
 * The triangle below is known as Pascal’s triangle.
 *
 * In this triangle, the value at a position is equal to the sum of values of the 2 elements just above it.
 *
 * Examples
 * The 2nd element of 5th row is 1+3 => 4
 * The 3rd element of 5th row is 3+3 => 6
 * The 4th element of 5th row is 3+1 => 4
 *
 * For the leftmost and the rightmost position in each row, the value is 1.
 * The element in the first row is also 1.
 *
 * Given a number n, find the nth row of pascal’s triangle.
 *
 * Input Format
 * The first line contains ‘T’ denoting the no. of test cases.
 *
 * Next T lines contains a number 'n' denoting the row number of pascal’s triangle.
 *
 * Output Format
 * For each test case, a line containing ‘n’ space-separated integers denoting the elements in the nth row.
 *
 */
func PascalTriangleRow(rowNo int) []int {
	C := []int{}
	nCr := 0
	factRow := factorial(rowNo)
	for i := 0; i <= rowNo; i++ {
		nCr = factRow / (factorial(rowNo-i) * factorial(i))
		C = append(C, nCr)
	}
	return C
}

func factorial(n int) int {
	if n == 0 {
		return 1
	} else {
		return n * factorial(n-1)
	}
}

func main() {
	fmt.Println("---------->", PascalTriangleRow(0))
	fmt.Println("---------->", PascalTriangleRow(1))
	fmt.Println("---------->", PascalTriangleRow(2))
	fmt.Println("---------->", PascalTriangleRow(3))
	fmt.Println("---------->", PascalTriangleRow(4))
	fmt.Println("---------->", PascalTriangleRow(5))
	fmt.Println("---------->", PascalTriangleRow(6))
	fmt.Println("---------->", PascalTriangleRow(7))
}
