package com.vss.app.apprentice.adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.vss.app.apprentice.R;
import com.vss.app.apprentice.model.Test;

import java.util.List;

public class AdapterForTest extends RecyclerView.Adapter<AdapterForTest.RecyclerVH> {

    private Context mCtx;
    private List<Test> testList;

    public AdapterForTest(Context mCtx, List<Test> testList) {
        this.mCtx = mCtx;
        this.testList = testList;
    }

    @NonNull
    @Override
    public AdapterForTest.RecyclerVH onCreateViewHolder(@NonNull ViewGroup parent, int vireType) {
        LayoutInflater layoutInflater = LayoutInflater.from(mCtx);
        View view = layoutInflater.inflate(R.layout.list_test, parent, false);
        return new AdapterForTest.RecyclerVH(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterForTest.RecyclerVH holder, int position) {

        Test test = testList.get(position);

        holder.question.setText(test.getQuestion());

        holder.option_1.setText("A)" + test.getOption_1());
        holder.option_2.setText("B)" + test.getOption_2());
        holder.option_3.setText("C)" + test.getOption_3());
        holder.option_4.setText("D)" + test.getOption_4());
    }

    @Override
    public int getItemCount() {
        return testList.size();
    }

    public class RecyclerVH extends RecyclerView.ViewHolder {
        TextView question;
        RadioButton option_1, option_2, option_3, option_4;

        public RecyclerVH(@NonNull View itemView) {
            super(itemView);

            question = itemView.findViewById(R.id.txt_question);
            option_1 = itemView.findViewById(R.id.radio_option_1);
            option_2 = itemView.findViewById(R.id.radio_option_2);
            option_3 = itemView.findViewById(R.id.radio_option_3);
            option_4 = itemView.findViewById(R.id.radio_option_4);
        }
    }
}
