package com.clancy.conor.tictactoegame;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TicTacToeGame mGame;
    private TextView mGameStateTextView;
    private Button[] mButtons;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mGame = new  TicTacToeGame(this);
        mGameStateTextView = findViewById(R.id.game_state_text_view);
        mButtons = new Button[TicTacToeGame.NUM_SQUARES];
        mButtons[0] = findViewById(R.id.button0);
        mButtons[1] = findViewById(R.id.button1);
        mButtons[2] = findViewById(R.id.button2);
        mButtons[3] = findViewById(R.id.button3);
        mButtons[4] = findViewById(R.id.button4);
        mButtons[5] = findViewById(R.id.button5);
        mButtons[6] = findViewById(R.id.button6);
        mButtons[7] = findViewById(R.id.button7);
        mButtons[8] = findViewById(R.id.button8);
        updateView(); // update view when game launches


    }

    public void pressedSquare(View view){

    String tagAsStr =view.getTag().toString();
    int tagAsInt = Integer.parseInt(tagAsStr);
    Log.d( "TTT", "You Pressed index " + tagAsInt);

    // Log.d outputs text to Logcat

    Toast.makeText(this, "You Pressed index" + tagAsInt, Toast.LENGTH_SHORT).show();

    // Toast outputs text to screen of device
    mGame.pressedButtonAtIndex(tagAsInt);
    updateView();

    }

    private void updateView() {
        mGameStateTextView.setText(mGame.stringForGameState());
        for (int i=0; i<TicTacToeGame.NUM_SQUARES; i++){
            mButtons[i].setText(mGame.stringForButtonAtIndex(i));
        }
    }

    public void pressedNewGame(View view){

        //String tagAsStr =view.getTag().toString();
        //int tagAsInt = Integer.parseInt(tagAsStr);
        mGame = new TicTacToeGame(this);
        updateView();
        //Log.d( "TTT", "You Pressed New Game " + tagAsInt);

        // Log.d outputs text to Logcat

        Toast.makeText(this, "You Pressed New Game", Toast.LENGTH_SHORT).show();
        // Toast outputs text to screen of device

    }
}
