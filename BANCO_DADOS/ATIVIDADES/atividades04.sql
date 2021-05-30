-- 1) Criar uma tabela chamada produtos
-- 	codigo INT AUTO_INCREMENT PRIMARY KEY,
-- 	produto VARCHAR(40),
-- 	categoria VARCHAR(20),
-- 	valor DOUBLE,
-- 	cadastro DATE
CREATE TABLE produtos(
    codigo INT AUTO_INCREMENT PRIMARY KEY,
    produto VARCHAR(40),
    categoria VARCHAR(40),
    valor DOUBLE,
    cadastro DATE 
);

-- 2) Cadastrar os seguintes produtos:
-- Smartphone Samsung A8, telefonia, 1400.00 , 2019-07-22
-- Notebook Acer A650, informática,3800.00 ,  2019-03-19
-- Telefone sem fio Intelbras, telefonia,129.90, 2018-12-20
-- iPhone XR,telefonia, 5499.00, 2019-07-08
-- Notebook Dell Espiron 500,informática,3975.80, 2019-01-29
-- All in one LG A8574,informática,2547.12, 2019-02-13
-- Smartphone Motorola G7,telefonia,799.00, 2019-04-03
-- Smartphone Galaxy S10,telefonia,4600.00, 2019-05-03
-- Notebook Acer Axpros 47,informática,2857.00, 2019-08-16
-- Smartphone Asus Zenfone 6,telefonia,2356.00, 2018-07-29
INSERT INTO produtos VALUES
    (null, "Smartphone Samsung A8", "telefonia", 1400.00, '2019-07-22'),
    (null, "Notebook Acer A650", "informatica", 3800.00, '2019-03-19'),
    (null, "Telefone sem fio Intelbras", "telefonia", 129.90, '2018-12-20'),
    (null, "Iphone XR", "telefonia", 5499.00, '2019-07-08'),
    (null, "Notebook Dell Inspiron 500", "informatica", 3975.80, '2019-01-29'),
    (null, "All in one LG A8574", "informatica", 2547.12, '2019-02-13'),
    (null, "Smartphone Motorola G7", "telefonia", 799.00, '2019-04-03'),
    (null, "Smartphone Galaxy S10", "telefonia", 4600.00, '2019-05-03'),
    (null, "Notebook Acer Axpros 47", "informatica", 2857.00, '2019-08-16'),
    (null, "Smartphone Asus Zenfone 6", "telefonia", 2356.00, '2018-07-29');


-- 3) Exibir a quantidade de produtos cadastrados
SELECT COUNT(*) FROM produtos;
SELECT * FROM produtos;
 
-- 4) Exibir o nome dos produtos e valor, onde o cadastro esteja entre 01/04/2019 a 31/07/2019
SELECT produto, valor FROM produtos
WHERE cadastro BETWEEN '2019-04-01' AND '2019-07-31';

-- 5) Alterar a categoria para telefonia o produto que seja da categoria null
UPDATE produtos
SET categoria = "telefonia" WHERE categoria IS NULL;

-- 6) Exibir o nome das categorias cadastradas na tabela e a quantidade de produtos (https://www.w3schools.com/sql/sql_groupby.asp)
SELECT categoria, COUNT(produto) FROM produtos
GROUP BY categoria;


-- 7) Exibir a média dos valores por categorias
SELECT categoria, SUM(valor)/COUNT(produto) FROM produtos
GROUP BY categoria;

-- 8) Nome e valor do produto mais barato
SELECT produto, valor FROM produtos
WHERE valor = (SELECT MIN(valor) FROM produtos);

-- 9) Exibir todos os produtos da categoria telefonia com valor igual ou superior a 4.000,00     
SELECT produto FROM produtos
WHERE categoria = "telefonia" AND valor >= 4000;

-- 10) Listar todos os produtos cadastrados em 2018 (https://www.w3schools.com/mysql/func_mysql_date_format.asp)
SELECT produto FROM produtos
WHERE DATE_FORMAT(cadastro, '%Y') = '2018';

-- 11) Deletar todos os produtos que possuam o nome Samsung ou LG
DELETE FROM produtos
WHERE produto LIKE "%Samsung%" OR produto LIKE "%LG%";

-- 12) Exibir o código do produto, onde o nome contenha o termo Intelbras 
SELECT codigo FROM produtos
WHERE produto LIKE "%Intelbras%";

-- 13) Excluir a tabela produtos
DROP TABLE produtos;
