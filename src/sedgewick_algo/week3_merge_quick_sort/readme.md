Input - 12 10 15 1 7 8 3 11 4 0 -1 -2 99

Merge-sort calls

sort(0,12)    
sort(0,6)    
sort(0,3)    
sort(0,1)    
sort(0,0)    
sort(1,1)    
merge(0,0,1)    
10 12 15 1 7 8 3 11 4 0 -1 -2 99
sort(2,3)  
sort(2,2)  
sort(3,3)  
merge(2,2,3)  
10 12 1 15 7 8 3 11 4 0 -1 -2 99
merge(0,1,3)  
1 10 12 15 7 8 3 11 4 0 -1 -2 99
sort(4,6)  
sort(4,5)  
sort(4,4)  
sort(5,5)  
merge(4,4,5)  
1 10 12 15 7 8 3 11 4 0 -1 -2 99
sort(6,6)  
merge(4,5,6)  
1 10 12 15 3 7 8 11 4 0 -1 -2 99
merge(0,3,6)  
1 3 7 8 10 12 15 11 4 0 -1 -2 99
sort(7,12)  
sort(7,9)  
sort(7,8)  
sort(7,7)  
sort(8,8)  
merge(7,7,8)  
1 3 7 8 10 12 15 4 11 0 -1 -2 99
sort(9,9)  
merge(7,8,9)  
1 3 7 8 10 12 15 0 4 11 -1 -2 99
sort(10,12)  
sort(10,11)  
sort(10,10)  
sort(11,11)  
merge(10,10,11)  
1 3 7 8 10 12 15 0 4 11 -2 -1 99
sort(12,12)  
merge(10,11,12)  
1 3 7 8 10 12 15 0 4 11 -2 -1 99
merge(7,9,12)  
1 3 7 8 10 12 15 -2 -1 0 4 11 99
merge(0,6,12)  
-2 -1 0 1 3 4 7 8 10 11 12 15 99
-2 -1 0 1 3 4 7 8 10 11 12 15 99