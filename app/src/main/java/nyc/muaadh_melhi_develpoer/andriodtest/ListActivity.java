package nyc.muaadh_melhi_develpoer.andriodtest;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        CustomFragment myFragment = new CustomFragment();
        fragmentTransaction.add(R.id.fragment_container, myFragment);
        fragmentTransaction.commit();

    }
}
