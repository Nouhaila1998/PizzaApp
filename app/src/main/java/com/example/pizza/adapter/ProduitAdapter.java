package com.example.pizza.adapter;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.pizza.R;
import com.example.pizza.beans.Produit;

import java.util.List;

public class ProduitAdapter extends BaseAdapter {

    private LayoutInflater layoutInflater;
    private List<Produit> produits;

    public ProduitAdapter(Activity activity, List<Produit> produits) {
        layoutInflater= (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        this.produits = produits;
    }

    @Override
    public int getCount() {
        return produits.size();
    }

    @Override
    public Object getItem(int position) {
        return produits.get(position);
    }

    @Override
    public long getItemId(int position) {
        return produits.get(position).getId();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView==null){
         convertView= layoutInflater.inflate(R.layout.item_produit1,null);
        }
        if(convertView!=null){
            TextView id=convertView.findViewById(R.id.id);
            TextView nom=convertView.findViewById(R.id.nom);
            TextView nbrIngredients=convertView.findViewById(R.id.nombre);
            TextView duree=convertView.findViewById(R.id.duree);
            ImageView image=convertView.findViewById(R.id.imagesp);
            id.setText(produits.get(position).getId()+"");
            nom.setText(produits.get(position).getNom());
            nbrIngredients.setText(produits.get(position).getNbrIngredients()+"");
            duree.setText(produits.get(position).getDuree());
            image.setImageResource(produits.get(position).getPhoto());
        }
        return convertView;
    }
}
