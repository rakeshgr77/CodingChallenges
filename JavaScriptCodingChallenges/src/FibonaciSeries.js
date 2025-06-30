let num =8
let start = 0
let next = 1
//if you want to display it as array
let fibArr = [];

for(let i =0;i<num;i++){

    //add to array
    fibArr.push(start)
    //direct display
    console.log(start)
    let fb = start + next
    start = next
    next = fb
}

console.log(fibArr)
