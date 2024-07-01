package net.dav.dependency.injection.dependencyinjection;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DependencyinjectionApplication implements CommandLineRunner{

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(DependencyinjectionApplication.class, args);
		//SpringApplication.run(DependencyinjectionApplication.class, args);
		Veicolo v = ctx.getBean(Veicolo.class); //sfruttiamo il ctx, adesso esiste una istanza di veicolo, una sola (il bean veicolo)
		System.out.println(v.getMotore().getId());//inizialmente da un problema perche abbiamo creato i bean ma l'istanza di motore non è stata iniettata all'intenro di veicolo
	}

	@Override
	public void run(String... args) throws Exception{


		
		//Veicolo v = new Veicolo();
		//System.out.println(v.getMotore().getId());
		// le due classi veicolo e motore devono diventare dei Bean altmenti 
		// non verranno istanziati (adesso stavamo istanziando noi veicolo all'interno
		// di run e motore all'interno della classe veicolo) adesso dobbiamo 
		// quindi fare in modo che sia Spring a istanziarli tramite i Bean 
	}

}
