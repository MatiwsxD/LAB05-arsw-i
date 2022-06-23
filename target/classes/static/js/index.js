let intentos = 0;

let getFijasPicas = async() =>{
    intentos++;
    let datos = document.getElementById("p11").value + document.getElementById("p22").value+ document.getElementById("p33").value +document.getElementById("p44").value+ document.getElementById("p55").value;
    let urlPeticion = "/game/info?resp="+datos;
    let valueJSON = await fetch(urlPeticion,{
        method: 'GET'
    }).then(JSON => JSON.json());


    y = "<h3>Picas:  </3><h3>"+valueJSON.picas+"</h3><br>"+"<h3>Fijas:  </2><h3>"+valueJSON.fijas+"</h3><br>"
    document.getElementById("Resultados").innerHTML =y
    if(intentos == 10){
        alert("Perdio");
    }
    if(valueJSON.fijas == "5"){
        fetch("/game/win",{
            method: 'GET'
        })
        alert("Gano")
    }

}