function exibirHoraAtual() {
    var dataHora = new Date();
    var hora = dataHora.getHours();

    return hora;
}

function bemVindo() {
    var nome = prompt("Qual é o seu nome?");

    if(nome == "" || nome == " "){
        nome = 'Usuário';
    }

    var horario = exibirHoraAtual();
    var mensagem;

    if (horario > 0 && horario < 12) {
        mensagem = "Bom dia, " + nome;
    }
    else if(horario < 18){
        mensagem = "Boa tarde, " + nome;
    }
    else{
        mensagem = "Boa noite, " + nome;
    }
    document.getElementById("mensagem").innerHTML = mensagem;
}



