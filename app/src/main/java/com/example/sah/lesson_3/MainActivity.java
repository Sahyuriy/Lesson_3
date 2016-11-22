package com.example.sah.lesson_3;

import android.app.Application;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.ActivityA:
                methodOne();
                return true;
            case R.id.ActivityB:
                methodTwo();
                return true;
            case R.id.ActivityC:
                methodThree();
                return true;
            case R.id.Exit:
                finishAffinity();

            default:
                return super.onOptionsItemSelected(item);
        }
    }


    public void methodOne()
    {
        Intent in = new Intent(this, ActivityOne.class);
        startActivity(in);

    }

    public void methodTwo()
    {
        Intent in = new Intent(this, ActivityTwo.class);
        startActivity(in);
    }
    public void methodThree()
    {
        Intent in = new Intent(this, ActivityThree.class);
        startActivity(in);
    }
}
