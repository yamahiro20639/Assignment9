DROP TABLE IF EXISTS movieList;

CREATE TABLE movieList
(
    movie_id    int unsigned AUTO_INCREMENT,
    movieName   VARCHAR(100) NOT NULL,
    releaseDate VARCHAR(100) NOT NULL,
    PRIMARY KEY (movie_id)
);

INSERT INTO movieList (movie_id, movieName, releaseDate)
VALUES (1, 'Episode IV – A New Hope', '1978年6月30日');
INSERT INTO movieList (movie_id, movieName, releaseDate)
VALUES (2, 'Episode V – The Empire Strikes Back', '1980年6月28日');
INSERT INTO movieList (movie_id, movieName, releaseDate)
VALUES (3, 'Episode VI – Return of the Jedi', '1983年7月2日');
INSERT INTO movieList (movie_id, movieName, releaseDate)
VALUES (4, 'Episode I – The Phantom Menace', '1999年7月10日');
INSERT INTO movieList (movie_id, movieName, releaseDate)
VALUES (5, 'Episode II – Attack of the Clones', '2002年5月16日');
INSERT INTO movieList (movie_id, movieName, releaseDate)
VALUES (6, 'Episode III – Revenge of the Sith', '2005年7月9日');
INSERT INTO movieList (movie_id, movieName, releaseDate)
VALUES (7, 'Episode VII – The Force Awakens', '2015年12月18日');
INSERT INTO movieList (movie_id, movieName, releaseDate)
VALUES (8, 'Episode VIII – The Last Jedi', '2017年12月15日');
INSERT INTO movieList (movie_id, movieName, releaseDate)
VALUES (9, 'Episode IX – The Rise of Skywalker', '2019年12月20日');


DROP TABLE IF EXISTS directorList;

CREATE TABLE directorList
(
    director_id int unsigned AUTO_INCREMENT,
    director    VARCHAR(100) NOT NULL,
    PRIMARY KEY (director_id)

);

INSERT INTO directorList (director_id, director)
VALUES (1, 'George Walton Lucas Jr.');
INSERT INTO directorList (director_id, director)
VALUES (2, 'Irvin Kershner');
INSERT INTO directorList (director_id, director)
VALUES (3, 'Richard Marquand');
INSERT INTO directorList (director_id, director)
VALUES (4, 'George Walton Lucas Jr.');
INSERT INTO directorList (director_id, director)
VALUES (5, 'George Walton Lucas Jr.');
INSERT INTO directorList (director_id, director)
VALUES (6, 'George Walton Lucas Jr.');
INSERT INTO directorList (director_id, director)
VALUES (7, 'Jeffrey Jacob Abrams');
INSERT INTO directorList (director_id, director)
VALUES (8, 'Rian Craig Johnson');
INSERT INTO directorList (director_id, director)
VALUES (9, 'Jeffrey Jacob Abrams');



