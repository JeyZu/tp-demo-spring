CREATE TABLE PRODUCTS (
	id identity,
	name varchar(255) not null,
	description varchar(255) not null,
	image_url varchar(255) not null,
	price decimal not null,
	created_on date not null,
	seller_id bigint
	
);

