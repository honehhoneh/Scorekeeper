package tech.hyperdev.scorekeeper.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

import tech.hyperdev.scorekeeper.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class ScoreFragment extends Fragment {
    String name;
    ImageButton btnMinus, btnPlus;
    int team1 = 0, team2 = 0;
    TextView teamName, teamScore;

    public ScoreFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_score, container, false);

        teamName = (TextView) view.findViewById(R.id.tvTeamName);
        teamName.setText(name);

        teamScore = (TextView) view.findViewById(R.id.textView2);

        btnMinus = (ImageButton) view.findViewById(R.id.btnMinus);
        btnPlus = (ImageButton) view.findViewById(R.id.btnPlus);

        btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (name.equals("TEAM 1")) {
                    team1 = team1 - 1;
                    teamScore.setText(team1 + "");
                } else {
                    team2 = team2 - 1;
                    teamScore.setText(team2 + "");
                }
            }
        });

        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (name.equals("TEAM 1")) {
                    team1 = team1 + 1;
                    teamScore.setText(team1 + "");
                } else {
                    team2 = team2 + 1;
                    teamScore.setText(team2 + "");
                }
            }
        });

        return view;
    }

    public static ScoreFragment newInstance(String name) {
        ScoreFragment scoreFragment = new ScoreFragment();
        Bundle args = new Bundle();
        args.putString("TEAM NAME", name);
        scoreFragment.setArguments(args);
        return scoreFragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            name = getArguments().getString("TEAM NAME");
        }
    }
}
