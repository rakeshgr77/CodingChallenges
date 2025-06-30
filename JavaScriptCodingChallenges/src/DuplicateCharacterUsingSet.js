let str ='Rakesh is rak my nas'
let chars = str.toLowerCase().replace(/\s/g,'').split('')
let count = {}
let duplicateCharcters = new Set()

for (let char of chars){
   if(count[char]){
       duplicateCharcters.add(char)
   }else{
       count[char] =1
   }
}
console.log([...duplicateCharcters])