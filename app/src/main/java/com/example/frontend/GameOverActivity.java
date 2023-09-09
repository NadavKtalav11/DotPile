package com.example.frontend;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.mygame.R;


public class GameOverActivity extends Activity {


    Button returnToMenu;
    Button startAnotherGame;
    TextView scoreBoard;

    TextView highScore;



    @SuppressLint({"ClickableViewAccessibility", "MissingInflatedId", "SetTextI18n"})
    protected void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        setContentView(R.layout.game_over);
        //int score = GameActivity.gameBoard.getScore();
        Bundle extras = getIntent().getExtras();
        int value= 0;
        int highScoreInt = 0;
        if (extras != null) {
            value = extras.getInt("score");
            highScoreInt = extras.getInt("highScore");
        }

        scoreBoard  = (TextView) findViewById(R.id.youLost2) ;
        scoreBoard.setText(
                "your score was: "+ value);

        highScore  = (TextView) findViewById(R.id.highScore) ;
        highScore.setText(
                "All Time High Score: "+ highScoreInt);

        returnToMenu = (Button) findViewById(R.id.returnToMenu);
        returnToMenu.setOnClickListener(onClickListener);

        startAnotherGame = (Button) findViewById(R.id.playAgain);
        startAnotherGame.setOnClickListener(onClickListener2);



    }

    View.OnClickListener onClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent menuIntent =new Intent(GameOverActivity.this, MenuActivity.class);
            startActivity(menuIntent);
        }

    };
    View.OnClickListener onClickListener2 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent newGameIntent =new Intent(GameOverActivity.this, GameActivity.class);
            startActivity(newGameIntent);
        }

    };
}
