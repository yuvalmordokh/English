package com.example.yuvalmordok.english;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;


public class listqu extends AppCompatActivity implements AdapterView.OnItemClickListener{
    ListView lv;
    TextView tv;
    String s;
    int n;
    String [] arr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listqu);
        lv = (ListView) findViewById(R.id.lv);
        tv = (TextView) findViewById(R.id.tv);

        Intent gt = getIntent();
        n = gt.getIntExtra("num", 1);



        int identifier = getResources().getIdentifier("li" + n, "array", this.getPackageName());

        arr=getResources().getStringArray(identifier);



        ArrayAdapter<String> adp = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, arr);
        lv.setAdapter(adp);
        lv.setOnItemClickListener(this);
        lv.setChoiceMode(ListView.CHOICE_MODE_SINGLE);
    }


    public void back1(View view) {
        Intent r = new Intent(this, info.class);
        r.putExtra("num",n);
        startActivity(r);
    }

    public void restart(View view) {
        Intent t = new Intent(this, Main.class);
        startActivity(t);
    }



    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        String[] a;
        int identifier = getResources().getIdentifier("lis" + n, "array", this.getPackageName());
        a=getResources().getStringArray(identifier);
        tv.setText(""+a[i]);
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
