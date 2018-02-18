package com.example.khalisavirra.khalisavirra_1202154312_modul2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import java.util.ArrayList;

public class DaftarMenuActivity extends AppCompatActivity {
    public static ArrayList<Menu> menuList = new ArrayList<>();

    private RecyclerView recyclerView;
    private MenusAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar_menu);

        menuList = isiMenu();
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);

        mAdapter = new MenusAdapter(menuList);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(mAdapter);

    }

    public ArrayList<Menu> isiMenu(){
        ArrayList<Menu> data = new ArrayList<>();

        data.add(new Menu(R.drawable.ayam,"Ayam Goreng", "Harga : Rp 20.000", "Tepung Terigu dan Daging Ayam"));

        data.add(new Menu(R.drawable.kentang,"Kentang Goreng", "Harga : Rp 12.000","Kentang berkualitas dicampur dengan bumbu rahasia"));

        data.add(new Menu(R.drawable.nachos,"Nachos", "Harga : Rp 23.000","Tortilla chips dengan saus bolognaise"));

        data.add(new Menu(R.drawable.pizza,"Pizza", "Harga : Rp 30.000","Daging berkualitas, keju mozarella serta dicampur dengan sayuran dilapisi dengan roti berkualitas"));

        return data;

    }
}
