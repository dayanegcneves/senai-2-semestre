function calcular() {
    var op = parseInt(document.getElementById('operacoes').value);
    var num1 = document.getElementById('numero1').value;
    var num2 = document.getElementById('numero2').value;
    var resultado = 0;
    //Expressão para verificar se a variável é uma letra
    let verificaLetra = /^[a-zA-Z]+$/;

    //Caso seja uma letra, vai substituir por uma string vazia
    if (num1.match(verificaLetra) || num2.match(verificaLetra)) {
        alert('Favor digitar apenas NÚMEROS!');
        if (num1.match(verificaLetra)) {
            document.getElementById('numero1').value = '';
        }
        if (num2.match(verificaLetra)) {
            document.getElementById('numero2').value = '';
        }
    }
    else {
        num1 = parseFloat(num1);
        num2 = parseFloat(num2);

        switch (op) {
            case 1:
                resultado = num1 + num2;
                break;
            case 2:
                resultado = num1 - num2;
                break;
            case 3:
                resultado = num1 * num2;
                break;
            case 4:
                if (num2 == 0) {
                    alert('Não é possível dividir por 0');
                    resultado = 'N/A';
                }
                else {
                    resultado = num1 / num2;
                }
                break;
            default:
                break;
        }

        alert('Resultado = ' + resultado);
    }
}
