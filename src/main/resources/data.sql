insert into doctor(name, specialization, email)
values('Dr.Prakesh','Cardio','Prakesh@gmail.com');

insert into doctor(name, specialization, email)
values('Dr.Rakesh','Derma','rakesh@gmail.com');

insert into doctor(name, specialization, email)
values('Dr.Sneha','Neuro','sneha@gmail.com');

insert into patient(name, birth_date, email, gender, blood_group)
values('uiop','2001-05-10','uio@gmail.com','male','A_Positive');

insert into patient(name, birth_date, email, gender, blood_group)
values('zxcb','2000-05-10','qwe@gmail.com','female','A_Positive');

insert into appointment (appointment_time, reason, doctor_id, patient_id)
values ('2025-07-01 10:30:00', 'Genearal Checkup', 1,2);

insert into appointment (appointment_time, reason, doctor_id, patient_id)
values('2025-07-02 13:30:00', 'Skin rash', 2,2);