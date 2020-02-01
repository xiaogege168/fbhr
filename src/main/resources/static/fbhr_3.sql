select
    h.*,w.*
from hours h ,worker w
where workerId =1 and w.idworker=1

drop procedure if exists test_a;
CREATE PROCEDURE test_a()
BEGIN
    DECLARE  id int default  1;            #主键 工人ID#
    declare  day_id int  default 0; #日期加1#
    declare  num int  default  day(last_day(curdate())) ;    #每个工人循环31次#
    declare  temp int default 0;      #temp被赋值为N,为机构创建N条预约数#
    while id<100 DO
            SET temp=num;
            while temp>0 DO
                    #                         insert into hours values(null,id,date_sub(current_timestamp,interval  day(curdate())-1 day),0,0,0);
                    insert into hours values(null,id,date_add(date_sub(curdate(),interval  day(curdate())-1 day) ,interval day_id day),0,0,0);
                    SET temp=temp-1;
                    SET day_id=day_id+1;
                end WHILE;
            SET day_id=0;
            set id=id+1;
        END WHILE;

END

