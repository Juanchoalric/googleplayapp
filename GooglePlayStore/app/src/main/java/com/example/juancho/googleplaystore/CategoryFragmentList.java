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

import static com.example.juancho.googleplaystore.R.id.category_rv;
import static com.example.juancho.googleplaystore.R.id.rv;


/**
 * A simple {@link Fragment} subclass.
 */
public class CategoryFragmentList extends Fragment {

    private List<Category> categories;

    public CategoryFragmentList() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_category_fragment_list, container, false);

        RecyclerView categoryRV = (RecyclerView)view.findViewById(category_rv);
        categories = new ArrayList<>();

        cargarCategories();

        categoryRV.setHasFixedSize(true);

        LinearLayoutManager layoutManagerCategory = new LinearLayoutManager(view.getContext(), LinearLayoutManager.HORIZONTAL, false);
        categoryRV.setLayoutManager(layoutManagerCategory);

        CategoryAdapter adapter = new CategoryAdapter(categories);
        categoryRV.setAdapter(adapter);

        return view;
    }

    public void cargarCategories(){

        categories.add(new Category("fantasy"));
        categories.add(new Category("Terror"));
        categories.add(new Category("suspense"));
        categories.add(new Category("drama"));
        categories.add(new Category("Comedy"));


    }

}
