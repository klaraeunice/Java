/*
 * highlighted
-- *! descontinuado
 --*? dúvida
 TODO: REFAZER 
--// excluido
*/

-- *tabelas
CREATE TABLE MOTORISTA
(
    ID_MOTORISTA INT PRIMARY KEY,
    CPF NUMERIC (11),
    CNH NUMERIC (10),
    NOME VARCHAR (50),
    ENDERECO VARCHAR (100)
);

CREATE TABLE VEICULO
(
    PLACA CHAR (7) PRIMARY KEY,
    CAPACIDADE INT
);

CREATE TABLE PRODUTO
(
    ID_PRODUTO INT PRIMARY KEY,
    CUSTO NUMERIC (11,2),
    DESCRICAO TEXT,
    PRECO NUMERIC (11,2),
    NOME VARCHAR (50)
);

CREATE TABLE VENDEDOR
(
    ID_VENDEDOR INT PRIMARY KEY,
    CPF NUMERIC (11),
    VALOR_COMISSAO NUMERIC (4,2),
    QUANTIDADE INT
);

CREATE TABLE CLIENTE
(
    ID_CLIENTE INT PRIMARY KEY,
    NOME VARCHAR (50),
    TELEFONE CHAAR (10),
    ENDERECO VARCHAR (100),
    CPF NUMERIC (11),
    EMAIL VARCHAR (50)
);

CREATE TABLE VENDA
(
    NUMERO_VENDA INT PRIMARY KEY,
    VALOR_TOTAL NUMERIC (11,2),
    ID_VENDEDOR INT REFERENCES VENDEDOR,
    ID_CLIENTE INT REFERENCES CLIENTE
);

CREATE TABLE ITEM_VENDA
(
    ID_PRODUTO INT PRIMARY KEY REFERENCES PRODUTO,
    NUMERO_VENDA INT PRIMARY KEY REFERENCES VENDA,
    VALOR_UNITARIO INT
);

CREATE TABLE ENTREGA
(
    HORA TIME PRIMARY KEY,
    DATA TIME,
    NUMERO_VENDA INT REFERENCES VENDA,
    PLACA CHAR (7) REFERENCES VEICULO,
    ID_MOTORISTA INT REFERENCES MOTORISTA,
    PRIMARY KEY (HORA, DATA, NUMERO_VENDA, PLACA, ID_MOTORISTA)
);

--* INSERTS

INSERT INTO MOTORISTA
VALUES

    --*? ID, CPF, CNH, NOME, ENDERECO
    (01, 11111111111, 1111111111, 'motorista 1', 'endereco do motorista 1'),
    (02, 22222222222, 2222222222, 'motorista 2', 'endereco do motorista 2'),
    (03, 33333333333, 3333333333, 'motorista 3', 'endereco do motorista 3');

INSERT INTO VEICULO
VALUES
    --*? PRIMARIA - PLACA, CAPACIDADE
    ('111AAA', 20),
    ('222BBB', 20),
    ('333CCC', 20);

INSERT INTO PRODUTO
VALUES
    --*? PRIMARIA - ID, CUSTO, DESCRICAO, PRECO, NOME
    (11, 10.0, 'lema 1', 20.0, 'produto 1'),
    (22, 10.0, 'lema 2', 20.0, 'produto 2'),
    (33, 10.0, 'lema 3', 20.0, 'produto 3');

INSERT INTO VENDEDOR
VALUES
    --*? PRIMARIA - ID, CPF, COMISSAO, NOME, ENDERECO
    (01, 11111111111, 20.0, 'vendedor 1', 'endereco do vendedor 1'),
    (02, 22222222222, 20.0, 'vendedor 2', 'endereco do vendedor 2'),
    (03, 33333333333, 20.0, 'vendedor 3', 'endereco do vendedor 3');

INSERT INTO CLIENTE
VALUES
    --*?PRIMARIA - ID, NOME, TEL, ENDERECO, CPF, EMAIL
    (01, 'Cliente 1', 123456781, 'endereco do cliente 1', 11111111111, "cliente1@gmail.com"),
    (02, 'Cliente 2', 123456782, 'endereco do cliente 2', 22222222222, "cliente2@gmail.com"),
    (03, 'Cliente 3', 123456783, 'endereco do cliente 3', 33333333333, "cliente3@gmail.com");

INSERT INTO VENDA
VALUES
    --*? PRIMARIA - NUMERO VENDA, TOTAL, ESTRANGEIRA - ( ID VENDEDOR, ID CLIENTE)
    (11, 20.0, 01, 01),
    (22, 20.0, 02, 02),
    (33, 20.0, 03, 03);

INSERT INTO ITEM_VENDA
VALUES
    --*? PRI E EST - (ID PRODUTO E NUMERO VENDA), VALOR UNITARIO, QUANTIDADE
    (11, 11, 10.0, 1),
    (22, 22, 10.0, 1),
    (33, 33, 10.0, 1);

INSERT INTO ENTREGA
VALUES
    --*? PRI E ESTR - NUMERO VENDA, PLACA E ID MOTORISTA
    --*? HORA, DATA, NUMERO VENDA, PLACA E ID MOTORISTA
    ('00:00:00', '10/10/2010', 11, '111AAA', 01),
    ('00:00:00', '10/10/2010', 22, '222BBB', 02),
    ('00:00:00', '10/10/2010', 33, '333CCC', 03);
