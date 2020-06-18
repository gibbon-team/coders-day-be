CREATE USER 'quizor'@'localhost' IDENTIFIED BY 'xxx';
GRANT ALL PRIVILEGES ON * . * TO 'quizor'@'localhost';
CREATE USER 'quizor'@'%' IDENTIFIED BY 'xxx';
GRANT ALL PRIVILEGES ON *.* TO 'quizor'@'%' WITH GRANT OPTION;
FLUSH PRIVILEGES;

