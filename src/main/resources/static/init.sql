CREATE SEQUENCE core.users_id_seq MINVALUE 1 START 1;

create table core.users (
	id BIGINT DEFAULT nextval('core.users_id_seq') PRIMARY KEY,
	username VARCHAR(254),
	password VARCHAR(254)
);