package com.ntkduy1604.tourguidewa.fragments;


import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ntkduy1604.tourguidewa.R;
import com.ntkduy1604.tourguidewa.model.Attractions;
import com.ntkduy1604.tourguidewa.recycling.AttractionAdapter;

import java.util.ArrayList;

import butterknife.BindDrawable;
import butterknife.BindString;
import butterknife.ButterKnife;

/**
 * A simple {@link Fragment} subclass.
 */
public class FoodFragment extends Fragment {
    private static final String TAG = "AboutFragment";

    @BindString(R.string.food_and_drink_01_name)
    String food01Name;
    @BindString(R.string.food_and_drink_01_info)
    String food01Info;
    @BindDrawable(R.drawable.food_and_drink_cider_house_resized)
    Drawable food01Image;

    @BindString(R.string.food_and_drink_02_name)
    String food02Name;
    @BindString(R.string.food_and_drink_02_info)
    String food02Info;
    @BindDrawable(R.drawable.food_and_drink_janebrook_wine_resized)
    Drawable food02Image;


    protected RecyclerView mRecyclerView;
    protected AttractionAdapter mAdapter;
    protected RecyclerView.LayoutManager mLayoutManager;
    protected ArrayList<Attractions> datasetToAdapter = new ArrayList<>();

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.recycler_view_frag, container, false);
        rootView.setTag(TAG);
        ButterKnife.bind(this,rootView);

        // BEGIN_INCLUDE(initializeRecyclerView)
        mRecyclerView = rootView.findViewById(R.id.recyclerView);

        // LinearLayoutManager is used here, this will layout the elements in a similar fashion
        // to the way ListView would layout elements. The RecyclerView.LayoutManager defines how
        // elements are laid out.
        mLayoutManager = new LinearLayoutManager(getActivity());
        mRecyclerView.setLayoutManager(mLayoutManager);


        initDataset();

        mAdapter = new AttractionAdapter(datasetToAdapter);
        // Set AttractionAdapter as the adapter for RecyclerView.
        mRecyclerView.setAdapter(mAdapter);
        // END_INCLUDE(initializeRecyclerView)

        return rootView;

    }

    private void initDataset() {
        datasetToAdapter.add(new Attractions(food01Name, food01Info, food01Image));
        datasetToAdapter.add(new Attractions(food02Name, food02Info, food02Image));
    }
}
