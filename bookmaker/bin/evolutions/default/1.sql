# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table book_maker_table (
  id                            bigserial not null,
  url                           varchar(255) not null,
  memo                          varchar(255),
  image                         varchar(255),
  users_id                      bigint,
  constraint pk_book_maker_table primary key (id)
);

create table users (
  id                            bigserial not null,
  user_name                     varchar(255) not null,
  password                      varchar(255) not null,
  full_name                     varchar(255) not null,
  constraint uq_users_user_name unique (user_name),
  constraint pk_users primary key (id)
);

alter table book_maker_table add constraint fk_book_maker_table_users_id foreign key (users_id) references users (id) on delete restrict on update restrict;
create index ix_book_maker_table_users_id on book_maker_table (users_id);


# --- !Downs

alter table if exists book_maker_table drop constraint if exists fk_book_maker_table_users_id;
drop index if exists ix_book_maker_table_users_id;

drop table if exists book_maker_table cascade;

drop table if exists users cascade;

