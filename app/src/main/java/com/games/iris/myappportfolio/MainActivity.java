package com.games.iris.myappportfolio;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void showToast(View view) {
        String message = null;
        switch (view.getId())
        {
        case R.id.button_app1:
            message = getString(R.string.toast_message_activty_main, getString(R.string.name_app1));
            break;
        case R.id.button_app2:
            message = getString(R.string.toast_message_activty_main, getString(R.string.name_app2));
            break;
        case R.id.button_app3:
            message = getString(R.string.toast_message_activty_main, getString(R.string.name_app3));
            break;
        case R.id.button_app4:
            message = getString(R.string.toast_message_activty_main, getString(R.string.name_app4));
            break;
        case R.id.button_app5:
            message = getString(R.string.toast_message_activty_main, getString(R.string.name_app5));
            break;
        case R.id.button_app6:
            message = getString(R.string.toast_message_activty_main, getString(R.string.name_app6));
            break;
        }

        Toast.makeText(getApplicationContext(), message, Toast.LENGTH_LONG).show();
    }
}
