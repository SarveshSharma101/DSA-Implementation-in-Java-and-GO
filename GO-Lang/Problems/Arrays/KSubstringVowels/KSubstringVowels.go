package main

import "fmt"

func KSubstringVowels(s string, k int) []int {
	count := 0
	counts := []int{}
	chars := []rune(s)

	for i := 0; i < len(chars)-k; i++ {
		count = 0
		for j := i; j < i+k; j++ {
			if string(chars[j]) == "a" || string(chars[j]) == "e" || string(chars[j]) == "i" || string(chars[j]) == "o" || string(chars[j]) == "u" {
				count++
			}
		}
		counts = append(counts, count)
	}
	return counts
}

func main() {
	fmt.Println("--->", KSubstringVowels("workattech", 3))
}
