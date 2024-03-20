CREATE EXTENSION IF NOT EXISTS pgcrypto;

CREATE TABLE IF NOT EXISTS student (
  id UUID,
  first_name VARCHAR(100) NOT NULL,
  last_name VARCHAR(255) NOT NULL,
  registration BIGINT,
  PRIMARY KEY(id, registration)
);