/*
Será desenvolvido um algoritmo para auxiliar a polícia de trânsito a averiguar as possíveis infrações, para isso peça os seguintes dados: Velocidade da pista e velocidade do veículo.
Se a velocidade do veículo for menor ou igual a velocidade da pista, retorno bom motorista.
Se a velocidade for até 10km/h haverá uma multa de R$50,00
Se a velocidade estiver entre 10.1km/h até 20km/h haverá uma multa de R$100,00
Se a velocidade for superior a 20km/h a multa será de R$200,00
*/

function atividade09 () {
    alert("Sistema indicador de multas. Vamos começar!")
    var velMotorista = parseFloat(prompt("Informe a velocidade do condutor:"))
    var velPista = parseFloat(prompt("Agora, informe a velocidade da via:"))
    var calculoVel = velMotorista - velPista

    if (calculoVel < 0) {
        document.getElementById("paragrafo09").innerText = "Motorista dentro do limite de velocidade."
        
    }else if (calculoVel > 0 && calculoVel <= 10) {
        document.getElementById("paragrafo09").innerText = "Velocidade excedida, deve ser aplicada multa de R$50,00"
        
    }else if (calculoVel > 10 && calculoVel <= 20) {
        document.getElementById("paragrafo09").innerText = "Velocidade excedida, deve ser aplicada multa de R$100,00"
        
    }else {
        document.getElementById("paragrafo09").innerText = "Velocidade excedida, deve ser aplicada multa de R$200,00"
    }

}

        
    
    

