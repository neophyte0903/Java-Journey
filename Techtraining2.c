#include <stdio.h>
#include <stdlib.h>
#include <string.h>

#define MAX_LEN 100

// Stack data structure
typedef struct {
    char data[MAX_LEN];
    int top;
} Stack;

// Function prototypes
void push(Stack *stack, char c);
char pop(Stack *stack);
int is_matching_pair(char left, char right);
int check_expression(char *exp);

int main() {
    char exp[MAX_LEN];
    printf("Enter an expression: ");
    fgets(exp, MAX_LEN, stdin);
    exp[strcspn(exp, "\n")] = '\0';  // Remove newline character from input

    if (check_expression(exp)) {
        printf("The expression has correct pairs and orders of braces/brackets/parentheses.\n");
    } else {
        printf("The expression has incorrect pairs and/or orders of braces/brackets/parentheses.\n");
    }

    return 0;
}

// Pushes an element onto the stack
void push(Stack *stack, char c) {
    if (stack->top == MAX_LEN - 1) {
        printf("Stack overflow.\n");
        exit(1);
    }
    stack->data[++stack->top] = c;
}

// Pops an element from the stack
char pop(Stack *stack) {
    if (stack->top == -1) {
        printf("Stack underflow.\n");
        exit(1);
    }
    return stack->data[stack->top--];
}

// Checks if a left and right brace/bracket/parenthesis form a matching pair
int is_matching_pair(char left, char right) {
    if (left == '(' && right == ')') {
        return 1;
    } else if (left == '{' && right == '}') {
        return 1;
    } else if (left == '[' && right == ']') {
        return 1;
    } else {
        return 0;
    }
}

// Checks the expression for correct pairs and orders of braces/brackets/parentheses
int check_expression(char *exp) {
    Stack stack;
    stack.top = -1;

    for (int i = 0; i < strlen(exp); i++) {
        if (exp[i] == '(' || exp[i] == '{' || exp[i] == '[') {
            push(&stack, exp[i]);
        } else if (exp[i] == ')' || exp[i] == '}' || exp[i] == ']') {
            if (stack.top == -1 || !is_matching_pair(pop(&stack), exp[i])) {
                return 0;
            }
        }
    }

    return stack.top == -1;
}

