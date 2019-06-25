package com.irfan.sampling.androidlatihan3_list.recycleSamples;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.irfan.sampling.androidlatihan3_list.R;

import java.util.ArrayList;
import java.util.List;

/**
 * created by Irfan Assidiq on 2019-05-19
 * email : assidiq.irfan@gmail.com
 **/
public class MainMovie extends AppCompatActivity {
    private List<ModelMovie> movieList = new ArrayList<>();
    private RecyclerView rcview;
    private MovieAdapter mAdapter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recycle_main);

        rcview = findViewById(R.id.rcview);
        mAdapter = new MovieAdapter(movieList);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(
                getApplicationContext());
        rcview.setLayoutManager(mLayoutManager);
        rcview.setItemAnimator(new DefaultItemAnimator());
        rcview.setAdapter(mAdapter);
        prepareMovie();
    }

    private void prepareMovie(){
        ModelMovie movie = new ModelMovie("Ketika Cinta Bertasbih",
                "Drama", "2005");
        movieList.add(movie);
        movie = new ModelMovie("Avenger Age of Ultron", "Sci-fi",
                "2011");
        movieList.add(movie);
        movie = new ModelMovie("Naruto", "Action & Adventurer",
                "1996");
        movieList.add(movie);
        movie = new ModelMovie("Manusia Setengah Salmon", "Comedy",
                "2011");
        movieList.add(movie);
        movie = new ModelMovie("DKNN", "comedy", "2012");
        movieList.add(movie);

        mAdapter.notifyDataSetChanged();
    }
}
