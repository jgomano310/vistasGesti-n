package edu.dws.gestionMaterialVistas.aplicacion;

import java.sql.DriverManager;

import javax.sql.DataSource;

import org.hibernate.cfg.Environment;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan
@PropertySource("propiedades.properties")
@EnableJpaRepositories("/gestionMaterialVistas/src/main/java/edu/dws/gestionMaterialVistas/aplicacion/servicios")

public class AplicacionConfiguracionContexto {
	private Environment contexto;
	@Bean
	public DataSource data() {
		
		DriverManagerDataSource datasource = new DriverManagerDataSource();
		
		return datasource;
		
	}

}
