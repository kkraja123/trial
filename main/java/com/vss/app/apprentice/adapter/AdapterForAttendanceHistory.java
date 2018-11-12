package com.vss.app.apprentice.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.vss.app.apprentice.model.AttendanceHistory;
import com.vss.app.apprentice.R;

import java.util.List;

public class AdapterForAttendanceHistory extends RecyclerView.Adapter<AdapterForAttendanceHistory.RecyclerVH> {
    private Context mCtx;
    private List<AttendanceHistory> historyList;

    public AdapterForAttendanceHistory(Context mCtx, List<AttendanceHistory> historyList) {
        this.mCtx = mCtx;
        this.historyList = historyList;
    }

    @NonNull
    @Override
    public AdapterForAttendanceHistory.RecyclerVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(mCtx);
        View view = layoutInflater.inflate(R.layout.list_attendance_history, parent, false);
        return new AdapterForAttendanceHistory.RecyclerVH(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterForAttendanceHistory.RecyclerVH holder, int position) {
        AttendanceHistory attendanceHistory = historyList.get(position);
        holder.txtMonthAndYear.setText(attendanceHistory.getMonthAndYear());
        holder.txtAvailableLeave.setText(attendanceHistory.getAvailableLeave());
        holder.txtLeaveTaken.setText(attendanceHistory.getLeaveTaken());
        holder.txtTotalLeave.setText(attendanceHistory.getTotalLeave());
    }

    @Override
    public int getItemCount() {
        return historyList.size();
    }

    public class RecyclerVH extends RecyclerView.ViewHolder {
        TextView txtMonthAndYear, txtTotalLeave, txtLeaveTaken, txtAvailableLeave;

        public RecyclerVH(@NonNull View itemView) {
            super(itemView);
            txtMonthAndYear = itemView.findViewById(R.id.txt_month_year);
            txtTotalLeave = itemView.findViewById(R.id.txt_total_leave);
            txtLeaveTaken = itemView.findViewById(R.id.txt_leave_taken);
            txtAvailableLeave = itemView.findViewById(R.id.txt_available_leave);

        }
    }
}
