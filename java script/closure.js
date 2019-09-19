function sum(a,b){
    function addSum(){
        return a+b;
    }
    return addSum;
}
var addFun = sum(20,30);
    var total = addFun();
    console.log('total',total);
    console.log("==============================");
    console.log(window);
    console.log(this);
    console.log(this===window);
    var name = 'bhavana';
    console.log(window.name);
    console.log(this.name); 
    var person = {
                    name : 'dulquer salman',
                    age : 35,
                    getname : function(){
                        console.log('getName method '+this.name);
                        console.log(window);
                        getData();
                        function getData(){
                            console.log('get Data method '+this.name);
                        }
                        return this.name;
                    }
    }
    var heroName = person.getname();
    console.log('Name ='+heroName);
    console.log("=========================================");
    for(var i=0;i<=5;i++){
        console.log(i);
    }
    console.log('value of i'+i);
     /*block scope by using let keyword*/
    for(let j=0;j<=5;j++){
        console.log(j)
    }
    
    console.log("===========================");
    /*declaring var keyword*/
    var hobbies = ['dancing','singing','cricket'];
    console.log('hobbies '+hobbies);
    var hobbies = ['numismatics'];
    console.log('hobbies  '+hobbies);
    /* using let keyword*/
    hobbies = ['singing'];
    console.log("=============================");
    let fruits = ['orange','jackfruit'];
    console.log('fruits '+fruits);
     fruits = ['pineapple'];
    console.log('fruits '+fruits);
    /* let and const are block scope*/
    const names = ['bhavana','jithin','akshitha'];
    console.log('names '+names);
    names[0] = ['saheli deekshitha'];
    console.log('names '+names);
