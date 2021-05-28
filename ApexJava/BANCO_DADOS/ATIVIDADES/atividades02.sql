-- 1) Criar a tabela produtos
-- 	codigo int primary key auto_increment,
--     nome varchar(20),
--     marca varchar(20),
--     valor double

CREATE TABLE produtos(
    codigo INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(20),
    marca VARCHAR(20),
    valor DOUBLE 

);

-- 2) Inserir os produtos
-- Galaxy S10, Samsung, 5000
-- iPhone 11, Apple, 6000
-- Moto G7, Motorola, 1500
-- Galaxy Note 10, Samsung, 6500
-- iPhone 8, Apple, 3000

INSERT INTO produtos VALUES
    (null, "Galaxy S10", "Samsung", 5000),
    (null, "Iphone 11", "Apple", 6000),
    (null, "Moto G7", "Motorola", 1500),
    (null, "Galaxy Note 10", "Samsung", 6500),
    (null, "Iphone 8", "Apple", 3000);

-- 3) Selecionar todos os produtos
SELECT * FROM produtos;

-- 4) Exibir todas as marcas, não pode haver repetição do nome das marcas (https://www.w3schools.com/sql/sql_groupby.asp)
-- O comando GROUP BY já trás a informação sem repetição
SELECT marca FROM produtos
GROUP BY marca;

-- 5) Exibir o nome das marcas e a quantidade de produtos naquela marca (O nome da marca não pode se repetir)
SELECT marca, COUNT(nome) FROM produtos
GROUP BY marca;

-- 6) Selecione todos os produtos das marcas Apple e Samsung
SELECT * FROM produtos
WHERE marca IN("Apple", "Samsung") ORDER BY marca;

-- 7) Selecione todos os produtos das marcas Apple e Samsung com valor inferior a R$6000,00
SELECT * FROM produtos
WHERE marca IN ("Apple", "Samsung") AND valor <= 6000.00;

-- 8) Insira o produto: iPhone 11 Max, da marca Apple no valor de R$6.500,00
INSERT INTO produtos VALUES (null, "Iphone 11 Max", "Apple", 6500);

-- 9) Exiba o nome e valor do produto mais caro. (Para essa questão haverá um duplo SELECT, chame o instrutor para explicar)
SELECT nome, valor FROM produtos
WHERE valor = (SELECT MAX(valor) FROM produtos);

-- 10) Remover todos os produtos da marca Samsung
DELETE FROM produtos
WHERE marca = "Samsung";

-- 11) Adicionar novos produtos:
-- "Galaxy A7", "Samsung", 2000;
-- "Galaxy A8", "Samsung", 2350;

INSERT INTO produtos VALUES
    (null, "Galaxy A7", "Samsung", 2000),
    (null, "Galaxy A8", "Samgung", 2300);

-- 12) Limpar dados e reiniciar numeração
TRUNCATE produtos;    

-- Teste de criação para ver se os códigos começariam a partir do zero mesmo.
INSERT INTO produtos VALUES
    (null, "Galaxy A7", "Samsung", 2000),
    (null, "Galaxy A8", "Samgung", 2300);

DROP TABLE produtos;
