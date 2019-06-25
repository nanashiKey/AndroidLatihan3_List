package com.irfan.sampling.androidlatihan3_list;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.ContextMenu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;


/**
 * created by Irfan Assidiq on 2019-05-16
 * email : assidiq.irfan@gmail.com
 **/
public class ListDataSample extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sample_list2);
        ListView lv_sample = findViewById(R.id.lv_sample);
        List<String> data = new ArrayList<>();
            data.add("Indonesia");
            data.add("Jepang");
            data.add("Portugis");
            data.add("Perancis");
            data.add("Belanda");

        ArrayAdapter<String> adapterData = new ArrayAdapter<String>(
                this, android.R.layout.simple_list_item_1, data);

        lv_sample.setAdapter(adapterData);
        registerForContextMenu(lv_sample);
        lv_sample.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            Bundle b = new Bundle();
            @Override
            public void onItemClick(AdapterView<?> adapterView,
                                    View view, int i, long l) {
                switch (i){
                    case 0 : {
                        b.putString("negara", "ina");
                        Intent intent = new Intent(ListDataSample.this,
                                AfterClass.class);
                        intent.putExtras(b);
                        startActivity(intent);
                    }break;
                    case 1 :{
                        b.putString("negara", "jpn");
                        Intent intent = new Intent(ListDataSample.this,
                                AfterClass.class);
                        intent.putExtras(b);
                        startActivity(intent);
                    }break;
                    case 2 :{
                        b.putString("negara", "ptgs");
                        Intent intent = new Intent(ListDataSample.this,
                                AfterClass.class);
                        intent.putExtras(b);
                        startActivity(intent);
                    }break;
                    case 3:{
                        b.putString("negara", "frn");
                        Intent intent = new Intent(ListDataSample.this,
                                AfterClass.class);
                        intent.putExtras(b);
                        startActivity(intent);
                    }break;
                    case 4:{
                        b.putString("negara", "nth");
                        Intent intent = new Intent(ListDataSample.this,
                                AfterClass.class);
                        intent.putExtras(b);
                        startActivity(intent);
                    }
                    default:
                        //
                }
            }
        });
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        MenuInflater inflater =  getMenuInflater();
        inflater.inflate(R.menu.context_menu, menu);
    }

//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//
//    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.ctx_menu1:{
                Toast.makeText(getApplicationContext(),
                        "context menu 1", Toast.LENGTH_SHORT).show();
                return true;
            }
            case R.id.ctx_menu2 :{
                Toast.makeText(getApplicationContext(),
                        "context menu 2", Toast.LENGTH_SHORT).show();
                return true;
            }
            default:
                //
                return super.onContextItemSelected(item);
        }

    }
}
