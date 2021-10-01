package com.openclassrooms.entrevoisins;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.openclassrooms.entrevoisins.ui.neighbour_list.AddNeighbourActivity;

public class UserPage extends AppCompatActivity {

    private TextView name;
    private TextView addresse;
    private TextView phone;
    private TextView email;
    private TextView text;
    private TextView phoneNumber;
    private TextView about;
    private TextView description;
    private Button  AddToFav;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_page);

        name.getText().toString();
        addresse.getText().toString();
        phone.getText().toString();
        email.getText().toString();
        text.getText().toString();
        phoneNumber.getText().toString();
        about.getText().toString();
        description.getText().toString();

        AddToFav = (Button) findViewById(R.id.addtofav);
        AddToFav.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent add = new Intent(UserPage.this, AddNeighbourActivity.class);
                startActivity(add);
            }
        });
    }
}