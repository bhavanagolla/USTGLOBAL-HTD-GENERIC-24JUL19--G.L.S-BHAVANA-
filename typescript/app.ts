// let myName = 'bhavana';
// // alert(myName);
// console.log(myName);
// let company;
// company = 'testyantra';
// company = 23;
// console.log(company); 
// //union
// let sample : number | boolean;
// sample = 10;
// sample = true;
// console.log(sample);
// //array
// let myArray :any[]= ['dagyefg', 'gdyugdeyg'];
// console.log(myArray);
// //tuple(arrange the elements in the required order mentioned in an array)
// let myTuple: [string, number, boolean] = ['', 4875, true];
// console.log(myTuple);
// //enumeration(enum)
// enum colors{
//     red = 'danger',
//     blue = 'royal',
//     pink = 'pretty',
//     black = 'dark'
// }
// console.log(colors.red);
// //class(it is a blueprint of an object.in this we didnot use let and const keywords)
// class Person{
//         name : string;
//         age : number;
//         constructor(public personName: string,personAge: number){
//             this.name = personName;
//             this.age = personAge;
//         }
// }
// let person = new Person('chinnu',21);
// person.name;
// console.log(person.name);
// //class
// class Car{
//        constructor(public brand: string, public model: string){
//        }
//        }
// let audi = new Car('audi','x5');
// console.log(audi.brand);
// console.log(audi.model);
// let mercedesbenz : Car ={
//     brand : 'audi',
//     model : '0003'
// }
// //constructor
// class Person1 {
//                constructor(public name: string, public aadhar: number){}
// }
// class Student extends Person {
//                             constructor(public myName :string, public myAge : number,public usn : number){
//                                 super(myName, myAge);
//                             }
//                         }
                        
//                         let per = new Person1('jithin', 123);
//                         let std = new Student('akshitha',213,789456123);
//                         console.log(per.aadhar);

// let person3: Person2 = {
//     name : 'hbhgdhj',
//     age: 4654
// }
// let person4: Person2 = {
//     name : 'hufhjhj',
//     age: 54535,
//     degree : 'enjwegf'
// }
// using interface
// interface Student {
//                     name: string;
//                     age: number;
//                     printDetails(): void;
// }
// class Bhavana implements Student{
//                         name = 'gdhugh';
//                         age = 565;
//                         printDetails(){
//                             console.log("name is "+ this.name + 'age is'+ this.age);
//                         }
//                         }
//                         let person1 = new Bhavana();
//                         person1.printDetails();
//                         let Student1: Student = {
//                             name : 'xgyewf',
//                             age : 5456,
//                             printDetails : ()=>{
//                                 console.log("name is"+ this.name + 'age is'+ Student.age);
//                             }

//                         }
     //generics
    //  function getArray<p>(items:p[]):p[]{
    //      return new Array<p>().concat(items);
    //  }           
    //  let strArray= getArray<string>(['vdhg','gdhug','dggchycg']);
    //  let numArray= getArray<number>([5454,65345,5435435]);
    //  numArray.push(454);
    //  strArray.push('hghghj');
    /// <reference path="C:\Users\bhavana\Desktop\typescript-class\circle.ts"/>
    /// <reference path="C:\Users\bhavana\Desktop\typescript-class\rectangle.ts"/>
    MathOperations.circle.circumferenceOfCircle(234);
    rectangleOperations.rectangle.area(23,24);

    



