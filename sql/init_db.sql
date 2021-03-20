create table if not exists planets (
    id int primary key,
    name varchar
);

insert into planets
values (1,'Mercury'),
       (2,'Venus'),
       (3, 'Earth'),
       (4, 'Mars'),
       (5, 'Jupiter'),
       (6, 'Saturn'),
       (7, 'Uranus'),
       (8, 'Neptune');
