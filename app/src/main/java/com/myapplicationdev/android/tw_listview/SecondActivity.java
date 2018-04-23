package com.myapplicationdev.android.tw_listview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class SecondActivity extends AppCompatActivity {

    ListView lv;
    TextView tvYear;
    ArrayAdapter aa;
    ArrayList<Module> module;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        lv = (ListView) this.findViewById(R.id.lvModules);
        tvYear = (TextView) findViewById(R.id.tvYear);

        module = new ArrayList<Module>();
        aa = new ModuleAdapter(this, R.layout.row, module);
        lv.setAdapter(aa);


        Intent i = getIntent();
        String year = i.getStringExtra("year");
        tvYear.setText(year);
        if(year == "Year 1"){
            module.add(new Module("C105", true));
            module.add(new Module("B102", false));
            module.add(new Module("A113", false));
        }if(year == "Year 1"){
            module.add(new Module("C208", false));
            module.add(new Module("C200", true));
            module.add(new Module("C346", false));
        }else{
            module.add(new Module("C347", true));
            module.add(new Module("C302", true));
            module.add(new Module("C349", true));
        }

    }



}
