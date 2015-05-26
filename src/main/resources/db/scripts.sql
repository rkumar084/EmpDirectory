CREATE SCHEMA empdir;

CREATE SEQUENCE empdir.emp_id_seq
INCREMENT 1
MINVALUE 1
MAXVALUE 9223372036854775807
CACHE 1;


CREATE TABLE empdir.employee
(
id integer NOT NULL,
name character varying(150),
emp_id integer,
mgr_id integer,
desk_phone_no character varying(15),
mobile_no character varying(15),
emergency_no character varying(15),
desk_no character varying(15),
email_id character varying(50),
role_id integer,
CONSTRAINT emp_pkey PRIMARY KEY (id)
);