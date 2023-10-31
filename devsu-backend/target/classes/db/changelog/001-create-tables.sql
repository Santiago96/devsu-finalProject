-- Create the 'person' table
CREATE TABLE IF NOT EXISTS person (
                                      id serial PRIMARY KEY,
                                      name VARCHAR(255) NOT NULL,
    gender VARCHAR(10),
    date_of_birth DATE,
    address TEXT,
    phone VARCHAR(15)
    );

-- Create the 'client' table
CREATE TABLE IF NOT EXISTS client (
                                      id serial PRIMARY KEY,
                                      password VARCHAR(255) NOT NULL,
    state VARCHAR(50)
    );

-- Create the 'account' table
CREATE TABLE IF NOT EXISTS account (
                                       number_account serial PRIMARY KEY,
                                       balance BIGINT NOT NULL,
                                       state BOOLEAN,
                                       type VARCHAR(50),
    client_id serial,
    FOREIGN KEY (client_id) REFERENCES client (id)
    );

-- Create the 'transactions' table
CREATE TABLE IF NOT EXISTS transactions (
                                            transaction_id serial PRIMARY KEY,
                                            date TIMESTAMP NOT NULL,
                                            type VARCHAR(50),
    state BOOLEAN,
    balance_initial BIGINT NOT NULL,
    balance_transaction BIGINT NOT NULL,
    movement VARCHAR(50) NOT NULL,
    client_id serial,
    number_account serial,
    FOREIGN KEY (client_id) REFERENCES client (id),
    FOREIGN KEY (number_account) REFERENCES account (number_account)
    );
