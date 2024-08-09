package org.repasodelcursojavabasico.desarroladorJavaBasico;

import lombok.*;

// Uso de lombok
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Libro {

	@Getter @Setter private String nombre;
	@Getter @Setter private String autor;
	@Getter @Setter private int isbn;
	
}
