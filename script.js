// JSON
var pessoas = []

// Verificar se existe dados no LocalStorage
window.onload = function(){

    if(localStorage.getItem("dados") != null){
        pessoas = JSON.parse(localStorage.getItem("dados"))
        listar()
    }

}


// Função de cadastro
function cadastrar(){

    // Obter objetos
    var nome = document.getElementById("nome")
    var idade = document.getElementById("idade")
    var alerta = document.getElementById("alerta")

    // Remover as classes alert-danger e alert-success
    alerta.classList.remove("alert-danger")
    alerta.classList.remove("alert-success")

    // Validar campos
    if(nome.value == ""){
        alerta.classList.add("alert-danger")
        alerta.innerHTML = "Favor informar um nome"
        return false
    }

    if(idade.value == ""){
        alerta.classList.add("alert-danger")
        alerta.innerHTML = "Informe uma idade"
        return false
    }

    // Adicionar a classe alert-success e o texto
    alerta.classList.add("alert-success")
    alerta.innerHTML = "Cadastro efetuado com sucesso!"

    // Cadastrar no JSON
    pessoas.push({"nome":nome.value, "idade":idade.value})

    // Console
    //console.table(pessoas)

    // Limpar os campos
    nome.value = ""
    idade.value = ""

    // Cursor no campo nome
    nome.focus()

    // Atualizar tabela
    listar()

    // Adicionar no LocalStorage
    adicionarLocalStorage()

}

// Função de listagem
function listar(){

    // Obter o elemento tabela
    var tabela = document.getElementById("tabela")

    // Limpar a tabela
    tabela.innerHTML = ""

    // Laço
    for(var indice = 0; indice < pessoas.length; indice++){

        // Criar linha
        var linha = tabela.insertRow(-1)

        // Criar colunas
        var colunaCodigo = linha.insertCell(0)
        var colunaNome = linha.insertCell(1)
        var colunaIdade = linha.insertCell(2)
        var colunaRemover = linha.insertCell(3)

        // Valores
        colunaCodigo.innerHTML = indice + 1
        colunaNome.innerHTML = pessoas[indice].nome
        colunaIdade.innerHTML = pessoas[indice].idade
        colunaRemover.innerHTML = "<button class='btn btn-danger' onClick='remover("+indice+")'>Remover</button>"

    }

}

// Função de remoção
function remover(posicao){
    
    // Remover do JSON
    pessoas.splice(posicao, 1)

    // Remover os dados no LocalStorage
    localStorage.removeItem("dados")

    // Enviar o JSON atualizado para o LocalStorage
    localStorage.setItem("dados", JSON.stringify(pessoas))

    // Atualizar a tabela
    listar()

}

// Adicionar ao localstorage
function adicionarLocalStorage(){

    localStorage.setItem("dados", JSON.stringify(pessoas))

}