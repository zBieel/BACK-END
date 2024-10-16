-- Criar tabela agendamentos
DO $$
BEGIN
    IF NOT EXISTS (SELECT 1 FROM pg_tables WHERE tablename = 'agendamentos') THEN
        CREATE TABLE agendamentos (
            id BIGSERIAL PRIMARY KEY,
            data_agendamento DATE,
            horario_agendamento TIME,
            descricao_agendamento VARCHAR(45),
            usuario_id BIGINT,
            CONSTRAINT fk_agendamento_cliente_id FOREIGN KEY (usuario_id) REFERENCES usuarios(id)
        );
    END IF;
END $$;