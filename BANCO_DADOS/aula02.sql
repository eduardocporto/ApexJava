-- OPERADORES RELACIONAIS
-- > Maior
-- < Menor
-- >= Maior ou Igual
-- <= Menor ou Igual
-- = Igual
-- <> Diferente


-- OPERADORES LÓGICOS
-- E -> AND
-- OU -> OR


CREATE TABLE alunos(
    nome VARCHAR(30),
    nota1 FLOAT,
    nota2 FLOAT
);

INSERT INTO alunos VALUES
("Bruno", 7, 8.5),
("Carla", 9, 0),
("Ellen", 6, 8),
("Paula", 7, 5);

SELECT * FROM alunos;

SELECT  nome, (nota1+nota2)/2 FROM alunos;

SELECT nome FROM alunos ORDER BY nome; 

-- Selecionando os alunos com filtro de ordem por nome
-- comando ASC ou DESC no final, filtra por ascendente ou 
-- decrescente

SELECT nome FROM alunos ORDER BY nome DESC;
SELECT nome FROM alunos ORDER BY nome ASC;

SELECT nome, IF((nota1+nota2)/2 >= 7, "Aprovado", "Reprovado") FROM alunos;

SELECT nome, (nota1+nota2)/2, IF((nota1+nota2)/2 >= 7, "Aprovado", "Reprovado") FROM alunos;

SELECT nome,
CONCAT(IF((nota1+nota2)/2 >= 7, "Aprovado", "Reprovado"), " Com média ", (nota1+nota2)/2)
FROM alunos;

SELECT COUNT(*) FROM alunos;

SELECT MAX(nota1) FROM alunos;
SELECT MIN(nota1) FROM alunos;

-- Comando para selecionar o Average(média) de uma coluna em especifico
SELECT AVG(nota1) FROM alunos;

SELECT nome, nota1 FROM alunos WHERE nota1 >= 7;


-- PESQUISA
-- E% -> Inicia com o texto
-- %A -> Finaliza com o texto
-- %u% -> Contêm o texto

SELECT nome FROM alunos
WHERE nome LIKE "E%";

SELECT nome FROM alunos
WHERE nome LIKE "%A";

SELECT nome FROM alunos
WHERE nome LIKE "%U%";

-- COMANDO UPDATE PARA ALTERAR VALORES
UPDATE alunos 
SET nota2 = 7 WHERE nome = "Paula";


-- COMANDO DELETE DE INFORMAÇÕES
DELETE FROM alunos
WHERE nome = "Carla";

DROP TABLE alunos;