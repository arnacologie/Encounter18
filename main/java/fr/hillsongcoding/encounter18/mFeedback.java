package com.example.jerem.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

import java.util.ArrayList;
import java.util.List;

public class mFeedback extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_m_feedback);

        final EditText message = (EditText) findViewById(R.id.editText);
        final EditText email = (EditText) findViewById(R.id.editText2);
        final RadioButton rdb = (RadioButton) findViewById(R.id.checkbox);
        final RadioButton rdb2 = (RadioButton) findViewById(R.id.checkbox2);
        final RadioButton rdb3 = (RadioButton) findViewById(R.id.checkbox3);
        final RadioButton rdb4 = (RadioButton) findViewById(R.id.checkbox4);

        final List<RadioButton>radioButtons = new ArrayList<RadioButton>();
        radioButtons.add(rdb);
        radioButtons.add(rdb2);
        radioButtons.add(rdb3);
        radioButtons.add(rdb4);


        Button send = (Button) findViewById(R.id.button);

        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String messageS = message.getText().toString();
                String emailS = email.getText().toString();
                Intent email = new Intent(Intent.ACTION_SEND);
                email.putExtra(Intent.EXTRA_TEXT, messageS);
                email.putExtra(Intent.EXTRA_EMAIL,new String[] {emailS});


                for (RadioButton cb: radioButtons){
                    if(cb.isChecked())
                    {
                        email.putExtra(Intent.EXTRA_SUBJECT, cb.getText().toString());
                    }

                }

                email.setType("message/rfc822");
                startActivity(Intent.createChooser(email, "Chose app to send mail"));
            }
        });
    }
}





