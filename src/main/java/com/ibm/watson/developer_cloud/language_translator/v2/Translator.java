package com.ibm.watson.developer_cloud.language_translator.v2;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

import com.ibm.watson.developer_cloud.language_translator.v2.model.Language;
import com.ibm.watson.developer_cloud.language_translator.v2.model.TranslationResult;

public class Translator extends HttpServlet{
	

	public String traducir(String pTraducir) throws ServletException, IOException
	 {	
		 LanguageTranslator service = new LanguageTranslator();
		 service.setUsernameAndPassword("1c2f9171-71d3-4e32-8bcb-01794b46c094",  "wA8w3nSU0P8g");
		 /*service.setUsernameAndPassword("0e44aad4-6d93-4561-a6c5-e331b24c1e1e",  "BvNxGHkB0MUP");*/
		 System.out.print("1-Hola:");
		 TranslationResult result = service.translate("Hola", Language.SPANISH,Language.ENGLISH ).execute();
		 String lineaTraducida= result.getTranslations().get(0).getTranslation().toString();
	     System.out.println(lineaTraducida);
		 System.out.println("");
		 System.out.print("2-Hello:");
		 TranslationResult result2 = service.translate("Hello", Language.ENGLISH,Language.SPANISH ).execute();
	     String lineaTraducida2= result2.getTranslations().get(0).getTranslation().toString();
	     System.out.println(lineaTraducida2);
	     System.out.println("");
		 System.out.print("3-Hola:");
		 TranslationResult result3 = service.translate("Hola", Language.SPANISH,Language.FRENCH ).execute();
	     String lineaTraducida3= result3.getTranslations().get(0).getTranslation().toString();
	     System.out.println(lineaTraducida3);
	     System.out.println("");
		 System.out.print("4-Hello:");
		 TranslationResult result4 = service.translate("Hello", Language.ENGLISH,Language.PORTUGUESE ).execute();
	     String lineaTraducida4= result4.getTranslations().get(0).getTranslation().toString();
	     System.out.println(lineaTraducida4);
	     return lineaTraducida;
	   
	 }

	 public static void main(String[] args) throws ServletException, IOException {
		 Translator s2t=new Translator();
		 s2t.traducir("obligaciones del personal del laboratorio");
	}
	 
	 
}