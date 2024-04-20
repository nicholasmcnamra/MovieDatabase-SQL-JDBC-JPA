INSERT INTO movies (Title, Runtime, Genre, IMDB Score, Rating) VALUES ('Howard the Duck',110, 'Sci-Fi',	4.6, 'PG');
INSERT INTO movies (Title, Runtime, Genre, IMDB Score, Rating) VALUES ('Lavalantula', 83, 'Horror', 4.7, 'TV-14');
INSERT INTO movies (Title, Runtime, Genre, IMDB Score, Rating) VALUES ('Starship Troopers', 129, 'Sci-Fi', 7.2, 'PG-13');
INSERT INTO movies (Title, Runtime, Genre, IMDB Score, Rating) VALUES ('Waltz With Bashir', 90, 'Documentary', 8.0, 'R');
INSERT INTO movies (Title, Runtime, Genre, IMDB Score, Rating) VALUES ('Spaceballs', 96, 'Comedy', 7.1, 'PG');
INSERT INTO movies (Title, Runtime, Genre, IMDB Score, Rating) VALUES ('Monsters Inc.', 92, 'Animation', 8.1, 'G');

SELECT * FROM movies WHERE Genre='Sci-Fi';

SELECT * FROM movies WHERE IMDB Score >= 6.5;

SELECT * FROM movies WHERE (Rating='G' OR Rating='PG') AND Runtime < 100;

SELECT AVG (Runtime) FROM movies WHERE IMDB Score < 7.5 GROUP BY Genre;

UPDATE movies SET Rating='R' WHERE Title='Starship Troopers';

SELECT Id, Rating FROM movies WHERE Genre='Horror' or Genre='Documentary';

SELECT AVG(IMDB Score), MAX(IMDB Score), MIN(IMDB Score), Rating FROM movies GROUP BY Rating;

SELECT AVG(IMDB Score), MAX(IMDB Score), MIN(IMDB Score), Rating FROM movies GROUP BY Rating HAVING COUNT(*) > 1;

DELETE FROM movies WHERE Rating='R';


