create table Application_User(
	user_identifier int not null auto_increment,
	user_first_name varchar(20) not null,
	user_last_name varchar(20) not null,
	dob date,
	age int,
	created_date date,
	created_by int,
	last_modified_date date,
	last_modified_by int,
	primary key(user_identifier)
);