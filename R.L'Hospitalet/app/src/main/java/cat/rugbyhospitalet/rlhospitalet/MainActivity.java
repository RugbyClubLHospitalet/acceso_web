package cat.rugbyhospitalet.rlhospitalet;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //Creacion de WebView
        WebView webview = new WebView(this);
        setContentView(webview);



        //cargamos la URL
        webview.loadUrl("http://rugbyhospitalet.cat/");



    }
}
