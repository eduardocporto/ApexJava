DROP TABLE colaboradores;
DROP TABLE filiais;
DROP TABLE cargos;

-- 1) Criar uma tabela chamada cargos com os seguintes campos:
-- codigo INT AUTO_INCREMENT PRIMARY KEY,
-- cargo VARCHAR(40) NOT NULL,
-- salario DOUBLE
CREATE TABLE cargos(
    codigoCargo INT AUTO_INCREMENT PRIMARY KEY,
    cargo VARCHAR(40) NOT NULL,
    salario DOUBLE
);

-- 2) Criar uma tabela chamada filiais com os seguintes campos:
-- codigo INT AUTO_INCREMENT PRIMARY KEY,
-- estado VARCHAR(2),
-- cidade VARCHAR(30)
CREATE TABLE filiais(
    codigoFilial INT AUTO_INCREMENT PRIMARY KEY ,
    estado VARCHAR(2),
    cidade VARCHAR (30)
);

-- 3) Criar uma tabela chamada colaboradores com os seguintes campos:
-- codigo INT AUTO_INCREMENT PRIMARY KEY,
-- nome VARCHAR(70),
-- nascimento DATE,
-- cargo INT FOREIGN KEY,
-- filial INT FOREIGN KEY,
CREATE TABLE colaboradores(
    codigoColaborador INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(70),
    nascimento DATE,
    codigoCargo INT,
    CodigoFilial INT,
    FOREIGN KEY(codigoCargo) REFERENCES cargos(CodigoCargo),
    FOREIGN KEY(codigoFilial) REFERENCES filiais(CodigoFilial)
);

-- 4) Cadastre os seguintes dados na tabela de cargos:
-- ("Estagiário", 980),
-- ("Desenvolvedor I", 1350),
-- ("Desenvolvedor II", 1800),
-- ("Desenvolvedor III", 2400),
-- ("Analista I", 2680),
-- ("Analista II", 3140),
-- ("Analista III", 3900),
-- ("Gerente de Projetos", 4700),
-- ("Administrador de Banco de Dados I", 2500),
-- ("Administrador de banco de Dados II", 3270),
-- ("Administrador de banco de Dados III", 4100);
INSERT INTO cargos VALUES
    (null, "Estagiário", 980),
    (null, "Desenvolvedor I", 1350),
    (null, "Desenvolvedor II", 1800),
    (null, "Desenvolvedor III", 2400),
    (null, "Analista I", 2680),
    (null, "Analista II", 3140),
    (null, "Analista III", 3900),
    (null, "Gerente de Projetos", 4700),
    (null, "Administrador de Banco de Dados I", 2500),
    (null, "Administrador de banco de Dados II", 3270),
    (null, "Administrador de banco de Dados III", 4100);

-- 5) Cadastre os seguintes dados na tabela de filiais:
-- ("SC", "Blumenau"),
-- ("SC", "Joinville"),
-- ("SC", "Criciúma"),
-- ("SC", "Florianópolis"),
-- ("PR", "Curitiba"),
-- ("PR", "Maringá"),
-- ("SP", "São Paulo"),
-- ("SP", "Campinas"),
-- ("SP", "Franca"),
-- ("MG", "Belo Horizonte"),
-- ("GO", "Anápolis"),
-- ("RJ", "Niterói");
INSERT INTO filiais VALUES
    (null, "SC", "Blumenau"),
    (null, "SC", "Joinville"),
    (null, "SC", "Criciúma"),
    (null, "SC", "Florianópolis"),
    (null, "PR", "Curitiba"),
    (null, "PR", "Maringá"),
    (null, "SP", "São Paulo"),
    (null, "SP", "Campinas"),
    (null, "SP", "Franca"),
    (null, "MG", "Belo Horizonte"),
    (null, "GO", "Anápolis"),
    (null, "RJ", "Niterói");

