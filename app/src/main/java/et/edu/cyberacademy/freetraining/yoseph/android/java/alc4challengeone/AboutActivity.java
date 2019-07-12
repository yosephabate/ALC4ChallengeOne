package et.edu.cyberacademy.freetraining.yoseph.android.java.alc4challengeone;

import androidx.appcompat.app.AppCompatActivity;

import android.net.http.SslError;
import android.os.Bundle;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class AboutActivity extends AppCompatActivity {

    private WebView alcWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        getSupportActionBar().setElevation(0);

        setTitle(R.string.about_activity);

        alcWebView = findViewById(R.id.alc_web_view);

        alcWebView.setWebViewClient(new WebViewClient() {
            @Override
            public void onReceivedSslError(WebView view, SslErrorHandler handler, SslError error) {
                handler.proceed();
            }
        });
        alcWebView.loadUrl("https://andela.com/alc/");
        WebSettings webSettings = alcWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
    }

}
