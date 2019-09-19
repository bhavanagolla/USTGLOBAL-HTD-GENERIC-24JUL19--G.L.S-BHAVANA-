function validate(){
   let employeeData = document.forms['employeeForm'];
   let empPassword = employeeData.pass.value;
   let empCPassword = employeeData.cpass.value;
   if(empPassword==='' && empPassword===''){
       return false;
   }
   if(empPassword ===empCPassword){
       alert('success');
       return true;
   }else{
       alert('password Not matching');
       return false;
   }
}