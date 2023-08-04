package com.example.endavaapplication.mydemoapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.endavaapplication.R;
import com.example.endavaapplication.mydemoapp.model.Event;
import com.example.endavaapplication.mydemoapp.adapter.RecyclerViewAdapterEvent;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Event> events = new ArrayList<>();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setUpMockedEvents();
        RecyclerViewAdapterEvent recyclerViewAdapterEvent = new RecyclerViewAdapterEvent(events);
        RecyclerView recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(recyclerViewAdapterEvent);

        ImageButton cardButton = this.findViewById(R.id.cart_button);
        cardButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(intent);
            }
        });
    }

    private void setUpMockedEvents() {
        Event event1 = new Event("Untold", "The Capital of Night and Magic", "Central Park, Cluj-Napoca", "3-6 August", R.drawable.untoldlogo);
        Event event2 = new Event("Electric Castle", "Back to Life", "Bontida, Cluj", "19-23 July", R.drawable.electriccastleloggo);
        Event event3 = new Event("Wine Festival", "Life is Better with Wine", "Central Park, Cluj-Napoca", "26-29 August", R.drawable.wineloggo);
        Event event4 = new Event("Football", "Live, Love, Enjoy Football", "Cluj Arena, Cluj-Napoca", "4 September", R.drawable.footballloggo);
        events.add(event1);
        events.add(event2);
        events.add(event3);
        events.add(event4);
    }

}
