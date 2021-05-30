/*
Peça um nome e uma idade, em seguida retorne uma frase com essas informações, exemplo:
Nome: Mariana
Idade: 17
Olá Mariana, você tem 17 anos. 
*/

function atividade01() {
    var nome = prompt("Informe o seu nome: ")
    var idade = prompt ("Informe a sua idade: ")

    document.getElementById("paragrafo01").innerText = "Olá " + nome + ", a idade informada foi " + idade + " anos."



}