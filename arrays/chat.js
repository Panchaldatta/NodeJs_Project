
let age = prompt("Enter ur age ");
if (isNaN(age) || age < 0) {
    console.log("Please enter a valid age.");
} else {
    console.log(`Your age is ${age}`);
    if (age < 18) {
        console.log("You are a minor.");
    } else if (age >= 18 && age < 65) {
        console.log("You are an adult.");
    } else {
        console.log("You are a senior citizen.");
    }
}
   