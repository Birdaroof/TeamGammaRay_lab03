# TeamGammaRay_lab03

## Hypothesis:
Binary search will be a lot faster than linear search on average. This is because it takes the "savviest" guesses, and will take fewer guesses on average than linear search, which brute forces, and iterates through every element in an array. 

Linear search will be faster if the target element is very close to the beginning.
Binary search will be slowest if the target element is the first or last element of the array. 
Linear search will be slowest if the target element is the last element of the array, or if it doesn't exist. 

## Tests Performed:

We generated arrays of length 50, filled with random Integers as test cases. 
Binary and linear searches on arrays of length: 100,000, 200,000, 500,000, 1,000,000, 7,000,000, 8,000,000. 
For linear search, we iterated through every case 10 times, and for binary search, we iterated through 100,000 times (to produce more visible results).

## Results: 

Even with us iterating through every binary search case 100,000 times, binary search was still much faster than linear search (for long arrays). 
When we tried iterating through every linear search case 100,000 times to match binary search, our code take a long time to run. 

### Output of code (ms): 
```java
100,000 length
Binary Average: 2
Linear Average: 0
200,000 length
Binary Average: 2
Linear Average: 1
500,000 length
Binary Average: 3
Linear Average: 8
1,000,000 length
Binary Average: 3
Linear Average: 16
7,000,000 length
Binary Average: 3
Linear Average: 121
8,000,000 length
Binary Average: 3
Linear Average: 129
```

## Conclusion: 

Binary search on average is a lot faster than linear search, most of the time returning a value of 0 milliseconds for search time. 
Linear search is very inefficient, quickly becoming slow to run, especially for longer arrays and more iterations. 
In the worst case scenario, linear search wins out for shorter arrays, but as the array gets larger, binary search wins. 
