package com.vss.app.apprentice.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.app.FragmentManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

import com.vss.app.apprentice.R;
import com.vss.app.apprentice.model.Study;

import java.util.List;

public class AdapterForStudy extends RecyclerView.Adapter<AdapterForStudy.RecyclerVH> {
    private Context mCtx;
    private List<Study> inProgressList;

    public AdapterForStudy(Context mCtx, List<Study> inProgressList) {
        this.mCtx = mCtx;
        this.inProgressList = inProgressList;
    }

    @NonNull
    @Override
    public RecyclerVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(mCtx);
        View view = layoutInflater.inflate(R.layout.list_todo, parent, false);
        return new AdapterForStudy.RecyclerVH(view);
    }


    @Override
    public void onBindViewHolder(@NonNull final RecyclerVH holder, int position) {

        final Study study = inProgressList.get(position);

        holder.txtBook.setText(study.getBookName());
        holder.txtAuthor.setText(study.getBookAuther());
        holder.txtPage.setText(study.getPage());

        holder.imgDownload.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                holder.imgDownload.setImageResource(R.drawable.ic_file_download_green_24dp);
            }
        });

        holder.imgBookmark.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                holder.imgBookmark.setImageResource(R.drawable.ic_bookmark_green_24dp);
            }
        });
    }

    @Override
    public int getItemCount() {
        return inProgressList.size();
    }

    public class RecyclerVH extends RecyclerView.ViewHolder {
        TextView txtBook, txtAuthor, txtPage;
        ImageButton imgDownload, imgBookmark;

        public RecyclerVH(@NonNull View itemView) {
            super(itemView);
            txtBook = itemView.findViewById(R.id.txt_book_name);
            txtAuthor = itemView.findViewById(R.id.txt_author);
            txtPage = itemView.findViewById(R.id.txt_pages);
            imgDownload = itemView.findViewById(R.id.img_download);
            imgBookmark = itemView.findViewById(R.id.img_bookmark);
        }
    }
}
