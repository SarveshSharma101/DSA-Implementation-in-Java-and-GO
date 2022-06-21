package main

import "fmt"

func SearchRoot(x int) int {
	subCount := 0
	temp := x

	for i := 1; i < x; i = i + 2 {
		temp = temp - i
		subCount++
		if temp == 0 {
			return subCount
		} else if temp < 0 {
			return subCount - 1
		}
	}
	return subCount
}

func main() {
	fmt.Println("---->", SearchRoot(625))
}
