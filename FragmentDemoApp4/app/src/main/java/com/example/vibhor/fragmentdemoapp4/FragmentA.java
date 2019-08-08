package com.example.vibhor.fragmentdemoapp4;

import android.annotation.TargetApi;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.Nullable;


@TargetApi(Build.VERSION_CODES.HONEYCOMB)
public class FragmentA extends Fragment implements View.OnClickListener {


    private Button button;
    Communicator communicator;

    private int counter = 0;

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        communicator= (Communicator) getActivity();
        button = (Button) getActivity().findViewById(R.id.button1);
            button.setOnClickListener(this);
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_a, container, false);
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if(savedInstanceState == null)counter=0;
            else
              counter =   savedInstanceState.getInt("Counter" , 0);
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
                outState.putInt("Counter" , counter);
    }

    @Override
    public void onClick(View v) {

        counter++;
        communicator.respond("the button was cloicked " + counter  + " times "  );


    }


}
