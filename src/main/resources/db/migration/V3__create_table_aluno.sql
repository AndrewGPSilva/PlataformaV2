CREATE TABLE IF NOT EXISTS aluno (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(255) NOT NULL,
    nivel VARCHAR(50) NOT NULL,
    email VARCHAR(255)
);