CREATE DATABASE app_db;
CREATE USER app_user WITH PASSWORD 'app_user';
GRANT ALL PRIVILEGES ON DATABASE app_db TO app_user;

\connect app_db

----Таблица стран
--CREATE TABLE public.countries
--(
--     id INTEGER PRIMARY KEY,
--     name VARCHAR(255),
--     code_alpha2 VARCHAR(2)
--);
--ALTER TABLE public.countries
--OWNER to app_user;
--
--INSERT INTO public.countries (id, name, code_alpha2) values (1, 'The Shire', 'SH');
--INSERT INTO public.countries (id, name, code_alpha2) values (2, 'Eldar', 'EL');
--
----Таблица городов
--CREATE TABLE public.cities
--(
--     id INTEGER PRIMARY KEY,
--     name VARCHAR(255),
--     country_id INTEGER REFERENCES public.countries
--);
--ALTER TABLE public.cities
--OWNER to app_user;
--
--INSERT INTO public.cities (id, name, country_id) values (1, 'Hobbiton', 1);
--INSERT INTO public.cities (id, name, country_id) values (2, 'Tirion', 2);
--
----Таблица улиц
--CREATE TABLE public.streets
--(
--     id INTEGER PRIMARY KEY,
--     name VARCHAR(255),
--     city_id INTEGER REFERENCES public.cities
--);
--ALTER TABLE public.streets
--OWNER to app_user;
--
--INSERT INTO public.streets (id, name, city_id) values (1, 'Bagshot Row', 1);
--INSERT INTO public.streets (id, name, city_id) values (2, 'Main Street', 2);
--
----Таблица адресов
--CREATE TABLE public.addresses
--(
--     id INTEGER PRIMARY KEY,
--     country_id INTEGER REFERENCES public.countries,
--     city_id INTEGER REFERENCES public.cities,
--  	 street_id INTEGER REFERENCES public.streets,
--     house INTEGER,
--     building VARCHAR(20),
--     apartment INTEGER
--);
--ALTER TABLE public.addresses
--OWNER to app_user;
--
--INSERT INTO public.addresses (id, country_id, city_id, street_id, house, building, apartment) values (1, 1, 1, 1, 3, null, null);
--INSERT INTO public.addresses (id, country_id, city_id, street_id, house, building, apartment) values (2, 2, 2, 2, 303, 'A', 1);

--Таблица пользователей
CREATE TABLE public.users
(
     id bigserial PRIMARY KEY,
     firstname VARCHAR(255),
     lastname VARCHAR(255),
     address VARCHAR(255)
     --address_id INTEGER REFERENCES public.addresses
);
ALTER TABLE public.users
OWNER to app_user;

INSERT INTO public.users (firstname, lastname, address) values ('Samwise', 'Gamgee', '1');
INSERT INTO public.users (firstname, lastname, address) values ('Galadriel', 'Lady of Lorien', '2');