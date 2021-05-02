package com.javahelps.muslimbabynames;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Main2ActivityExit extends Activity {

    private Object Main2ActivityExit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2_exit);
    }
    /*
    public void onBackPressed() {
        Intent intent =new Intent(this,Main2ActivityExit.class);
        startActivity(intent);
        final AlertDialog.Builder builder = new AlertDialog.Builder(java.lang,Main2ActivityExit);
        builder.setMessage("Do you want exit ?");
        builder.setCancelable(true);
        builder.setNegativeButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int i) {
               dialog.cancel();
            }
        });
        builder.setPositiveButton("Close", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        });
        AlertDialog alertDialog = builder.create();
        alertDialog.show();

    }
*/

}
