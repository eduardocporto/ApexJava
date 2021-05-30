/*
Peça dois números, retorne a soma desses valores.
*/

function atividade03() {
    alert("Vamos somar dois números, ok?")
    var num1 = prompt ("Informe o primeiro número, por favor:")
    var num2 = prompt ("E agora informe o segundo:")

    //Neste comando não tive sucesso na soma de números fracionados, como fazer para o caso de números com vírgula??
    document.getElementById("paragrafo03").innerText = "A soma dos dois números foi: " + (parseFloat(num1) + parseFloat(num2))

}




