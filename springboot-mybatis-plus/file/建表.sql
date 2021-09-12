create table db2019.driver_real_amount_info
(
    id bigint auto_increment
        primary key,
    driver_id bigint not null comment '司机id',
    before_real_amount decimal(10,2) default 0.00 not null comment '刷入前的可提现金额',
    after_real_amount decimal(10,2) default 0.00 not null comment '刷入后的可提现金额',
    incr_amount decimal(10,2) default 0.00 not null comment '刷入金额',
    create_time timestamp default CURRENT_TIMESTAMP not null on update CURRENT_TIMESTAMP,
    update_time timestamp default CURRENT_TIMESTAMP not null
)
    comment '可提现金额刷入时的流水表';

create index idx_create_time
    on db2019.driver_real_amount_info (create_time);

create index idx_driver_id
    on db2019.driver_real_amount_info (driver_id);

create index idx_update_time
    on db2019.driver_real_amount_info (update_time);
