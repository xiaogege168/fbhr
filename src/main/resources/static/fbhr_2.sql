select
    h.*,w.*,d.*,f.*
from worker w
         left outer join hours h  on h.workerId=w.idworker

         left outer join department d on w.departmentId = d.iddepartment

         left outer join factory f on d.factoryId = f.idfactory

order by w.idworker
select day(last_day(curdate()));

show PROCEDURE status ;
call test_a();
truncate  table hours;
show create procedure test_a ;
select * from hours where riqi=date_sub(curdate(),interval 1 day);
select * from mysql.
                  CREATE EVENT IF NOT EXISTS event_b
ON SCHEDULE EVERY 1 mon
    ON COMPLETION PRESERVE
update hours set gongshi=11 where riqi=date_sub(curdate(),interval 1 day) and qingjia=0;