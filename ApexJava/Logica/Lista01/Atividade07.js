/*
Peça um número, retorno o antecessor e o sucessor daquele número
*/

function atividade07() {
    var num = prompt("Me informe um número, por favor:")
    
//Neste caso eu não consegui usar o comando num++ ou num--. Como deveria ser feito aqui?
    document.getElementById("paragrafo07").innerText = "Depois deste número, temos o número " + (parseInt(num)+1) + " e antes dele, temos o número " + (parseInt(num-1) )
    
    
}


