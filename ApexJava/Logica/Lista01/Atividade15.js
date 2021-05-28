/*
Crie um sistema, onde o cliente informa o salário recebido. Em seguida pergunte os valores a serem pagos sobre: 
conta de luz, telefone, água, mercado, lazer e aluguel. Retorne quanto irá sobrar do seu salário.
*/

function atividade15() {
    alert("Neste sistema, vamos calcular o saldo final do seu salário após o pagamento das suas contas. Basta preencher os campos solicitados a seguir:")
    var salario = prompt("Informe o seu salário:")
    var gastoLuz = prompt("Informe o seu gasto com luz:")
    var gastoTel = prompt("Informe o seu gasto com telefonia:")
    var gastoAgua = prompt("Informe o seu gasto com água:")
    var gastoMercado = prompt("Informe o seu gasto com mercado:")
    var gastoLazer = prompt("Informe o seu gasto com lazer:")
    var gastoAluguel = prompt("Informe o seu gasto com aluguel:")

    var despesas = parseInt(gastoLuz) + parseInt(gastoTel) + parseInt(gastoAgua) + parseInt(gastoMercado) + parseInt(gastoLazer) + parseInt(gastoAluguel)
    var saldo = parseInt(salario) - parseInt(despesas)

    document.getElementById("paragrafo15").innerText = "O seu saldo no final do mês, será de R$" + saldo

    
}

