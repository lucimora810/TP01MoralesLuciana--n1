package ar.edu.unju.edm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import ar.edu.unju.edm.model.Principal;
import ar.edu.unju.edm.model.AñoBisiesto_2;
import ar.edu.unju.edm.model.NumeroPar_3;
import ar.edu.unju.edm.model.MesdelAño_4;
import ar.edu.unju.edm.model.Switch_5;
import ar.edu.unju.edm.model.While_6;
import ar.edu.unju.edm.model.For_7;
import ar.edu.unju.edm.model.DoWhile_8;
import ar.edu.unju.edm.model.MostrarFor_9;
import ar.edu.unju.edm.model.MostrarWhile_10;
import ar.edu.unju.edm.model.MostrarDoWhile_11;

@SpringBootApplication
public class Tp01MoralesLuciana1Application {

	public static void main(String[] args) {
		SpringApplication.run(Tp01MoralesLuciana1Application.class, args);
		//punto1
		Principal factorPrincipal = new Principal();
		factorPrincipal.setNum(4);
		System.out.println("El factorial es " + factorPrincipal.ResolverFac());
		//punto2
		AñoBisiesto_2 Bisiesto = new AñoBisiesto_2();
		Bisiesto.setAnio(2020);
		System.out.println("El aÃ±o es " + Bisiesto.Bi());
		//punto3
		NumeroPar_3 Par=new NumeroPar_3();
		int aux=3;
		for(int i=0;i<5;i++){
			Par.setNum(aux);
			System.out.println("El numero es "+ Par.par());
			aux=aux+3;
		}
		//punto4
		MesdelAño_4 mes = new MesdelAño_4();
		mes.setNum(11);
		System.out.println(mes.Mes());
		//punto5
		Switch_5 mess = new Switch_5();
		mess.setNum(13);
		System.out.println(mess.Mes());
		//punto6
		While_6 Nota = new While_6();
		aux=7;
		while(aux>0){
			Nota.setNum(aux);
			System.out.println(Nota.nota());
			aux--;
		}
		//punto7
		For_7 Secuencia = new For_7();
		Secuencia.setNum(117);
		System.out.println(Secuencia.secuencia());
		//punto8
		DoWhile_8 Secuencia2 = new DoWhile_8();
		Secuencia2.setNum(4);
		System.out.println(Secuencia2.secuencia());
		//punto9
		MostrarFor_9 Secuencia3 = new MostrarFor_9();
		Secuencia3.setNum(320);
		System.out.println(Secuencia3.secuencia());
		//punto10
		MostrarWhile_10 Secuencia4 = new MostrarWhile_10();
		Secuencia4.setNum(320);
		System.out.println(Secuencia4.secuencia());
		//punto11
		MostrarDoWhile_11 Secuencia5 = new MostrarDoWhile_11();
		Secuencia5.setNum(320);
		System.out.println(Secuencia5.secuencia());
	}

}
