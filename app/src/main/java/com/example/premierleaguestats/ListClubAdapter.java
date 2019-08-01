package com.example.premierleaguestats;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.text.BreakIterator;
import java.util.ArrayList;

public class ListClubAdapter extends RecyclerView.Adapter<ListClubAdapter.ListViewHolder> {
    private ArrayList<Club> clubList;

    private OnItemClickCallback onItemClickCallback;
    public void setOnItemClickCallback(OnItemClickCallback onItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback;
    }

    /* Constructor */
    public ListClubAdapter(ArrayList<Club> list) {
        this.clubList = list;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_club_list, viewGroup, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ListViewHolder listViewHolder, int i) {
        Club club = clubList.get(i);

        Glide.with(listViewHolder.itemView.getContext())
                .load(club.getPhoto())
                .apply(new RequestOptions().override(60, 60))
                .into(listViewHolder.imgPhoto);

        listViewHolder.tvName.setText(club.getName());
        listViewHolder.tvManager.setText(club.getManager());
        listViewHolder.tvStadium.setText(club.getStadium());

        listViewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onItemClickCallback.onItemClicked(clubList.get(listViewHolder.getAdapterPosition()));
            }
        });
    }

    @Override
    public int getItemCount() {
        return clubList.size();
    }

    class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvName;
        TextView tvManager;
        TextView tvStadium;

        ListViewHolder(@NonNull View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.club_logo);
            tvName = itemView.findViewById(R.id.club_name);
            tvManager = itemView.findViewById(R.id.manager);
            tvStadium = itemView.findViewById(R.id.stadium);
        }
    }

    public interface OnItemClickCallback {
        void onItemClicked(Club data);
    }
}
