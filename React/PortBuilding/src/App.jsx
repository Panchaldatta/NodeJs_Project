
import './App.css'

function App() {


const dulha = "Haramzada"
const dulhan = "Sakshi"

let a= 10;
let b = a;
console.log(a,b);

//Hoisting =variable and are hoisted which means theire declearation is moved to the top of the code
//Undefined = variable is declared but not assigned any value(Value defined hai par pata nahi hai kaha par hai)

//TYPES IN JS
//Primitives  and Reference(NON-Primitives)

//Primitives = String, Number, Boolean, Null, Undefined, Symbol
//Reference = [],(),{},(Object, Array, Function)
//aisi koi bhi value jisko copy karne par real copy nahi hota balki us main value ka reference pass ho jata haouse hum reference value kaheate hai 

//aur jisksa copy karne par real copy ho jata hai usko primitive bolte hai


var g = 10;

var h = a
console.log(g,h)


console.log(dulha + " and " + dulhan + " are getting married today!");
  return (
    <>

        <h1>React Practice</h1>
        <h2>{dulha} and {dulhan} are getting married today!</h2>
        <h3>Value of a is {a} and b is {b}</h3>

    </>
  )
}

export default App
