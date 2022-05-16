package ar.edu.unju.edm.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ar.edu.unju.edm.model.Bisiesto;
import ar.edu.unju.edm.model.Factorial;
import ar.edu.unju.edm.model.Mes;
import ar.edu.unju.edm.model.Most1;
import ar.edu.unju.edm.model.Most2;
import ar.edu.unju.edm.model.Most3;
import ar.edu.unju.edm.model.NotaAlumno;
import ar.edu.unju.edm.model.Par_Impar;
import ar.edu.unju.edm.model.Secuencia1;
import ar.edu.unju.edm.model.Secuencia2;
import ar.edu.unju.edm.model.Tiempo;

@Controller
public class PrincipalController {
	@GetMapping("/Menu")
	  public String GetMenu(){
	    return "index";
	
	}
	//punto1
	  @GetMapping("/Factorial") 
	  public String getFactorialpage(@RequestParam (name = "num") int num, Model model){
	    int Factorial=1;
	    Factorial factoPrincipal = new Factorial();
	    factoPrincipal.setNum(num);
	    Factorial= factoPrincipal.main();
	    model.addAttribute("Factorial", Factorial);
	    return "P1";
	  }
	//punto2
	  @GetMapping("/AnioBisiesto")
	  public String getBiPage(@RequestParam (name = "num") int num, Model model){
	    String ABisiesto;
	    Bisiesto biBisiesto = new Bisiesto();
	    biBisiesto.setanio(num);
	    ABisiesto = biBisiesto.Bi();
	    model.addAttribute("ABisiesto", ABisiesto);
	    return "P2";
	  }
	  //punto3
	  @GetMapping("/NumeroPar")
	  public String getparPage(@RequestParam (name = "num") int num,Model model){
	    String[] Aux1= new String[5];
	    Par_Impar ppar = new Par_Impar();
			for(int i=0;i<5;i++){
				ppar.setNum(num);
				Aux1[i] = ppar.par();
	      model.addAttribute("par1", Aux1[0]);
	      model.addAttribute("par2", Aux1[1]);
	      model.addAttribute("par3", Aux1[2]);
	      model.addAttribute("par4", Aux1[3]);
	      model.addAttribute("par5", Aux1[4]);
				num=num+3;
			}
	    return "P3";
	  }
	//punto4
	  @GetMapping("/MesdeAnio")
	  public String getmesPage(@RequestParam (name = "num") int num,Model model){
	    String aux;
	    Mes mmes = new Mes();
	    mmes.setNum(num);
			aux = mmes.ME();
	    model.addAttribute("me", aux);
	    return "P4";
	  }

	//punto6
	  @GetMapping("/NotaAlumno")
	  public String getnotaPage(@RequestParam (name = "num") int num,Model model){
	    String[] Aux1= new String[8];
	    NotaAlumno nnota = new NotaAlumno();
			for(int i=0;i<8;i++){
				nnota.setNum(num);
				Aux1[i] = nnota.nota();
	      model.addAttribute("nota1", Aux1[0]);
	      model.addAttribute("nota2", Aux1[1]);
	      model.addAttribute("nota3", Aux1[2]);
	      model.addAttribute("nota4", Aux1[3]);
	      model.addAttribute("nota5", Aux1[4]);
	      model.addAttribute("nota6", Aux1[5]);
	      model.addAttribute("nota7", Aux1[6]);
	      model.addAttribute("nota8", Aux1[7]);
				num--;
			}
	    return "P6";
	  }

	  //punto7
	  @GetMapping("/Secuencia_1")
	  public String getsecuPage(@RequestParam (name = "num") int num,Model model){
	    String Aux;
	    Secuencia1 secu = new Secuencia1();
	    secu.setNum(num);
	    Aux = secu.secu();
	    model.addAttribute("secu", Aux);
	    return "P7";
	  }

	  //punto8
	  @GetMapping("/Secuencia_2")
	  public String getsecu2Page(@RequestParam (name = "num") int num,Model model){
	    String Aux;
	    Secuencia2 secu2 = new Secuencia2();
	    secu2.setNum(num);
	    Aux = secu2.secu();
	    model.addAttribute("secu2", Aux);
	    return "P8";
	  }

	  //punto9
	  @GetMapping("/Mostrar_1")
	  public String getsecu3Page(@RequestParam (name = "num") int num,Model model){
	    String Aux;
	    Most1 most1 = new Most1();
	    most1.setNum(num);
	    Aux = most1.secu();
	    model.addAttribute("most1", Aux);
	    return "P9";
	  }

	  //punto10
	  @GetMapping("/Mostrar_2")
	  public String getsecu4Page(@RequestParam (name = "num") int num,Model model){
	    String Aux;
	    Most2 most2 = new Most2();
	    most2.setNum(num);
	    Aux = most2.secu();
	    model.addAttribute("most2", Aux);
	    return "P10";
	  }

	  //punto11
	  @GetMapping("/Mostrar_3")
	  public String getsecu5Page(@RequestParam (name = "num") int num, Model model){
	    String Aux;
	    Most3 most3 = new Most3();
	    most3.setNum(num);
	    Aux = most3.secu();
	    model.addAttribute("most3", Aux);
	    return "P11";
	  }

	  //punto12
	  @GetMapping("/Tiempo")
	  public String gettiempoPage(@RequestParam (name = "num") int num,Model model){
	    String aux;
	    Tiempo tiemp = new Tiempo();
	    tiemp.setNum(num);
	    aux = tiemp.formula();
	    model.addAttribute("tempo", aux);
	    return "P12";
	  }
	  



}
