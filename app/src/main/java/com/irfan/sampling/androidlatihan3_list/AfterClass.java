package com.irfan.sampling.androidlatihan3_list;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;


/**
 * created by Irfan Assidiq on 2019-05-16
 * email : assidiq.irfan@gmail.com
 **/
public class AfterClass extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.afterclick);
        ImageView imgView = findViewById(R.id.imgViews);
        TextView tv_negara = findViewById(R.id.tv_negara);

        String negara = "";
        Bundle b = getIntent().getExtras();
        if (b != null){
            negara = b.getString("negara");
        }
        if (negara.equals("ina")){
            imgView.setImageResource(R.drawable.id);
            tv_negara.setText(R.string.indonesia);
        }else if (negara.equals("jpn")){
            imgView.setImageResource(R.drawable.jp);
            tv_negara.setText(R.string.jepang);
        }else if (negara.equals("ptgs")){
            imgView.setImageResource(R.drawable.ptgs);
            tv_negara.setText(R.string.portugis);
        }else if(negara.equals("frn")){
            imgView.setImageResource(R.drawable.fr);
            tv_negara.setText(R.string.prancis);
        }else if (negara.equals("nth")){
            imgView.setImageResource(R.drawable.nth);
            tv_negara.setText(R.string.belanda);
        }else{
            imgView.setImageResource(R.drawable.ic_launcher_foreground);
            tv_negara.setText("lorem ipsum");
        }
    }
}

