INSERT INTO Users(first_name,last_name,email,password) VALUES('Nivedha','R','niv@gmail.com','$2a$10$tlS5pWZkZ3CwPAgne8uDCe1Dsl6fY30m2x8MzTdAXSobIX2aJgrUu');
INSERT INTO Users(first_name,last_name,email,password) VALUES('Subash','Ramu','sub@gmail.com','$2a$10$iOFe8JquetXk.Fn6hb5w..qyrVyvYW0ip0eI.lUQMl4TYN.LuKZNS');

INSERT INTO Roles(id,role_type)VALUES ('1','ROLE_ADMIN');
INSERT INTO Roles(id,role_type)VALUES ('2','ROLE_USER');

INSERT INTO Users_Role(user_id,role_id)VALUES ('1','1');
INSERT INTO Users_Role(user_id,role_id)VALUES ('2','2');

INSERT INTO Student(first_Name,last_Name,phone_No,date_Of_Birth,email,course_Of_Choice,percentage_In10th,percentage_In12th,
location_Preferred,fee_Capability)
VALUES ( 'Nivedha', 'R', '7402077519', '16/04/1998' , 'niv@gmail.com', 'ECE' ,'75','70','Chennai','140000');
INSERT INTO Student(first_Name,last_Name,phone_No,date_Of_Birth,email,course_Of_Choice,percentage_In10th,percentage_In12th,
location_Preferred,fee_Capability)
VALUES( 'Divya', 'Smily', '8988976893', '19/10/1999' , 'div@gmail.com', 'AI' ,'70','75','Pune','150000');
INSERT INTO Student(first_Name,last_Name,phone_No,date_Of_Birth,email,course_Of_Choice,percentage_In10th,percentage_In12th,
location_Preferred,fee_Capability)
VALUES( 'Radha', 'J', '9998976893', '28/09/1997' , 'radha@gmail.com', 'EEE' ,'75','75','Bangalore','120000');
INSERT INTO Student(first_Name,last_Name,phone_No,date_Of_Birth,email,course_Of_Choice,percentage_In10th,percentage_In12th,
location_Preferred,fee_Capability)
VALUES( 'Benny', 'Paul', '8988678993', '10/01/1998' , 'benny@gmail.com', 'CSE' ,'70','72','Kerala','200000');
INSERT INTO Student(first_Name,last_Name,phone_No,date_Of_Birth,email,course_Of_Choice,percentage_In10th,percentage_In12th,
location_Preferred,fee_Capability)
VALUES( 'Anusha', 'HP', '7789976893', '31/05/1997' , 'anusha@gmail.com', 'AI' ,'80','82','Coimbatore','250000');




insert into educational_counsellor ( Name, Email, Location, Capacity, Course, Fee, percentage_In10th, percentage_In12th)
values ( 'SNS College', 'sns@gmail.com', 'Coimbatore', 1000, 'AI', 250000, 80, 82);
insert into educational_counsellor ( Name, Email, Location, Capacity, Course, Fee, percentage_In10th, percentage_In12th)
values ( 'AQW College', 'aqw@gmail.com', 'Coimbatore', 1000, 'ECE', 250000, 80, 82);
insert into educational_counsellor ( Name, Email, Location, Capacity, Course, Fee, percentage_In10th, percentage_In12th)
values ( 'GYT College', 'gyt@gmail.com', 'Coimbatore', 1000, 'EEE', 250000, 80, 82);
insert into educational_counsellor ( Name, Email, Location, Capacity, Course, Fee, percentage_In10th, percentage_In12th)
values ( 'KLI College', 'Kli@gmail.com', 'Coimbatore', 1000, 'CSE', 250000, 80, 82);

insert into educational_counsellor ( Name, Email, Location, Capacity, Course, Fee, percentage_In10th, percentage_In12th)
values ( 'ABC College', 'abc@gmail.com', 'Coimbatore', 1000, 'AI', 250000, 80, 82);
insert into educational_counsellor (Name, Email, Location, Capacity, Course, Fee, percentage_In10th, percentage_In12th)
values ( 'DCG College', 'dcg@gmail.com', 'Coimbatore', 1000, 'ECE', 250000, 80, 82);
insert into educational_counsellor ( Name, Email, Location, Capacity, Course, Fee, percentage_In10th, percentage_In12th)
values ( 'JNK College', 'jnk@gmail.com', 'Coimbatore', 1000, 'EEE', 250000, 80, 82);
insert into educational_counsellor ( Name, Email, Location, Capacity, Course, Fee, percentage_In10th, percentage_In12th)
values ( 'JUH College', 'juh@gmail.com', 'Coimbatore', 1000, 'CSE', 250000, 80, 82);


