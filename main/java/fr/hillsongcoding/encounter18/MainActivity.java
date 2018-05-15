package fr.hillsongcoding.encounter18;

import android.app.ActivityOptions;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity{

    private Button mProgramBtn;
    private Button mLunchBtn;
    private Button mStoreBtn;
    private Button mFeedbackBtn;
    private Button mGuestBtn;
    private Button mComingSoon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mProgramBtn = (Button) findViewById(R.id.ProgramBtn);
        mLunchBtn =(Button) findViewById(R.id.LunchBtn);
        mStoreBtn = (Button) findViewById(R.id.StoreBtn);
        mFeedbackBtn = (Button) findViewById(R.id.FeedbackBtn);
        mGuestBtn = (Button) findViewById(R.id.GuestBtn);
        mComingSoon = (Button) findViewById(R.id.ComingSoonBtn);

        mProgramBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ProgramActivity.class);
                startActivity(intent);
            }
        });

        mLunchBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent sharedIntent = new Intent(MainActivity.this, LunchActivity.class);

                startActivity(sharedIntent);

            }
        });

        mStoreBtn.setEnabled(false);

        mFeedbackBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, FeedbackActivity.class);

                startActivity(intent);
            }
        });

        mGuestBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, GuestActivity.class);

                startActivity(intent);
            }
        });

        mComingSoon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ComingSoonActivity.class);
                startActivity(intent);
            }
        });

    }
}
