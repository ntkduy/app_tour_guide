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
public class AboutFragment extends Fragment {
    private static final String TAG = "AboutFragment";

    @BindString(R.string.about_general_name)
    String generalName;
    @BindString(R.string.about_general_info)
    String generalInfo;
    @BindDrawable(R.drawable.about_general_leighton_beach_resized)
    Drawable generalImage;

    @BindString(R.string.about_explore_name)
    String exploreName;
    @BindString(R.string.about_explore_info)
    String exploreInfo;
    @BindDrawable(R.drawable.about_explore_south_perth_resized)
    Drawable exploreImage;


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
        datasetToAdapter.add(new Attractions(generalName, generalInfo, generalImage));
        datasetToAdapter.add(new Attractions(exploreName, exploreInfo, exploreImage));
    }
}
