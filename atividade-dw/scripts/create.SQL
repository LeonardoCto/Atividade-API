Create table atividade.clientes(
id int auto_increment not null,
nome varchar(400) not null,
cpf char(11) not null,
telefone varchar(12) not null,
data_cadastro date not null,
constraint clientes_pk primary key (id)
);