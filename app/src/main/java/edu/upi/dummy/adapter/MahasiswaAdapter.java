package edu.upi.dummy.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import edu.upi.dummy.R;
import edu.upi.dummy.model.Mahasiswa;

/**
 * Created by Rizki on 11/1/2017.
 */

public class MahasiswaAdapter extends RecyclerView.Adapter<MahasiswaAdapter.MovieViewHolder> {

    private List<Mahasiswa> movies;
    private Mahasiswa mahasiswa;
    private int rowLayout;
    private Context context;

    class MovieViewHolder extends RecyclerView.ViewHolder {
        TextView tvNim;
        TextView tvNama;
        TextView tvAlamat;
        TextView tvLat;
        TextView tvLng;

        MovieViewHolder(View v) {
            super(v);
            tvNim = v.findViewById(R.id.tvNim);
            tvNama = v.findViewById(R.id.tvNama);
            tvAlamat = v.findViewById(R.id.tvAlamat);
            tvLat = v.findViewById(R.id.tvLat);
            tvLng = v.findViewById(R.id.tvLng);
        }
    }

    public MahasiswaAdapter(List<Mahasiswa> movies, int rowLayout, Context context) {
        this.movies = movies;
        this.rowLayout = rowLayout;
        this.context = context;
    }

    @Override
    public MovieViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(rowLayout, parent, false);
        return new MovieViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final MovieViewHolder holder, int position) {
        Mahasiswa movie = movies.get(position);

        holder.tvNim.setText(movie.getNim());
        holder.tvNama.setText(movie.getNama());
        holder.tvAlamat.setText(movie.getAlamat());
        holder.tvLat.setText(movie.getLat());
        holder.tvLng.setText(movie.getLng());
    }

    @Override
    public int getItemCount() {
        return movies.size();
    }
}
