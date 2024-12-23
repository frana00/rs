package proteccion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.stream.Collectors;
import java.util.stream.Stream;
// SERÍA SujetoReal DEL UML
public class EjecutorDeComandos implements InterfaceEjecutor {
    public EjecutorDeComandos() {

    }

    // Método peticion() de la interfaz
    @Override
    public String ejecutarComando(String comando) throws IOException {

        // EL SIGUIENTE FRAGMENTO SIMPLEMENTE EJECUTA COMO COMANDO DEL SISTEMA LO QUE SE LE PASA
        // COMO ARGUMENTO
        // RECUPERA LA INFORMACIÓN QUE SE DEVUELVE Y DEVUELVE UN string CON EL RESULTADO DEL COMANDO


        //Process process = Runtime.getRuntime().exec("cmd.exe /C " + comando);
        //En Mac se debe usar este comando y no cmd.exe
        Process process = Runtime.getRuntime().exec(new String[]{"/bin/bash", "-c", comando});
        //Process process = Runtime.getRuntime().exec(comando);
        // TRANSFORMAR EL RESULTADO DE LA EJECUCIÓN DEL COMANDO EN UN String
        InputStream inputStream = process.getInputStream();
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
        Stream<String> streamOfString= new BufferedReader(inputStreamReader).lines();
        String streamToString = streamOfString.collect(Collectors.joining("\n","",""));
        return streamToString;

    }
}
