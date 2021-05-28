/*
Crie uma lista com três países, informe a hora atual, retorne o horário daquele país.
Exemplo: 19 horário de Brasília
Inglaterra: 22 horas
Japão: 07 horas
México: 16 horas
*/

var data = new Date()

//HORARIO DE BRASILIA NÃO PRECISA DA CONVERSÃO PARA UTC TIMEZONE 

if (data.getMinutes() < 10) {
    document.getElementById("paragrafo12").innerText = "Hora atual em Brasília: " + data.getHours() + ":" + "0" + data.getMinutes()

}else {
    document.getElementById("paragrafo12").innerText = "Hora atual em Brasília: " + data.getHours() + data.getMinutes()

}

//NESTE CASO EU PRECISEI CRIAR UMA VARIAVEL PARA CONVERTER DE GMT PARA UTC

/* 
var utcOffset = data.getTimezoneOffset()
data.setMinutes(data.getMinutes() + utcOffset)
*/

//COM A TIMEZONE CONVERTIDA, EU PESQUISEI A TIMEZONE DE CADA PAÍS, CRIEI UMA VARIÁVEL  MULTIPLIQUEI OS MINUTOS PELA TIMEZONE

//TIMEZONE INGLATERRA: +1

var setEngland = 4 * 60
data.setMinutes(data.getMinutes() + setEngland)
if (data.getMinutes() < 10) {
    document.getElementById("paragrafo12.1").innerText = "Hora atual na Inglaterra: " + data.getHours() + ":" + "0" + data.getMinutes()
    
}else {
    document.getElementById("paragrafo12.1").innerText = "Hora atual na Inglaterra: " + data.getHours() + ":" + data.getMinutes()

}

//TIMEZONE JAPÃO: +9

/*
var utcOffset = data.getTimezoneOffset()
data.setMinutes(data.getMinutes() + utcOffset)
*/

var setJapao = 12 * 60
data.setMinutes(data.getMinutes() + setJapao)
if (data.getMinutes() < 10) {
    document.getElementById("paragrafo12.2").innerText = "Hora atual no Japão: " + data.getHours() + ":" + "0" + data.getMinutes()
    
}else {
    document.getElementById("paragrafo12.2").innerText = "Hora atual no Japão: " + data.getHours() + ":" + data.getMinutes()

}

//TIMEZONE MÉXICO: -5


var utcOffsetMexico = data.getTimezoneOffset()
data.setMinutes(data.getMinutes() + utcOffsetMexico)


var setMexico = -5 * 60
data.setMinutes(data.getMinutes() + setMexico)
if (data.getMinutes() < 10) {
    document.getElementById("paragrafo12.3").innerText = "Hora atual no México: " + data.getHours() + ":" + "0" + data.getMinutes()
    
}else {
    document.getElementById("paragrafo12.3").innerText = "Hora atual no México: " + data.getHours() + ":" + data.getMinutes()

}













/*
document.getElementById("paragrafo12.1").innerText = "Hora atual na Inglaterra: " + (3+data.getHours()) + ":" + data.getMinutes() + "h"
document.getElementById("paragrafo12.2").innerText = "Hora atual na Japão: " + data.getHours+12() + ":" + data.getMinutes() + "h"
document.getElementById("paragrafo12.3").innerText = "Hora atual na México: " + data.getHours-2() + ":" + data.getMinutes() + "h"




*/