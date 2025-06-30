var expense = [20,31,45,90,31]

//add
console.log(expense.reduce((sum,acc)=> sum+acc,0))

//Filter based on condition
console.log(expense.filter(exp=>exp%2==0))

console.log(expense.filter(exp=>exp>40))

//Map
console.log(expense.map(num=>num+10))