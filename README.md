# Lab 00: Big O(?)
## Team I_Don-t_really_know
Maryann Foley & Peter Cwalina

## Hypothesis
Our hypothesis is that our algorithm does in fact run in linear time

## Background
The algorithm uses the fact that anything above the diagonal of the matrix  will be less than the number on that row of the diagonal and anything to the right would be greater than the number in the diagonal.  If the target is less than the position it is looking at then it would go up one and if its greater then it would go right one.

## Methodology
Our method is to take a timestamp before the matrix search is done and after to determine how long it takes to go through with the search.
The task is being performed on matricies of 1000 x 1000 upwards to make sure the data is meaningful.

## Results
The time taken seems to increase in a linear fashion. 

## Conclusions
The algorithm works in a linear time, but while testing we noticed that the jvm needs a little time to "warmup" during that time it runs slower than its supposed to.  Therfore we gave it a warmup period before actually recording data.
We had to have a few throw away cases in order to discount the initial large numbers that we were seeing.
We also ran each matrix size 50 times to ensure that our average was as accurate as possible.  Graph is visible below, with red representing the optimized line.
![graph][chart.png]
