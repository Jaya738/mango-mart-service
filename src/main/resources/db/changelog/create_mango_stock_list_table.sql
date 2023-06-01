CREATE TABLE mango_stock
(
    id               CHAR(36) NOT NULL PRIMARY KEY,
    seller_id        CHAR(36) NOT NULL,
    mango_type       VARCHAR(36) NOT NULL,
    mango_size       VARCHAR(10) NOT NULL,
    selling_format   VARCHAR(10) NOT NULL,
    prize            DOUBLE NOT NULL,
    FOREIGN KEY (seller_id) REFERENCES seller(id)

)