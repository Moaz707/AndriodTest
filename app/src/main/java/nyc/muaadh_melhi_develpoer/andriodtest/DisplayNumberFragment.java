package nyc.muaadh_melhi_develpoer.andriodtest;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class DisplayNumberFragment extends Fragment {


    public DisplayNumberFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_display_number, container, false);

        TextView textView = rootView.findViewById(R.id.display_number);


        Bundle bundle = getArguments();
        if (bundle != null) {
            String userInput = bundle.getString("input");

            textView.setText(userInput);
        }

        return rootView;
    }

}
