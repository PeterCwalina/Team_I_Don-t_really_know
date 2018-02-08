# Lab 0: Big O(?)
## Team I_Don-t_really_know
Maryann Foley & Peter Cwalina

## Hypothesis
Our hypothesis is that our algorithm does in fact run in linear time

## Background
The algorithm uses the fact that anything above the diagonal of the matrix  will be less than the number on that row of the diagonal and anything to the right would be greater than the number in the diagonal.  If the target is less than the position it is looking at then it would go up one and if its greater then it would go right one.

## Methodology
Our method is to take a timestamp before the matrix search is done and after to determine how long it takes to go through with the search.
The task is being performed on matricies of 1000 x 1000 upwards to make sure the data is meaningful

## Results
The time taken seems to increase in a linear fashion with the exception of 16k x 16k matrix.  

## Conclusions
The algorithm works in a linear time with the exception of the 16k by 16k matrix only because of the initial slowdown 
Without taking the average of the the times of the trials we noticed that the times for a single matrix-size would speed up, but when averaged and graphed the times do in fact look like a linear graph. The initial slowdown can be attributed to memory allocation most likely.
 
