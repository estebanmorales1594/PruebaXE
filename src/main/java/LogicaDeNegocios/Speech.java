package LogicaDeNegocios;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.TargetDataLine;

import com.ibm.watson.developer_cloud.http.HttpMediaType;
import com.ibm.watson.developer_cloud.speech_to_text.v1.model.RecognizeOptions;
import com.ibm.watson.developer_cloud.speech_to_text.v1.model.SpeechResults;
import com.ibm.watson.developer_cloud.speech_to_text.v1.websocket.BaseRecognizeCallback;

public class Speech  extends HttpServlet {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	SpeechResults transcript;

	public String voz_a_texto() throws LineUnavailableException, InterruptedException
	{
		
		String texto;
		int sampleRate = 16000;
		
		SpeechToText s2t = new SpeechToText();
		s2t.setUsernameAndPassword("4a76e4e6-2f33-424f-a847-c06e5d3551f0", "tJwskp6qa47O");
		/*s2t.setUsernameAndPassword("9fec7f24-611b-4a32-90d9-4ebeb66022a0", "7gJVErqKulgx");*/

		 AudioFormat format = new AudioFormat(sampleRate, 16, 1, true, false);
		 DataLine.Info info = new DataLine.Info(TargetDataLine.class, format);
		 if (!AudioSystem.isLineSupported(info))
		 {
		     System.out.println("Line not supported");
		     System.exit(0);
		  }
		 TargetDataLine line = (TargetDataLine) AudioSystem.getLine(info);
		 line.open(format);
		 line.start();
		 AudioInputStream audio2 = new AudioInputStream(line);
		
		RecognizeOptions options = new RecognizeOptions.Builder().model("es-ES_NarrowbandModel")
		     .continuous(true)
		     .interimResults(true)
		     .contentType(HttpMediaType.AUDIO_RAW + "; rate=" + sampleRate)
		     .build();
	        
		s2t.recognizeUsingWebSocket(audio2, options, new BaseRecognizeCallback() 
		{
			public void onTranscription(SpeechResults speechResults) 
			{
		    transcript=speechResults;
		       //System.out.println(speechResults+"\nHOLAAAA");
		
		     }
		});

		System.out.println("Listening to your voice for the next 30s...");
		Thread.sleep(5 * 1000);

		   
   	   	texto=transcript.getResults().get(0).getAlternatives().get(0).getTranscript();
		 // closing the WebSockets underlying InputStream will close the WebSocket itself.
		 line.stop();
		 line.close();
		 System.out.println("Fin.");
		   
		 return texto;
	}

	public static void main(String[] args) throws LineUnavailableException, InterruptedException  {
		Speech ss = new Speech();
		System.out.println(ss.voz_a_texto());
	}
}
