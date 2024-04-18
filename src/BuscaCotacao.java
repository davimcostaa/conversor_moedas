import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class BuscaCotacao {

    Gson gson = new GsonBuilder()
            .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
            .setPrettyPrinting()
            .create();

    public Cotacao buscaCotacao(String moeda1, String moeda2) {
        URI endereco = URI.create("https://v6.exchangerate-api.com/v6/c976a08faffd5cff498f708d/pair/" + moeda1 + "/" + moeda2);
        HttpRequest request = HttpRequest.newBuilder()
                .uri(endereco)
                .build();

        try {
            HttpResponse<String> response = HttpClient.newHttpClient()
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return gson.fromJson(response.body(), Cotacao.class);
        } catch (Exception e) {
            throw new RuntimeException("Não foi possível obter o endereço!");
        }
    }
}
