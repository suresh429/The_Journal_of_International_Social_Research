package com.journals.sosyalarastirmalar.ui.adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.request.RequestOptions;
import com.bumptech.glide.request.target.CustomTarget;
import com.bumptech.glide.request.transition.Transition;

import com.journals.sosyalarastirmalar.R;
import com.journals.sosyalarastirmalar.databinding.EditorialBoardItemBinding;
import com.journals.sosyalarastirmalar.model.EditorialBoardResponse;

import java.util.List;

public class EditorialBoardAdapter extends RecyclerView.Adapter<EditorialBoardAdapter.ViewHolder> {

    List<EditorialBoardResponse.EditorialboardarrBean> modelList;
    Context context;

    public EditorialBoardAdapter(List<EditorialBoardResponse.EditorialboardarrBean> modelList, Context context) {
        this.modelList = modelList;
        this.context = context;
    }

    @NonNull
    @Override
    public EditorialBoardAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(EditorialBoardItemBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false));
    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onBindViewHolder(@NonNull EditorialBoardAdapter.ViewHolder holder, int position) {


        holder.rowItemBinding.txtName.setText(modelList.get(position).getEname() + " " + modelList.get(position).getEQlf());



        if (modelList.get(position).getEditorType() != null && !modelList.get(position).getEditorType().equalsIgnoreCase("null") && !modelList.get(position).getEditorType().isEmpty()) {
            holder.rowItemBinding.txtView1.setText(modelList.get(position).getEditorType());
        } else {
            holder.rowItemBinding.txtView1.setVisibility(View.GONE);
        }


        if (modelList.get(position).getEditorDesig() != null && !modelList.get(position).getEditorDesig().equalsIgnoreCase("null") && !modelList.get(position).getEditorDesig().isEmpty()
                || modelList.get(position).getEditorDept() != null && !modelList.get(position).getEditorDept().equalsIgnoreCase("null") && !modelList.get(position).getEditorDept().isEmpty()) {

            if (modelList.get(position).getEditorDesig() != null && !modelList.get(position).getEditorDesig().equalsIgnoreCase("null") && !modelList.get(position).getEditorDesig().isEmpty()) {
                holder.rowItemBinding.txtView2.setText(modelList.get(position).getEditorDesig() + " " + modelList.get(position).getEditorDept());

            } else {
                holder.rowItemBinding.txtView2.setText(modelList.get(position).getEditorDept());
            }

        } else {
            holder.rowItemBinding.txtView2.setVisibility(View.GONE);
        }


        if (modelList.get(position).getUname() != null && !modelList.get(position).getUname().equalsIgnoreCase("null") && !modelList.get(position).getUname().isEmpty()
                || modelList.get(position).getExUnvName() != null && !modelList.get(position).getExUnvName().equalsIgnoreCase("null") && !modelList.get(position).getExUnvName().isEmpty()
                || modelList.get(position).getCountryName() != null && !modelList.get(position).getCountryName().equalsIgnoreCase("null") && !modelList.get(position).getCountryName().isEmpty()) {

            if (modelList.get(position).getUname() != null && !modelList.get(position).getUname().equalsIgnoreCase("null") && !modelList.get(position).getUname().isEmpty()) {
                holder.rowItemBinding.txtView3.setText(modelList.get(position).getUname() + " " + modelList.get(position).getExUnvName() + " " + modelList.get(position).getCountryName());

            } else if (modelList.get(position).getExUnvName() != null && !modelList.get(position).getExUnvName().equalsIgnoreCase("null") && !modelList.get(position).getExUnvName().isEmpty()) {
                holder.rowItemBinding.txtView3.setText(modelList.get(position).getExUnvName() + " " + modelList.get(position).getCountryName());

            } else {
                holder.rowItemBinding.txtView3.setText(modelList.get(position).getCountryName());
            }


        } else {
            holder.rowItemBinding.txtView3.setVisibility(View.GONE);
        }


        if (modelList.get(position).getPhoto() != null && !modelList.get(position).getPhoto().equalsIgnoreCase("null") && !modelList.get(position).getPhoto().isEmpty()) {
            Glide.with(context)
                    .load(modelList.get(position).getPhoto())
                    .apply(new RequestOptions().diskCacheStrategy(DiskCacheStrategy.NONE))
                    .into(new CustomTarget<Drawable>() {
                        @Override
                        public void onResourceReady(@NonNull Drawable resource, @Nullable Transition<? super Drawable> transition) {
                            holder.rowItemBinding.imgPhoto.setImageDrawable(resource);
                            holder.rowItemBinding.imgPhoto.setVisibility(View.VISIBLE);

                        }

                        @Override
                        public void onLoadCleared(@Nullable Drawable placeholder) {


                        }

                    });
        } else {
            holder.rowItemBinding.imgPhoto.setVisibility(View.GONE);
        }


        if (modelList.get(position).getBiography() != null && !modelList.get(position).getBiography().equalsIgnoreCase("null") && !modelList.get(position).getBiography().isEmpty()) {
            holder.rowItemBinding.btnBiography.setVisibility(View.VISIBLE);
        } else {
            holder.rowItemBinding.btnBiography.setVisibility(View.GONE);
        }
        holder.rowItemBinding.btnBiography.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle = new Bundle();
                bundle.putString("value", modelList.get(position).getBiography());
                bundle.putString("ActionBarTitle", "Biography");

                Navigation.findNavController(v).navigate(R.id.biographyResearchFragment, bundle);


            }
        });
        if (modelList.get(position).getResearchInterest() != null && !modelList.get(position).getResearchInterest().equalsIgnoreCase("null") && !modelList.get(position).getResearchInterest().isEmpty()) {
            holder.rowItemBinding.btnResearch.setVisibility(View.VISIBLE);
        } else {
            holder.rowItemBinding.btnResearch.setVisibility(View.GONE);
        }
        holder.rowItemBinding.btnResearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle = new Bundle();
                bundle.putString("value", modelList.get(position).getResearchInterest());
                bundle.putString("ActionBarTitle", "Research Interest");
                Navigation.findNavController(v).navigate(R.id.biographyResearchFragment, bundle);

            }
        });
    }

    @Override
    public int getItemCount() {
        return modelList.size();
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public int getItemViewType(int position) {
        return position;
    }



    public static class ViewHolder extends RecyclerView.ViewHolder {
        EditorialBoardItemBinding rowItemBinding;

        public ViewHolder(@NonNull EditorialBoardItemBinding rowItemBinding) {
            super(rowItemBinding.getRoot());
            this.rowItemBinding = rowItemBinding;
        }
    }
}
