package com.arztemis.online_grocery.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.arztemis.online_grocery.R;
import com.arztemis.online_grocery.model.DiscountedProducts;

import java.util.List;

public class DiscountedProductAdapter extends RecyclerView.Adapter<DiscountedProductAdapter.DiscountViewHolder> {

    private List<DiscountedProducts> discountedProductsList;

    public DiscountedProductAdapter(List<DiscountedProducts> discountedProductsList) {
        this.discountedProductsList = discountedProductsList;
    }

    @NonNull
    @Override
    public DiscountViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_discount, parent, false);
        return new DiscountViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull DiscountViewHolder holder, int position) {
        holder.imgdiscount.setImageResource(discountedProductsList.get(position).getImageUrl());
    }

    @Override
    public int getItemCount() {
        return discountedProductsList.size();
    }

    public class DiscountViewHolder extends RecyclerView.ViewHolder {

        ImageView imgdiscount;

        public DiscountViewHolder(@NonNull View itemView) {
            super(itemView);
            imgdiscount = itemView.findViewById(R.id.img_discount);
        }
    }
}