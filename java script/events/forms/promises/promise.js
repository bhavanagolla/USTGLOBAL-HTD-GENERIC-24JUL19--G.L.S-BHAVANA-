
let employeeData = new Promise(function(resolve,reject){
    const employee = [
                        {
                            name : 'shahrukh',
                            age : 60
                        },
                        {
                            name : 'sundari',
                            age : 45
                        },
                        {
                            name : 'akshay',
                            age :50
                        },
                    
    ];
    if(10>10){
        reject('Failed');
    }
    else{
        resolve(employee);
    }
});
employeeData.then((data)=>{
   // console.log('Then block =',data);
   return data;
}).catch((error)=>{
    console.log('Catch block = '+error);
}).then(function(data1){
    console.log('This is then block 2',data1);

});
function fact(n){
    if(n===0||n===1){
        return 1;
    }
    else{
        return fact(n-1)*n;
    }
}
let factorialValue = fact(5);
console.log(factorialValue);