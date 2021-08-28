package funcoesExemplo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.stream.Collectors;

public class InferenciaExemplo {
    public static void main(String[] args) throws IOException {
        printarNomeCompleto("Ender","alves");
    }

    public static void connectSiteOracleEBuscaHtml() throws IOException {
        URL url = new URL("https://docs.oracle.com/javase/10/language");
        URLConnection urlConnection = url.openConnection();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));

        System.out.println(bufferedReader.lines().collect(Collectors.joining()).replaceAll(">", ">\n"));
    }

    public static void printarNomeCompleto(String nome, String sobrenome) {
        var nomeCompleto = String.format("%s %s ", nome, sobrenome);
        System.out.println(nomeCompleto);
    }
}


// var nao dar pra usa///
//  em nivel de classe
// como parametro
// variavel locais nao inicializavel