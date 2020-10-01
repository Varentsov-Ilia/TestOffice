insert into Cabinets (Cabinet_ID,number,office_id) values (1,5,1);


select * from cabinets left join devices
where cabinets.cabinet_id = devices.cabinet_id;


select employees.* from employees join cabinets
where employees.cabinet_id = cabinets.cabinet_id and cabinets.number = 1;



