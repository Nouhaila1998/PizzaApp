package com.example.pizza;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.app.ShareCompat;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.pizza.beans.Produit;
import com.example.pizza.service.ProduitService;

public class DetailsActivity extends AppCompatActivity {
    private ProduitService produitService = ProduitService.getInstance();
    private ImageView image;
    private TextView description;
    private TextView ingrediant;
    private TextView titre;
    private TextView preparation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setBackgroundColor((Color.parseColor("#fc6b00")));
        // Sets the Toolbar to act as the ActionBar for this Activity window.
        // Make sure the toolbar exists in the activity and is not null
        setSupportActionBar(toolbar);

        Intent intent = getIntent();
        int id = Integer.parseInt(intent.getStringExtra("id"));
        Produit p = produitService.findById(id);

        image = findViewById(R.id.imagesp);
        description = findViewById(R.id.text1);
        ingrediant = findViewById(R.id.text2);
        titre = findViewById(R.id.titre);
        image.setImageResource(p.getPhoto());
        titre.setText(p.getNom());
        description.setText(p.getDescription());
        ingrediant.setText(p.getDtailsIngred());
        preparation = findViewById(R.id.text3);
        preparation.setText(p.getPreparation());


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @SuppressLint("ResourceType")
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {


        String mimeType = "text/plain";
        ShareCompat.IntentBuilder
                .from(this)
                .setType(mimeType)
                .setChooserTitle("partager avec")
                .setText("PIZZA")
                .startChooser();
        return true;

    }
}
