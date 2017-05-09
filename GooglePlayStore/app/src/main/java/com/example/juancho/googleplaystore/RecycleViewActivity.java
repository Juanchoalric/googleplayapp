package com.example.juancho.googleplaystore;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class RecycleViewActivity extends AppCompatActivity {

    private List<Product> products;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycle_view);

        RecyclerView rv = (RecyclerView)findViewById(R.id.rv);
        products = new ArrayList<>();

        cargarProductos();

        rv.setHasFixedSize(true);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        rv.setLayoutManager(layoutManager);

        ProductsAdapter adapter = new ProductsAdapter(products);
        rv.setAdapter(adapter);

        //cargarDetailGameFragment();

    }

    public void cargarProductos(){

        products.add(new Product("Zelda", R.drawable.swordartonline, 4.3, "gratis"));
        products.add(new Product("Final Fantasy", R.drawable.swordartonline, 3.4, "gratis"));
        products.add(new Product("Clash Royale", R.drawable.swordartonline, 1.5, "gratis"));
        products.add(new Product("Zelda", R.drawable.swordartonline, 4.3, "gratis"));
        products.add(new Product("Zelda", R.drawable.swordartonline, 4.9, "gratis"));
        products.add(new Product("Zelda", R.drawable.swordartonline, 4.3, "gratis"));
        products.add(new Product("Zelda", R.drawable.swordartonline, 4.3, "gratis"));
        products.add(new Product("Zelda", R.drawable.swordartonline, 4.3, "gratis"));
        products.add(new Product("Zelda", R.drawable.swordartonline, 4.3, "gratis"));
        products.add(new Product("Zelda", R.drawable.swordartonline, 4.3, "gratis"));
        products.add(new Product("Zelda", R.drawable.swordartonline, 4.3, "gratis"));
        products.add(new Product("Zelda", R.drawable.swordartonline, 4.3, "gratis"));
        products.add(new Product("Zelda", R.drawable.swordartonline, 4.3, "gratis"));
        products.add(new Product("Zelda", R.drawable.swordartonline, 4.3, "gratis"));
    }



}
