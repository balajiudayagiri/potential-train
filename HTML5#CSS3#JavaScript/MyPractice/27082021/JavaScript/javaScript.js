function myFunction() {
    onClick = document.getElementById('demo').innerHTML = "<h1>this is a sample paragraph2</h1>";
    onClick = document.getElementById('demo').style.color = "red";
};

function meFunction(name) {
    document.getElementById('demo4').innerHTML = "Welcome " + name;
    document.getElementById('demo4').style.fontSize = "5rem"
}
const person = {
    lastName: "udayagiri",
    firstName: "balaji",
    age: "23"
};

document.getElementById('demo3').innerHTML = "My name is " + person.lastName + " " + person.firstName + " and I am " + person.age + " years old";

const cars = ["carA", "carB", "carC", "carD"];
document.getElementById('cars0').innerHTML = cars;
function meFunction1() {
    cars.push("carS");
    document.getElementById('carsZ').innerHTML = cars;
}
cars[2] = "carZ";
document.getElementById('cars1').innerHTML = cars;
document.getElementById('carsL').innerHTML = cars.length;


