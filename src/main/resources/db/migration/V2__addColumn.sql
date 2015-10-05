ALTER TABLE PERSON ADD (age INTEGER);

insert into PERSON (first_name, last_name, age) values ('James', 'Rod', 37);
update PERSON SET age = 25 WHERE age is NULL;