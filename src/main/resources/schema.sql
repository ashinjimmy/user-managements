CREATE DATABASE IF NOT EXISTS userdb;



CREATE TABLE IF NOT EXISTS profile (
   id INT AUTO_INCREMENT PRIMARY KEY,
   user_name VARCHAR(100) NOT NULL,
   email_id VARCHAR(100) NOT NULL,
   user_role VARCHAR(100) NOT NULL,
   created_at DATE NOT NULL
   -- created_by VARCHAR(20) NOT NULL,
--    updated_at DATE DEFAULT NULL,
--    updated_by VARCHAR(20) DEFAULT NULL
);