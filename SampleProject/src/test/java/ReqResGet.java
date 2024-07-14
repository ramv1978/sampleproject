import okhttp3.*;
import org.json.JSONObject;
import org.junit.Assert;

import java.io.IOException;
import java.sql.SQLOutput;

public class ReqResGet
{
    public static void main(String[] args) throws IOException {
        OkHttpClient client = new OkHttpClient().newBuilder()
                .build();
        MediaType mediaType = MediaType.parse("text/plain");
        RequestBody body = RequestBody.create(mediaType, "");
        Request request = new Request.Builder()
                .url("https://reqres.in/api/users?page=2").method("GET", null).build();
        Response response = client.newCall(request).execute();
        System.out.println(response.body().string());
        String resStr = response.body().string();
        JSONObject json = new JSONObject(resStr);
        Assert.assertTrue(response.toString().contains("page"));
        }}
