-- 1) Criar tabela uzuarios (o erro foi de escrita foi proposital)
--     codigo INT AUTO_INCREMENT PRIMARY KEY,
--     nome VARCHAR(20),
--     sobrenome VARCHAR(50),
--     idade INT
CREATE TABLE uzuarios(
    codigo INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(40),
    sobrenome VARCHAR(40),
    idade INT
);

SELECT * FROM usuarios;

-- 2) Alterar o nome da tabela uzuarios para usuarios (https://www.mysqltutorial.org/mysql-rename-table/)
RENAME TABLE uzuarios TO usuarios;

-- 3) Adicionar uma coluna chamada email do tipo varchar com tamanho 
-- de 40 caracteres
ALTER TABLE usuarios ADD email VARCHAR(40);

-- 4) Remover a coluna sobrenome
ALTER TABLE usuarios DROP COLUMN sobrenome;

-- 5) Cadastrar os seguintes dados:
-- Vanessa, 16, vanessa.rosa@gmail.com
-- Adailton, 22, adailton.maas@yahoo.com.br
-- Andressa, 36, dessa.simas@uol.com.br
-- Mayra, 24, mayra.antunes@gmail.com
-- Cristiane, 14, criss.maya@gmail.com
-- Leonardo, 15, leo.kopff@terra.com.br
-- Carina, 27, carina.almeida@gmail.com
-- Clóvis, 29, clovis.simao@hotmail.com
-- Gabriela, 23, gabriela.braga@live.com
-- Cibele, null, cibele.lins@uol.com.br

INSERT INTO usuarios VALUES
    (null, "Vanessa", 16, "vanessa,rosa@gmail.com"),
    (null, "Adailton", 22, "adailton.maas@yahoo.com.br"),
    (null, "Andressa", 36, "dessa.simas@uol.com.br"),
    (null, "Mayra", 24, "mayra.antunes@gmail.com"),
    (null, "Cristiane", 14, "criss.maya@gmail.com"),
    (null, "Leonardo", 15, "leo.kopff@terra.com.br"),
    (null, "Carina", 27, "carina.almeida@gmail.com"),
    (null, "Clóvis", 29, "clovis.simao@hotmail.com"),
    (null, "Gabriela", 23, "gabriela.braga@live.com"),
    (null, "Cibele", null, "cibele.lins@uol.com.br");

-- 6) Exibir o número de usuários
SELECT COUNT(*) FROM usuarios;

-- 7) Exibir a quantidade de usuários menores de 18 anos
SELECT COUNT(*) FROM usuarios
WHERE idade < 18;

-- 9) Retornar o nome da pessoa com a maior idade 
SELECT nome FROM usuarios
WHERE idade = (SELECT MAX(idade) FROM usuarios);

-- 10) Retornar o nome do usuário, onde a idade seja null 
SELECT nome FROM usuarios
WHERE idade IS NULL;

-- 11) Alterar todas as idades que estejam null para 27
UPDATE usuarios
SET idade = 27 WHERE idade IS NULL;

-- 12) Deletar todos os usuários onde a idade seja inferior a 18 anos
DELETE FROM usuarios
WHERE idade < 18;

-- 13) Excluir os dados da tabela usuarios e reiniciar a contagem da coluna código.
TRUNCATE usuarios;

-- 14) Excluir a tabela usuarios
DROP TABLE usuarios;

