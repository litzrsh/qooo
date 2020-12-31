drop table if exists
    lz_serial,
    lz_user,
    lz_user_author,
    lz_author;

create table lz_serial
(
    serial_id  varchar(100) not null,
    serial_val bigint       not null default 0,
    updt_dt    timestamp    not null default current_timestamp,
    constraint pk_lz_serial primary key (serial_id)
);

create table lz_user
(
    user_id           bigint      not null,
    login_id          varchar(100),
    login_pwd         varchar(1024),
    user_nm           varchar(100),
    user_gender       varchar(40),
    user_email        varchar(100),
    user_prof_img_url varchar(1000),
    user_identify     varchar(1024),
    status            varchar(40) not null,
    use_yn            char(1)     not null default 'Y',
    expr_yn           char(1)     not null default 'N',
    del_yn            char(1)     not null default 'N',
    last_login_dt     timestamp,
    last_chg_pwd_dt   timestamp,
    regist_dt         timestamp   not null default current_timestamp,
    regist_id         bigint      not null default -1,
    updt_dt           timestamp   not null default current_timestamp,
    updt_id           bigint      not null default -1,
    constraint pk_lz_user primary key (user_id)
);

create
unique index udx_lz_user_login_id on lz_user (upper(login_id));

create
unique index udx_lz_user_email on lz_user (upper(user_email));

create
unique index udx_lz_user_identify on lz_user (upper(user_identify));

create table lz_user_author
(
    user_id   bigint    not null,
    author_id bigint    not null,
    regist_dt timestamp not null default current_timestamp,
    regist_id bigint    not null default -1,
    updt_dt   timestamp not null default current_timestamp,
    updt_id   bigint    not null default -1,
    constraint pk_lz_user_author primary key (user_id, author_id)
);

create table lz_author
(
    author_id bigint      not null,
    author_ty varchar(40) not null,
    author_nm varchar(100),
    author_dc text,
    use_yn    char(1)     not null default 'Y',
    regist_dt timestamp   not null default current_timestamp,
    regist_id bigint      not null default -1,
    updt_dt   timestamp   not null default current_timestamp,
    updt_id   bigint      not null default -1,
    constraint pk_lz_author primary key (author_id)
);