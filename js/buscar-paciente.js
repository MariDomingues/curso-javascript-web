const botao = document.querySelector("#sincronizar-paciente");

botao.addEventListener("click", function() {
    
    const xhr = new XMLHttpRequest();

    xhr.open("GET", "https://api-pacientes.herokuapp.com/pacientes");

    xhr.addEventListener("load", function(){

        const pacientes = JSON.parse(xhr.responseText);
        
    });

    xhr.send();
});