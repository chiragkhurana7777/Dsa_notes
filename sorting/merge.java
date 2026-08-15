import java.util.*;

public class merge {

    public static void merge(int[] arr, int low, int mid, int high) {
        int[] temp= new int[arr.length];
        int left=low;
        int right=mid+1;

        int i=0;

        while(left<=mid && right<=high){
            if(arr[left]<=arr[right]){
                temp[i]=arr[left];
                i++;
                left++;
            }
            else{
                temp[i]=arr[right];
                i++;
                right++;
            }

        }

        while(left<=mid){
            temp[i]=arr[left];
                i++;
                left++;
        }
        
        while(right<=high){
            temp[i]=arr[right];
                i++;
                right++;
        }

        for (int k = low; k <=high; k++) {
            arr[k]=temp[k-low];

        }

    }

    public static void mergesort(int[] arr, int low, int high){
        if(low>=high) return;
        int mid=(low+high)/2;

        mergesort(arr, low, mid);
        mergesort(arr,mid+1,high);
        merge(arr, low, mid, high);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter array size : ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.print("enter array elements : ");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        mergesort(arr,0,n-1);

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        } 

        sc.close();
    }
}

/* Let's dry-run your exact Merge Sort code for:

arr = [8, 1, 6, 9, 0]
index   0  1  2  3  4

Initial call:

mergesort(arr, 0, 4)
1. Recursion: Divide the array
mergesort(0,4)
mid = 2

├── mergesort(0,2)
│   mid = 1
│
│   ├── mergesort(0,1)
│   │   mid = 0
│   │
│   │   ├── mergesort(0,0) → RETURN
│   │   ├── mergesort(1,1) → RETURN
│   │   └── merge(0,0,1)
│   │
│   ├── mergesort(2,2) → RETURN
│   └── merge(0,1,2)
│
├── mergesort(3,4)
│   mid = 3
│
│   ├── mergesort(3,3) → RETURN
│   ├── mergesort(4,4) → RETURN
│   └── merge(3,3,4)
│
└── merge(0,2,4)

Now let's see each merge().

Merge 1: merge(arr, 0, 0, 1)

Current:

[8, 1, 6, 9, 0]

left = 0
right = 1
i = 0

Compare:

arr[left] = 8
arr[right] = 1

8 <= 1 ❌

So:

temp[0] = 1
right = 2
i = 1

Right side finished.

Copy remaining left:

temp[1] = 8

temp relevant portion:

[1, 8]

Copy back:

arr = [1, 8, 6, 9, 0]
Merge 2: merge(arr, 0, 1, 2)

Current:

[1, 8, 6, 9, 0]

We are merging:

[1, 8]   +   [6]

Initially:

left = 0
right = 2
i = 0

First comparison:

arr[0] = 1
arr[2] = 6

1 <= 6 ✅

temp[0] = 1
left = 1
i = 1

Second comparison:

arr[1] = 8
arr[2] = 6

8 <= 6 ❌

temp[1] = 6
right = 3
i = 2

Right side finished.

Copy remaining left:

temp[2] = 8

So:

temp = [1, 6, 8]

Copy back:

arr = [1, 6, 8, 9, 0]
Merge 3: merge(arr, 3, 3, 4)

Current:

[1, 6, 8, 9, 0]

Merging:

[9] + [0]

Initially:

left = 3
right = 4
i = 0

Compare:

9 <= 0 ❌

temp[0] = 0
right = 5
i = 1

Copy remaining left:

temp[1] = 9

So:

temp = [0, 9]

Now this loop:

for (int k = low; k <= high; k++) {
    arr[k] = temp[k-low];
}

Here low = 3:

k = 3 → arr[3] = temp[3-3] = temp[0] = 0
k = 4 → arr[4] = temp[4-3] = temp[1] = 9

Result:

arr = [1, 6, 8, 0, 9]
Final Merge: merge(arr, 0, 2, 4)

Now:

[1, 6, 8] + [0, 9]

Current array:

[1, 6, 8, 0, 9]

Start:

left = 0
right = 3
i = 0

Comparisons:

1 vs 0
→ temp[0] = 0
→ right = 4

1 vs 9
→ temp[1] = 1
→ left = 1

6 vs 9
→ temp[2] = 6
→ left = 2

8 vs 9
→ temp[3] = 8
→ left = 3

Left side finished.

Copy remaining right:

temp[4] = 9

Therefore:

temp = [0, 1, 6, 8, 9]

Copy back:

arr = [0, 1, 6, 8, 9]
Final output
0 1 6 8 9

The most important thing to understand is the order of execution:

DIVIDE:
[8,1,6,9,0]
       ↓
[8,1,6]       [9,0]
   ↓             ↓
[8,1] [6]     [9] [0]
 ↓
[8] [1]


MERGE BACK:
[8] [1]       → [1,8]
[1,8] [6]     → [1,6,8]
[9] [0]       → [0,9]
[1,6,8] [0,9] → [0,1,6,8,9]

So recursion first keeps dividing, and merge() starts executing only when the base cases (low >= high) start returning.*/