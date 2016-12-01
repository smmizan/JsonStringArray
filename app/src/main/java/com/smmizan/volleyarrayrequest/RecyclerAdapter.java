package com.smmizan.volleyarrayrequest;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Mamun on 12/1/2016.
 */

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.MyViewHolder>{
    ArrayList<Contact> arrayList = new ArrayList<>();



    public RecyclerAdapter(ArrayList<Contact> arrayList) {
        this.arrayList = arrayList;
    }




    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_items,parent,false);
        MyViewHolder myViewHolder = new MyViewHolder(view);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        holder.Name.setText(arrayList.get(position).getName());
        holder.Email.setText(arrayList.get(position).getEmail());
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{

        TextView Name,Email;


        public MyViewHolder(View itemView) {
            super(itemView);
            Name = (TextView)itemView.findViewById(R.id.textViewName);
            Email = (TextView)itemView.findViewById(R.id.textViewEmail);

        }
    }

}
