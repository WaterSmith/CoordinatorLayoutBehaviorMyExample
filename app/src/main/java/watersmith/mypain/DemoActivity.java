package watersmith.mypain;

import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by WaterSmith on 14.01.2018.
 */

public class DemoActivity extends AppCompatActivity {
    @BindView(R.id.toolbar) Toolbar mToolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_demo_activity);
        ButterKnife.bind(this);

        setSupportActionBar(mToolbar);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setHomeButtonEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setDisplayShowTitleEnabled(true);
    }

    @Override
    protected void onResume() {
        super.onResume();
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction().replace(R.id.main_fragment, new DemoFragment()).addToBackStack("demo");
        fragmentTransaction.commit();
    }
}
