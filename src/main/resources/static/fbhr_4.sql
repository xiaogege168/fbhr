update worker set passoword=123 where passoword is null;
insert into hours values(null,1,date_add(date_sub(curdate(),interval  day(curdate())-1 day) ,interval 1 day),0,0,0);
truncate table  hours;

show events ;
SHOW create event event_a;
drop event event_a;
CREATE EVENT IF NOT EXISTS event_a
    ON SCHEDULE EVERY 1 day starts date_add(curdate(),interval 1 minute )
    ON COMPLETION PRESERVE
    DO
    begin
        update hours set gongshi=11 where riqi=date_sub(curdate(),interval 1 day) and qingjia=0;
    end



