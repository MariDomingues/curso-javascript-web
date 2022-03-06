const botaoAdicionar = document.querySelector("#adicionar-paciente");

botaoAdicionar.addEventListener("click", function(event) {

    event.preventDefault();

    const form = document.querySelector("form");

    const mensagemErro = validaPaciente(form.altura.value, form.peso.value);
    if (mensagemErro.length > 0) {
        const mensagemErroTag = document.querySelector(".mensagem-erro");
        mensagemErroTag.textContent = mensagemErro;
        return;
    }
    
    adicionaPaciente(montaTR(getPacienteForm(form)));

    form.reset();
})

function adicionaPaciente(pacienteTr) {

    const tabela = document.querySelector("index.html #tabela-pacientes");
    tabela.appendChild(pacienteTr);
}

function montaTR(pPaciente) {

    const pacienteTr = document.createElement("tr");
    pacienteTr.classList.add("paciente");

    const nomeTd = montaTD(pPaciente.nome, "info-nome");
    const pesoTd = montaTD(pPaciente.nome, "info-peso");
    const alturaTd = montaTD(pPaciente.nome, "info-altura");
    const gorduraTd = montaTD(pPaciente.nome, "info-gordura");
    const imcTd = montaTD(pPaciente.nome, "info-imc");
    
    pacienteTr.appendChild(nomeTd);
    pacienteTr.appendChild(pesoTd);
    pacienteTr.appendChild(alturaTd);
    pacienteTr.appendChild(gorduraTd);
    pacienteTr.appendChild(imcTd);

    return pacienteTr;
}

function montaTD(pDado, pClasse) {

    const td = document.createElement("td");
    td.classList.add(pClasse);
    td.textContent = pDado;

    return td;
}

function getPacienteForm(pForm) {

    const paciente = {

        nome: pForm.nome.value,
        peso: pForm.peso.value,
        altura: pForm.altura.value,
        gordura: pForm.gordura.value,
        imc: calculaImc(peso, altura)
    }

    return paciente;
}
