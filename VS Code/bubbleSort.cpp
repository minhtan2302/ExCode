#include <stdio.h>

void swap (int &x, int &y)
{
    int temp = x;
    x = y;
    y =temp;
}

void bubbleSort (int arr[],int n){
    int i,j;
    bool haveSwap =false;
    for(i= 0;i < n-1;i++){
        haveSwap = false;
        for (j=0;j<n-i-1;j++){
            if(arr[j] > arr[j+1]){
                swap (arr[j], arr[j+1]);
                haveSwap = true;
            }
        }
        if (haveSwap == false){
            break;
        }
    }
}

void printArray (int arr[], int size){
    int i;
    for (  i = 0; i < size; i++)
    printf (" %d ",arr[i]);
    printf("\n");
    
        /* code */
    
}
int main ()
{
    int arr[] = {8,1,26,7,4,8,9};
    int n =sizeof(arr)/sizeof(arr[0]);
    bubbleSort (arr, n);
    printf("Sorted array: \n");
    printArray (arr, n);
    return 0;
}