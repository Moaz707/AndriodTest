package nyc.muaadh_melhi_develpoer.andriodtest;


import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class CustomFragment extends Fragment {


    private TextView fragmentText;

    public CustomFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_list, container, false);


        fragmentText = view.findViewById(R.id.text);
        RecyclerView recyclerView = view.findViewById(R.id.recycler_view);

        List<ModelData> modelData = listNumber();

        MyAdapter adapter = new MyAdapter(getActivity(),modelData,CustomFragment.this);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);


        return view;

    }

    private List<ModelData> listNumber() {
        List<ModelData> list = new ArrayList<>();
        list.add(new ModelData(0));
        list.add(new ModelData(1));
        list.add(new ModelData(2));
        list.add(new ModelData(3));
        list.add(new ModelData(4));
        list.add(new ModelData(5));
        list.add(new ModelData(6));
        list.add(new ModelData(7));
        list.add(new ModelData(8));
        list.add(new ModelData(9));
        list.add(new ModelData(10));
        return list;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        Intent intent = getActivity().getIntent();
        String emailPassed = intent.getStringExtra(LoginActivity.EMAIL_KEY);
        fragmentText.setText(emailPassed);
    }
}


