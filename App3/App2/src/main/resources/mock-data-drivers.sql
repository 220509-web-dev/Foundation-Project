set search_path to Transportations;

insert into driver_roles (name) values ('class a'), ('class b'), ('class c');

insert into Drivers (first_name, last_name, email, username, password, role_id)
values 
    ('Bryan', 'Carter', 'B.Carter@gmail', 'BCart', 'welcome1', 3),
    ('Jimmy', 'Jim', 'Slim.Jim@gmail', 'JJim', 'welcome1', 2);