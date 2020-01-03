package com.mymovies;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.Arrays;
import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyAdapter extends RecyclerView.Adapter {

    private Context context;
    List<String> lst;           //
    List<String> lst1;

    MyAdapter(Context context) {
        lst = Arrays.asList(new String[]{"s", "dd", "gggg"});
        lst1 = Arrays.asList(new String[]{"ne", "fdss", "fvvv"});
        this.context = context;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater mInflater = LayoutInflater.from(context);
        View view = mInflater.inflate(R.layout.row, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        TextView text = ((MyViewHolder)holder).text;
        String item = lst.get(position);
        text.setText(item);

        TextView text1 = ((MyViewHolder)holder).text1;
        String item1 = lst1.get(position);
        text1.setText(item1);
    }

    @Override
    public int getItemCount() {
        return lst.size();
    }

    private class MyViewHolder extends RecyclerView.ViewHolder {

        public TextView text;
        public TextView text1;

        public MyViewHolder(View view) {
            super(view);
            text = view.findViewById(R.id.row_text0);
            text1 = view.findViewById(R.id.row_text1);
        }
    }
}
