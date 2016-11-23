use `mensajeria.database`;
SHOW TABLES;
SET AUTOCOMMIT = 1;
SELECT * FROM tb_usuarios;

INSERT INTO tb_usuarios(nick, correo, contraseña, idActivo) VALUES ('Reygen', 'reygen@reygen', 'prueba1', 1);

call obtenerDatosLogin(Reygen);