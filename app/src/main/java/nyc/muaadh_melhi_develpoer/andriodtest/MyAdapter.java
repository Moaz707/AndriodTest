package nyc.muaadh_melhi_develpoer.andriodtest;

import android.app.Fragment;
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by c4q on 12/6/17.
 */

class MyAdapter extends RecyclerView.Adapter<MyViewHolder> {
    private List<ModelData> list;
    public static Context context;
    public static CustomFragment fragment;

    public MyAdapter(Context ctx, List<ModelData> list, CustomFragment fragment) {
        this.list = list;
        this.context = ctx;
        this.fragment = fragment;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.view_holder, parent, false);
        return new MyViewHolder(view);

    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        holder.onBind(list.get(position));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

}
