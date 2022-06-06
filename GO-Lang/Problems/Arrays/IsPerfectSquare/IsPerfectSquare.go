package main

import (
	"fmt"
	"math"
)

func IsPerfectSquare(num int) bool {
	num = int(math.Abs(float64(num)))
	if num == 4 {
		return true
	} else if num == 0 {
		return true
	}

	low, high, mid, temp := 0, num/2, 0, 0

	for low <= high {
		mid = (low + high) / 2
		temp = mid * mid
		if temp == num {
			return true
		} else if temp > num {
			high = mid - 1
		} else {
			low = mid + 1
		}
	}

	return false
}

func main() {
	fmt.Println("---->", IsPerfectSquare(25))
	fmt.Println("---->", IsPerfectSquare(36))
	fmt.Println("---->", IsPerfectSquare(49))
	fmt.Println("---->", IsPerfectSquare(64))
	fmt.Println("---->", IsPerfectSquare(121))
	fmt.Println("---->", IsPerfectSquare(144))
	fmt.Println("---->", IsPerfectSquare(2215))
	fmt.Println("---->", IsPerfectSquare(223235))
}
