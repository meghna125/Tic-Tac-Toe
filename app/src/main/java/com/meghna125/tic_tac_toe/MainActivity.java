package com.meghna125.tic_tac_toe;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import static android.R.attr.onClick;



// Add Comments;
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button exit = (Button)findViewById(R.id.exit);
        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {



                moveTaskToBack(true);
                android.os.Process.killProcess(android.os.Process.myPid());
                System.exit(1);
            }
        });

        Button newGame = (Button) findViewById(R.id.newGame);
        newGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                MediaPlayer mplayer = MediaPlayer.create(getApplicationContext(),R.raw.tick);
                mplayer.start();

                Intent intent = new Intent(getApplicationContext(),Main4Activity.class);
                startActivity(intent);
            }
        });

        Button howToPlay = (Button)findViewById(R.id.howToPlay);
        howToPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                MediaPlayer mplayer = MediaPlayer.create(getApplicationContext(),R.raw.tick);
                mplayer.start();

                Intent intent = new Intent(getApplicationContext(),Main2Activity.class);
                startActivity(intent);


            }
        });
        Button ins = (Button)findViewById(R.id.Ins);
        ins.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mplayer = MediaPlayer.create(getApplicationContext(),R.raw.tick);
                mplayer.start();

                Intent intent = new Intent(getApplicationContext(),Main3Activity.class);
                startActivity(intent);


            }
        });
    }
}
