package com.example.android.myappportfolio;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Called when the user touches the Popular Movies button
     */
    public void popularMovies(View view) {
        Context context = getApplicationContext();
        CharSequence text = this.getString(R.string.toast_message) +this.getString(R.string.popular_movies)  + "!";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();

    }

    /**
     * Called when the user touches the Stock Hawk button
     */
    public void stockHawk(View view) {
        Context context = getApplicationContext();
        CharSequence text = this.getString(R.string.toast_message) +this.getString(R.string.stock_hawk)  + "!";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();

    }

    /**
     * Called when the user touches the Build It Bigger button
     */
    public void buildItBigger(View view) {
        Context context = getApplicationContext();
        CharSequence text = this.getString(R.string.toast_message) +this.getString(R.string.build_it_bigger)  + "!";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();

    }

    /**
     * Called when the user touches the Make your App Material button
     */
    public void makeYourAppMaterial(View view) {
        Context context = getApplicationContext();
        CharSequence text = this.getString(R.string.toast_message) +this.getString(R.string.make_your_app_material)  + "!";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();

    }

    /**
     * Called when the user touches the Go Ubiquitous button
     */
    public void goUbiquitous(View view) {
        Context context = getApplicationContext();
        CharSequence text = this.getString(R.string.toast_message) +this.getString(R.string.go_ubiquitous)  + "!";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();

    }

    /**
     * Called when the user touches the Capstone button
     */
    public void capstone(View view) {
        Context context = getApplicationContext();
        CharSequence text = this.getString(R.string.toast_message) +this.getString(R.string.capstone)  + "!";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();

    }

}