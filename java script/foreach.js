/*foreach*/
var hobbies = ['singing','daancing','cricket','football','monoacting'];
hobbies.forEach(function(myhobbies,index){
    if(myhobbies.length>7)
    console.log('hobbies = '+myhobbies);
});
console.log("=====================");
console.log(myname);
var myname = 'bhavana shetty';
console.log(myname);
function getage(){
    console.log(age);
    var age = 21;
    console.log(age);
}
getage();
console.log("======================");
/*Is array*/
var hobbies = ['singing','dancing','cricket','football','monoacting'];
 var checkArray = Array.isArray(hobbies);
 console.log('Is Array = '+checkArray);
 /*includes*/
 var checkIncludes = hobbies.includes('dancing');
  console.log('Includes = +checkIncludes');
  /*push and pop*/
 hobbies.push('kabaddi','volleyball');
 console.log('hobbies after push ' +hobbies);
 hobbies.pop();
 /*unshift and shift*/
 console.log('hobbies after pop ' +hobbies);
 hobbies.unshift('skipping','weaving');
 console.log('hobbies after unshift ' +hobbies);
 hobbies.shift();
 console.log('hobbies after shift ' +hobbies);
/*splice and slice*/
hobbies.splice(0,2,'swimming','trecking');
console.log('hobbies after splice ' +hobbies);
hobbies.slice(1,3);
console.log('hobbies after slice ' +hobbies);   
var indexOfPhotography = hobbies.indexOf('photography');
console.log('index Of Photography '+indexOfPhotography);
console.log("=============================");
var number = [10,20,30,40,50];
var afterMap = number.map((mapnumbers=>(mapnumbers+10)));
console.log(afterMap);
var afterFilter = number.filter((filterNumbers=>(value>10)));
console.log(afterFilter);
console.log("======================================");
var items = [{
     name : 'lipstick',
     price : 95,
     id : 1
},
{
    name : 'perfume',
    price : 500,
    id : 2
},
{
    name : 'watches',
    price : 1000,
    id : 3
},
{
    name : 'shoes',
    price : 2000,
    id : 4
}
];
var mappeditems = items.map(function(item)){
    item.price = item.price+100;
    return item;
});
console.log("Items after adding 100 "+mappeditems);
var filtereditems = items.filter(function(item){
    var itemfilter = item.price>100 && item.name.length>5;
    return itemfilter;
});
console.log("items after mapping")