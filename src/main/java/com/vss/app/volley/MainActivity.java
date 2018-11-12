package com.vss.app.volley;

import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.Volley;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;


public class MainActivity extends AppCompatActivity {
    TextView course;
    TextView chapter;
    String url ="http://kolamapps.com/Liaise/Login/login.php?";
    String TAG = this.getClass().getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        course = findViewById(R.id.course);
        chapter= findViewById(R.id.chapter);

        MyNewRequest myNewRequest = new MyNewRequest("jarin.platosys@gmail.com",
                "dhfgyy","123456");

        RequestQueue requestQueue = Volley.newRequestQueue(getApplicationContext());

        GsonRequest<MyNewResponse> gsonRequest = new GsonRequest<>(Request.Method.POST,url,myNewRequest,MyNewResponse.class,
                null,succesListener(),errorListener());
        requestQueue.add(gsonRequest);
    }

    private Response.Listener<MyNewResponse> succesListener() {
        return new Response.Listener<MyNewResponse>() {
            @Override
            public void onResponse(MyNewResponse response) {

               // Toast.makeText(MainActivity.this,response.getContact_email()+response.getContact_number(),Toast.LENGTH_SHORT).show();

                course.setText(response.getResult());
               // chapter.setText(response.getMessage());

                Log.d(TAG + "result",response.getResult());

                if (response.getResult().equals("success")){
                    Log.d(TAG + "id",response.getId());

                }
                Log.d(TAG + "message",response.getMessage());

                Toast.makeText(MainActivity.this, response.getMessage(), Toast.LENGTH_SHORT).show();


            }
        };
    }

    private Response.ErrorListener errorListener() {
        return new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

            }
        };
    }


    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
    }
}
