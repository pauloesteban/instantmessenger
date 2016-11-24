drop procedure obtenerDatosLogin;
DELIMITER //
CREATE PROCEDURE obtenerDatosLogin(
	IN usserV VARCHAR(20)
)
BEGIN
	SELECT id_usuario, nick, correo FROM tb_usuarios WHERE tb_usuarios.nick = usserV or tb_usuarios.correo = usserV;
END; //
DELIMITER ;

DELIMITER //
CREATE PROCEDURE nuevo_usuario (
	IN nickV varchar(45),
    IN correoV varchar(45),
    in passV varchar(45))
BEGIN
	INSERT INTO tb_usuarios(nick, correo, contraseña, idActivo) VALUES (nickV, correoV, passV, 1);
END; //
DELIMITER ;



CALL obtenerDatosLogin('Reygen');
    
    