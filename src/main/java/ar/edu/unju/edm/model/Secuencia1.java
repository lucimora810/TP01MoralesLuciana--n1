package ar.edu.unju.edm.model;

import org.springframework.stereotype.Component;

@Component

public class Secuencia1 {
	int num,aux=37;
	  public void setNum(int num) {
	    this.num = num;
	  }
	  public int getNum() {
	    return num;
	  }
	  public String secu(){
	    String resultado="",aux1;
	    int i=2;
	     for(int j=40;j>0;j--){
	      aux1=String.valueOf(num);
	      resultado=resultado + " " + aux1;
	      if(aux==0){
	        num=num-aux;
	        aux=aux+i;
	      }else{
	        num=num+aux;
	        aux=aux-i;
	      }
	      
	    }
	    return resultado;
	  }

}
