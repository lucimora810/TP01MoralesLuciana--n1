package ar.edu.unju.edm.model;

import org.springframework.stereotype.Component;

@Component
public class Most1 {
	int num;
	  String aux;
	  public void setNum(int num) {
	    this.num = num;
	  }
	  public int getNum() {
	    return num;
	  }
	  public String secu(){
	    String resultado="";
	    for(int i=20;num>=160;num=num-i){
	      aux=String.valueOf(num);
	      resultado= resultado + " " + aux;
	    }
	    return resultado;
	  }
	
}
