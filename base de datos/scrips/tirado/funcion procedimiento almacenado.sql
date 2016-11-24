delimiter $
create procedure insertar( in nomb varchar(150), in corr varchar(150), in contr varchar(150))

begin
	insert into tb_usuarios (nick,correo,contraseña) values(id_us,nomb,corr,contr);
end $