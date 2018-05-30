package com.tech.gigabyte.fragment;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText textActivity;
    Button buttonSendToFragment;
    Fragment SimpleAdition;

    /**
     * Called when the activity is first created.
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textActivity = (EditText) findViewById(R.id.editText1);
        buttonSendToFragment = (Button) findViewById(R.id.button1);

        // get an instance of FragmentTransaction from your Activity
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        //add a fragment
        SimpleAdition = new Fragment();
        fragmentTransaction.add(R.id.text_fragment, SimpleAdition);
        fragmentTransaction.commit();

        buttonSendToFragment.setOnClickListener(new View.OnClickListener() {

            //Getting input text to fragment
            @Override
            public void onClick(View v) {

                // TODO Auto-generated method stub
                String text = textActivity.getText().toString();
                TextView textFragment = (TextView) findViewById(R.id.textview);
                textFragment.setText(text);
            }
        });
    }
}
