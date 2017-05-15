package com.example.juancho.googleplaystore;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by juancho on 15/05/17.
 */

public class CategoryAdapter extends RecyclerView.Adapter<CategoryAdapter.CategoryViewHolder> {

    private List<Category> categories;

    public CategoryAdapter(List<Category> categories) {
        this.categories = categories;
    }

    public static class CategoryViewHolder extends RecyclerView.ViewHolder {
        private TextView categoryName;

        public CategoryViewHolder(View itemView) {
            super(itemView);
            categoryName = (TextView)itemView.findViewById(R.id.category_name);
        }
    }


    @Override
    public CategoryAdapter.CategoryViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.detalle_category, parent, false);
        CategoryViewHolder categoryViewHost = new CategoryViewHolder(view);
        return categoryViewHost;
    }

    @Override
    public void onBindViewHolder(CategoryAdapter.CategoryViewHolder holder, int position) {
        holder.categoryName.setText(categories.get(position).getCategoryName().toString());
    }

    @Override
    public int getItemCount() {
        return categories.size();
    }
}
