DROP TABLE user IF EXISTS;

CREATE TABLE user  (
                         id BIGINT IDENTITY NOT NULL PRIMARY KEY,
                         name VARCHAR(20),
                         status int
);