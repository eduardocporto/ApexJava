CREATE TABLE cargos(
    codigoCargo INT AUTO_INCREMENT PRIMARY KEY,
    nomeCargo VARCHAR(30)
);

INSERT INTO cargos VALUES
    (null, "Desenvolvedor"),
    (null, "Analista"),
    (null, "Gerente");

CREATE TABLE colaboradores(
    codigoColaborador INT AUTO_INCREMENT PRIMARY KEY,
    nomeColaborador VARCHAR(40),
    codigoCargo INT,
    FOREIGN KEY(codigoCargo) REFERENCES cargos(codigoCargo)
);

INSERT INTO colaboradores (nomeColaborador, codigoCargo) VALUES
("Sarah", 1),
("Everton", 1),
("Christian", 2),
("Jéssica", 1);

SELECT 
    colaboradores.nomeColaborador, 
    cargos.nomeCargo
FROM colaboradores
INNER JOIN cargos 
ON cargos.codigoCargo = colaboradores.codigoCargo;

SELECT 
    cargos.nomeCargo,
    COUNT(colaboradores.nomeColaborador)
FROM colaboradores
RIGHT JOIN cargos
ON cargos.codigoCargo = colaboradores.codigoCargo
GROUP BY cargos.codigoCargo;

SELECT 
    cargos.nomeCargo,
    COUNT(colaboradores.nomeColaborador)
FROM colaboradores
LEFT JOIN cargos
ON cargos.codigoCargo = colaboradores.codigoCargo
GROUP BY cargos.codigoCargo;

INSERT INTO colaboradores VALUE(null, "Luana", null);

SELECT 
    cargos.nomeCargo,
    colaboradores.nomeColaborador
FROM colaboradores
LEFT JOIN cargos
ON cargos.codigoCargo = colaboradores.codigoCargo;


