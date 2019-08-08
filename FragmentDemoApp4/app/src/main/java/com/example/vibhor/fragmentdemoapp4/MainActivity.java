package com.example.vibhor.fragmentdemoapp4;

import android.annotation.TargetApi;
import android.os.Build;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements  Communicator {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    @Override
    public void respond(String data) {
        android.app.FragmentManager fragmentManager = getFragmentManager();

        FragmentB fragmentB = (FragmentB) fragmentManager.findFragmentById(R.id.fragment2);
        fragmentB.changeText(data);

    }
}