insert into educational_counsellor (Name, Email, Location, Capacity, Course, Fee, percentage_In10th, percentage_In12th)
values ( 'XYZ College', 'xyz@gmail.com', 'Coimbatore', 1000, 'AI', 250000, 80, 82);
insert into educational_counsellor ( Name, Email, Location, Capacity, Course, Fee, percentage_In10th, percentage_In12th)
values ( 'ZYX College', 'zyx@gmail.com', 'Coimbatore', 1000, 'EEE', 250000, 80, 82);
insert into educational_counsellor ( Name, Email, Location, Capacity, Course, Fee, percentage_In10th, percentage_In12th)
values ( 'MKO College', 'mko@gmail.com', 'Coimbatore', 1000, 'ECE', 250000, 80, 82);
insert into educational_counsellor ( Name, Email, Location, Capacity, Course, Fee, percentage_In10th, percentage_In12th)
values ( 'NJI College', 'nji@gmail.com', 'Coimbatore', 1000, 'CSE', 250000, 80, 82);


insert into educational_counsellor ( Name, Email, Location, Capacity, Course, Fee, percentage_In10th, percentage_In12th)
values ( 'Rajagiri Institute', 'Rajagiri@gmail.com', 'Chennai', 500, 'AI', 140000, 75, 70);
insert into educational_counsellor ( Name, Email, Location, Capacity, Course, Fee, percentage_In10th, percentage_In12th)
values ( 'Raja Institute', 'Raja@gmail.com', 'Chennai', 500, 'ECE', 140000, 75, 70);
insert into educational_counsellor ( Name, Email, Location, Capacity, Course, Fee, percentage_In10th, percentage_In12th)
values ( 'giri Institute', 'giri@gmail.com', 'Chennai', 500, 'EEE', 140000, 75, 70);
insert into educational_counsellor ( Name, Email, Location, Capacity, Course, Fee, percentage_In10th, percentage_In12th)
values ( 'jagi Institute', 'jagi@gmail.com', 'Chennai', 500, 'CSE', 140000, 75, 70);

insert into educational_counsellor ( Name, Email, Location, Capacity, Course, Fee, percentage_In10th, percentage_In12th)
values ( 'Anna Institute', 'Anna@gmail.com', 'Chennai', 500, 'AI', 140000, 75, 70);
insert into educational_counsellor ( Name, Email, Location, Capacity, Course, Fee, percentage_In10th, percentage_In12th)
values ( 'malai Institute', 'malai@gmail.com', 'Chennai', 500, 'EEE', 140000, 75, 70);
insert into educational_counsellor ( Name, Email, Location, Capacity, Course, Fee, percentage_In10th, percentage_In12th)
values ( 'nama Institute', 'nama@gmail.com', 'Chennai', 500, 'ECE', 140000, 75, 70);
insert into educational_counsellor ( Name, Email, Location, Capacity, Course, Fee, percentage_In10th, percentage_In12th)
values ( 'alai Institute', 'alai@gmail.com', 'Chennai', 500, 'CSE', 140000, 75, 70);


insert into educational_counsellor ( Name, Email, Location, Capacity, Course, Fee, percentage_In10th, percentage_In12th)
values ( 'RMK Institute', 'Rmk@gmail.com', 'Chennai', 500, 'AI', 140000, 75, 70);
insert into educational_counsellor ( Name, Email, Location, Capacity, Course, Fee, percentage_In10th, percentage_In12th)
values ( 'RMD Institute', 'Rmd@gmail.com', 'Chennai', 500, 'CSE', 140000, 75, 70);
insert into educational_counsellor ( Name, Email, Location, Capacity, Course, Fee, percentage_In10th, percentage_In12th)
values ( 'RMKCET Institute', 'Rmkcet@gmail.com', 'Chennai', 500, 'ECE', 140000, 75, 70);
insert into educational_counsellor ( Name, Email, Location, Capacity, Course, Fee, percentage_In10th, percentage_In12th)
values ( 'RMKT Institute', 'Rmkt@gmail.com', 'Chennai', 500, 'EEE', 140000, 75, 70);


