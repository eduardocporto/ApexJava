CREATE TABLE usuarios(
    nome VARCHAR(20),
    idade INT

);

DESCRIBE usuarios;

ALTER TABLE usuarios ADD cidade VARCHAR(30);

ALTER TABLE usuarios DROP COLUMN cidade;

INSERT INTO usuarios VALUES ("Eduardo", 30);

INSERT INTO usuarios (nome) VALUES ("Eduardo2");

SELECT * FROM usuarios;

DROP TABLE usuarios;
