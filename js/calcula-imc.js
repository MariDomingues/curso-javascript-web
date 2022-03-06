const pacientes = document.querySelectorAll(".paciente");

pacientes.forEach(preencheTabela);

function preencheTabela(pPaciente) {

    const tdPeso = pPaciente.querySelector(".info-peso");
    const tdAltura = pPaciente.querySelector(".info-altura");
    const tdImc = pPaciente.querySelector(".info-imc");

    const peso = tdPeso.textContent;
    const altura = tdAltura.textContent;

    const mensagemErro = validaPaciente(altura, peso);
    if (mensagemErro.length > 0) {
        tdImc.textContent = mensagemErro;
        //dá acesso à lista das classes de um HTML
        pPaciente.classList.add("paciente-invalido");

    } else {
        const imc = calculaImc(peso, altura);

        tdImc.textContent = imc.toFixed(2);
    }
}

function calculaImc(peso, altura) {

    return peso / (altura * altura);
}

function isAlturaValida(altura) {

    return altura > 0 && altura < 2.5;
}

function isPesoValido(peso) {

    return peso > 0 && peso < 300;
}

function validaPaciente(altura, peso) {
    
    if (!isAlturaValida(altura))
        return "Altura inválida!";

    if (!isPesoValido(peso))
        return "Peso inválido!";

    return "";
}
