package com.ntkduy1604.tourguidewa.recycling;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ntkduy1604.tourguidewa.model.Attractions;

import com.ntkduy1604.tourguidewa.R;

import java.util.ArrayList;

/**
 * Provide views to RecyclerView with data from attractions.
 */
public class AttractionAdapter extends RecyclerView.Adapter<ViewHolder> {
    private static final String TAG = "AttractionAdapter";

    private final ArrayList<Attractions> attractions;

    public AttractionAdapter(ArrayList<Attractions> dataSet) {
        attractions = dataSet;
    }

    // BEGIN_INCLUDE(recyclerViewOnCreateViewHolder)
    // Create new views (invoked by the layout manager)
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        // Create a new view.
        View v = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.recycler_list_item, viewGroup, false);

        return new ViewHolder(v);
    }
    // END_INCLUDE(recyclerViewOnCreateViewHolder)

    // BEGIN_INCLUDE(recyclerViewOnBindViewHolder)
    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, final int position) {
        // Get element from your dataset at this position and replace the contents of the view
        // with that element
        viewHolder.bindDataModel(attractions.get(position));
    }
    // END_INCLUDE(recyclerViewOnBindViewHolder)

    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return attractions.size();
    }

}