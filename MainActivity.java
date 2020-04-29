package sg.edu.np.WhackAMole;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;


import java.util.Random;

public class MainActivity extends AppCompatActivity {

    public int score = 0;
    private Button buttonLeft;
    private Button buttonMiddle;
    private Button buttonRight;
    private TextView scores;
    private static final String TAG = "Whack-A-Mole";


    @Override
    protected void onStart(){
        super.onStart();
        Log.v(TAG, "Starting GUI!");
        setNewMole();

        buttonLeft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (buttonLeft.getText().toString() == "*") {
                    score += 1;
                    setNewMole();
                    scores.setText("" + score);
                } else {
                    score -= 1;
                    setNewMole();
                    scores.setText("" + score);
                }
                Log.v(TAG, "Button 1 Clicked!");
            }
        });

        buttonMiddle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (buttonMiddle.getText().toString() == "*") {
                    score += 1;
                    setNewMole();
                    scores.setText("" + score);
                } else {
                    score -= 1;
                    setNewMole();
                    scores.setText("" + score);
                }
                Log.v(TAG, "Button 2 Clicked!");
            }
        });

        buttonRight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (buttonRight.getText().toString() == "*") {
                    score += 1;
                    setNewMole();
                    scores.setText("" + score);
                } else {
                    score -= 1;
                    setNewMole();
                    scores.setText("" + score);
                }

                Log.v(TAG, "Button 3 Clicked!");
            }
        });



    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.v(TAG, "Resuming...");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.v(TAG, "Pausing...");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.v(TAG, "Destroying!!!");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.v(TAG, "Stopping!");
    }

    public void setNewMole()
    {
        Random ran = new Random();
        int randomLocation = ran.nextInt(3);
        if (randomLocation == 0) {
            buttonLeft.setText("*");
            buttonMiddle.setText("O");
            buttonRight.setText("O");
        } else if (randomLocation == 1) {
            buttonLeft.setText("O");
            buttonMiddle.setText("*");
            buttonRight.setText("O");
        } else {
            buttonLeft.setText("O");
            buttonMiddle.setText("O");
            buttonRight.setText("*");
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        buttonLeft = (Button) findViewById(R.id.Button1);
        buttonMiddle = (Button) findViewById(R.id.Button2);
        buttonRight = (Button) findViewById(R.id.Button3);
        scores = (TextView) findViewById(R.id.Scoring);
        Log.v(TAG, "Preloaded Object");
    }
}
