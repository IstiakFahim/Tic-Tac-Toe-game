package com.example.tictactoe;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    ImageView button1, button2, button3, button4, button5, button6, button7, button8, button9;
    private String startGame = "X";
    int b1 = 5, b2 = 5, b3 = 5, b4 = 5, b5 = 5, b6 = 5, b7 = 5, b8 = 5, b9 = 5, i = 0, xCount = 0, oCount = 0;
    private TextView score1, score2;
    private Button Restart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = findViewById(R.id.img1);
        button2 = findViewById(R.id.img2);
        button3 = findViewById(R.id.img3);
        button4 = findViewById(R.id.img4);
        button5 = findViewById(R.id.img5);
        button6 = findViewById(R.id.img6);
        button7 = findViewById(R.id.img7);
        button8 = findViewById(R.id.img8);
        button9 = findViewById(R.id.img9);

        score1 = findViewById(R.id.player1);
        score2 = findViewById(R.id.player2);

        Restart = findViewById(R.id.Restart);

        Restart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button1.setImageDrawable(null);
                button2.setImageDrawable(null);
                button3.setImageDrawable(null);
                button4.setImageDrawable(null);
                button5.setImageDrawable(null);
                button6.setImageDrawable(null);
                button7.setImageDrawable(null);
                button8.setImageDrawable(null);
                button9.setImageDrawable(null);

                RestartValues();

                xCount = 0;
                oCount = 0;

                score1.setText("Player One: " + String.valueOf(xCount));
                score2.setText("Player Two: " + String.valueOf(oCount));
            }
        });


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (startGame.equals("X")) {
                    button1.setImageResource(R.drawable.cross);
                    b1 = 1;
                    i++;
                } else {
                    button1.setImageResource(R.drawable.circle);
                    b1 = 0;
                    i++;
                }

                choosePlayer();
                WinningGame();

            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (startGame.equals("X")) {
                    button2.setImageResource(R.drawable.cross);
                    b2 = 1;
                    i++;
                } else {
                    button2.setImageResource(R.drawable.circle);
                    b2 = 0;
                    i++;
                }

                choosePlayer();
                WinningGame();

            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(startGame.equals("X")){
                    button3.setImageResource(R.drawable.cross);
                    b3 = 1;
                    i++;
                }
                else {
                    button3.setImageResource(R.drawable.circle);
                    b3=0;
                    i++;
                }

                choosePlayer();
                WinningGame();

            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(startGame.equals("X")){
                    button4.setImageResource(R.drawable.cross);
                    b4 = 1;
                    i++;
                }
                else {
                    button4.setImageResource(R.drawable.circle);
                    b4=0;
                    i++;
                }

                choosePlayer();
                WinningGame();

            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(startGame.equals("X")){
                    button5.setImageResource(R.drawable.cross);
                    b5 = 1;
                    i++;
                }
                else {
                    button5.setImageResource(R.drawable.circle);
                    b5=0;
                    i++;
                }

                choosePlayer();
                WinningGame();

            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(startGame.equals("X")){
                    button6.setImageResource(R.drawable.cross);
                    b6 = 1;
                    i++;
                }
                else {
                    button6.setImageResource(R.drawable.circle);
                    b6=0;
                    i++;
                }

                choosePlayer();
                WinningGame();

            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(startGame.equals("X")){
                    button7.setImageResource(R.drawable.cross);
                    b7 = 1;
                    i++;
                }
                else {
                    button7.setImageResource(R.drawable.circle);
                    b7=0;
                    i++;
                }

                choosePlayer();
                WinningGame();

            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(startGame.equals("X")){
                    button8.setImageResource(R.drawable.cross);
                    b8 = 1;
                    i++;
                }
                else {
                    button8.setImageResource(R.drawable.circle);
                    b8=0;
                    i++;
                }

                choosePlayer();
                WinningGame();

            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(startGame.equals("X")){
                    button9.setImageResource(R.drawable.cross);
                    b9 = 1;
                    i++;
                }
                else {
                    button9.setImageResource(R.drawable.circle);
                    b9=0;
                    i++;
                }

                choosePlayer();
                WinningGame();

            }
        });


    }


    private void choosePlayer() {
        if (startGame.equals("X")) {
            startGame = "O";
        } else {
            startGame = "X";
        }
    }

    private void WinningGame(){


        if((b1 == 1) && (b2 == 1) && (b3 == 1)){
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("Player One Wins").setCancelable(false).setPositiveButton("Play Again", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {

                    button1.setImageDrawable(null);
                    button2.setImageDrawable(null);
                    button3.setImageDrawable(null);
                    button4.setImageDrawable(null);
                    button5.setImageDrawable(null);
                    button6.setImageDrawable(null);
                    button7.setImageDrawable(null);
                    button8.setImageDrawable(null);
                    button9.setImageDrawable(null);

                    RestartValues();

                }
            });

            AlertDialog alertDialog = builder.create();
            alertDialog.show();
            xCount++;
            score1.setText("Player One: " + String.valueOf(xCount));
        }


        else if((b4 == 1) && (b5 == 1) && (b6 == 1)){
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("Player One Wins").setCancelable(false).setPositiveButton("Play Again", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {

                    button1.setImageDrawable(null);
                    button2.setImageDrawable(null);
                    button3.setImageDrawable(null);
                    button4.setImageDrawable(null);
                    button5.setImageDrawable(null);
                    button6.setImageDrawable(null);
                    button7.setImageDrawable(null);
                    button8.setImageDrawable(null);
                    button9.setImageDrawable(null);

                    RestartValues();

                }
            });

            AlertDialog alertDialog = builder.create();
            alertDialog.show();
            xCount++;
            score1.setText("Player One: " + String.valueOf(xCount));
        }


        else if((b7 == 1) && (b8 == 1) && (b9 == 1)){
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("Player One Wins").setCancelable(false).setPositiveButton("Play Again", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {

                    button1.setImageDrawable(null);
                    button2.setImageDrawable(null);
                    button3.setImageDrawable(null);
                    button4.setImageDrawable(null);
                    button5.setImageDrawable(null);
                    button6.setImageDrawable(null);
                    button7.setImageDrawable(null);
                    button8.setImageDrawable(null);
                    button9.setImageDrawable(null);

                    RestartValues();

                }
            });

            AlertDialog alertDialog = builder.create();
            alertDialog.show();
            xCount++;
            score1.setText("Player One: " + String.valueOf(xCount));
        }


        else if((b1 == 1) && (b4 == 1) && (b7 == 1)){
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("Player One Wins").setCancelable(false).setPositiveButton("Play Again", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {

                    button1.setImageDrawable(null);
                    button2.setImageDrawable(null);
                    button3.setImageDrawable(null);
                    button4.setImageDrawable(null);
                    button5.setImageDrawable(null);
                    button6.setImageDrawable(null);
                    button7.setImageDrawable(null);
                    button8.setImageDrawable(null);
                    button9.setImageDrawable(null);

                    RestartValues();

                }
            });

            AlertDialog alertDialog = builder.create();
            alertDialog.show();
            xCount++;
            score1.setText("Player One: " + String.valueOf(xCount));
        }


        else if((b2 == 1) && (b5 == 1) && (b8 == 1)){
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("Player One Wins").setCancelable(false).setPositiveButton("Play Again", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {

                    button1.setImageDrawable(null);
                    button2.setImageDrawable(null);
                    button3.setImageDrawable(null);
                    button4.setImageDrawable(null);
                    button5.setImageDrawable(null);
                    button6.setImageDrawable(null);
                    button7.setImageDrawable(null);
                    button8.setImageDrawable(null);
                    button9.setImageDrawable(null);

                    RestartValues();

                }
            });

            AlertDialog alertDialog = builder.create();
            alertDialog.show();
            xCount++;
            score1.setText("Player One: " + String.valueOf(xCount));
        }


        else if((b3 == 1) && (b6 == 1) && (b9 == 1)){
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("Player One Wins").setCancelable(false).setPositiveButton("Play Again", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {

                    button1.setImageDrawable(null);
                    button2.setImageDrawable(null);
                    button3.setImageDrawable(null);
                    button4.setImageDrawable(null);
                    button5.setImageDrawable(null);
                    button6.setImageDrawable(null);
                    button7.setImageDrawable(null);
                    button8.setImageDrawable(null);
                    button9.setImageDrawable(null);

                    RestartValues();

                }
            });

            AlertDialog alertDialog = builder.create();
            alertDialog.show();
            xCount++;
            score1.setText("Player One: " + String.valueOf(xCount));
        }


        else if((b1 == 1) && (b5 == 1) && (b9 == 1)){
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("Player One Wins").setCancelable(false).setPositiveButton("Play Again", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {

                    button1.setImageDrawable(null);
                    button2.setImageDrawable(null);
                    button3.setImageDrawable(null);
                    button4.setImageDrawable(null);
                    button5.setImageDrawable(null);
                    button6.setImageDrawable(null);
                    button7.setImageDrawable(null);
                    button8.setImageDrawable(null);
                    button9.setImageDrawable(null);

                    RestartValues();

                }
            });

            AlertDialog alertDialog = builder.create();
            alertDialog.show();
            xCount++;
            score1.setText("Player One: " + String.valueOf(xCount));
        }


        else if((b3 == 1) && (b5 == 1) && (b7 == 1)){
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("Player One Wins").setCancelable(false).setPositiveButton("Play Again", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {

                    button1.setImageDrawable(null);
                    button2.setImageDrawable(null);
                    button3.setImageDrawable(null);
                    button4.setImageDrawable(null);
                    button5.setImageDrawable(null);
                    button6.setImageDrawable(null);
                    button7.setImageDrawable(null);
                    button8.setImageDrawable(null);
                    button9.setImageDrawable(null);

                    RestartValues();

                }
            });

            AlertDialog alertDialog = builder.create();
            alertDialog.show();
            xCount++;
            score1.setText("Player One: " + String.valueOf(xCount));
        }









        if((b1 == 0) && (b2 == 0) && (b3 == 0)){
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("Player Two Wins").setCancelable(false).setPositiveButton("Play Again", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {

                    button1.setImageDrawable(null);
                    button2.setImageDrawable(null);
                    button3.setImageDrawable(null);
                    button4.setImageDrawable(null);
                    button5.setImageDrawable(null);
                    button6.setImageDrawable(null);
                    button7.setImageDrawable(null);
                    button8.setImageDrawable(null);
                    button9.setImageDrawable(null);

                    RestartValues();

                }
            });

            AlertDialog alertDialog = builder.create();
            alertDialog.show();
            oCount++;
            score2.setText("Player Two: " + String.valueOf(oCount));
        }


        else if((b4 == 0) && (b5 == 0) && (b6 == 0)){
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("Player Two Wins").setCancelable(false).setPositiveButton("Play Again", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {

                    button1.setImageDrawable(null);
                    button2.setImageDrawable(null);
                    button3.setImageDrawable(null);
                    button4.setImageDrawable(null);
                    button5.setImageDrawable(null);
                    button6.setImageDrawable(null);
                    button7.setImageDrawable(null);
                    button8.setImageDrawable(null);
                    button9.setImageDrawable(null);

                    RestartValues();

                }
            });

            AlertDialog alertDialog = builder.create();
            alertDialog.show();
            oCount++;
            score2.setText("Player Two: " + String.valueOf(oCount));
        }


        else if((b7 == 0) && (b8 == 0) && (b9 == 0)){
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("Player Two Wins").setCancelable(false).setPositiveButton("Play Again", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {

                    button1.setImageDrawable(null);
                    button2.setImageDrawable(null);
                    button3.setImageDrawable(null);
                    button4.setImageDrawable(null);
                    button5.setImageDrawable(null);
                    button6.setImageDrawable(null);
                    button7.setImageDrawable(null);
                    button8.setImageDrawable(null);
                    button9.setImageDrawable(null);

                    RestartValues();

                }
            });

            AlertDialog alertDialog = builder.create();
            alertDialog.show();
            oCount++;
            score2.setText("Player Two: " + String.valueOf(oCount));
        }


        else if((b1 == 0) && (b4 == 0) && (b7 == 0)){
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("Player Two Wins").setCancelable(false).setPositiveButton("Play Again", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {

                    button1.setImageDrawable(null);
                    button2.setImageDrawable(null);
                    button3.setImageDrawable(null);
                    button4.setImageDrawable(null);
                    button5.setImageDrawable(null);
                    button6.setImageDrawable(null);
                    button7.setImageDrawable(null);
                    button8.setImageDrawable(null);
                    button9.setImageDrawable(null);

                    RestartValues();

                }
            });

            AlertDialog alertDialog = builder.create();
            alertDialog.show();
            oCount++;
            score2.setText("Player Two: " + String.valueOf(oCount));
        }


        else if((b2 == 0) && (b5 == 0) && (b8 == 0)){
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("Player Two Wins").setCancelable(false).setPositiveButton("Play Again", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {

                    button1.setImageDrawable(null);
                    button2.setImageDrawable(null);
                    button3.setImageDrawable(null);
                    button4.setImageDrawable(null);
                    button5.setImageDrawable(null);
                    button6.setImageDrawable(null);
                    button7.setImageDrawable(null);
                    button8.setImageDrawable(null);
                    button9.setImageDrawable(null);

                    RestartValues();

                }
            });

            AlertDialog alertDialog = builder.create();
            alertDialog.show();
            oCount++;
            score2.setText("Player Two: " + String.valueOf(oCount));
        }


        else if((b3 == 0) && (b6 == 0) && (b9 == 0)){
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("Player Two Wins").setCancelable(false).setPositiveButton("Play Again", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {

                    button1.setImageDrawable(null);
                    button2.setImageDrawable(null);
                    button3.setImageDrawable(null);
                    button4.setImageDrawable(null);
                    button5.setImageDrawable(null);
                    button6.setImageDrawable(null);
                    button7.setImageDrawable(null);
                    button8.setImageDrawable(null);
                    button9.setImageDrawable(null);

                    RestartValues();

                }
            });

            AlertDialog alertDialog = builder.create();
            alertDialog.show();
            oCount++;
            score2.setText("Player Two: " + String.valueOf(oCount));
        }


        else if((b1 == 0) && (b5 == 0) && (b9 == 0)){
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("Player Two Wins").setCancelable(false).setPositiveButton("Play Again", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {

                    button1.setImageDrawable(null);
                    button2.setImageDrawable(null);
                    button3.setImageDrawable(null);
                    button4.setImageDrawable(null);
                    button5.setImageDrawable(null);
                    button6.setImageDrawable(null);
                    button7.setImageDrawable(null);
                    button8.setImageDrawable(null);
                    button9.setImageDrawable(null);

                    RestartValues();

                }
            });

            AlertDialog alertDialog = builder.create();
            alertDialog.show();
            oCount++;
            score2.setText("Player Two: " + String.valueOf(oCount));
        }


        else if((b3 == 0) && (b5 == 0) && (b7 == 0)){
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("Player Two Wins").setCancelable(false).setPositiveButton("Play Again", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {

                    button1.setImageDrawable(null);
                    button2.setImageDrawable(null);
                    button3.setImageDrawable(null);
                    button4.setImageDrawable(null);
                    button5.setImageDrawable(null);
                    button6.setImageDrawable(null);
                    button7.setImageDrawable(null);
                    button8.setImageDrawable(null);
                    button9.setImageDrawable(null);

                    RestartValues();

                }
            });

            AlertDialog alertDialog = builder.create();
            alertDialog.show();
            oCount++;
            score2.setText("Player Two: " + String.valueOf(oCount));
        }

        else{
            if(i==9){

                AlertDialog.Builder builder = new AlertDialog.Builder(this);
                builder.setMessage("No One Wins").setCancelable(false).setPositiveButton("Play Again", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                        button1.setImageDrawable(null);
                        button2.setImageDrawable(null);
                        button3.setImageDrawable(null);
                        button4.setImageDrawable(null);
                        button5.setImageDrawable(null);
                        button6.setImageDrawable(null);
                        button7.setImageDrawable(null);
                        button8.setImageDrawable(null);
                        button9.setImageDrawable(null);

                        RestartValues();

                    }
                });

                AlertDialog alertDialog = builder.create();
                alertDialog.show();
            }
        }


    }


    private void RestartValues() {

        b1 = 5;
        b2 = 5;
        b3 = 5;
        b4 = 5;
        b5 = 5;
        b6 = 5;
        b7 = 5;
        b8 = 5;
        b9 = 5;
        i = 0;
    }
}