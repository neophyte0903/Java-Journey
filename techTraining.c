#include <stdio.h>
#include <stdlib.h>

int main() {
    int *ptr = (int *)malloc(sizeof(int));
    *ptr = 10;
    printf("Value of ptr: %d\n", *ptr);

    free(ptr);
    printf("Value of ptr after free(): %d\n", *ptr);

    return 0;
}
