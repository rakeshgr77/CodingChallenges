let str1 = 'silent'
let str2 = 'listen'

/*
/[^\w]/g
\w matches any word character: [a-zA-Z0-9_]
^ inside the brackets [^...] means "not"
So, [^\w] matches anything that is not a letter, digit, or underscore.
g is the global flag, meaning it replaces all occurrences, not just the first one. */

let sortedstr1  = str1.replace(/[^\w]/g,'').toLowerCase().split('').sort().join('')
let sortedstr2  = str2.replace(/[^\w]/g,'').toLowerCase().split('').sort().join('')

if(sortedstr1===sortedstr2){
    console.log("It is Anagram")
}else{
    console.log("Not a Anagram")
}