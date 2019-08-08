package com.example.vibhor.fragmentdemoapp4;

import android.annotation.TargetApi;
import android.os.Build;
import android.os.Bundle;
import androidx.annotation.Nullable;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


@TargetApi(Build.VERSION_CODES.HONEYCOMB)
public class FragmentB extends Fragment {

    String data;
    private TextView textView;


    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        textView = (TextView) getActivity().findViewById(R.id.textView);
    }


    @TargetApi(Build.VERSION_CODES.HONEYCOMB_MR1)
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if(savedInstanceState == null)data=null;
        else {
            data = savedInstanceState.getString("text");
           TextView text= (TextView) textView.findViewById(R.id.textView);
            text.setText(data);
        }
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_b, container, false);
    }

    /**
     * Custom method which takes data input as parameter and
     * set it on the text view
     *
     */

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString("text",data);
    }

    /**
     * implementation of changeText() method
     * @param data
     */



    public void changeText(String  data){
                this.data=data;
            textView.setText(data);
    }

}
