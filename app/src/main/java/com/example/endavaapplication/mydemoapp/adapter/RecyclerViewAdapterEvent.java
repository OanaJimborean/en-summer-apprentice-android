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
import com.example.endavaapplication.mydemoapp.model.Event;

import java.util.ArrayList;

public class RecyclerViewAdapterEvent extends RecyclerView.Adapter<RecyclerViewAdapterEvent.EventViewHolder> {

    private final ArrayList<Event> events;

    public RecyclerViewAdapterEvent(ArrayList<Event> events) {
        this.events = events;
    }

    @NonNull
    @Override
    public EventViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater
                .from(parent.getContext())
                .inflate(R.layout.recycler_view_card, parent, false);
        return new EventViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull EventViewHolder holder, int position) {
        holder.bind(this.events.get(position));
    }

    @Override
    public int getItemCount() {
        return events.size();
    }

    public class EventViewHolder extends RecyclerView.ViewHolder {
        public EventViewHolder(@NonNull View itemView) {
            super(itemView);
        }

        public void bind(Event event) {
            ImageView cardIcon = this.itemView.findViewById(R.id.card_icon);
            TextView cardTitle = this.itemView.findViewById(R.id.card_title);
            TextView cardDescription = this.itemView.findViewById(R.id.card_description);
            TextView cardLocation = this.itemView.findViewById(R.id.card_location);
            TextView cardDate = this.itemView.findViewById(R.id.card_date);
            ImageButton cardButton = this.itemView.findViewById(R.id.cart_button);
            cardIcon.setImageResource(event.image);
            cardTitle.setText(event.eventName);
            cardDescription.setText(event.eventDescription);
            cardLocation.setText(event.eventLocation);
            cardDate.setText(event.eventDate);
        }

    }
}
