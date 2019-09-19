// getElementById()
    let pElement = document.getElementById('demo');
    console.log(pElement);
    pElement.textContent = 'this is new p tag';
    //getElementsByClassName()
    let divElements = document.getElementsByClassName('blue');
    console.log(divElements);
    let pElements = document.getElementsByTagName('p');
    console.log(pElements);
   let nameElements= document.getElementsByName('helement');
   console.log(nameElements);
   let demoElement = document.querySelector('demo');
   console.log(demoElement);
   let blueClassElements = document.querySelectorAll('blue');
   console.log(blueClassElements);
   let buttonElement = document.createElement('button');
   buttonElement.textContent = 'Click Me';
   console.log(buttonElement);
   document.body.appendChild(buttonElement);
   let spanEle = document.getElementById('spanid');
   spanEle.style.color = 'pink';
   let buttonElement1 = document.getElementById('buttonEle');
// buttonElement1.className = 'add';
buttonElement1.classList = "add add1";
document.getElementById('tableid').innerHTML=`<table>
    <tr>
        <td>name</td>
        <td>age</td>
    </tr>
    <tr>
        <td>john</td>
        <td>20</td>
    </tr>
    <tr>
        <td>bhavana</td>
        <td>21</td>
    </tr>
    <tr>
        <td>chinnu/td>
        <td>22</td>
    </tr>
</table>`
let pElementData = document.getElementById('demo1');
//pElementData.style.color = 'blue';
//pElementData.className = 'blue';
pElementData.classList = 'blue fonts';