-- 6) Cadastre os seguintes dados na tabela de colaboradores:
-- ("Henrique Conceição", "2000/08/07", 1, 7),
-- ("Jéssica Corrêa", "1991/07/25",  5, 1),
-- ("Luana Muniz", "1990/06/19", 9, 6),
-- ("Ricardo Alves", "1995/12/05", 11, 1),
-- ("Mayara Sanchez", "1987/01/22", 8, 2),
-- ("Daniel Starke", "1979/03/14", 6, 9),
-- ("Eduardo Ruediger", "1981/04/27", 11, 4),
-- ("Elizandra Ambrosi", "1994/02/06", 3, 1),
-- ("Camila Fortal", "1992/11/07", 8, 7),
-- ("Juliana Gonçalves", "1997/05/14", 1, 10),
-- ("Caio Orbus", "1986/06/06", 4, 3),
-- ("Cristiane Alcantra", "1981/10/07", 6, 4),
-- ("Bianca da Cruz", "1990/12/08", 2, 1),
-- ("Arnaldo Souza", "1984/01/08", 9, 5),
-- ("Josué Azess", "1977/05/30", 8, 7),
-- ("Renata de Paula", "1998/03/04", 1, 4); 
INSERT INTO colaboradores VALUES
    (null, "Henrique Conceição", "2000/08/07", 1, 7),
    (null, "Jéssica Corrêa", "1991/07/25",  5, 1),
    (null, "Luana Muniz", "1990/06/19", 9, 6),
    (null, "Ricardo Alves", "1995/12/05", 11, 1),
    (null, "Mayara Sanchez", "1987/01/22", 8, 2),
    (null, "Daniel Starke", "1979/03/14", 6, 9),
    (null, "Eduardo Ruediger", "1981/04/27", 11, 4),
    (null, "Elizandra Ambrosi", "1994/02/06", 3, 1),
    (null, "Camila Fortal", "1992/11/07", 8, 7),
    (null, "Juliana Gonçalves", "1997/05/14", 1, 10),
    (null, "Caio Orbus", "1986/06/06", 4, 3),
    (null, "Cristiane Alcantra", "1981/10/07", 6, 4),
    (null, "Bianca da Cruz", "1990/12/08", 2, 1),
    (null, "Arnaldo Souza", "1984/01/08", 9, 5),
    (null, "Josué Azess", "1977/05/30", 8, 7),
    (null, "Renata de Paula", "1998/03/04", 1, 4); 


SELECT * FROM cargos;
SELECT * FROM colaboradores;
SELECT * FROM filiais;


-- 9) Exibir a quantidade de colaboradores por cada cargo.
SELECT
    cargos.cargo "CARGO",
    COUNT(colaboradores.nome) "COLABORADORES"
FROM colaboradores
RIGHT JOIN cargos
ON cargos.codigoCargo = colaboradores.codigoCargo
GROUP BY cargos.codigoCargo;

-- 10) Exibir a quantidade de colaboradores por filial e a cidade.
SELECT
    filiais.cidade "CIDADE",
    COUNT(colaboradores.nome) "QUANTIDADE COLABORADORES",
    filiais.estado "ESTADO"
FROM filiais
RIGHT JOIN colaboradores
ON filiais.codigoFilial = colaboradores.CodigoFilial
GROUP BY filiais.cidade;

INSERT INTO colaboradores(nome, nascimento) VALUES ("Eduardo", "1977/05/05");


-- 11) Nome do(s) colaborador(es) mais velho(s) e sua idade.
SELECT
    nome AS "NOME",
    DATE_FORMAT(NOW(), "%Y") - DATE_FORMAT(nascimento, "%Y") AS "IDADE"
FROM colaboradores
    WHERE DATE_FORMAT(nascimento, "%Y") = (SELECT MIN(DATE_FORMAT(nascimento, "%Y")) FROM colaboradores);

-- 12) Exiba todos os cargos e a quantidade de colaboradores por cargos, mesmo que não haja nenhum colaborador cadastrado naquele cargo


-- 13) Exibir a quantidade de colaboradores que trabalham na filial do estado de SC, independente a cidade de atuação
