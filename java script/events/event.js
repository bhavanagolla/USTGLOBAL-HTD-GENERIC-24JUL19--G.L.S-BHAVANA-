function sayhello(){
    alert('hello!!!!');
}
let buttonElement = document.getElementById('click button')
buttonElement.onclick = function(){
                                    alert("hello world !!!! welcome to events");
}
function pEle(){
    let newEle = document.createElement('p');
    newEle.textcontent = 'This is p Element';
    document.body.appendChild(newEle);
}
let alertElement = document.getElementById('alertHi');
alertElement.addEventListener('click',function(){
    alert('good evening');
 });
 let h1Element = document.createElement('h1');
 function showText(){
     let inputElement = document.getElementById('showData');
     console.log(inputElement.value);
     h1Element.textContent = inputElement.value;
     document.body.appendChild(h1Element);
 }
