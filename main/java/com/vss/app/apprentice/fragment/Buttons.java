package com.vss.app.apprentice.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.vss.app.apprentice.R;
import com.vss.app.apprentice.StudyActivity;

public class Buttons extends Fragment {

    Button attendance, study, feedback;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.buttons, container, false);
        attendance = v.findViewById(R.id.btn_attendance);
        study = v.findViewById(R.id.btn_study);
        feedback = v.findViewById(R.id.btn_feedback);

        attendance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction transaction = fragmentManager.beginTransaction();
                transaction.replace(R.id.container_id, new AttendanceHistoryFragment(), "AttendanceHomeFragment");
                transaction.addToBackStack(null);
                transaction.commit();
            }
        });

        study.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent;
                intent = new Intent(getActivity(), StudyActivity.class);
                startActivity(intent);
            }
        });

        feedback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.container_id, new FeedbackFragment(), "FeedbackFragment");
                transaction.addToBackStack(null);
                transaction.commit();
            }
        });
        return v;
    }
}
