let num  =4
let isPrime = true
for(let i =2;i<num/2;i++){
    if(num%i===0){
        isPrime = false;
        break;
    }
}
if(isPrime){
    console.log("It is Prime Number")
}else {
    console.log("It is Not a Prime Number");
}