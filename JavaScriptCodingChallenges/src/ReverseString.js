let str = 'Rakesh'
console.log(str.split('').reverse().join(''))

let str2 = 'Rakesh is my name'
console.log(str2.replaceAll(/\s/g,'').split('').reverse().join(''))

//Count of vowles

let str3 = 'akiessou'
console.log(str3.match(/[aieouAEIOU]/g).length)