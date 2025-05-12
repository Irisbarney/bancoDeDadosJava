# Projeto Java com PostgreSQL

Este projeto Java utiliza PostgreSQL como banco de dados para gerenciar clientes.

## 🧰 Tecnologias usadas

- Java
- PostgreSQL
- JDBC (com driver do PostgreSQL)

## 🗃 Estrutura do banco de dados

Banco: `bancodados`  
Tabela: `cliente`

### Script para criação (PostgreSQL):

```sql
CREATE DATABASE bancodados;

-- Conecte-se ao banco e execute:
CREATE TABLE cliente (
    id SERIAL PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    saldo NUMERIC DEFAULT 0
);
