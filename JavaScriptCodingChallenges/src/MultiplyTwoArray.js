let arr1 =[1,2,3,4]
let arr2 = [9,6,2,8,5]
let multiplyArr = [];

//check length to make sure you take equal length array for multiplication
let minLength = Math.min(arr1.length, arr2.length);  // Choose the shorter length

for (let i = 0; i < minLength; i++) {
    multiplyArr.push(arr1[i] * arr2[i]);
}

console.log(multiplyArr);

//you can do the same using the map remember this if you want impress the interviwer
let multiplyArr = arr1.map((val, index) => val * arr2[index]);