
// Servidor
import java.io.*;
import java.net.*;

class TCPServer {
    public static void main(String argv[]) throws Exception {
        double clientNumber;
        double result;

        ServerSocket welcomeSocket = new ServerSocket(6789);

        while (true) {
            Socket connectionSocket = welcomeSocket.accept();

            BufferedReader inFromClient = new BufferedReader(
                new InputStreamReader(connectionSocket.getInputStream())
            );

            DataOutputStream outToClient = new DataOutputStream(
                connectionSocket.getOutputStream()
            );

            // Leer la línea como String
            String clientSentence = inFromClient.readLine();

            try {
                // Parsear el String a double
                clientNumber = Double.parseDouble(clientSentence);

                // Hacer alguna operación (ejemplo: multiplicar por 2)
                result = clientNumber * 2;

                // Enviar el resultado al cliente
                outToClient.writeBytes("Resultado: " + result + "\n");
            } catch (NumberFormatException e) {
                // Si no es un número válido, enviar error
                outToClient.writeBytes("Error: entrada no es un número válido\n");
            }

            connectionSocket.close(); // Cerrar conexión con el cliente
 }
}
}