insert into educational_counsellor ( Name, Email, Location, Capacity, Course, Fee, percentage_In10th, percentage_In12th)
values ( 'Gandhi Institute', 'Gandhi@gmail.com', 'Kerala', 250, 'ECE', 200000, 70, 72);
insert into educational_counsellor ( Name, Email, Location, Capacity, Course, Fee, percentage_In10th, percentage_In12th)
values ( 'SRM Institute', 'srm@gmail.com', 'Kerala', 250, 'EEE', 200000, 70, 72);
insert into educational_counsellor ( Name, Email, Location, Capacity, Course, Fee, percentage_In10th, percentage_In12th)
values ( 'DHEE Institute', 'dhee@gmail.com', 'Kerala', 250, 'CSE', 200000, 70, 72);
insert into educational_counsellor ( Name, Email, Location, Capacity, Course, Fee, percentage_In10th, percentage_In12th)
values ( 'RAM Institute', 'ram@gmail.com', 'Kerala', 250, 'AI', 200000, 70, 72);

insert into educational_counsellor ( Name, Email, Location, Capacity, Course, Fee, percentage_In10th, percentage_In12th)
values ( 'Nehru Institute', 'Nehru@gmail.com', 'Kerala', 250, 'ECE', 200000, 70, 72);
insert into educational_counsellor ( Name, Email, Location, Capacity, Course, Fee, percentage_In10th, percentage_In12th)
values ( 'hru Institute', 'hru@gmail.com', 'Kerala', 250, 'AI', 200000, 70, 72);
insert into educational_counsellor ( Name, Email, Location, Capacity, Course, Fee, percentage_In10th, percentage_In12th)
values ( 'ruah Institute', 'ruah@gmail.com', 'Kerala', 250, 'EEE', 200000, 70, 72);
insert into educational_counsellor ( Name, Email, Location, Capacity, Course, Fee, percentage_In10th, percentage_In12th)
values ( 'ruth Institute', 'ruth@gmail.com', 'Kerala', 250, 'CSE', 200000, 70, 72);

insert into educational_counsellor ( Name, Email, Location, Capacity, Course, Fee, percentage_In10th, percentage_In12th)
values ( 'APJ Institute', 'Apj@gmail.com', 'Kerala', 250, 'ECE', 200000, 70, 72);
insert into educational_counsellor ( Name, Email, Location, Capacity, Course, Fee, percentage_In10th, percentage_In12th)
values ( 'APR Institute', 'Apr@gmail.com', 'Kerala', 250, 'AI', 200000, 70, 72);
insert into educational_counsellor ( Name, Email, Location, Capacity, Course, Fee, percentage_In10th, percentage_In12th)
values ( 'APD Institute', 'Apd@gmail.com', 'Kerala', 250, 'EEE', 200000, 70, 72);
insert into educational_counsellor ( Name, Email, Location, Capacity, Course, Fee, percentage_In10th, percentage_In12th)
values ( 'APM Institute', 'Apm@gmail.com', 'Kerala', 250, 'CSE', 200000, 70, 72);


insert into educational_counsellor ( Name, Email, Location, Capacity, Course, Fee, percentage_In10th, percentage_In12th)
values ('CMRIT Institute', 'cmrit@gmail.com', 'Bangalore', 100, 'AI', 120000, 75, 75);
insert into educational_counsellor ( Name, Email, Location, Capacity, Course, Fee, percentage_In10th, percentage_In12th)
values ( 'CMR Institute', 'cmr@gmail.com', 'Bangalore', 100, 'ECE', 120000, 75, 75);
insert into educational_counsellor ( Name, Email, Location, Capacity, Course, Fee, percentage_In10th, percentage_In12th)
values ( 'RIT Institute', 'rit@gmail.com', 'Bangalore', 100, 'EEE', 120000, 75, 75);
insert into educational_counsellor ( Name, Email, Location, Capacity, Course, Fee, percentage_In10th, percentage_In12th)
values ( 'VIT Institute', 'vit@gmail.com', 'Bangalore', 100, 'CSE', 120000, 75, 75);


insert into educational_counsellor ( Name, Email, Location, Capacity, Course, Fee, percentage_In10th, percentage_In12th)
values ( 'PES Institute', 'pes@gmail.com', 'Bangalore', 100, 'AI', 120000, 75, 75);
insert into educational_counsellor ( Name, Email, Location, Capacity, Course, Fee, percentage_In10th, percentage_In12th)
values ( 'PESSAT Institute', 'pessat@gmail.com', 'Bangalore', 100, 'ECE', 120000, 75, 75);
insert into educational_counsellor ( Name, Email, Location, Capacity, Course, Fee, percentage_In10th, percentage_In12th)
values ( 'SAT Institute', 'sat@gmail.com', 'Bangalore', 100, 'EEE', 120000, 75, 75);
insert into educational_counsellor ( Name, Email, Location, Capacity, Course, Fee, percentage_In10th, percentage_In12th)
values ( 'SUNDAY Institute', 'sun@gmail.com', 'Bangalore', 100, 'CSE', 120000, 75, 75);

