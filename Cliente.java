import java.io.*; 
import java.net.*;  
public class Cliente {

    public static void main(String[] args) {
        double sentence;          
        double modifiedSentence;  
        BufferedReader inFromUser = new BufferedReader(new InputStreamReader(System.in));
        Socket clientSocket = new Socket(10.153.159.246, 6789);  
        DataOutputStream outToServer = new DataOutputStream(clientSocket.getOutputStream());   
        BufferedReader inFromServer = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
        sentence = Double.parseDouble(inFromUser.readLine());          
        outToServer.writeBytes(sentence + '\n');          
        modifiedSentence = Double.parseDouble(inFromServer.readLine()); 
        System.out.println("FROM SERVER: " + modifiedSentence);           
        clientSocket.close();    
} 
}
       
    








