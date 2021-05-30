/*
 Criar um sistema, onde seja informado o nome, idade e cidade. Monte uma frase contendo essas informações.
*/

function atividade02() {
    var nome = prompt("Por favor, informe o seu nome: ")
    var idade = prompt ("Agora a sua idade: ")
    var cidade = prompt("Em que cidade você mora, " + nome + " ?")

    document.getElementById("paragrafo02").innerText = ("Olá " + nome + "! Aos " + idade + " anos e você ainda mora em " + cidade + " com seus pais?")



}