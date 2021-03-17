package android.exemple.com.daddstories_0.presentation.arabic;

import android.content.Context;
import android.exemple.com.daddstories_0.R;
import android.exemple.com.daddstories_0.data.Story;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class ArabicAdapter extends RecyclerView.Adapter<ArabicAdapter.viewHolder> {

    Context context;
    List<Story> storyList = new ArrayList();

    ArabicAdapter(Context context, List<Story> storyList)
    {
        this.context =context;
        this.storyList=storyList;
    }
    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.story_item,parent,false);
        return new viewHolder(view);
    }
    public void filter(ArrayList<Story> filteredList) {
       storyList = filteredList;
        notifyDataSetChanged();
    }
    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {
        Story story = storyList.get(position);

        holder.storyTilt.setText(story.getStoryTitle());
        holder.storyImg.setImageResource(story.getStoryImgUrl());
    }

    @Override
    public int getItemCount() {
        return storyList.size();
    }

    class viewHolder extends RecyclerView.ViewHolder
    {

        ImageView storyImg;
        TextView storyTilt;
        public viewHolder(@NonNull View itemView) {
            super(itemView);
            storyImg = itemView.findViewById(R.id.stotyItem_storyImg_iv);
            storyTilt = itemView.findViewById(R.id.stotyItem_storyTitle_tv);
        }
    }
}

