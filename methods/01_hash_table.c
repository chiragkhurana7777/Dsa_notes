//two sum example

#include <stdio.h>

#define SIZE 1000 // hash table size

int main()
{
    int n;
    scanf("%d", &n);
    int arr[n];

    for (int i = 0; i < n; i++)
    {
        scanf("%d", &arr[i]);
    }

    int target;
    scanf("%d", &target);

    int hash[SIZE] = {0}; // initialize all to 0

    for (int i = 0; i < n; i++)
    {
        int complement = target - arr[i];

        // Check if complement exists
        if (hash[complement] == 1)
        {
            printf("Pair found: %d and %d\n", arr[i], complement);
            return 0;
        }

        // Store current element
        hash[arr[i]] = 1;
    }

    printf("No pair found\n");
    return 0;
}