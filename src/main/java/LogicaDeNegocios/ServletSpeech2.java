package LogicaDeNegocios;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
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

/**
 * Servlet implementation class ServletSpeech2
 */
@WebServlet("/ServletSpeech2")
public class ServletSpeech2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	SpeechResults transcript;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletSpeech2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String user = request.getParameter("user");
		String pass = request.getParameter("password");
		if ("edu4java".equals(user) && "eli4java".equals(pass)) {
			response(response, "login ok");
		} else {
			response(response, "invalid login");
		}
		
		
		String texto;
		int sampleRate = 16000;
		
		SpeechToText s2t = new SpeechToText();
		s2t.setUsernameAndPassword("4a76e4e6-2f33-424f-a847-c06e5d3551f0", "tJwskp6qa47O");
		/*s2t.setUsernameAndPassword("9fec7f24-611b-4a32-90d9-4ebeb66022a0", "7gJVErqKulgx");*/

		 AudioFormat format = new AudioFormat(sampleRate, 16, 1, true, false);
		 DataLine.Info info = new DataLine.Info(TargetDataLine.class, format);
		 if (!AudioSystem.isLineSupported(info))
		 {
			 response(response, "Line not supported");
		     //System.out.println("Line not supported");
		     System.exit(0);
		  }
		TargetDataLine line = null;
		try {
			line = (TargetDataLine) AudioSystem.getLine(info);
		} catch (LineUnavailableException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		 try {
			line.open(format);
		} catch (LineUnavailableException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
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
		       //System.out.println(speechResults);
		
		     }
		});

		System.out.println("Listening to your voice for the next 30s...");
		try {
			Thread.sleep(5 * 1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		   
   	   	texto=transcript.getResults().get(0).getAlternatives().get(0).getTranscript();
		 // closing the WebSockets underlying InputStream will close the WebSocket itself.
		 line.stop();
		 line.close();
		 System.out.println("Fin.");
		 
		 response(response, texto);
	}
	
	private void response(HttpServletResponse resp, String msg)
			throws IOException {
			PrintWriter out = resp.getWriter();
			out.println("<html>");
			out.println("<body>");
			out.println("<t1>" + msg + "</t1>");
			out.println("</body>");
			out.println("</html>");
	}

}
