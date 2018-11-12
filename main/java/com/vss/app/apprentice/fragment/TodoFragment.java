package com.vss.app.apprentice.fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.vss.app.apprentice.R;
import com.vss.app.apprentice.adapter.AdapterForStudy;
import com.vss.app.apprentice.model.Study;

import java.util.ArrayList;


public class TodoFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.recycle, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        final ArrayList<Study> todoArrayList = new ArrayList<Study>();

        todoArrayList.add(new Study("Wheat Pasta in Mushroom Sauce-", "Recipe by Chef Ritu Dalmia", "20 Pages", 0));
        todoArrayList.add(new Study("Wheat Pasta in Mushroom Sauce-", "Recipe by Chef Ritu Dalmia", "20 Pages", 0));
        todoArrayList.add(new Study("Wheat Pasta in Mushroom Sauce-", "Recipe by Chef Ritu Dalmia", "20 Pages", 0));
        todoArrayList.add(new Study("Wheat Pasta in Mushroom Sauce-", "Recipe by Chef Ritu Dalmia", "20 Pages", 0));
        todoArrayList.add(new Study("Wheat Pasta in Mushroom Sauce-", "Recipe by Chef Ritu Dalmia", "20 Pages", 0));
        todoArrayList.add(new Study("Wheat Pasta in Mushroom Sauce-", "Recipe by Chef Ritu Dalmia", "20 Pages", 0));
        todoArrayList.add(new Study("Wheat Pasta in Mushroom Sauce-", "Recipe by Chef Ritu Dalmia", "20 Pages", 0));
        todoArrayList.add(new Study("Wheat Pasta in Mushroom Sauce-", "Recipe by Chef Ritu Dalmia", "20 Pages", 0));

        final AdapterForStudy itemsAdapter = new AdapterForStudy(TodoFragment.this.getActivity(), todoArrayList);
        final RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.recycle);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(TodoFragment.this.getActivity(), 2);
        recyclerView.setLayoutManager(gridLayoutManager);
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(itemsAdapter);

    }
}
