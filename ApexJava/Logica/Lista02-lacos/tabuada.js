// Criar sistema onde o usuário informa um número, em seguida retornar a tabuada daquele valor


function atividade01() {
    alert("Este teste mostrará a tabuada de um número informado por você")

    var num = parseInt(prompt("Informe o número para o cálculo"))
    var repeticao = parseInt(prompt("Informe a quantidade de multiplicações"))
    var contador = 1
    var resultado
    var elemento = document.getElementById("paragrafo01")

    elemento.innerHTML = ""
    
    do {
        resultado = num * contador
        //Neste caso usamos o += para concatenar e gerar uma nova linha*/
        elemento.innerHTML += ("<p>"+num + " x " + contador + " = " + resultado +"</p>") 
    contador++
    } while (contador <= repeticao);

    
}