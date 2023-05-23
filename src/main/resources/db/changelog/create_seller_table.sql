CREATE TABLE seller
(
    id              CHAR(36) NOT NULL PRIMARY KEY,
    name            VARCHAR(100) NOT NULL,
    city            VARCHAR(36) NOT NULL,
    phone           NUMERIC(10) NOT NULL
)