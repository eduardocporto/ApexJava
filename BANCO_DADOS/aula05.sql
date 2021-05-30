CREATE TABLE estados(
    codigoEstado INT AUTO_INCREMENT PRIMARY KEY,
    nomeEstado VARCHAR(30)
);

INSERT INTO estados (nomeEstado) VALUES
    ("Paraná"),
    ("Rio Grande do Sul"),
    ("Rio de Janeiro"),
    ("Santa Catarina"),
    ("São Paulo");

CREATE TABLE cidades(
    codigoCidade INT AUTO_INCREMENT PRIMARY KEY,
    nomeCidade VARCHAR (40),
    codigoEstado INT,
    FOREIGN KEY(codigoEstado) REFERENCES estados(codigoEstado)
);

INSERT INTO cidades (nomeCidade, CodigoEstado) VALUES
    ("Curitiba", 1),
    ("Porto Alegre", 2),
    ("Florianópolis", 4),
    ("Blumenau", 4),
    ("Londrina", 1);

CREATE TABLE pessoas(
    codigoPessoa INT AUTO_INCREMENT PRIMARY KEY,
    nomePessoa VARCHAR (40),
    codigoEstado INT,
    codigoCidade INT,
    FOREIGN KEY (codigoEstado) REFERENCES estados(codigoEstado),
    FOREIGN KEY (codigoCidade) REFERENCES cidades(codigoCidade)
);

INSERT INTO pessoas (nomePessoa, codigoEstado, codigoCidade) VALUES
    ("Adriane", 1, 5),
    ("Lucas", 4, 4),
    ("Vanessa", 1, 5);

SELECT * FROM pessoas;

-- CRIANDO UMA VIEW PARA UTILIZAR DEPOIS
CREATE VIEW selecionar AS
SELECT
    pessoas.codigoPessoa,
    pessoas.nomePessoa,
    estados.nomeEstado,
    cidades.nomeCidade
FROM pessoas
INNER JOIN estados
ON estados.codigoEstado = pessoas.codigoEstado
INNER JOIN cidades
ON cidades.codigoCidade = pessoas.codigoCidade;

-- EXECUTANDO ESTA VIEW CRIADA ANTERIORMENTE
SELECT * FROM selecionar;



