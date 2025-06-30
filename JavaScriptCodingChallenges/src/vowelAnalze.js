//count the number of vowels
let str = "Rakeshaitow"

//?.length || 0 will return the length if not found returns 0
console.log(str.match(/[aeiouAEIOU]/g)?.length||0)
