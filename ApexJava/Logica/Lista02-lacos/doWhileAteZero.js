//Peça valores até que o usuário informe zero, em seguida exiba a soma dos valores.

function atividade04() {
    alert("Neste teste, informe números para serem somados e quando quiser finalizar o cálculo, insira o número zero")
    var num
    var soma = 0

    do {
        num = parseInt(prompt("Informe o número"))
        soma += num
    } while (num != 0);

    document.getElementById("paragrafo04").innerText = ("A soma dos números é: " + soma)

    
}
