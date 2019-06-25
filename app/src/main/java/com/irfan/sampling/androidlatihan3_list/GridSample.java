package com.irfan.sampling.androidlatihan3_list;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;


/**
 * created by Irfan Assidiq on 2019-05-16
 * email : assidiq.irfan@gmail.com
 **/
public class GridSample extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.grid_sample);
        GridView gv_sample = findViewById(R.id.gv_sample);
        gv_sample.setAdapter(new ImageAdapters(this));

        gv_sample.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView,
                                    View view, int i, long l) {
                Toast.makeText(getApplicationContext(), "test grid"
                        , Toast.LENGTH_SHORT).show();
            }
        });
    }
}
