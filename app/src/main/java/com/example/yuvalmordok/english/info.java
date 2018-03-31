package com.example.yuvalmordok.english;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class info extends AppCompatActivity {
    String s = new String();
    TextView info1;
    int n;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);
        info1 = (TextView) findViewById(R.id.inf);

        Intent gt = getIntent();
        n = gt.getIntExtra("num", 1);
        int identifier = getResources().getIdentifier("st" + n, "string", this.getPackageName());
        s = getResources().getString(identifier);
        info1.setText(s);

    }

    public void back(View view) {
        Intent t = new Intent(this, Main.class);
        startActivity(t);

    }

    public void que(View view) {
        Intent r = new Intent(this, listqu.class);
            r.putExtra("num",n);
        startActivity(r);
        }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
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
}