insert into educational_counsellor ( Name, Email, Location, Capacity, Course, Fee, percentage_In10th, percentage_In12th)
values ('OXFORD College', 'oxford@gmail.com', 'Bangalore', 100, 'AI', 120000, 75, 75);
insert into educational_counsellor ( Name, Email, Location, Capacity, Course, Fee, percentage_In10th, percentage_In12th)
values ( 'OX College', 'ox@gmail.com', 'Bangalore', 100, 'EEE', 120000, 75, 75);
insert into educational_counsellor ( Name, Email, Location, Capacity, Course, Fee, percentage_In10th, percentage_In12th)
values ( 'FORD College', 'ford@gmail.com', 'Bangalore', 100, 'ECE', 120000, 75, 75);
insert into educational_counsellor ( Name, Email, Location, Capacity, Course, Fee, percentage_In10th, percentage_In12th)
values ( 'DUSK College', 'dusk@gmail.com', 'Bangalore', 100, 'CSE', 120000, 75, 75);


insert into educational_counsellor ( Name, Email, Location, Capacity, Course, Fee, percentage_In10th, percentage_In12th)
values ( 'GHI Institute', 'ghi@gmail.com', 'Pune', 100, 'CSE', 150000, 70, 75);
insert into educational_counsellor ( Name, Email, Location, Capacity, Course, Fee, percentage_In10th, percentage_In12th)
values ( 'HIGH Institute', 'high@gmail.com', 'Pune', 100, 'AI', 150000, 70, 75);
insert into educational_counsellor ( Name, Email, Location, Capacity, Course, Fee, percentage_In10th, percentage_In12th)
values ( 'DAY Institute', 'day@gmail.com', 'Pune', 100, 'EEE', 150000, 70, 75);
insert into educational_counsellor ( Name, Email, Location, Capacity, Course, Fee, percentage_In10th, percentage_In12th)
values ( 'CIT Institute', 'cit@gmail.com', 'Pune', 100, 'ECE', 150000, 70, 75);

insert into educational_counsellor ( Name, Email, Location, Capacity, Course, Fee, percentage_In10th, percentage_In12th)
values ( 'LMN Institute', 'lmn@gmail.com', 'Pune', 100, 'CSE', 150000, 70, 75);
insert into educational_counsellor ( Name, Email, Location, Capacity, Course, Fee, percentage_In10th, percentage_In12th)
values ( 'MBV Institute', 'MBV@gmail.com', 'Pune', 100, 'AI', 150000, 70, 75);
insert into educational_counsellor ( Name, Email, Location, Capacity, Course, Fee, percentage_In10th, percentage_In12th)
values ( 'JKH Institute', 'jkh@gmail.com', 'Pune', 100, 'EEE', 150000, 70, 75);
insert into educational_counsellor ( Name, Email, Location, Capacity, Course, Fee, percentage_In10th, percentage_In12th)
values ('XDR Institute', 'XDR@gmail.com', 'Pune', 100, 'ECE', 150000, 70, 75);

insert into educational_counsellor ( Name, Email, Location, Capacity, Course, Fee, percentage_In10th, percentage_In12th)
values ( 'DEF Institute', 'def@gmail.com', 'Pune', 100, 'CSE', 150000, 70, 75);
insert into educational_counsellor ( Name, Email, Location, Capacity, Course, Fee, percentage_In10th, percentage_In12th)
values ( 'STUDY Institute', 'study@gmail.com', 'Pune', 100, 'AI', 150000, 70, 75);
insert into educational_counsellor ( Name, Email, Location, Capacity, Course, Fee, percentage_In10th, percentage_In12th)
values ( 'ACE Institute', 'ace@gmail.com', 'Pune', 100, 'ECE', 150000, 70, 75);
insert into educational_counsellor ( Name, Email, Location, Capacity, Course, Fee, percentage_In10th, percentage_In12th)
values ( 'ARM Institute', 'arm@gmail.com', 'Pune', 100, 'EEE', 150000, 70, 75);
