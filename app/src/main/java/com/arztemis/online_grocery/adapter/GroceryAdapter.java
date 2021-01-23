package com.arztemis.online_grocery.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.arztemis.online_grocery.R;
import com.arztemis.online_grocery.model.Grocery;

import java.util.List;

public class GroceryAdapter extends RecyclerView.Adapter<GroceryAdapter.GroceryViewHolder> {
    private List<Grocery> groceryList;

    public GroceryAdapter(List<Grocery> groceryList) {
        this.groceryList = groceryList;
    }


    @NonNull
    @Override
    public GroceryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_grocery, parent, false);
        return new GroceryViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull GroceryViewHolder holder, int position) {
        holder.imggrocery.setImageResource(groceryList.get(position).getImgaeurl());
    }

    @Override
    public int getItemCount() {
        if (groceryList != null) {
            return groceryList.size();
        }
        return 0;
    }

    public class GroceryViewHolder extends RecyclerView.ViewHolder {

        private ImageView imggrocery;

        public GroceryViewHolder(@NonNull View itemView) {
            super(itemView);
            imggrocery = itemView.findViewById(R.id.iv_grocery);
        }
    }
}
