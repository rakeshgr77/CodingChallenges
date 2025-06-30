//Print number from 500 to 700 in reverse order which are divisible by 3
let arr = []
for (let i =500;i<=700;i++){
    if ((i%3===0)){
        arr.push(i)
    }
}
console.log(arr.reverse())