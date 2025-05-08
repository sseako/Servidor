import java.io.*; 
import java.net.*;  
public class Cliente {
    public static void main(String[] args) {
        String sentence;          
        String modifiedSentence;  
        BufferedReader inFromUser = new BufferedReader(new InputStreamReader(System.in));
        Socket clientSocket = new Socket("hostname", 6789);  
        DataOutputStream outToServer = new DataOutputStream(clientSocket.getOutputStream());   

    }
}
