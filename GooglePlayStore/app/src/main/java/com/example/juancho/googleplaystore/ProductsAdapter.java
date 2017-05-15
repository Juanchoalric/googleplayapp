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
 * Created by juancho on 08/05/17.
 */

 public class ProductsAdapter extends RecyclerView.Adapter<ProductsAdapter.ProductViewHolder>{

    private List<Product> products;

    public ProductsAdapter(List<Product> products) {
        this.products = products;
    }

    public static class ProductViewHolder extends RecyclerView.ViewHolder {
         private CardView cv;
         private TextView titleProduct;
         private TextView starProduct;
         private ImageView imageProduct;
         private TextView valorProduct;




        public ProductViewHolder(View itemView) {
            super(itemView);
            cv = (CardView)itemView.findViewById(R.id.cv);
            titleProduct = (TextView)itemView.findViewById(R.id.titulo_juego);
            starProduct = (TextView)itemView.findViewById(R.id.estrellas_juego);
            imageProduct = (ImageView)itemView.findViewById(R.id.imagen_juego);
            valorProduct = (TextView)itemView.findViewById(R.id.valor_juego);
        }




    }

    @Override
    public int getItemCount() {
        return products.size();
    }

    @Override
    public ProductViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.detalle_item, parent, false);
        ProductViewHolder pvh = new ProductViewHolder(v);
        return pvh;
    }

    @Override
    public void onBindViewHolder(ProductViewHolder holder, int position) {
        holder.starProduct.setText(products.get(position).getStarsProduct().toString());
        holder.titleProduct.setText(products.get(position).getTitulo());
        holder.imageProduct.setImageResource(products.get(position).getImageProduct());
        holder.valorProduct.setText(products.get(position).getValorGratis());
    }

}
