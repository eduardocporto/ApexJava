-- 1) Desenvolver uma tabela chamada autores com as seguintes características:
-- idAutor Inteiro auto incrementado e chave-primária
-- nomeAutor Varchar de 50
CREATE TABLE autores(
    idAutor INT AUTO_INCREMENT PRIMARY KEY,
    nomeAutor VARCHAR(50)
);

-- 2) Crie mais uma tabela chamada generos:
-- idGenero inteiro auto incrementado e chave-primária
-- nomeGenero Varchar de 30 caracteres
CREATE TABLE generos(
    idGenero INT AUTO_INCREMENT PRIMARY KEY,
    nomeGenero VARCHAR(30)
);

-- 3) Crie outra tabela chamada livros:
-- idLivro inteiro auto incrementado e chave-primária
-- nomeLivro Varchar de 50 caracteres
-- idAutor Inteiro chave-estrangeira
-- idGenero inteiro chave-estrangeira
CREATE TABLE livros(
    idLivro INT AUTO_INCREMENT PRIMARY KEY,
    nomeLivro VARCHAR(50),
    idAutor INT,
    idGenero INT,
    FOREIGN KEY(idAutor) REFERENCES autores(idAutor),
    FOREIGN KEY(idGenero) REFERENCES generos(idGenero)
);

-- 4) Adicione três autores de sua preferência, cinco gêneros e cadastre quatro livros, interligando esses livros com os autores já cadastrados e os gêneros.
 

-- 5) insert into generos (nomeGenero) values 


-- 6) insert into livros (nomeLivro,idAutor,idGenero) values


-- 7) Após criar essas três tabelas exiba os seguintes dados: Nome do livro, nome do autor e nome do gênero do livro.