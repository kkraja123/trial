package com.vss.app.apprentice.fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.vss.app.apprentice.R;
import com.vss.app.apprentice.adapter.AdapterForComplete;
import com.vss.app.apprentice.model.Study;

import java.util.ArrayList;

public class CompletedFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.recycle, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        final ArrayList<Study> studyArrayList = new ArrayList<>();

        studyArrayList.add(new Study("Chettinad Fish Fry - tutorial", "", "",
                8));
        studyArrayList.add(new Study("Chettinad Fish Fry - tutorial", "", "",
                8));
        studyArrayList.add(new Study("", "", "",
                8));
        studyArrayList.add(new Study("Chettinad Fish Fry - tutorial", "", "",
                8));
        studyArrayList.add(new Study("Chettinad Fish Fry - tutorial", "", "",
                8));
        studyArrayList.add(new Study("", "", "",
                8));
        studyArrayList.add(new Study("Chettinad Fish Fry - tutorial", "", "",
                8));
        studyArrayList.add(new Study("", "", "",
                8));
        studyArrayList.add(new Study("", "", "",
                8));

        final AdapterForComplete itemsAdapter = new AdapterForComplete(CompletedFragment.this.getActivity(), studyArrayList);
        final RecyclerView recyclerView = view.findViewById(R.id.recycle);
        recyclerView.setLayoutManager(new LinearLayoutManager(CompletedFragment.this.getActivity()));
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(itemsAdapter);
    }
}