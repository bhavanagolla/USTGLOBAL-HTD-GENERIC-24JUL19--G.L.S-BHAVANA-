function validateForm(){
    let formData = document.forms[0];
    //console.log(formData.uname.value);
let userName = formData.uname.value;
let passwordValue = formData.uname.value;
if(userName.length>4 && passwordValue.lenth>7){
    
    formData.uname.style.border = '1px solid green';
    formData.password.style.border = '1px solid green';
    formData.loginSubmit.disabled = false;      
}
else{
    formData.uname.style.border = '4px solid red';
    formData.password.style.border = '4px solid red';
    formData.loginSubmit.disabled = true;
}
}
