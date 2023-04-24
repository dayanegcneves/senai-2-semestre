function validarFormulario() {
    if (document.getElementById("usuario").value == "") {
        alert("Campo de usuário não pode estar vazio");
        return false;
    }

    if (document.getElementById("senha").value == "") {
        alert("Campo de senha não pode estar vazio");
        return false;
    }

    alert("Login efetuado com sucesso");
    window.location.href = "pagina-de-boas-vindas.html";
    return false;
}