package com.funinc.amusementparklinesaver.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import android.widget.Toast;

import com.funinc.amusementparklinesaver.R;

public class ReservePage2 extends AppCompatActivity {

    // calls the activity reservation page to be displayed if selected
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reserve_page2);
    }

    // code once the information is entered and the button is pressed
    private EditText fName;
    private EditText lName;
    private EditText seatsSaved;
    public void buttonOnClick(View v){
        Button button = (Button) v;
        fName = (EditText) findViewById(R.id.txtname);
        Toast toast = new Toast(getApplicationContext());
        toast.setGravity(Gravity.TOP|Gravity.LEFT, 0, 0);
        toast.makeText(ReservePage2.this, fName.getText(), toast.LENGTH_SHORT).show();
    }
}
