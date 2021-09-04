package masmidia.digital.one;

import java.io.IOException;
import java.net.ProxySelector;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadFactory;

public class NovaApiJavaHttpClient {

    static ExecutorService executorService = Executors.newFixedThreadPool(6, new ThreadFactory() {
        @Override
        public Thread newThread(Runnable runnable) {
            Thread thread = newThread(runnable);
            System.out.println("Nova Thread Criada :: " + (thread.isDaemon() ? "daemon" : "") + "Thread Group :: " + thread.getThreadGroup());
            return thread;
        }
    });


    public static void main(String[] args) throws IOException, InterruptedException {
        // connectSiteOracleEBuscaHtml();
        connectHttpClienteNovaVersaoDois();
    }


    public static void connectHttpClienteNovaVersaoDois() {
        System.out.println("Running Http 1.1  exemple ....");
        try {
            HttpClient httpClient = HttpClient.newBuilder()
                    .version(HttpClient.Version.HTTP_1_1)
                    .proxy(ProxySelector.getDefault())
                    .build();

            long start = System.currentTimeMillis();

            HttpRequest mainResquest = HttpRequest.newBuilder()
                    .uri(URI.create("http://http2.akamai.com/demo/h2_demo_frame.html"))
                    .build();

            HttpResponse<String> response = httpClient.send(mainResquest, HttpResponse.BodyHandlers.ofString());

            System.out.println("status code :: " + response.statusCode());
            System.out.println("Response Headers :: " + response.headers());
            String responseBody = response.body();
            System.out.println(responseBody);

            List<Future<?>> future = new ArrayList<>();

            responseBody
                    .lines()
                    .filter(line -> line.trim().startsWith("<img height"))
                    .map(line -> line.substring(line.indexOf("src'") + 5, line.indexOf("'/>")))
                    .forEach(image -> System.out.println(image));
        } catch (InterruptedException | IOException e) {

        }

    }

    public static void connectSiteOracleEBuscaHtml() throws IOException, InterruptedException {
        HttpRequest request = HttpRequest.newBuilder()
                .GET().uri(URI.create("https://docs.oracle.com/javase/10/language/"))
                .build();

        HttpClient httpClient = HttpClient.newHttpClient();

        HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println("status code :: " + response.statusCode());
        System.out.println("Headers response :: " + response.headers());
        System.out.println(response.body());
    }



}
