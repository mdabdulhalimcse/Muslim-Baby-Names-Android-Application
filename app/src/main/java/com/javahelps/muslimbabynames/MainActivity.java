package com.javahelps.muslimbabynames;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import android.view.View;

import androidx.appcompat.app.AlertDialog;
import androidx.cardview.widget.CardView;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import com.google.android.material.navigation.NavigationView;


import androidx.drawerlayout.widget.DrawerLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import android.view.Menu;
import android.widget.Button;

public class MainActivity extends AppCompatActivity  {
    CardView cv1;
    private Button exitButton;
    private AlertDialog.Builder alertDialogBuilder;


    private AppBarConfiguration mAppBarConfiguration;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       // exitButton = (Button)findViewById(R.id.idexit);
       // exitButton.setOnClickListener(MainActivity.this);

        cv1 = (CardView)findViewById(R.id.cv1) ;

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        mAppBarConfiguration = new AppBarConfiguration.Builder(
                R.id.nav_home, R.id.nav_gallery)
                .setDrawerLayout(drawer)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        NavigationUI.setupActionBarWithNavController(this, navController, mAppBarConfiguration);
        NavigationUI.setupWithNavController(navigationView, navController);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        return NavigationUI.navigateUp(navController, mAppBarConfiguration)
                || super.onSupportNavigateUp();
    }
    public void methodcv1(View view) {
        Intent intent = new Intent(this,Main2ActivityCV1.class);
        startActivity(intent);
    }
    public void methodcv2(View view) {
        Intent intent = new Intent(this,Main2ActivityCV2.class);
        startActivity(intent);
    }
    public void methodcv3(View view) {
        Intent intent = new Intent(this,Main2ActivityCV3.class);
        startActivity(intent);
    }
    public void methodcv4(View view) {
        Intent intent = new Intent(this,Main2ActivityCV4.class);
        startActivity(intent);
    }
    public void methodcv5(View view) {
        Intent intent = new Intent(this,Main2ActivityCV5.class);
        startActivity(intent);
    }
    public void methodcv6(View view) {
        Intent intent = new Intent(this,Main2ActivityCV6.class);
        startActivity(intent);
    }
    public void methodcv7(View view) {
        Intent intent = new Intent(this,Main2ActivityCV7.class);
        startActivity(intent);
    }
    public void methodcv8(View view) {
        Intent intent = new Intent(this,Main2ActivityCV8.class);
        startActivity(intent);
    }
    public void methodcv9(View view) {
        Intent intent = new Intent(this,Main2ActivityCV9.class);
        startActivity(intent);
    }
    public void methodcv10(View view) {
        Intent intent = new Intent(this,Main2ActivityCV10.class);
        startActivity(intent);
    }

    public void methodcv11(View view) {
        Intent intent = new Intent(this,Main2ActivityCV11.class);
        startActivity(intent);
    }
    public void methodcv12(View view) {
        Intent intent = new Intent(this,Main2ActivityCV12.class);
        startActivity(intent);
    }
    public void methodcv13(View view) {
        Intent intent = new Intent(this,Main2ActivityCV13.class);
        startActivity(intent);
    }
    public void methodcv14(View view) {
        Intent intent = new Intent(this,Main2ActivityCV14.class);
        startActivity(intent);
    }
    public void methodexit(View view) {
        Intent intent = new Intent(this,Main2ActivityExit.class);
        startActivity(intent);
    }




}
