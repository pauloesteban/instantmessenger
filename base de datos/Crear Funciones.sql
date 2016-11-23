DELIMITER //
CREATE FUNCTION verificar_login (usser varchar(20), pass varchar(20)) RETURNS bit
BEGIN
	IF EXISTS(select * from tb_usuarios where ((tb_usuarios.nick = usser) or (tb_usuarios.correo = usser)) and (tb_usuarios.contraseña = pass) and (tb_usuarios.idActivo = 1)) THEN
		RETURN 1;
	ELSE
		RETURN 0;
   END IF;
END//
DELIMITER ;

