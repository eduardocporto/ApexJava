-- 1) Criar tabela
CREATE TABLE alunos(
    nome VARCHAR(40),
    IDADE INT,
    nota1 DOUBLE,
    nota2 DOUBLE
    
);

-- 2) Inserir dados
INSERT INTO alunos VALUES
    ("Ana", 15, 7.5, 8.2),
    ("Lucas", null, 9, 8.6),
    ("Vanessa", 16, 6.6, 7.1),
    ("Leonardo", 15, 5, 4.5),
    ("Denis", 17, 10, 10);

-- 3) Selecione todos os dados (colunas e alunos)
SELECT * FROM alunos;

-- 4) Selecionar nome, nota1, nota2 e exibir a média
SELECT nome, (nota1+nota2)/2 FROM alunos;

-- 5) Exibir o nome, média e situação (aprovado ou reprovado)
SELECT nome, 
(nota1+nota2)/2, IF((nota1+nota2)/2 > 7, "Aprovado", "Reprovado") FROM alunos;

-- 6) Selecione todos os alunos com idade inferior a 16 anos.
SELECT nome FROM alunos
WHERE idade <= 16;

-- 8) Exiba os dados dos alunos em ordem decrescente através do nome
SELECT * FROM alunos ORDER BY nome DESC;

-- 9) Exiba todos os alunos, onde seus nome contenham a letra L
SELECT nome FROM alunos
WHERE nome LIKE "%L%";

-- 10) Exiba todos os alunos que iniciem com a letra A
SELECT nome FROM alunos
WHERE nome LIKE "A%";

-- 11) Exibir todos os alunos que terminam com A
SELECT nome FROM alunos
WHERE nome LIKE "%A";

-- 12) Contar quantos registros existem na tabela
SELECT COUNT(*) FROM alunos;

-- 13) Exibe a soma das idades (https://www.w3schools.com/sql/sql_count_avg_sum.asp)
SELECT SUM(IDADE) FROM alunos;

-- 15) Exiba a maior idade
SELECT MAX(IDADE) FROM alunos;

-- 16) Exiba a menor idade
SELECT MIN(IDADE) FROM alunos;

-- 17) Altere a idade para 15 de todos os alunos com idade nula
UPDATE alunos
SET IDADE = 15 WHERE IDADE IS NULL;

SELECT * FROM alunos;

-- 18) Exclua todos os alunos com idade superior a 15
DELETE FROM alunos
WHERE IDADE > 15;

-- 19) Excluir a tabela alunos
DROP TABLE alunos;




