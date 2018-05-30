package layout;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.tech.gigabyte.fragment.R;


public class SimpleAddition extends Fragment {

    private static TextView textview;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_simple_addition, container, false);

        textview = (TextView) view.findViewById(R.id.textview);
        return view;
    }


}
