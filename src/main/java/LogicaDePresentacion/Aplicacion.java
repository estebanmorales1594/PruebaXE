package LogicaDePresentacion;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.sound.sampled.LineUnavailableException;

import LogicaDeNegocios.Recognition;
import LogicaDeNegocios.Speech;
import LogicaDeNegocios.Translator;


public class Aplicacion {

	public static void main(String[] args) throws LineUnavailableException, InterruptedException, ServletException, IOException  {
		Speech ss = new Speech();
		ss.voz_a_texto();
		
		Translator s2t=new Translator();
		s2t.traducir("obligaciones del personal del laboratorio");
		
		Recognition rct = new Recognition();
		rct.reconocimiento();
	}
	
}
