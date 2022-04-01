package com.example.pasarmalamcarimakan;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class recycleradapter2 extends RecyclerView.Adapter<recycleradapter2.ImageViewHolder>{
    private Context mContext;
    private int[] images;

    public recycleradapter2(int[] images){
        this.images=images;
    }

    @NonNull
    @Override
    public ImageViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
      View view= LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.album_layout,viewGroup,false);
      ImageViewHolder imageViewHolder=new ImageViewHolder(view);
      return imageViewHolder;
    }

    @Override
    public void onBindViewHolder(ImageViewHolder holder2, int position2) {
int image_id=images[position2];
        holder2.Album.setImageResource(image_id);
        holder2.AlbumTitle.setText("Recommended Food Stalls");

        switch (images[position2]){
            case 0: case 1: case 2:case 3:case 4:
                Toast.makeText(mContext, "Pasar Malam OUG", Toast.LENGTH_SHORT).show();
    }

    }

    @Override
    public int getItemCount() {
        return images.length;
    }

    public static class ImageViewHolder extends RecyclerView.ViewHolder{
        ImageView Album;
        TextView AlbumTitle;

        public ImageViewHolder(@NonNull View itemView) {
            super(itemView);
            Album=itemView.findViewById(R.id.album);
            AlbumTitle=itemView.findViewById(R.id.album_title);
        }
    }
}
