let str ='Rakesh is rak my nas'
let chars = str.toLowerCase().replace(/\s/g,'').split('')
let count = {}

for (let char of chars){
    count[char] = ((count[char]|0)+1)
}

//Below is to find the duplicate
for (let char in count){
    if(count[char]>1){
        console.log(`${char} : ${count[char]}`)
    }
}