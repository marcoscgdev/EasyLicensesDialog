package com.marcoscg.easylicensesdialogsample;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import com.marcoscg.easylicensesdialog.EasyLicensesDialog;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    public void showLicensesDialog(View view) {
        EasyLicensesDialog easyLicensesDialog = new EasyLicensesDialog(this);
        easyLicensesDialog.setTitle("Licenses"); //by default EasyLicensesDialog comes without any title.
        easyLicensesDialog.setCancelable(true); //true or false
        //easyLicensesDialog.setIcon(R.mipmap.ic_launcher);
        easyLicensesDialog.show();
    }

    public void showAboutDialog() {
        String msg = getResources().getString(R.string.about_text);
        AlertDialog alertDialog = new AlertDialog.Builder(this, R.style.DialogStyle).create();
        alertDialog.setTitle("About " + getResources().getString(R.string.app_name));
        alertDialog.setMessage(Html.fromHtml(msg));
        alertDialog.setButton(DialogInterface.BUTTON_POSITIVE,"Close",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                    }
                });
        alertDialog.setButton(DialogInterface.BUTTON_NEUTRAL,"View on GitHub",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/marcoscgdev/EasyLicensesDialog")));
                    }
                });
        alertDialog.show();
        TextView messageView = (TextView)alertDialog.findViewById(android.R.id.message);
        messageView.setGravity(Gravity.CENTER);
        messageView.setTextColor(Color.parseColor("#757575"));
        ((TextView)alertDialog.findViewById(android.R.id.message)).setMovementMethod(LinkMovementMethod.getInstance());
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            showAboutDialog();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

}
