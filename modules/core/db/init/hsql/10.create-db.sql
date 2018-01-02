-- begin SAMPLE_PERSON
create table SAMPLE_PERSON (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    ADDRESS_LINE1 varchar(255),
    ADDRESS_LINE2 varchar(255),
    ADDRESS_CITY varchar(255),
    ADDRESS_ZIP varchar(20),
    --
    NAME varchar(255),
    --
    primary key (ID)
)^
-- end SAMPLE_PERSON
