function validate(){
    
let em=document.getElementById("email").value;
let e1=em.indexOf("@")
let e2=em.indexOf(".")
if(em==""){
document.getElementById("email1").innerText="email cannot be empty"
}
else if(e1<0 || e2<0){
document.getElementById("email1").innerText="email should have @ and . symbol"
}

let pw=document.getElementById("pwd").value;
let p1=pw.indexOf("@")
let l=pw.length;
if(pw==""){
document.getElementById("pwd1").innerText="password cannot be empty"
}
else if(p1<0 || l<=8 ){
document.getElementById("pwd1").innerText="password should have @ symbol and should contain max 8 letters"
}

}   