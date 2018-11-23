create table Client (
id INT NOT NULL auto_increment, 
full_name varchar(20) default NULL,
service  varchar(20) default NULL,
appointment datetime default NULL,
phone varchar(20) default NULL, primary key (id)
);