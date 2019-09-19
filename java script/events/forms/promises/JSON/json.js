let employeeJSON = {
                    name : 'dinga',
                    age : 24,
                    hobbies : ['dancing','drawing']
}
console.log(`My name is ${employeeJSON.name}`);
console.log(employeeJSON);
let jsonObject = JSON.stringify(employeeJSON);
console.log(jsonObject);
let jsObject = JSON.parse(jsonObject);
console.log(jsObject);