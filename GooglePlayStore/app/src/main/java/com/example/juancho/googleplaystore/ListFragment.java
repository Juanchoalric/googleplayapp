package com.example.juancho.googleplaystore;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class ListFragment extends Fragment {

    private List<Product> products;

    public ListFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_list, container, false);

        RecyclerView rv = (RecyclerView)view.findViewById(R.id.rv);
        products = new ArrayList<>();

        cargarProductos();

        rv.setHasFixedSize(true);

        LinearLayoutManager layoutManager = new LinearLayoutManager(view.getContext(), LinearLayoutManager.HORIZONTAL, false);
        rv.setLayoutManager(layoutManager);

        ProductsAdapter adapter = new ProductsAdapter(products);
        rv.setAdapter(adapter);

        return view;
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
