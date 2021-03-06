package com.example.p.mrmrsmksaini;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

public class Ghar_praves extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ghar_praves);

        //toolbar and back sign
        getSupportActionBar().setTitle("Ghar Paraves");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        // end

        GridView gridView = (GridView) findViewById(R.id.gridView);

        gridView.setAdapter(new ImageAdapterGhar(this));

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i = new Intent(getApplicationContext(),FullImageActivity.class);
                i.putExtra("id",position);
                startActivity(i);
            }
        });
    }
}
