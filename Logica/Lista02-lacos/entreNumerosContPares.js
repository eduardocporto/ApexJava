// Informe dois valores, retorne os valores entre os números informados, exemplo: 4 a 9, exiba: 4 5 6 7 8 9.
// Informe quantos números são pares, ímpares, positivos e negativos.

function atividade05() {
    alert("Informe dois números para que sejam informados os números entre eles")

    var num1 = parseInt(prompt("Informe o primeiro número"))
    var num2 = parseInt(prompt("Informe o segundo número"))
    var indice
    var par = 0, impar = 0, positivo = 0, negativo = 0

    var texto = document.getElementById("paragrafo05")
    texto.innerHTML = ""

    //como que eu poderia colocar um ao lado do outro? (sem guardar todos os números em variáveis)
    
    if (num1 < num2) {
        indice = num1+1        
        do {
            texto.innerHTML += ("<p>Números entre " + num1 + " e " + num2 + ": " + indice++ + "</p>")
            if (indice % 2 == 0) {
                par++
                
            } else {
                impar++
            }

            if (indice < 0) {
                negativo++
                
            } else if (indice > 0) {
                positivo++
                
            }
                
            } while (indice < num2);   
        document.getElementById("paragrafo05.1").innerText = ("Temos " + par + " pares, " + impar + " ímpares, " + positivo + " positivos e " + negativo + " números negativos")     
            
        } else if (num1 > num2){
        indice = num2+1        
        do {
            texto.innerHTML += ("<p>Números entre " + num2 + " e " + num1 + ": " + indice++ + "</p>")
            if (indice % 2 == 0) {
                par++
                
            }else {
                impar++
            }
            
            if (indice < 0) {
                negativo++
            
            }else if (indice > 0){
                positivo++
                
            }
            
        } while (indice < num1);
    document.getElementById("paragrafo05.1").innerText = ("Temos " + par + " números pares, " + impar + " ímpares, " + positivo + " positivos e " + negativo + " negativos")
    }

}