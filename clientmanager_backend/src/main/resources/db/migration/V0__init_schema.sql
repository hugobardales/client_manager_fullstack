-- V0__init_schema.sql
-- Tabla dummy para verificar que Flyway y la BD están conectados y saludables.

CREATE TABLE app_health(
    id INT AUTO_INCREMENT PRIMARY KEY,
    status VARCHAR(50) NOT NULL,
    checked_at TIMESTAMP DEFAULT  CURRENT_TIMESTAMP
);

INSERT INTO app_health(status) VALUES ('UP');