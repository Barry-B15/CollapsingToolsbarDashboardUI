package com.example.barry.collaspingdashboardui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

/**
 * To add click listener
 * 1. give a unique id to each card in main.xml
 * 2. declare the views in main.java
 *      init/ def the views
 * 3. Let the class implement onClick listener
 *      alt+enter > implement to fix the error
 * 4. Create the activities for the cards
 * 5. add Intent and a switch in onClick()
 */
public class Home extends AppCompatActivity implements View.OnClickListener {

    // declare the cards
    private CardView bankCard, addCard, ideasCard, linksCard, wifiCard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        // init/define the cards
        bankCard = (CardView) findViewById(R.id.bank_card);
        addCard = (CardView) findViewById(R.id.add_card);
        ideasCard = (CardView) findViewById(R.id.ideas_card);
        linksCard = (CardView) findViewById(R.id.links_card);
        wifiCard = (CardView) findViewById(R.id.wifi_card);

        // Add click listeners
        bankCard.setOnClickListener(this);
        addCard.setOnClickListener(this);
        ideasCard.setOnClickListener(this);
        linksCard.setOnClickListener(this);
        wifiCard.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        Intent i;

        // use a switch to test and switch to which card is clicked
        switch (view.getId()) {
            case R.id.bank_card:
                i = new Intent(this, Bank.class);
                startActivity(i);
                break;

            case R.id.ideas_card: i = new Intent(this, Ideas.class);
                startActivity(i);
                break;
            case R.id.add_card: i = new Intent(this, Add.class);
                startActivity(i);
                break;
            case R.id.links_card: i = new Intent(this, Links.class);
                startActivity(i);
                break;
            case R.id.wifi_card: i = new Intent(this, Wifi.class);
                startActivity(i); break;
            default:break;
        }
    }
}
