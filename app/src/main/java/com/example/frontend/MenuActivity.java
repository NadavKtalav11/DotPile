package com.example.frontend;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.ClipData;
import android.content.Intent;
import android.os.Bundle;
import android.view.DragEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;

import com.example.mygame.R;


public class MenuActivity extends Activity {
    //public String string = "start new game";

    Button startGame;


    @SuppressLint("ClickableViewAccessibility")
    protected void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        setContentView(R.layout.menu);

        startGame = (Button) findViewById(R.id.startGameButton);
        startGame.setOnClickListener(onClickListener);


    }

    View.OnClickListener onClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent gameIntent =new Intent(MenuActivity.this, GameActivity.class);
            startActivity(gameIntent);
        }

    };
}



