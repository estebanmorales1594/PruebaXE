package LogicaDeNegocios;

import java.io.File;

import javax.servlet.http.HttpServlet;

import com.ibm.watson.developer_cloud.visual_recognition.v3.model.ClassifyImagesOptions;
import com.ibm.watson.developer_cloud.visual_recognition.v3.model.VisualClassification;

public class Recognition extends HttpServlet {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public VisualClassification reconocimiento(){
		VisualRecognition service = new VisualRecognition(VisualRecognition.VERSION_DATE_2016_05_20);
		service.setApiKey("02bbd8abdec2b8bd70acddca8dcd6d4f3011dee5");
	
		System.out.println("Classify an image");
		ClassifyImagesOptions options = new ClassifyImagesOptions.Builder()
		    .images(new File("D:/equipo3.jpg"))
		    .build();
		VisualClassification result = service.classify(options).execute();
		System.out.println(result);
		return result;
	}
	
	public static void main(String[] args){
		Recognition rct = new Recognition();
		rct.reconocimiento();
	}
}
