package hacktj.hackxenon;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class MainActivity extends ActionBarActivity {
    private Button mAlertButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Parse.initialize(this, "EwtrbF7NsJ4OZpHloFxqrsQsZb4OQinTZuqv8GXP", "HMXh2pYjcKf11bU5tyiJdCmmx95l7Ukh0gSjE3Oe");
        //ParseInstallation.getCurrentInstallation().saveInBackground();
        mAlertButton = (Button)findViewById(R.id.alertButton);

        mAlertButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }

}
