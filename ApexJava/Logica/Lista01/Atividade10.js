/*
Informe um número, em seguida faça a tabuada daquele número. 
Não utilize laços de repetição (while, do-while ou for).
*/

function atividade10() {
    alert("Sistema de tabuada")
    var num = parseInt(prompt("Informe um número para mostrar a tabuada dele:"))

    document.getElementById("paragrafo10").innerHTML = 
    "1x"+num + " = " + (num*1) + "<br>" +
    "2x"+num + " = " + (num*2) + "<br>" +
    "3x"+num + " = " + (num*3) + "<br>" +
    "4x"+num + " = " + (num*4) + "<br>" +
    "5x"+num + " = " + (num*5) + "<br>" +
    "6x"+num + " = " + (num*6) + "<br>" +
    "7x"+num + " = " + (num*7) + "<br>" +
    "8x"+num + " = " + (num*8) + "<br>" +
    "9x"+num + " = " + (num*9) + "<br>" +
    "10x"+num + " = " + (num*10) + "<br>"

    
}