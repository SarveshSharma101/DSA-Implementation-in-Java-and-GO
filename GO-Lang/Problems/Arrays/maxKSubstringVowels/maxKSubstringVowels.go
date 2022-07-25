package main

import "fmt"

func MaxKSubstringVowels(s string, k int) int {
	maxCount, count := 0, 0

	for i := 0; i <= len(s)-k; i++ {
		count = 0
		for j := i; j < i+k; j++ {
			if s[j] == 'a' || s[j] == 'i' || s[j] == 'o' || s[j] == 'u' || s[j] == 'e' {
				count++
			}
		}
		if count > maxCount {
			maxCount = count
		}
	}
	return maxCount
}

func main() {
	fmt.Println("-->", MaxKSubstringVowels("workaattech", 3))
}
