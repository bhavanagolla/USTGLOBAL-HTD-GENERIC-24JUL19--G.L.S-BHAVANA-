function validateForm(){
let formData = document.forms[0];
}
  //console.log(formDta.uname.value);//
let userName = formData.uname.value;
let pswd = formData.password.value;
let cpswd = formData.cpsd.value;
if(pswd===""&&cpswd===""){
    console.log("fill the details properly");
    return false;
}
else if(userName.length>4&&pswd.length>7&&pswd===cpswd){
    console.log("success");
    formData.uname.style.border ="2px solid green";
    formData.password.style.border ="2px solid green";
    formData.cpsd.style.border ="2px solid green";
    formData.loginSubmit.disbled=false;
}
else{
    formData.uname.style.border ="4px solid red";
    formData.password.style.border ="4px solid red";
    formData.cpsd.style.border ="4px solid red";
    console.log('password not matching');
    formData.loginSubmit.disbled=true;
}

}