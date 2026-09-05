#include <stdio.h>
int n;
struct node
{
    int info;
    struct node *next;
};
struct node *head,*old;
printf("enter no of nodes:");
scanf("%d",&n);
