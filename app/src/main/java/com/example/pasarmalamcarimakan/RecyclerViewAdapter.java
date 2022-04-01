package com.example.pasarmalamcarimakan;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {
private ArrayList<String> pasarname;
private Context mContext;

    public RecyclerViewAdapter(ArrayList<String> pasarname, Context mContext) {
        this.pasarname = pasarname;
        this.mContext = mContext;

    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_listitem,parent,false);
       ViewHolder viewHolder=new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {


        holder.pasar_name.setText(pasarname.get(position));
holder.parent_layout.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Toast.makeText(mContext,pasarname.get(position),Toast.LENGTH_SHORT).show();
        if(pasarname.get(position)=="Pasar Lembah Subang"){
            Intent i=new Intent(mContext,Pasar1_Main.class);
            mContext.startActivity(i);
        }
        if(pasarname.get(position)=="Pasar Malam OUG"){
            Intent i=new Intent(mContext,Pasar2_Main.class);
            mContext.startActivity(i);
        }
        else  Toast.makeText(mContext,pasarname.get(position),Toast.LENGTH_SHORT).show();
    }
});
    }

    @Override
    public int getItemCount() {
        return pasarname.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
TextView pasar_name;
        RelativeLayout parent_layout;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            this.pasar_name=itemView.findViewById(R.id.pasar_name);
           this.parent_layout=itemView.findViewById(R.id.parent_layout);

        }
    }
}
