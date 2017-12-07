package nyc.muaadh_melhi_develpoer.andriodtest;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Created by c4q on 12/6/17.
 */

class MyViewHolder extends RecyclerView.ViewHolder {
    private TextView textView;


    public MyViewHolder(View itemView) {
        super(itemView);
    }

    public void onBind(ModelData modelData) {
        textView = itemView.findViewById(R.id.text_view_holder);
        textView.setText("" + modelData.getNumber());


        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DisplayNumberFragment displayNumberFragment = new DisplayNumberFragment();
                Bundle bundle = new Bundle();
                bundle.putString("input", textView.getText().toString());
                displayNumberFragment.setArguments(bundle);

                MyAdapter.fragment.getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,displayNumberFragment ).addToBackStack("").commit()





            }
        });
    }
}
