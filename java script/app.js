var todaydate=new Date();
console.log(todaydate);
var todaysdate=new Date(2018,11,24,10,33,30,0);
console.log(todaysdate);
var date=new Date(0);
console.log(date);
var date=new Date("october 13,2014 11;13;00");
console.log(date);
var months = ['jan','feb','mar','apr','may','jun','jul','aug','sep','oct','nov','dec'];
var days = ['sunday','monday','tuesday','wednesday','thursday','friday','saturady'];
console.log("Month = "+months[todaydate.getMonth()]);
console.log("Days = "+days[todaydate.getDay()]);
console.log(Math.PI);
console.log(Math.floor(4.5));
console.log(Math.ceil(4.5));
console.log(Math.random());
console.log(Math.random());
console.log(Math.floor(Math.random()*100));