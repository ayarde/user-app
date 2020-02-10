insert into user (username, password, enable, name, lastname, email) values ('pepe','$2a$10$pUwD7gVBktPYN6AZEaO3vOdoJcsRo2iGa6KxDq2.NVHMHPwXy1U7K',1,'Sapo','Pepe','sapo.pepe@gmail.com');
insert into user (username, password, enable, name, lastname, email) values ('pepe_lui','$2a$10$WKlz2dFRIbTsB.ENU22z0.VCbg9.GNsKrmAporZ.AvU0UAp3RM5vi',1,'Pepe','Lui','pepe.lui@gmail.com');

insert into role (name) values ('ROLE_USER');
insert into role (name) values ('ROLE_ADMIN');

insert into user_role (user_id, role_id) values (1,1);
insert into user_role (user_id, role_id) values (2,2);
insert into user_role (user_id, role_id) values (2,1);
