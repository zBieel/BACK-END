-- Criar tabela empresas
DO $$
BEGIN
    IF NOT EXISTS (SELECT 1 FROM pg_tables WHERE tablename = 'empresas') THEN
        CREATE TABLE empresas (
            id BIGSERIAL PRIMARY KEY,
            nome VARCHAR(50) NOT NULL,
            logradouro VARCHAR(50),
            bairro VARCHAR(50),
            cidade VARCHAR(50),
            cep VARCHAR(12),
            telefone VARCHAR(15),
            uf CHAR(2),
            cnpj VARCHAR(30),
            cod_status_empresa BOOLEAN NOT NULL
        );
    END IF;
END $$;