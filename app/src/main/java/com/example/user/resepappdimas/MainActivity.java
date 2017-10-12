package com.example.user.resepappdimas;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<ResepModel> listResep;
    private RecyclerView recyclerView;
    private RecyclerView.LayoutManager layoutManager;
    private RecyclerView.Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);


        listResep = new ArrayList<>();


        ResepModel resepLists = new ResepModel("Ayam Goreng", R.drawable.ayam);
        listResep.add(resepLists);

        resepLists = new ResepModel("Bakso ayam", R.drawable.bakso);
        listResep.add(resepLists);

        resepLists = new ResepModel("Mie keju", R.drawable.mie);
        listResep.add(resepLists);

        resepLists = new ResepModel("Nasi Goreng Rendang", R.drawable.nasigoreng);
        listResep.add(resepLists);

        resepLists = new ResepModel("Udang goreng", R.drawable.udang);
        listResep.add(resepLists);



        adapter = new ResepAdapter(listResep, this);


    }
}