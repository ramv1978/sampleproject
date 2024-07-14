package StoresAPI;

import okhttp3.*;

import java.io.IOException;

public class PathVariablesGet
{
    public static void main(String[] args) throws IOException {
        OkHttpClient client = new OkHttpClient().newBuilder()
                .build();
        MediaType mediaType = MediaType.parse("text/plain");
        RequestBody body = RequestBody.create(mediaType, "");
        Request request = new Request.Builder()
                .url("https://simple-grocery-store-api.glitch.me/products/4643")
                .method("GET", null)
                .build();
        Response response = client.newCall(request).execute();
        System.out.println(response.body().string());
    }
}
