package com.jack.android.sewiseplayer;

import com.jack.android.sewiseplayer.R;
import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.webkit.WebView;

public class PlayerMain extends Activity {
    private WebView myWebView;
    
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        JsInterface jsInterface = new JsInterface();
        myWebView = (WebView) findViewById(R.id.web_view);
        myWebView.getSettings().setJavaScriptEnabled(true);
        myWebView.addJavascriptInterface(jsInterface, "android");
        /*myWebView.getSettings().setBuiltInZoomControls(true);
        myWebView.getSettings().setSupportZoom(true);
        myWebView.getSettings().setUseWideViewPort(true);
        myWebView.getSettings().setLoadWithOverviewMode(true);
        myWebView.getSettings().setDomStorageEnabled(true);
        myWebView.getSettings().setAllowFileAccess(true);
        myWebView.getSettings().setAppCacheEnabled(true);*/
        
        //myWebView.loadUrl("file:///android_asset/sewise-player/demos/div_100_percent.html");
        myWebView.loadUrl("http://jackzhang1204.github.io/sewise/sewise_player/demos/div_100_percent.html");
    }
    
    //js call java
    public class JsInterface {
    	public void jsCallAndroid(String msg) {
    		Log.d("msg from js", msg);
    	}
    }
}