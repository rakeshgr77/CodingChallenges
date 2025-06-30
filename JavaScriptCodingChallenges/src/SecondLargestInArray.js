let arr = [12,4,67,99,55]
let unique = [...new Set(arr)]
let sorted = unique.sort((a,b)=>b -a)
//b -a sort in descending order a -b for ascending order

//print all the sorted value
console.log(sorted)

//Second Largest
console.log(sorted[1])