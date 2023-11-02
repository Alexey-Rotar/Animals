DROP DATABASE IF EXISTS human_friends;
CREATE DATABASE human_friends;
USE human_friends;

DROP TABLE IF EXISTS animal;
CREATE TABLE animal (
	id INT AUTO_INCREMENT PRIMARY KEY, 
	animal_type VARCHAR(45)
);

INSERT INTO animal (animal_type)
VALUES
('Cat'),
('Dog'),
('Hamster'),
('Horse'),
('Camel'),
('Donkey');

DROP TABLE IF EXISTS pets;
CREATE TABLE pets (
	id INT AUTO_INCREMENT PRIMARY KEY, 
	type_id INT NOT NULL,
	name VARCHAR(45),
	birth_date DATE,
	gender VARCHAR(45),
	owner VARCHAR(45),
  color VARCHAR(45),
	commands VARCHAR(100),
	FOREIGN KEY (type_id) REFERENCES animal (id) ON DELETE CASCADE ON UPDATE CASCADE  
);

INSERT INTO pets (type_id, name, birth_date, gender, owner, color, commands)
VALUES
(2, 'Ayna', '2013-02-10', 'female', 'Alexey', 'white', 'bark, lie, sit, stand, swim'),
(2, 'Tmin', '2022-05-24', 'male', 'Alina', 'black with brown', 'bark, play'),
(1, 'Pushok', '2016-12-05', 'male', 'Sergey', 'grey', 'meow, play'),
(2, 'Balu', '2012-11-02', 'male', 'Vika', 'brown', 'bark'),
(3, 'Homa', '2023-05-18', 'male', 'Irina', 'light brown', 'chew, run'),
(2, 'Roy', '2019-08-30', 'male', 'Liuba', 'black', 'bark'),
(3, 'Rice', '2022-10-13', 'female', 'Evgeny', 'white', 'gnaw, run'),
(2, 'Lesia', '2014-06-15', 'female', 'Kate', 'red', 'bark, lie, sit'),
(1, 'Taily', '2017-11-29', 'female', 'Sam', 'white with grey', 'meow, play'),
(1, 'Sazhik', '2019-04-21', 'male', 'Mel', 'black', 'meow, lie');

DROP TABLE IF EXISTS pack_animals;
CREATE TABLE pack_animals (
	id INT AUTO_INCREMENT PRIMARY KEY, 
	type_id INT NOT NULL,
	name VARCHAR(45),
	birth_date DATE,
	gender VARCHAR(45),
	owner VARCHAR(45),
  color VARCHAR(45),
	commands VARCHAR(100),
	FOREIGN KEY (type_id) REFERENCES animal (id) ON DELETE CASCADE ON UPDATE CASCADE  
);

INSERT INTO pack_animals (type_id, name, birth_date, gender, owner, color, commands)
VALUES
(4, 'Romb', '2023-05-14', 'male', 'Stepan', 'grey', 'ride, graze'),
(6, 'Grisha', '2020-12-07', 'male', 'Lina', 'grey', 'graze, pull, ia'),
(4, 'Star', '2011-08-26', 'female', 'Makar', 'light brown', 'ride, gallop, graze'),
(5, 'Ali', '2020-08-05', 'male', 'Will', 'brown', 'lie, stand, walk, graze'),
(6, 'Ushi', '2023-07-01', 'female', 'Maya', 'grey', 'pull'),
(4, 'Akhal', '2021-04-16', 'male', 'Dovran', 'light grey', 'ride, gallop'),
(6, 'Barma', '2022-03-14', 'female', 'Pury', 'grey', 'ia, iaaa'),
(6, 'Murgab', '2020-09-09', 'male', 'Juma', 'grey', 'pull, ia'),
(5, 'Amul', '2018-01-17', 'male', 'Alexey', 'brown', 'neighs, ride, graze'),
(6, 'Seri', '2021-03-30', 'male', 'Stan', 'grey', 'graze, iaaa');

-- Удалить записи о верблюдах и объединить таблицы лошадей и ослов
DELETE FROM pack_animals
WHERE type_id=5;

-- Создать новую таблицу для животных в возрасте от 1 до 3 лет 
-- и вычислить их возраст с точностью до месяца
CREATE TABLE young_animals 
SELECT 
type_id, 
name,
owner,
birth_date, 
commands, 
CONCAT(TIMESTAMPDIFF (YEAR, birth_date, CURRENT_DATE), ' years ',
(TIMESTAMPDIFF (MONTH, birth_date, CURRENT_DATE) - TIMESTAMPDIFF (YEAR, birth_date, CURRENT_DATE) * 12), ' months') AS age
FROM pets
WHERE birth_date <= DATE_SUB(CURRENT_DATE(),INTERVAL 1 YEAR) AND birth_date >= DATE_SUB(CURRENT_DATE(),INTERVAL 3 YEAR)
UNION
SELECT 
type_id, 
name,
owner,
birth_date, 
commands, 
CONCAT(TIMESTAMPDIFF (YEAR, birth_date, CURRENT_DATE), ' years ',
(TIMESTAMPDIFF (MONTH, birth_date, CURRENT_DATE) - TIMESTAMPDIFF (YEAR, birth_date, CURRENT_DATE) * 12), ' months') AS age
FROM pack_animals
WHERE birth_date <= DATE_SUB(CURRENT_DATE(),INTERVAL 1 YEAR) AND birth_date >= DATE_SUB(CURRENT_DATE(),INTERVAL 3 YEAR);

ALTER TABLE young_animals
ADD id INT AUTO_INCREMENT PRIMARY KEY,
ADD FOREIGN KEY (type_id) REFERENCES animal (id) ON DELETE CASCADE ON UPDATE CASCADE;

SELECT
id,
type_id, 
name,
owner,
birth_date, 
commands,
age
FROM young_animals;
