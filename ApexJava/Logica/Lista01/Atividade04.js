/*
Peça dois números, se forem iguais faça a soma, caso contrário faça a multiplicação.
*/

function atividade04() {

    alert("Vamos agora testar a soma ou multiplicação de dois números, beleza?")
    var num1 = prompt("Por favor, me informe o primeiro número:")
    var num2 = prompt("Informe agora o segundo número:")

    //Neste caso aqui, eu poderia colocar ambas as variáveis dentro do parseInt? Ex.: parseInt(num1 + num2)
    if (num1 == num2){
        document.getElementById("paragrafo04").innerText = "Os números são iguais, então a soma deles é: " + (parseInt(num1) + parseInt(num2))
        
    //Neste caso aqui, seria possível utilizar apenas o "else" sem o "if"? 
    //E é necessário mesmo a condição após o comando? visando que já estamos caindo no "else" devido aos números serem distintos
    }else if (num1 != num2) {
        document.getElementById("paragrafo04").innerText = "Os números são diferentes, então o resultado da multiplicação deles é: " + (parseInt(num1) * parseInt(num2))

    }
        
    
    

    
}
