package com.vss.app.apprentice.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.vss.app.apprentice.R;
import com.vss.app.apprentice.TestActivity;
import com.vss.app.apprentice.fragment.TestFragment;
import com.vss.app.apprentice.model.Study;

import java.util.List;

public class AdapterForComplete extends RecyclerView.Adapter<AdapterForComplete.RecyclerVH> {
    private Context mCtx;
    private List<Study> studyList;

    public AdapterForComplete(Context mCtx, List<Study> studyList) {
        this.mCtx = mCtx;
        this.studyList = studyList;
    }

    @NonNull
    @Override
    public AdapterForComplete.RecyclerVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(mCtx);
        View view = layoutInflater.inflate(R.layout.list_completed, parent, false);
        return new AdapterForComplete.RecyclerVH(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final AdapterForComplete.RecyclerVH holder, final int position) {

        Study study = studyList.get(position);

        holder.recipieTittle.setText(study.getBookName());
        holder.complete.setText("Completed");
        holder.takeTest.setText("Do You Want To Take Test?");
        holder.testComplete.setText("Test Completed");
        holder.score.setText("Your Score :" + " " + study.getScore() + "/10");
        holder.congrats.setText("Congratulations !");

        if (study.getBookName().equals("Chettinad Fish Fry - tutorial")) {

            holder.testComplete.setVisibility(View.GONE);
            holder.score.setVisibility(View.GONE);
            holder.congrats.setVisibility(View.GONE);
            holder.takeTest.setVisibility(View.VISIBLE);
            holder.btnTakeTest.setVisibility(View.VISIBLE);
        } else {
            holder.takeTest.setVisibility(View.GONE);
            holder.btnTakeTest.setVisibility(View.GONE);
            holder.testComplete.setVisibility(View.VISIBLE);
            holder.score.setVisibility(View.VISIBLE);
            holder.congrats.setVisibility(View.VISIBLE);
        }

        holder.btnTakeTest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(mCtx, TestActivity.class);
                mCtx.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return studyList.size();
    }

    public static class RecyclerVH extends RecyclerView.ViewHolder {

        TextView recipieTittle, complete, takeTest, testComplete, score, congrats;
        Button btnTakeTest;

        public RecyclerVH(@NonNull View itemView) {
            super(itemView);

            recipieTittle = itemView.findViewById(R.id.txt_recipe_name);
            complete = itemView.findViewById(R.id.txt_completed);
            takeTest = itemView.findViewById(R.id.txt_take_test);
            testComplete = itemView.findViewById(R.id.txt_test_complete);
            score = itemView.findViewById(R.id.txt_score);
            congrats = itemView.findViewById(R.id.txt_congrats);
            btnTakeTest = itemView.findViewById(R.id.btn_take_test);
        }
    }
}
