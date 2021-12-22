# TeamGammaRay_lab03

## Hypothesis:
Binary search will be a lot faster than linear search on average. This is because it takes the "savviest" guesses, and will take fewer guesses on average than linear search, which brute forces, and iterates through every element in an array. 

Linear search will be faster if the target element is very close to the beginning.
Binary search will be slowest if the target element is the first or last element of the array. 
Linear search will be slowest if the target element is the last element of the array, or if it doesn't exist. 

## Tests Performed:

We generated arrays of length 50, filled with random Integers as test cases. 
Binary and linear searches on arrays of length: 100, 1,000, 10,000, 50,000, 100,000, 200,000, 500,000 
For each of the searches, we iterate through the test cases 10,00 times each, to get more accurate averages. 

## Results: 

Even with us iterating through every binary search case 100,000 times, binary search was still much faster than linear search (for long arrays). 
When we tried iterating through every linear search case 100,000 times to match binary search, our code take a long time to run. 

### Output of code (ms): 
```java
Length 100
Binary Average: 0.8
Linear Average: 2.6
Length 1,000
Binary Average: 0.0
Linear Average: 8.0
Length 10,000
Binary Average: 0.2
Linear Average: 67.6
Length 50,000
Binary Average: 0.2
Linear Average: 324.8
Length 100,000
Binary Average: 0.2
Linear Average: 651.6
Length 200,000
Binary Average: 0.4
Linear Average: 1304.8
Length 500,000
Binary Average: 0.2
Linear Average: 4515.8
```

## Conclusion: 

Binary search on average is a lot faster than linear search, most of the time returning a value of 0 milliseconds for search time. 
Linear search is very inefficient, quickly becoming slow to run, especially for longer arrays and more iterations. 
In the worst case scenario, linear search wins out for shorter arrays, but as the array gets larger, binary search wins. 

Binary search is always better than linear search in the worst case scenario. 
This is especially true as the arrays get larger and larger, since the difference in times gets larger and larger, in favor of binary search. 
