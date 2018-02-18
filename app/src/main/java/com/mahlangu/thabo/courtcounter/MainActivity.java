package com.mahlangu.thabo.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreTeamA =0;
    int scoreTeamB=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void displayForTeamA(int score){
        TextView scoreView =(TextView)findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));


    }
    public void addOnePoint(View view){
        scoreTeamA +=1;
        displayForTeamA(scoreTeamA);
    }
    public void addOnePointB(View view){
        scoreTeamB +=1;
        displayForTeamB(scoreTeamB);
    }
    public void addTwoPoints(View view){
        scoreTeamA +=2;
        displayForTeamA(scoreTeamA);
    }
    public void addTwoPointsB(View view){
        scoreTeamB +=2;
        displayForTeamB(scoreTeamB);
    }


    public void addThreePoints(View view) {
        //TextView threePointsView =(TextView)findViewById(R.id.add_three_points);
        scoreTeamA +=3;

        displayForTeamA(scoreTeamA);
    }
    public void addThreePointB(View view) {
        //TextView threePointsView =(TextView)findViewById(R.id.add_three_points);
        scoreTeamB +=3;

        displayForTeamB(scoreTeamB);
    }
    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
    public void resetAll(View view){
        scoreTeamB=0;
        scoreTeamA=0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }
}
