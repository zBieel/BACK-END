-- Criar tabela papeis
DO $$
BEGIN
    IF NOT EXISTS (SELECT 1 FROM pg_tables WHERE tablename = 'papeis') THEN
        CREATE TABLE papeis (
            id BIGSERIAL PRIMARY KEY,
            nome_papel VARCHAR(45) NOT NULL,
            descricao_papel VARCHAR(250),
            cod_status_papel BOOLEAN
        );
    END IF;
END $$;