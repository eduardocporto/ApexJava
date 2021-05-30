/*
Implemente um pequeno sistema onde o cliente informa a temperatura atual e a conversão que pode ser entre Celsius 
para Fahrenheit ou Farenheit para Celsius.
*/

function atividade13() {
    var tempAtual = prompt("Informe a temperatura atual:")
    var convert = prompt("Deseja converter para Celsius ou Fahrenheit?   C-Celsius ou F-Fahrenheit)").toUpperCase()

    if (convert == "C") {
        document.getElementById("paragrafo13").innerText = (tempAtual - 32) * 0.5555 + "C"

    }else if (convert == "F") {
        document.getElementById("paragrafo13").innerText = tempAtual * 1.8 + 32 + "F"
        
    }

    
}
