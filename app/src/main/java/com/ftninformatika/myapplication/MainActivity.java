package com.ftninformatika.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends Activity {


    String brojevi[] = new String[]{"Jedan", "Dva ", "Tri"};
    ListView lvBrojevi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        lvBrojevi = findViewById(R.id.lvBrojevi);
        ArrayAdapter mojAdapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1, brojevi);
        lvBrojevi.setAdapter(mojAdapter);
        lvBrojevi.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(MainActivity.this,SecondActivity.class);
                intent.putExtra("broj",brojevi[position]);
                startActivity(intent);

            }
        });
    }
}
