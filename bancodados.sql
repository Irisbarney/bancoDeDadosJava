CREATE DATABASE bancodados;

-- Depois de criar, conecte-se ao banco 'bancodados' e execute:

CREATE TABLE cliente (
    id SERIAL PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    saldo NUMERIC DEFAULT 0
);
