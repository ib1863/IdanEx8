package com.example.idanex8;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    WebView wV;
    String url;
    EditText enterUrl;
    Button btnStart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        wV =(WebView)findViewById(R.id.wV);
        wV.getSettings().setJavaScriptEnabled(true);
        enterUrl = (EditText) findViewById(R.id.eT);
        wV.setWebViewClient(new MyWebViewClient());
        btnStart = (Button) findViewById(R.id.button2);
    }



    public void Clicked(View view) {
        url = enterUrl.getText().toString();
        wV.loadUrl(url);
        btnStart.setVisibility(View.GONE);
        enterUrl.setVisibility(View.GONE);
    }


    private class MyWebViewClient extends WebViewClient {
        public boolean shouldOverideUrlLoading(WebView view, String url) {
            view.loadUrl(url);
            return true;
        }

    }
}