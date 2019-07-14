package www.you.alcchall;

import android.net.http.SslError;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.ClientCertRequest;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class about_alc extends AppCompatActivity {
    WebView webv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_alc);

        webv = findViewById(R.id.web_name);
        webv.setWebViewClient(new WebViewClient(){
            @Override
            public void onReceivedSslError(WebView view, SslErrorHandler handler, SslError error) {
                handler.proceed();
            }
        });
        webv.getSettings().setJavaScriptEnabled(true);
        webv.getSettings().setDisplayZoomControls(true);
        webv.loadUrl("https://andela.com/alc/");
    }
}
