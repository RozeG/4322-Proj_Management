package com.funinc.amusementparklinesaver.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.content.Intent;
import com.funinc.amusementparklinesaver.R;

public class ReservePage extends AppCompatActivity {

    private EditText fName;
    private EditText lName;
    private EditText seatsSaved;
    private int count;

    // calls the activity reservation page to be displayed if selected
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reserve_page);
    }

    // code once the information is entered and the button is pressed
    public void buttonOnClick(View v){
        Button button = (Button) v;
        fName = (EditText) findViewById(R.id.txtname);
        Toast toast = new Toast(getApplicationContext());
        toast.setGravity(Gravity.TOP|Gravity.LEFT, 0, 0);
        toast.makeText(ReservePage.this, fName.getText(), toast.LENGTH_SHORT).show();

        count = count + 1;
        Intent reserveCoaster = new Intent(this, ReserveRide.class);
        startActivity(reserveCoaster);
    }
}
