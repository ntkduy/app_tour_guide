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
public class ThingsFragment extends Fragment {
    private static final String TAG = "AboutFragment";

    @BindString(R.string.must_do_01_name)
    String mustDo01Name;
    @BindString(R.string.must_do_01_info)
    String mustDo01Info;
    @BindDrawable(R.drawable.must_do_rottnest_island_resized)
    Drawable mustDo01Image;

    @BindString(R.string.must_do_02_name)
    String mustDo02Name;
    @BindString(R.string.must_do_02_info)
    String mustDo02Info;
    @BindDrawable(R.drawable.must_do_penguin_island_resized)
    Drawable mustDo02Image;

    @BindString(R.string.must_do_03_name)
    String mustDo03Name;
    @BindString(R.string.must_do_03_info)
    String mustDo03Info;
    @BindDrawable(R.drawable.must_do_fremantle_market_resized)
    Drawable mustDo03Image;

    @BindString(R.string.must_do_04_name)
    String mustDo04Name;
    @BindString(R.string.must_do_04_info)
    String mustDo04Info;
    @BindDrawable(R.drawable.must_do_cottesloe_beach_resized)
    Drawable mustDo04Image;


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
        datasetToAdapter.add(new Attractions(mustDo01Name, mustDo01Info, mustDo01Image));
        datasetToAdapter.add(new Attractions(mustDo02Name, mustDo02Info, mustDo02Image));
        datasetToAdapter.add(new Attractions(mustDo03Name, mustDo03Info, mustDo03Image));
        datasetToAdapter.add(new Attractions(mustDo04Name, mustDo04Info, mustDo04Image));
    }
}
