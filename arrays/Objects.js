const person={
    name: "John",
    age: 30,
    city: "New York",

     greet:()=> {
        return `Hello, my name is ${this.name} and I am ${this.age} years old.`;
    }

};

console.log(person);
console.log(person.greet());

