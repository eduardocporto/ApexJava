//Informe um número, retorne os dez antecessores e sucessores

function atividade02() {
    alert("Atividade para os 10 números antecessores e sucessores. Informe o número na solicitação a seguir")

    var num = parseInt(prompt("Informe o número"))
    var numMinimo = num - 10
    var numMaximo = num + 10
    
    var texto = document.getElementById("paragrafo02")
    texto.innerHTML = ""
    var textoDois = document.getElementById("paragrafo02")
    textoDois.innerHTML = ""

    while (numMinimo < num) {
        texto.innerHTML += ("<p> Antecessor: " + numMinimo++ + "</p>")
    }

    num++
    while (num <= numMaximo) {
        texto.innerHTML += ("<p> Sucessor: " + num ++ + "</p>")
    }
    
}