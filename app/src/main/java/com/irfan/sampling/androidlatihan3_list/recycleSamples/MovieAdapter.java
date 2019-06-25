package com.irfan.sampling.androidlatihan3_list.recycleSamples;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.irfan.sampling.androidlatihan3_list.R;

import java.util.List;


/**
 * created by Irfan Assidiq on 2019-05-19
 * email : assidiq.irfan@gmail.com
 **/
public class MovieAdapter extends RecyclerView.Adapter<MovieAdapter.MyViewHolder> {
    private List<ModelMovie> movieList;

    class MyViewHolder extends RecyclerView.ViewHolder{
        TextView title, genre, year;
        RelativeLayout rcview_;

        MyViewHolder(View v){
            super(v);
            title = v.findViewById(R.id.title);
            genre = v.findViewById(R.id.genre);
            year = v.findViewById(R.id.year);
            rcview_ = v.findViewById(R.id.rcview_);

            rcview_.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    switch (getLayoutPosition()){
                        case 0 :{
                            Toast.makeText(view.getContext(), "Test 1",
                                    Toast.LENGTH_SHORT).show();
                        }break;
                        case 1:{
                            Toast.makeText(view.getContext(), "Test 2",
                                    Toast.LENGTH_SHORT).show();
                        }
                    }
                }
            });
        }
    }

    MovieAdapter(List<ModelMovie> movieList){this.movieList = movieList;}


    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View itemView = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.layout_film, viewGroup, false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder viewHolder, int i) {
        ModelMovie movie = movieList.get(i);
        viewHolder.title.setText(movie.getTitle());
        viewHolder.genre.setText(movie.getGenre());
        viewHolder.year.setText(movie.getYear());
    }

    @Override
    public int getItemCount() { return movieList.size(); }
}
