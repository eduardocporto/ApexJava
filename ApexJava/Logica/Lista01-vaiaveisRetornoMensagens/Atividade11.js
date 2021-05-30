/*
O usuário informa um número, retorne se é um número positivo ou negativo.
*/

function atividade11() {
    var num = prompt("Informe um número qualquer:")

    if (num > 0) {
        document.getElementById("paragrafo11").innerText = "Este número é positivo"
        
    }else if (num < 0){
        document.getElementById("paragrafo11").innerText = "Este número é negativo"
    }else if (num == 0){
        document.getElementById("paragrafo11").innerText = "Este número é neutro"
    }
    
    
    

}

