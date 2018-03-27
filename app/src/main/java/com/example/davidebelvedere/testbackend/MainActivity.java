package com.example.davidebelvedere.testbackend;

import android.app.ProgressDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.VolleyLog;
import com.android.volley.toolbox.JsonObjectRequest;
import com.google.gson.Gson;

import org.json.JSONObject;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final ProgressDialog dialog = new ProgressDialog(MainActivity.this);
        dialog.setMessage("Loading..");
        dialog.show();
        GsonRequest jsonObjectReq = new GsonRequest("https://androidtutorialpoint.com/api/volleyJsonObject", DeviceOutput.class, null,
                new Response.Listener<DeviceOutput>() {
                    @Override
                    public void onResponse(DeviceOutput response) {
                        TextView screenView = (TextView) findViewById(R.id.screenSize);
                        TextView nameView = (TextView) findViewById(R.id.name);
                        TextView osView = (TextView) findViewById(R.id.OS);

                        screenView.setText(response.getScreenSize());
                        nameView.setText(response.getName());
                        osView.setText(response.getOperatingSystem());
                        dialog.hide();

                    }

                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

            }
        });
        ServiceQueueSingleton.getInstance(this).addToRequestQueue(jsonObjectReq);
    }
}
