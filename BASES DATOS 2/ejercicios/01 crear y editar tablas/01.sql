create table articles(
    codi_article varchar(50),
    descripcio varchar(200),
    preu_cost int,
    preu_venda int,
    primary key (codi_article)
);

create table clients(
    codi_client varchar(50),
    empresa varchar(200),
    adreca varchar(200),
    poblacio varchar(200),
    primary key (codi_client)
);

create table comercial(
    codi_comercial varchar(50),
    nom varchar(200),
    cognoms varchar (200),
    adreca varchar(200),
    poblacio varchar(200),
    primary key (codi_comercial)
);

create table vendes(
    codi_client varchar(50),
    codi_article varchar(50),
    unitats int,
    facturat boolean,
    comercial varchar(50),
    data_venda date,
    primary key (codi_client, codi_article),
    foreign key (codi_client) references clients(codi_client),
    foreign key (codi_article) references articles(codi_article),
    foreign key (comercial) references comercial(codi_comercial)
);

alter table comercial add provincia varchar(9) default 'Barcelona';

update articles set preu_venda = preu_venda * 1.12;

delete from comercial where poblacio = "Piera";

alter table vendes drop facturat;

drop table comercial;