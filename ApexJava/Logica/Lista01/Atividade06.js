/*
Criar um sistema pra converter moedas. Informe se a conversão será de Real para Dólar ou Dólar para Real, em seguida informe o valor e retorno a conversão. 
Vamos usar como base a cotação no valor de R$5,50.
Sendo assim, caso seja informado o valor de R$1,00 e a opção dólar para real retornará R$5,50.
Outro exemplo, se informado R$5,50 de real para dólar, o retorno será de: US1,00
*/

function atividade06() {
    alert("Este sistema irá fazer a conversão das moedas dolar e real. A cotação atual do dolar é de R$5,50. Vamos começar!")
    var moeda = prompt("De qual moeda você quer saber a cotação. Real ou dolar?").toUpperCase()

    if (moeda == "REAL") {
        document.getElementById("paragrafo06").innerText = "O real hoje, equivale a $1 dólar"
        
    }else if (moeda == "DOLAR"){
        document.getElementById("paragrafo06").innerText = "O dólar hoje, equivale a R$5,50 reais."
    }
    
}

