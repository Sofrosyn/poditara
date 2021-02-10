package com.sofrosyn.podpitara.adapter;

import android.content.Context;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.sofrosyn.podpitara.Modals.Show;
import com.sofrosyn.podpitara.R;

import java.util.ArrayList;

public class ShowsAdapter extends RecyclerView.Adapter<ShowsAdapter.showHolder>{

    public Context context;
    public ArrayList<Show> showArrayList;


    public ShowsAdapter(Context context, ArrayList<Show> locationArrayList) {
        this.context = context;
        this.showArrayList = locationArrayList;
    }


    @NonNull
    @Override
    public ShowsAdapter.showHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_show, parent, false);
        return new showHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ShowsAdapter.showHolder holder, int position) {
        Show show = showArrayList.get(position);

        holder.title.setText(show.getName());
        //holder.image.setImageDrawable();
        //  holder.body.setText(Html.fromHtml(location.getDetails()));
        // holder.body.setMovementMethod(LinkMovementMethod.getInstance());


    }

    @Override
    public int getItemCount() {
        return showArrayList.size();
    }





    public class showHolder extends RecyclerView.ViewHolder {

        public TextView title;
        public ImageView image;


        public showHolder(@NonNull View itemView) {
            super(itemView);

            title = itemView.findViewById(R.id.item_name);
            image = itemView.findViewById(R.id.item_image);


        }


    }















}