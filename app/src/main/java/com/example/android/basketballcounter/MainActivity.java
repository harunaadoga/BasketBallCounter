package com.example.android.basketballcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import android.view.View;
import java.text.NumberFormat;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Team A display method for the score on XML TextView
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Team B display method for the score on XML TextView
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    //initialize the scores for all teams A and B
    int scoreA = 0;
    int scoreB = 0;

    //method that adds 3 points to team A
    public void threePointsA(View view) {
        scoreA = scoreA + 3;
        displayForTeamA(scoreA);
    }

    //method that add 2 points to team B
    public void twoPointsA(View view) {
        scoreA = scoreA + 2;
        displayForTeamA(scoreA);
    }

    //method that adds 1 point to team A
    public void freeThrowA(View view) {
        scoreA = scoreA + 1;
        displayForTeamA(scoreA);
    }


    //method that adds 3 points to team B
    public void threePointsB(View view) {
        scoreB = scoreB + 3;
        displayForTeamB(scoreB);
    }

    //method that adds 2 points to team B
    public void twoPointsB(View view) {
        scoreB = scoreB + 2;
        displayForTeamB(scoreB);
    }

    //method that adds one point to team B
    public void freeThrowB(View view) {
        scoreB = scoreB + 1;
        displayForTeamB(scoreB);
    }

    // method that resets all the scores

    public void reset(View view){
        scoreA = 0;
        scoreB = 0;
        displayForTeamA(scoreA);
        displayForTeamB(scoreB);
    }



}


