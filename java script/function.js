function sum(num1,num2){
    if(num1!==undefined && num2!==undefined){
        sumvalue =num1+num2;
        return sumvalue;
    }
}
var sumval = sum(10,20);
console.log('sum = '+sumval);
console.log("========================");
var addData = function(num1,num2){
                                sumVal = num1+num2;
                            return sumVal;
                            };
                            var addValue = addData(10,20);
                            console.log('add value = '+addValue);
                            console.log("=====================");
                            (function (num1,num2){
                                var sumData = num1+num2;
                                console.log('sumValue '+sumData);
                            }
                            (10,20));
                            console.log("=======================");
                            var sumVal=(num1,num2)=>{
                                var totalsum = num1+num2;
                                return totalsum;
                            }
                            var valueData = sumVal(10,20);
                            console.log('value = '+valueData);
                            console.log("==========================");
                            var sumVal = (num1,num2)=>num1+num2;
                            var sumData = sumVal(10,50);
                            console.log('sum ='+sumData
                            );