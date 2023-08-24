package com.example.endavaapplication.mydemoapp;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.example.endavaapplication.R;
import com.example.endavaapplication.mydemoapp.model.Order;
import com.example.endavaapplication.mydemoapp.adapter.RecyclerViewAdapterOrder;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {

    ArrayList<Order> orders = new ArrayList<>();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        setUpMockedOrders();
        RecyclerViewAdapterOrder recyclerViewAdapterOrder = new RecyclerViewAdapterOrder(orders);
        RecyclerView recyclerView = findViewById(R.id.recycler_view_order);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(recyclerViewAdapterOrder);

        ImageButton cardButton = this.findViewById(R.id.back_button);
        cardButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }

    private void setUpMockedOrders() {
        Order order1 = new Order("Untold", "21/03/2023 03:23pm", "Number of Tickets: 3", "Total Price: 900$", R.drawable.untold);
        Order order2 = new Order("Wine Festival", "15/03/2023 01:14am", "Number of Tickets: 1", "Total Price: 15$", R.drawable.wine);
        Order order3 = new Order("Electric Castle", "02/01/2023 07:40pm", "Number of Tickets: 5", "Total Price: 2500$", R.drawable.electriccastle);
        Order order4 = new Order("Football", "23/02/2023 08:00pm", "Number of Tickets: 4", "Total Price: 80$", R.drawable.football);
        orders.add(order1);
        orders.add(order2);
        orders.add(order3);
        orders.add(order4);
    }
}