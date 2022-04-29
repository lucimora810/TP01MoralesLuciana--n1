package ar.edu.unju.edm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ar.edu.unju.edm.model.NotaAlumno;
import ar.edu.unju.edm.model.Bisiesto;
import ar.edu.unju.edm.model.Tiempo;
import ar.edu.unju.edm.model.Factorial;
import ar.edu.unju.edm.model.Mes;
import ar.edu.unju.edm.model.Most3;
import ar.edu.unju.edm.model.Most1;
import ar.edu.unju.edm.model.Most2;
import ar.edu.unju.edm.model.Par_Impar;
import ar.edu.unju.edm.model.Secuencia1;
import ar.edu.unju.edm.model.Secuencia2;

@SpringBootApplication
public class Tp01MoralesLuciana1Application {

	public static void main(String[] args) {
		SpringApplication.run(Tp01MoralesLuciana1Application.class, args);

		//prueba punto1
		Factorial factoPrincipal = new Factorial();
		factoPrincipal.setNum(4);
		System.out.println("El factorial es " + factoPrincipal.main());

		//prueba punto2
		Bisiesto biBisiesto = new Bisiesto();
		biBisiesto.setanio(2020);
		System.out.println("El año " + biBisiesto.Bi());

		//prueba punto3
		Par_Impar ppar = new Par_Impar();
		int aux=3;
		for(int i=0;i<5;i++){
			ppar.setNum(aux);
			System.out.println("El numero es "+ ppar.par());
			aux=aux+3;
		}

		//prueba punto4
		Mes mmes = new Mes();
		mmes.setNum(13);
		System.out.println(mmes.ME());

		//prueba punto6
		NotaAlumno nnota = new  NotaAlumno();
		aux=8;
		while(aux>0){
			nnota.setNum(aux);
			System.out.println(nnota.nota());
			aux--;
		}

		//prueba punto7
		Secuencia1 ssecuencia = new Secuencia1();
		ssecuencia.setNum(80);
		System.out.println(ssecuencia.secu());

		//prueba punto8
		Secuencia2 ssecuencia2 = new Secuencia2();
		ssecuencia2.setNum(4);
		System.out.println(ssecuencia2.secu());

		//prueba punto9
		Most1 ssecuencia3 = new Most1();
		ssecuencia3.setNum(320);
		System.out.println(ssecuencia3.secu());

		//prueba punto10
		Most2 ssecuencia4 = new Most2();
		ssecuencia4.setNum(320);
		System.out.println(ssecuencia4.secu());

		//prueba punto11
		Most3 ssecuencia5 = new Most3();
		ssecuencia5.setNum(320);
		System.out.println(ssecuencia5.secu());

		//prueba punto12
		Tiempo ttiempo = new Tiempo();
		ttiempo.setNum(6);
		System.out.println(ttiempo.formula());

	}

}
