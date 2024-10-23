-- Criar tabela agendamentos
DO $$
BEGIN
   IF NOT EXISTS (SELECT 1 FROM information_schema.tables WHERE table_name = 'agendamentos') THEN
        CREATE TABLE agendamentos (
            id BIGSERIAL PRIMARY KEY,
            data_agendamento DATE,
            horario_agendamento TIME,
            usuario_id BIGINT,
            nome VARCHAR(100),
            telefone VARCHAR(20),
            email VARCHAR(100),
            CONSTRAINT fk_agendamento_usuario_id FOREIGN KEY (usuario_id) REFERENCES usuarios(id)
        );
    END IF;
END $$;