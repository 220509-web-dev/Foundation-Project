


select * from "Employee";

select * from "Employee" e where "LastName" = 'King';

select * from "Employee" e where "FirstName" = 'Andrew' and "ReportsTo" = null;

insert into "Genre" ("GenreId", "Name")
values
(26, 'Orchestra'),
(27, 'Trap');


insert into "Employee" ("EmployeeId", "LastName", "FirstName", "Title", "Address", "City", "State", "Country", "PostalCode", "Email")
values 
(9, 'Wattson', 'Edison', 'HR', '320 Wilkshire Blvd', 'Las Vegas', 'NV', 'US', 00017, 'EdWatts@pro.com');

insert into "Employee" ("EmployeeId", "LastName", "FirstName", "Title", "Address", "City", "State", "Country", "PostalCode", "Email")
values 
(10, 'Tesla', 'Marconi', 'HR', '320 Wilkshire Blvd', 'New York', 'NY', 'US', 20017, 'Marc1tesla@pro.com');

select now ();

select *,
length("Name") 
as Length from "MediaType" 
where "MediaTypeId" = 2;


select * from "Invoice" i where 
("Total" > 15);

select * from "Invoice" i where 
("BillingAddress" < 'T')

select avg("Total") from "Invoice" i;

select max("UnitPrice") from "Track" t; 

update "Artist" set 
"Name" = 'CCR'
where  "ArtistId" = 76;

update "Customer" 
set "FirstName" = 'Robert', "LastName" = 'Walter'
where "CustomerId" = 32; 

select "AlbumId", "Title", "ArtistId"
from "Album" a 
order by "AlbumId", "Title", "ArtistId" desc; 

select "FirstName" 
from "Customer" c 
order by "FirstName" asc;

select * 
from "Invoice" i 
where ("Total") between 15 and 50;

select * 
from "Employee" e 
where ("HireDate") between '2003-06-01' and '2004-03-01';

 

select "FirstName", "InvoiceId" 
from "Customer" 
inner join "Invoice"  
on "SupportRepId" = "InvoiceId" 
order by "FirstName" desc;


select "Name", "Title" 
from "Artist"  
right join "Album"  
on "Artist_Id" = "AlbumId"; 

select * 
from "Album" a 
cross join "Artist" a2 
order by "Name" asc;

delete from "InvoiceLine" where "InvoiceId" 
	in 
		(select "InvoiceId" from "Invoice" i where "CustomerId" = 32 );

delete from "Invoice" 
where "CustomerId" = 32; 

delete from "Customer" 
where "FirstName" = 'Robert' and "LastName" = 'walter';



