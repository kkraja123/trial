package com.vss.app.apprentice.fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.vss.app.apprentice.R;
import com.vss.app.apprentice.adapter.AdapterForTest;
import com.vss.app.apprentice.model.Test;

import java.util.ArrayList;

public class TestFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fra_attendance_history, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        final ArrayList<Test> testArrayList = new ArrayList<>();

        testArrayList.add(new Test("1. Question", " aaaa", " bbbb", " cccc", " dddd"));
        testArrayList.add(new Test("2. Question", " aaaa", " bbbb", " cccc", " dddd"));
        testArrayList.add(new Test("3. Question", " aaaa", " bbbb", " cccc", " dddd"));
        testArrayList.add(new Test("4. Question", " aaaa", " bbbb", " cccc", " dddd"));
        testArrayList.add(new Test("5. Question", " aaaa", " bbbb", " cccc", " dddd"));
        testArrayList.add(new Test("6. Question", " aaaa", " bbbb", " cccc", " dddd"));
        testArrayList.add(new Test("7. Question", " aaaa", " bbbb", " cccc", " dddd"));
        testArrayList.add(new Test("8. Question", " aaaa", " bbbb", " cccc", " dddd"));
        testArrayList.add(new Test("9. Question", " aaaa", " bbbb", " cccc", " dddd"));

        final AdapterForTest itemsAdapter = new AdapterForTest(TestFragment.this.getActivity(), testArrayList);
        final RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.recycle);
        recyclerView.setLayoutManager(new LinearLayoutManager(TestFragment.this.getActivity()));
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(itemsAdapter);

        TextView txtTittle, txtTimeDate;
        Button btnSubmit, btnCheckIn, btnCheckOut;

        txtTittle = view.findViewById(R.id.txt_attendance_history);
        txtTittle.setText("Questions");
        btnSubmit = view.findViewById(R.id.btn_ok);
        btnSubmit.setText("SUBMIT");
        txtTimeDate = view.findViewById(R.id.txt_date);
        txtTimeDate.setVisibility(View.GONE);
        btnCheckIn = view.findViewById(R.id.btn_checkin);
        btnCheckIn.setVisibility(View.GONE);
        btnCheckOut = view.findViewById(R.id.btn_checkout);
        btnCheckOut.setVisibility(View.GONE);
    }
}
