function login(){
    console.log("calling login")
    var email=document.getElementById("email")
    var password = document.getElementById("password")
    console.log(email.value)
    console.log(password.value)
    var userObject = localStorage.getItem("userregistration")
    console.log(userObject)
    

    var userParsedObject =JSON.parse(userObject)

    console.log(userParsedObject)
    var message =document.getElementById("loginresult")
    console.log(message)
    if(email.value == userParsedObject.email && password.value == userParsedObject.password){
        console.log("Login Success")
        message.innerHTML ="Login Success"
        message.style.color ="green"
      window.location="https://www.facebook.com"
    }else{
        console.log("Invalid email or password")
        message.innerHTML ="Invalid email or password"
        message.style.color ="red"
    }


}