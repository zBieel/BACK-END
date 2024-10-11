-- Alterar tabela usuarios
DO $$
BEGIN
    IF NOT EXISTS (SELECT 1 FROM pg_tables WHERE tablename = 'usuarios') THEN
        ALTER TABLE usuarios
        ADD empresa_id BIGINT,
        ADD CONSTRAINT fk_ususarios_empresa_id FOREIGN KEY (empresa_id) REFERENCES empresas(id);
    END IF;
END $$;