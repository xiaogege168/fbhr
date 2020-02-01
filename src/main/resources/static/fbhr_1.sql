select  * from hours where gongshi!=0;
show events ;
show create event event_a
truncate  table hours;
select count(hours.jiezi) from hours;
select count(idhours) from hours group by   workerId;
select * from hours where workerId=1;
update hours set gongshi=11 where day(riqi)=31
select max(idhours) from hours;
call test_a();
call test_b();
show create event event_b;
select
    h.*,w.*,sum(jiezi) jieziPlus,sum(gongshi) gongshiPlus
from hours h ,worker w
where workerId = 1
  and idworker = 1

drop event event_b;
CREATE EVENT IF NOT EXISTS event_b
    ON SCHEDULE EVERY 1 month starts  '2020-01-31 03:16:00'

    ON COMPLETION PRESERVE
    DO
    begin
        call test_a();
    end

    select
    w.*,d.*,f.*,d.name departmentName,f.name factoryName
    from worker w

    left outer join department d on w.departmentId = d.iddepartment

    left outer join factory f on d.factoryId = f.idfactory

    where idworker =1;

select
    h.*,w.*
from hours h right outer join worker w
                              on workerId=idworker and qingjia=1
