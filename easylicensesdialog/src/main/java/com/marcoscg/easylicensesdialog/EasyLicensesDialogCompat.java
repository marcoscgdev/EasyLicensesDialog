package com.marcoscg.easylicensesdialog;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AlertDialog;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class EasyLicensesDialogCompat extends AlertDialog.Builder {

    Context ctx;

    public EasyLicensesDialogCompat(Context context) {
        super(context);
        ctx = context;
        init();
    }

    public EasyLicensesDialogCompat(Context context, int theme) {
        super(context, theme);
        ctx = context;
        init();
    }
    private void init() {
        WebView view = new WebView(ctx);
        view.loadUrl("file:///android_asset/licenses.html");
        view.setWebViewClient(new WebViewClient(){
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                if (url != null && url.startsWith("http://") || url != null && url.startsWith("https://")) {
                    view.getContext().startActivity(
                            new Intent(Intent.ACTION_VIEW, Uri.parse(url)));
                    return true;
                } else {
                    return false;
                }
            }
        });
        setView(view);
    }
}