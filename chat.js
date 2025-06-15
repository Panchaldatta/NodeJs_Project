var name="Aditya"
var age = 24
var isProgrammer = true

let sumaryy =  (UserName,UserAge,UserIsProgrammer)=> {
   return (
     `My name is ${UserName}, I am ${UserAge} years old and it is ${UserIsProgrammer} that I am a programmer.`)

};


const Updateuser=(UserName,UserAge,UserIsProgrammer)=>{
    name = UserName;
    age = UserAge;
    isProgrammer = UserIsProgrammer;
}
 
const Multiplication =(x,y)=>
{
    return x * y;
}
console.log(sumaryy(name, age, isProgrammer));
Updateuser("Aditya", 25, false);
console.log(sumaryy(name, age, isProgrammer));

console.log(Multiplication(100,500))
