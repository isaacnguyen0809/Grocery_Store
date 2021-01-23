package com.arztemis.online_grocery.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.arztemis.online_grocery.R;
import com.arztemis.online_grocery.activity.DetailActivity;
import com.arztemis.online_grocery.model.RecentlyItem;

import java.util.List;

public class RecentlyItemsAdapter extends RecyclerView.Adapter<RecentlyItemsAdapter.RecentlyViewHolder> {

    public RecentlyItemsAdapter(Context context, List<RecentlyItem> itemList) {
        this.context = context;
        this.itemList = itemList;
    }

    private Context context;
    private List<RecentlyItem> itemList;

    @NonNull
    @Override
    public RecentlyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_recentlyitems, parent,
                false);
        return new RecentlyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecentlyViewHolder holder, int position) {
        holder.name.setText(itemList.get(position).getName());
        holder.des.setText(itemList.get(position).getDescription());
        holder.price.setText(itemList.get(position).getPrice());
        holder.qty.setText(itemList.get(position).getQuantity());
        holder.unit.setText(itemList.get(position).getUnit());
        holder.itemcard.setImageResource(itemList.get(position).getImageUrl());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(context, DetailActivity.class);
                i.putExtra("name", itemList.get(position).getName());
                i.putExtra("des", itemList.get(position).getDescription());
                i.putExtra("price", itemList.get(position).getPrice());
                i.putExtra("qty", itemList.get(position).getQuantity());
                i.putExtra("unit", itemList.get(position).getUnit());
                i.putExtra("image", itemList.get(position).getBigimageUrl());

                context.startActivity(i);
            }
        });
    }

    @Override
    public int getItemCount() {
        if (itemList != null) {
            return itemList.size();
        }
        return 0;
    }

    public class RecentlyViewHolder extends RecyclerView.ViewHolder {

        private TextView name, des, price, qty, unit;
        private ImageView itemcard;
        private ConstraintLayout bg;

        public RecentlyViewHolder(@NonNull View itemView) {
            super(itemView);
            itemcard = itemView.findViewById(R.id.iv_card);
            name = itemView.findViewById(R.id.tv_name);
            des = itemView.findViewById(R.id.tv_des);
            price = itemView.findViewById(R.id.tv_price);
            qty = itemView.findViewById(R.id.tv_qty);
            unit = itemView.findViewById(R.id.tv_unit);
            bg = itemView.findViewById(R.id.cs_recentlyitem);
        }
    }
}
