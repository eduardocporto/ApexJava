CREATE TABLE produtos(
    codigo INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(40),
    valor DECIMAL(10,2),
-- Neste caso acima, usamos o valor com 10 casas antes da virgula e depois da virgula, os centavos em duas casas, ex 1000,00
    marca VARCHAR(30)
);

INSERT INTO produtos VALUES
(null, "Iphone X", 4000, "Apple"),
(null, "Galaxy S21", 4300, "Samsung"),
(null, "TV NanoCell 50", 2699, "LG"),
(null, "PlayStation 5", 5000, "Sony"),
(null, "Notebook Inspiron", 4100, "Dell");

SELECT * FROM produtos;


-- Se eu der um comando DELETE e cadastrar novos dados
-- a coluna codigo primary key iria seguir do numero onde parou

-- Para que a numeração seja resetada,
-- precisamos usar o comando TRUNCATE

TRUNCATE TABLE produtos;

-- Pesquisa utilizando o comando "OR"
SELECT nome FROM produtos
WHERE marca="LG" OR MARCA="SONY";

-- Para não usar este comando muito grande, usamos o "IN"
-- Que é um "OR" mais compacto
SELECT nome FROM produtos
WHERE marca IN ("Samsung", "LG", "Sony");

-- Listar todos os produtos na faixa de 2500 a 4000 
SELECT * FROM produtos
WHERE valor BETWEEN 2500 AND 4000;


-- PESQUISANDO PRODUTOS SEM VALUE
INSERT INTO produtos VALUES (null, "Teclado", null, "Microsoft");

-- Pesquisando valores nulos ou sem valor
SELECT * FROM produtos WHERE valor IS NULL;
-- No caso de não serem nulos
SELECT * FROM produtos WHERE valor IS NOT NULL;

