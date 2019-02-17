package com.example.basic1;

import android.app.Activity;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.view.View;

public class SpinnerActivity extends Activity implements OnItemSelectedListener {

    public void onItemSelected(AdapterView<?> parent, View view,int pos, long id) {
        // An item was selected. You can retrieve the selected item using
         //parent.getItemAtPosition(pos);
    }

    public void onNothingSelected(AdapterView<?> parent) {
        // Another interface callback
    }
}