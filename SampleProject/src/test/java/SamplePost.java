import okhttp3.*;

import java.io.IOException;

public class SamplePost
{
    public static void main(String[] args) throws IOException {
        OkHttpClient client = new OkHttpClient().newBuilder()
                .build();
        MediaType mediaType = MediaType.parse("application/json");
        RequestBody body = RequestBody.create(mediaType, "{ \"username\": \"ramv0305\", \"password\": \"Sairam@03051978\" }");
        Request request = new Request.Builder()
                .url("https://reqres.in/api/unknown")
                .method("POST", body)
                .addHeader("Content-Type", "application/json")
                .build();
        Response response = client.newCall(request).execute();
        //assert response.body() != null;
        System.out.println(response.body().string());
    }
}
