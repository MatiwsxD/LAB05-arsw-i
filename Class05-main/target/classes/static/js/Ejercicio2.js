
let metodoPost = function(){
    let name = document.getElementById("POST-name").value;
    data =  fetch("/hello2?name="+name,{

        method: 'POST'
    }).then(x => x.text()).then(y => document.getElementById("Respuesta").innerHTML = y)

        
}
let metodoGet = function(){
    let name = document.getElementById("GET-name").value;
    data = fetch("/hello?name="+name,{
        method:'GET'
    }).then(x => x.text()).then(y => document.getElementById("Respuesta").innerHTML = y)
}

let metodoGetStatus = function(){
    data = fetch("/status",{
        method: 'GET'
    }).then(x => x.json).then(y =>console.log(y["\"status\""]))
}
metodoGetStatus()