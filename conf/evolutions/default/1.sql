# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table person (
  id                            bigint not null,
  name                          varchar(255),
  constraint pk_person primary key (id)
);
create sequence person_seq;


# --- !Downs

drop table if exists person;
drop sequence if exists person_seq;

