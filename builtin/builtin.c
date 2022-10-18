#include <stdio.h>

void print(char* x)
{
    printf(x);
}

void println(char* x)
{
    printf("%s\n", x);
}

void printInt(int x)
{
    printf("%d", x);
}

void printlnInt(int x)
{
    printf("%d\n", x);
}

int getInt()
{
    int n;
    scanf("%d", &n);
    return n;
}