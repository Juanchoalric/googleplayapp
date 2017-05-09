package com.example.juancho.googleplaystore;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cargarDetailGameFragment();

    }

    public void cargarDetailGameFragment(){
        //Fragment manager me permite hacer cosas con los fragments
        FragmentManager unFragmentManager = getSupportFragmentManager();
        //Las transacciones me permiten hacer cosas como poner un fragment en un activity
        FragmentTransaction fragmentTransaction = unFragmentManager.beginTransaction();
        //aca hace esto
        ListFragment listFragment = new ListFragment();
        fragmentTransaction.replace(R.id.contenedor_fragment, listFragment);
        //aca hace lo otro

        fragmentTransaction.commit();
    }
}
