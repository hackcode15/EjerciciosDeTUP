package jdbc.usodeljdbc;

import lombok.*;
import java.util.*;

/*
create table clientes (
	dni int not null, -- No acepta valores nulos
  	nombre varchar(100) not null, -- No acepta valores nulos
  	apellido varchar(100),
   	fecha_nac date,
   	telefono varchar(15),
   	primary key(dni) -- Definimos el 'dni' como la clave primaria
);
*/

@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Cliente {

	@Getter @Setter private int dni;
	@Getter @Setter private String nombre;
	@Getter @Setter private String apellido;
	@Getter @Setter private Date fecha_nac;
	@Getter @Setter private String telefono;
	
}
