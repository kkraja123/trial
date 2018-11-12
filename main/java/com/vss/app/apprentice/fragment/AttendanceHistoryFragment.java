package com.vss.app.apprentice.fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.vss.app.apprentice.adapter.AdapterForAttendanceHistory;
import com.vss.app.apprentice.model.AttendanceHistory;
import com.vss.app.apprentice.R;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;

public class AttendanceHistoryFragment extends Fragment {

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fra_attendance_history, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        final ArrayList<AttendanceHistory> historyArrayList = new ArrayList<AttendanceHistory>();
        historyArrayList.add(new AttendanceHistory("October-2018", "Total Leaves - 5",
                "Leave Taken - 2", "Available Leave - 7"));
        historyArrayList.add(new AttendanceHistory("September-2018", "Total Leaves - 2",
                "Leave Taken - 3", "Available Leave - 4"));
        historyArrayList.add(new AttendanceHistory("August-2018", "Total Leaves - 4",
                "Leave Taken - 0", "Available Leave - 5"));
        historyArrayList.add(new AttendanceHistory("July-2018", "Total Leaves - 3",
                "Leave Taken - 2", "Available Leave - 1"));
        historyArrayList.add(new AttendanceHistory("October-2018", "Total Leaves - 5",
                "Leave Taken - 2", "Available Leave - 7"));
        historyArrayList.add(new AttendanceHistory("September-2018", "Total Leaves - 2",
                "Leave Taken - 3", "Available Leave - 4"));
        historyArrayList.add(new AttendanceHistory("August-2018", "Total Leaves - 4",
                "Leave Taken - 0", "Available Leave - 5"));
        historyArrayList.add(new AttendanceHistory("July-2018", "Total Leaves - 3",
                "Leave Taken - 2", "Available Leave - 1"));

        final AdapterForAttendanceHistory itemsAdapter = new AdapterForAttendanceHistory(AttendanceHistoryFragment.this.getActivity(), historyArrayList);
        final RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.recycle);
        recyclerView.setLayoutManager(new LinearLayoutManager(AttendanceHistoryFragment.this.getActivity()));
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(itemsAdapter);

        TextView txtDate, txtTittle;
        Button btnOk, checkIn;

        txtDate = view.findViewById(R.id.txt_date);
        String currentDateTimeString = DateFormat.getDateTimeInstance().format(new Date());
        txtDate.setText(currentDateTimeString);

        txtTittle = view.findViewById(R.id.txt_attendance_history);
        txtTittle.setText("Attendance History");

        btnOk = view.findViewById(R.id.btn_ok);
        btnOk.setVisibility(View.GONE);

        checkIn = view.findViewById(R.id.btn_checkin);
        checkIn.setVisibility(View.GONE);

    }
}
