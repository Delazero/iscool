create table pessoa(
	id serial primary key,
	nome varchar(200) not null,
	rg varchar(12) not null,
	cpf varchar(14),
	tipo int not null, -- 0 = Docente, 1 = Discente, 2 = Funcionario
	email varchar(100) not null,
	senha varchar(100) not null
);