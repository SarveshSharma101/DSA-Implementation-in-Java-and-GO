package services

import "fmt"

type Stack struct {
	top       int
	stackSize int
	stack     []int
}

func InitStack(stackSize int) Stack {

	if stackSize <= 0 {
		return Stack{top: -1, stackSize: 5, stack: make([]int, 5)}
	} else {
		return Stack{top: -1, stackSize: stackSize, stack: make([]int, stackSize)}
	}
}

func (Stack) IsFull(s *Stack) bool {
	return (s.top == s.stackSize-1)
}

func (Stack) IsEmpty(s *Stack) bool {
	return s.top == -1
}

func (Stack) Peek(s *Stack) int {
	if s.IsEmpty(s) {
		fmt.Println("Stack is empty")
		return -1
	}

	return s.stack[s.top]
}

func (Stack) Push(s *Stack, value int) int {
	if s.IsFull(s) {
		return -101
	}

	s.top += 1
	s.stack[s.top] = value
	return 0
}

func (Stack) Pop(s *Stack) int {
	if s.IsEmpty(s) {
		return -101
	}

	val := s.stack[s.top]
	s.top -= 1
	return val
}

func (Stack) DisplayAll(s *Stack) {
	if s.IsEmpty(s) {
		fmt.Println("Stack is empty")
		return
	}

	for i := 0; i <= s.top; i++ {
		fmt.Printf("%d: %d\n", i+1, s.stack[i])
	}
}
