USE university;
CREATE TABLE student (
    std_id INT PRIMARY KEY,
    name VARCHAR(100),
    marks INT
);

INSERT INTO student (std_id, name, marks)
VALUES 
(1, 'Apoorva', 85),
(2, 'Riya', 92),
(3, 'Manish', 78);
select * from student;
CREATE TABLE ucucu (
    userId INT AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR(50) NOT NULL,
    password VARCHAR(100) NOT NULL,
    email VARCHAR(100) UNIQUE NOT NULL,
    balance DECIMAL(10,2) DEFAULT 0.00
);
INSERT INTO ucucu (userId, username, password, email, balance) VALUES
(4, 'neha_k', 'neh@123', 'neha.kumar@example.com', 750.00),
(5, 'mohan21', 'mohan987', 'mohan.raj@example.com', 2200.50),
(6, 'riya_s', 'riya@2025', 'riya.sharma@example.com', 1800.00),
(7, 'sandy99', 'sand_567', 'sandeep@example.com', 950.75),
(8, 'varun_x', 'varun@111', 'varun.mehta@example.com', 3200.00),
(9, 'sonu_04', 'sonu1234', 'sonu.singh@example.com', 450.20),
(10, 'tanvi_p', 'tanvi789', 'tanvi.patel@example.com', 980.80);
select * from ucucu;

DELIMITER $$

CREATE PROCEDURE insert_into_ucucu (
    IN p_userId INT,
    IN p_username VARCHAR(50),
    IN p_password VARCHAR(50),
    IN p_email VARCHAR(100),
    IN p_balance DOUBLE
)
BEGIN
    INSERT INTO ucucu (userId, username, password, email, balance)
    VALUES (p_userId, p_username, p_password, p_email, p_balance);
END $$

DELIMITER ;

CALL insert_into_ucucu(101, 'Apoorva', 'ap123', 'apoorva@gmail.com', 5000.50);
