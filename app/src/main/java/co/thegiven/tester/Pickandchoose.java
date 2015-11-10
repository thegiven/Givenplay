package co.thegiven.tester;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;

public class Pickandchoose extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pickandchoose);
        Button button = (Button) findViewById(R.id.work);
        button.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent myIntent = new Intent(Pickandchoose.this, Globalquestions.class);
                Pickandchoose.this.startActivity(myIntent);
            }
        });
    }

}
