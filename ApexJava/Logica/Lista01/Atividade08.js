/*
Peça três números, retorne o maior dos três
*/

function atividade08() {
    alert("Vamos fazer uma mágica de computador. Por favor, me informe três números.")
    var num1 = prompt("Vamos lá, me informe o primeiro número:")
    var num2 = prompt("Agora o segundo:")
    var num3 = prompt("E por fim, o terceiro número:")
    
    if (parseInt(num1) > parseInt(num2) && parseInt(num3)) {
        document.getElementById("paragrafo08").innerText = "O maior número dos três é o " + num1
    }else if (parseInt(num2) > parseInt(num1) && parseInt(num3)){
        document.getElementById("paragrafo08").innerText = "O maior número dos três é o " + num2
    }else if (parseInt(num3) > parseInt(num1) && parseInt(num2)){
        document.getElementById("paragrafo08").innerText = "O maior número dos três é o " + num3
    }

    
}


