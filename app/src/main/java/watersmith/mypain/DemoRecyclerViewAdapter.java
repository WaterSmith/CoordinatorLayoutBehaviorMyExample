package watersmith.mypain;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by WaterSmith on 14.01.2018.
 */

class DemoRecyclerViewAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.main_list_item, parent, false);

        return new DemoListViewHolder(v);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 300;
    }

    class DemoListViewHolder extends RecyclerView.ViewHolder {
        DemoListViewHolder(View itemView) {
            super(itemView);
        }
    }
}
