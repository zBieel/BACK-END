-- Criar tabela usuarios
DO $$
BEGIN
    IF NOT EXISTS (SELECT 1 FROM pg_tables WHERE tablename = 'usuarios') THEN
        CREATE TABLE usuarios (
            id BIGSERIAL PRIMARY KEY,
            nome VARCHAR(45),
            email VARCHAR(45) NOT NULL UNIQUE,
            senha VARCHAR(200),
            cod_status_usuario BOOLEAN NOT NULL,
            tipo_usuario VARCHAR(45) NOT NULL,
            telefone VARCHAR(15),
            mensagem VARCHAR(45),
            uf CHAR(2),
            UNIQUE(email)
        );
    END IF;
END $$;