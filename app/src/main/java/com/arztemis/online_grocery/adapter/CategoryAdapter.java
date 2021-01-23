package com.arztemis.online_grocery.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.arztemis.online_grocery.R;
import com.arztemis.online_grocery.model.Category;

import java.util.List;

public class CategoryAdapter extends RecyclerView.Adapter<CategoryAdapter.CategoryViewHolder> {

    private List<Category> categoryList;

    public CategoryAdapter(List<Category> categoryList) {
        this.categoryList = categoryList;
    }

    @NonNull
    @Override
    public CategoryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_seemore, parent,
                false);
        return new CategoryViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CategoryViewHolder holder, int position) {
        holder.imgCategory.setImageResource(categoryList.get(position).getImageUrl());
    }

    @Override
    public int getItemCount() {
        if (categoryList != null) {
            return categoryList.size();
        }
        return 0;
    }

    public class CategoryViewHolder extends RecyclerView.ViewHolder {

        private ImageView imgCategory;

        public CategoryViewHolder(@NonNull View itemView) {
            super(itemView);
            imgCategory = itemView.findViewById(R.id.iv_seemore);
        }
    }
}
