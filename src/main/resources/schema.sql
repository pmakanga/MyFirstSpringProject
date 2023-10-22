CREATE TABLE IF NOT EXISTS photoz (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    file_name VARCHAR(255),
    content_type VARCHAR(MAX),
    data BINARY
);
