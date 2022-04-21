package ar.edu.unju.edm.model;

import org.springframework.stereotype.Component;

@Component
public class AñoBisiesto_2 {
	int anio;
	public int getAnio() {
		return anio;
	}
	public void setAnio(int anio) {
		this.anio=anio;
	}
	public String Bi(){
		String bisiesto="";
		if(((anio%4==0) || (anio%400==0)) && (anio%100!=0)){
			bisiesto="Si es Bisiesto";
			}else{
		      bisiesto="No es bisiesto";
		      }return bisiesto;
    }

}
