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
import android.util.DisplayMetrics;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TableLayout;
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
        LinearLayout rl = new LinearLayout(this);
        rl.setPadding(dpToPx(24),dpToPx(16),dpToPx(24),dpToPx(0));
        rl.setOrientation(LinearLayout.VERTICAL);
        rl.setGravity(Gravity.CENTER_HORIZONTAL);
        TextView tv  = new TextView(this);
        tv.setMovementMethod(LinkMovementMethod.getInstance());
        tv.setText(Html.fromHtml(msg));
        tv.setTextSize(16);
        tv.setTextColor(Color.parseColor("#757575"));
        tv.setLayoutParams(new TableLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT, 1f));
        rl.addView(tv);
        AlertDialog.Builder builder = new AlertDialog.Builder(this, R.style.DialogStyle);
        builder.setTitle("About " + getResources().getString(R.string.library_name));
        builder.setView(rl);
        builder.setPositiveButton("Close", null);
        builder.setNeutralButton("View On GitHub",
                new DialogInterface.OnClickListener()
                {
                    @Override
                    public void onClick(DialogInterface dialog, int which)
                    {
                        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/marcoscgdev/EasyLicensesDialog")));
                    }
                });
        builder.show();
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

    public int dpToPx(int dp) {
        DisplayMetrics displayMetrics = getApplicationContext().getResources().getDisplayMetrics();
        int px = Math.round(dp * (displayMetrics.xdpi / DisplayMetrics.DENSITY_DEFAULT));
        return px;
    }

}