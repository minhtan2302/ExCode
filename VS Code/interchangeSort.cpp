#include<stdio.h>
#include <math.h>

void swap (int &x, int &y){
    int temp = x;
    x =y;
    y=temp;
}

void interchangeSort (int a[],int n){
    for ( int i = 0; i <  n-1; i++)
    
        for (int j = i+1;i<n;j++)
        
        if (a[i]>a[j])
            swap(a[i],a[j]);
        
    
}

void printArray (int arr[],int n){
    int i;
    for (i = 0; i<n;i++)
    printf("%d ", arr[i]);
    printf ("\n");
}

 int main (){
     int arr[]={12,6,9,4,2,16,19};
     int n =sizeof(arr)/sizeof(arr[0]);
     interchangeSort(arr, n);
     printf("Sorted array: \n");
     printArray(arr, n);
 }