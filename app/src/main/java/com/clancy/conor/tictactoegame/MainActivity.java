package com.clancy.conor.tictactoegame;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TicTacToeGame mGame;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mGame = new  TicTacToeGame(this);
    }

    public void pressedSquare(View view){

    String tagAsStr =view.getTag().toString();
    int tagAsInt = Integer.parseInt(tagAsStr);
    Log.d( "TTT", "You Pressed index " + tagAsInt);

    // Log.d outputs text to Logcat

    Toast.makeText(this, "You Pressed index" + tagAsInt, Toast.LENGTH_SHORT).show();
    // Toast outputs text to screen of device

    }

    public void pressedNewGame(View view){

        String tagAsStr =view.getTag().toString();
        int tagAsInt = Integer.parseInt(tagAsStr);
        //Log.d( "TTT", "You Pressed New Game " + tagAsInt);

        // Log.d outputs text to Logcat

        Toast.makeText(this, "You Pressed New Game", Toast.LENGTH_SHORT).show();
        // Toast outputs text to screen of device

    }
}
