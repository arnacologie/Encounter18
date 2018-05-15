package fr.hillsongcoding.encounter18;

import android.app.ActivityOptions;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class GuestActivity extends AppCompatActivity {

    private LinearLayout mGuestLayout;
    private ImageView mPeter_image;
    private TextView mPeter_name;
    private TextView mMinistry;
    private TextView mChurch_name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guest);

        mGuestLayout =(LinearLayout) findViewById(R.id.guestLayout);
        mPeter_image = (ImageView) findViewById(R.id.peter_image);
        mPeter_name = (TextView) findViewById(R.id.peter_name);
        mMinistry = (TextView) findViewById(R.id.ministry);
        mChurch_name = (TextView) findViewById(R.id.church_name);


        mGuestLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent sharedIntent = new Intent(GuestActivity.this, GuestExpandedActivity.class);

                Pair[] pairs = new Pair[4];
                pairs[0] = new Pair<View, String>(mPeter_image, "imageTransition");
                pairs[1] = new Pair<View, String>(mPeter_name, "nameTransition");
                pairs[2] = new Pair<View, String>(mMinistry, "ministryTransition");
                pairs[3] = new Pair<View, String>(mChurch_name, "churchTransition");

                ActivityOptions options = ActivityOptions
                        .makeSceneTransitionAnimation(GuestActivity.this, pairs);

                startActivity(sharedIntent, options.toBundle());


            }
        });
    }
}
