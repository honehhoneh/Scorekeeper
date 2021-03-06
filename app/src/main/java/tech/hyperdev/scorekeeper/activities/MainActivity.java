package tech.hyperdev.scorekeeper.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import tech.hyperdev.scorekeeper.R;
import tech.hyperdev.scorekeeper.fragments.ScoreFragment;


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ScoreFragment fragment = ScoreFragment.newInstance("TEAM 1");
        getSupportFragmentManager().beginTransaction().add(R.id.fragment_container_one, fragment).commit();

        ScoreFragment fragment2 = ScoreFragment.newInstance("TEAM 2");
        getSupportFragmentManager().beginTransaction().add(R.id.fragment_container_two, fragment2).commit();

    }
}
