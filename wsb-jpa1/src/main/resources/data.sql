insert into doctor (id, doctor_number, email, first_name, last_name, specialization, telephone_number) values (1, '123456789', 'jan.kowalski@email.com', 'Jan', 'Kowalski', 'SURGEON', '1');
insert into doctor (id, doctor_number, email, first_name, last_name, specialization, telephone_number) values (2, '987654321', 'anna.nowak@email.com', 'Anna', 'Nowak', 'GP', '2');


insert into patient (id, date_of_birth, email, first_name, last_name, patient_number, telephone_number, pesel)
values (1, '1990-01-01', 'pacjent.jeden@email.com', 'Pacjent', 'Jeden', '1', '555555555', 123456789),
       (2, '1995-02-02', 'pacjentka.dwa@email.com', 'Pacjentka', 'Dwa', '2', '333333333', 119876543);

insert into address values (1, 'xx', 'yy', 'city', '62-030', 1, 1);
insert into address values (2, 'xxx', 'yyy', 'Wrocław', '54-080', 1, 2);

INSERT INTO visit (id, description, time, doctor_id, patient_id)
VALUES (1, 'Przyjęcie kontrolne', '2024-03-27', 1, 1);
INSERT INTO visit (id, description, time, doctor_id, patient_id)
VALUES (3, 'Wizyta 2', '2024-04-27', 1, 1);
INSERT INTO visit (id, description, time, doctor_id, patient_id)
VALUES (4, 'Wizyta 3', '2024-05-27', 1, 1);
INSERT INTO visit (id, description, time, doctor_id, patient_id)
VALUES (2, 'Operacja', '2024-06-22', 1, 2);

INSERT INTO medical_treatment (id, description, type, visit_id)
VALUES (1,'Pobieranie Krwi', 'Kontrola', 1);
INSERT INTO medical_treatment (id, description, type, visit_id)
VALUES (2, 'Zabieg chirurgiczny', 'Leczenie', 2);
