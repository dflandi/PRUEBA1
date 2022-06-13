create view age_view as
select age,count(age) as frecuencia from cancha group by (age)