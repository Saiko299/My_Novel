package com.example.mynovel;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class NovelAdapter extends RecyclerView.Adapter<NovelAdapter.NovelViewHolder> {
    private List<Novel> novelList;

    public NovelAdapter(List<Novel> novelList) {
        this.novelList = novelList;
    }

    @NonNull
    @Override
    public NovelViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_novel, parent, false);
        return new NovelViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull NovelViewHolder holder, int position) {
        Novel novel = novelList.get(position);
        holder.title.setText(novel.title);
        holder.desc.setText(novel.description);
        holder.genre1.setText(novel.genre1);
        holder.genre2.setText(novel.genre2);
        holder.score.setText(novel.score);
        holder.cover.setImageResource(novel.imageResId); // Tambahan untuk cover
    }

    @Override
    public int getItemCount() {
        return novelList.size();
    }

    public static class NovelViewHolder extends RecyclerView.ViewHolder {
        TextView title, desc, genre1, genre2, score;
        ImageView cover; // Tambahan

        public NovelViewHolder(@NonNull View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.novel_title);
            desc = itemView.findViewById(R.id.novel_desc);
            genre1 = itemView.findViewById(R.id.genre1);
            genre2 = itemView.findViewById(R.id.genre2);
            score = itemView.findViewById(R.id.novel_score);
            cover = itemView.findViewById(R.id.novel_cover); // Tambahan
        }
    }
}
