package StoresAPI;

import okhttp3.*;
import java.io.IOException;

    public class GraphQLRequest {

        public static void main(String[] args) throws IOException {
            OkHttpClient client = new OkHttpClient();

            MediaType mediaType = MediaType.parse("application/json");
            String graphqlQuery = "{ \"query\": \"query Hello { hello(person: { name: \\\"Ram\\\", age: 45 }) request { headers } }\" }";

            RequestBody body = RequestBody.create(mediaType, graphqlQuery);

            Request request = new Request.Builder()
                    .url("https://graphql.postman-echo.com/graphql") // Replace with your actual GraphQL endpoint
                    .post(body)
                    .addHeader("Content-Type", "application/json")
                    .build();

            try (Response response = client.newCall(request).execute()) {
                System.out.println(response.body().string());
            }
        }
    }


