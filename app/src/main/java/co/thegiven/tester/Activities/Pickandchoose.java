package co.thegiven.tester.Activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;

import co.thegiven.tester.R;

public class Pickandchoose extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pickandchoose);
        Button workbutton = (Button) findViewById(R.id.work);
        Button playbutton = (Button) findViewById(R.id.play);
        workbutton.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent myIntent = new Intent(Pickandchoose.this, Globalquestions.class);
                Pickandchoose.this.startActivity(myIntent);
            }
        });
        playbutton.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent myIntent = new Intent(Pickandchoose.this, Playrooms.class);
                Pickandchoose.this.startActivity(myIntent);
            }
        });
    }

}
