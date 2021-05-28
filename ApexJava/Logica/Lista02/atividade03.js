//Informe dois valores, retorne os valores entre os números informados, exemplo: 7 a 12 exiba: 7 8 9 10 11 12

function atividade03() {
    alert("Informe dois números para que sejam informados os números entre eles")

    var num1 = parseInt(prompt("Informe o primeiro número"))
    var num2 = parseInt(prompt("Informe o segundo número"))
    var indice

    var texto = document.getElementById("paragrafo03")
    texto.innerHTML = ""

    //como que eu poderia colocar um ao lado do outro? (sem guardar todos os números em variáveis)
    
    if (num1 < num2) {
        indice = num1+1        
        do {
            texto.innerHTML += ("<p>Números entre " + num1 + " e " + num2 + ": " + indice++ + "</p>")
            
        } while (indice < num2);
    } else if (num1 > num2){
        indice = num2+1        
        do {
            texto.innerHTML += ("<p>Números entre " + num2 + " e " + num1 + ": " + indice++ + "</p>")
            
        } while (indice < num1);
    }

     
}

       

