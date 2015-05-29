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
organization_id integer,
username character varying(30),
original_location integer,
current_location integer,
created_on timestamp,
created_by integer,
updated_on timestamp,
updated_by integer,
CONSTRAINT emp_pkey PRIMARY KEY (id)
);

CREATE SEQUENCE empdir.role_id_seq
INCREMENT 1
MINVALUE 1
MAXVALUE 9223372036854775807
CACHE 1;


CREATE TABLE empdir.roles
(
id integer NOT NULL,
name character varying(150),
CONSTRAINT role_pkey PRIMARY KEY (id)
);

CREATE SEQUENCE empdir.org_id_seq
INCREMENT 1
MINVALUE 1
MAXVALUE 9223372036854775807
CACHE 1;


CREATE TABLE empdir.organization
(
id integer NOT NULL,
name character varying(150),
CONSTRAINT organization_pkey PRIMARY KEY (id)
);

CREATE SEQUENCE empdir.loc_id_seq
INCREMENT 1
MINVALUE 1
MAXVALUE 9223372036854775807
CACHE 1;


CREATE TABLE empdir.location
(
id integer NOT NULL,
address character varying(300),
CONSTRAINT role_pkey PRIMARY KEY (id)
);
