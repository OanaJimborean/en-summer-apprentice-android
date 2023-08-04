package com.example.endavaapplication.mydemoapp.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.endavaapplication.R;
import com.example.endavaapplication.mydemoapp.model.Order;

import java.util.ArrayList;

public class RecyclerViewAdapterOrder extends RecyclerView.Adapter<RecyclerViewAdapterOrder.OrderViewHolder> {

    private final ArrayList<Order> orders;

    public RecyclerViewAdapterOrder(ArrayList<Order> orders) {
        this.orders = orders;
    }


    @NonNull
    @Override
    public OrderViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater
                .from(parent.getContext())
                .inflate(R.layout.recycler_card_order, parent, false);
        return new OrderViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull OrderViewHolder holder, int position) {
        holder.bind(this.orders.get(position));
    }

    @Override
    public int getItemCount() {
        return orders.size();
    }

    public class OrderViewHolder extends RecyclerView.ViewHolder {
        public OrderViewHolder(@NonNull View itemView) {
            super(itemView);
        }

        public void bind(Order order) {
            ImageView cardIcon = this.itemView.findViewById(R.id.card_image);
            TextView cardTitle = this.itemView.findViewById(R.id.card_order_title);
            TextView cardOrderedAt = this.itemView.findViewById(R.id.card_ordered_at);
            TextView cardNumberOfTickets = this.itemView.findViewById(R.id.card_number_tickets);
            TextView cardPrice = this.itemView.findViewById(R.id.card_price);
            ImageButton cardButtonBack = this.itemView.findViewById(R.id.back_button);
            ImageButton cardButtonProfile = this.itemView.findViewById(R.id.profile_button);

            cardIcon.setImageResource(order.image);
            cardTitle.setText(order.orderName);
            cardOrderedAt.setText(order.orderedAt);
            cardNumberOfTickets.setText(order.numberOfTickets);
            cardPrice.setText(order.totalPrice);

        }

    }

}
