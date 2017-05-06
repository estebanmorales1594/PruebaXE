package Integracion;


	import java.util.Arrays;

	import com.google.api.services.translate.Translate;
	import com.google.api.services.translate.model.TranslationsListResponse;
	import com.google.api.services.translate.model.TranslationsResource;
import com.ibm.watson.developer_cloud.language_translator.v2.LanguageTranslator;
import com.ibm.watson.developer_cloud.language_translator.v2.model.Language;
import com.ibm.watson.developer_cloud.language_translator.v2.model.TranslationResult;

	public class Traductor {
		
		String linea=null;
		
		public String Traduccion(String pTraducir){
			 LanguageTranslator service = new LanguageTranslator();
			 service.setUsernameAndPassword("1c2f9171-71d3-4e32-8bcb-01794b46c094",  "wA8w3nSU0P8g");
			 /*service.setUsernameAndPassword("0e44aad4-6d93-4561-a6c5-e331b24c1e1e",  "BvNxGHkB0MUP");*/
			 TranslationResult result = service.translate(pTraducir, Language.SPANISH,Language.ENGLISH ).execute();
			 String lineaTraducida= result.getTranslations().get(0).getTranslation().toString();
		     
			 return lineaTraducida;
	    }


	   // public static void main(String[] args) { }
	}
