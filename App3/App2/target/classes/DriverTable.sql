
Create schema Transportations;
Set search_path to Transportations;
Create table driver_roles (
 id int generated always as identity primary key, 
 name varchar unique not null
);

create table Drivers (
     id int generated always as identity primary key, 
     first_name varchar not null, 
     last_name varchar not null,
     email varchar unique not null, 
     username varchar unique not null check (length(username) >=4),
     password varchar not null check (length(password) >= 8), 
     role_id int,
     

constraint Drivers_pk
foreign key (role_id)
references driver_roles(id)
);

create table Vehicles (
    id int generated always as identity primary key, 
     name varchar unique not null
);

create table boats (
     id int generated always as identity primary key, 
     question_text varchar not null,
     answer_text varchar not null, 
     difficulty int default 1 check (difficulty >0 and difficulty <=10),
     creator_id int,
     category_id int, 
    
     constraint boats_fk
     foreign key (creator_id)
     references Vehicles(id)
    );

create table Cars (
    id int generated always as identity primary key, 
     name varchar not null, 
     owner_id int, 
     category_id int,

     constraint Cars_fk
     foreign key (owner_id) 
     references Drivers(id),
    
     constraint Cars_vehicle_fk
     foreign key (category_id) 
     references Vehicles(id) 
);


