package org.multiwebview;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class Multiwebview extends Activity
{
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        WebView webview;
        webview = (WebView) findViewById(R.id.webview1);
        webview.getSettings().setJavaScriptEnabled(true);
        webview.loadUrl("http://www.google.com");
        webview = (WebView) findViewById(R.id.webview2);
        webview.getSettings().setJavaScriptEnabled(true);
        webview.loadUrl("http://www.bing.com");
        webview = (WebView) findViewById(R.id.webview3);
        webview.loadUrl("http://eecs.northwestern.edu");

    }
}
