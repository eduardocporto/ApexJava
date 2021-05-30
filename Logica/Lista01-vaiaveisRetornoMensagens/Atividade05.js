/*
Peça três notas, retorne a média obtida e a situação (7 ou mais aprovado, caso contrário reprovado).
Estrutura do cálculo: (nota1 + nota2 + nota3) / 3
*/

function atividade05() {
    alert("Neste teste, vamos calcular a média de três notas de um aluno. Vamos começar!")
    var nota1 = prompt("Informe a primeira nota do aluno:")
    var nota2 = prompt("Informe agora, a segunda nota deste aluno:")
    var nota3 = prompt("E por fim, informe a nota final do aluno:")

    var media = (parseInt(nota1) + parseInt(nota2) + parseInt(nota3)) / 3

    //No caso de a média ficar com vírgula, temo como arredondar? E mostrar apenas dois números após a vírgula? .toFixed(numCasas)
    if(media >= 7){
        document.getElementById("paragrafo05").innerText = "A nota final deste aluno foi " + media + ". Este aluno foi aprovado, dê os parabéns para ele."
    //Teria como utilizar apenas o "else" neste caso? Ex.: else "aluno foi reprovado."
    }else if (media < 7){
        document.getElementById("paragrafo05").innerText = "A nota final deste aluno foi " + media + ". Este aluno reprovou, avise aos pais dele."
    }


    
}