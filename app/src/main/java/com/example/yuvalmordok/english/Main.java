package com.example.yuvalmordok.english;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Main extends AppCompatActivity {
    Button lost, enemy, tree;
    AlertDialog.Builder aaa;
    int a;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lost = (Button) findViewById(R.id.lost);
        enemy = (Button) findViewById(R.id.enemy);
        tree = (Button) findViewById(R.id.tree);

        aaa=new AlertDialog.Builder(this);

        aaa.setTitle("Hello");
        aaa.setMessage("Are you ready?");
        aaa.setPositiveButton("YES", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                goTost(a);

            }
        });


        AlertDialog ad=aaa.create();
        ad.show();

    }

    public void lost1(View view) {
        nextActive(1);
    }

    public void tree1(View view) {
        nextActive(2);
    }

    public void enemy1(View view) {
        nextActive(3);
    }

    public void nextActive(int n) {
        Intent t = new Intent(this, info.class);
        t.putExtra("num", n);
        startActivity(t);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.TE) {
            Intent g = new Intent(this, credit.class);
            startActivity(g);
        }
            return true;
    }
    private void goTost(int a){
        Toast.makeText(this,"Excellent let's get started", Toast.LENGTH_SHORT).show();
    }
}
