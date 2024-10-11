-- Criar tabela usuarios_papeis
DO $$
BEGIN
    IF NOT EXISTS (SELECT 1 FROM pg_tables WHERE tablename = 'usuarios_papeis') THEN
        CREATE TABLE usuarios_papeis (
            usuario_id BIGINT NOT NULL,
            papel_id BIGINT NOT NULL,
            CONSTRAINT fk_usuarios_papeis_usuario_id FOREIGN KEY(usuario_id) REFERENCES usuarios(id),
            CONSTRAINT fk_usuarios_papeis_papel_id FOREIGN KEY(papel_id) REFERENCES papeis(id)
        );
    END IF;
END $$;