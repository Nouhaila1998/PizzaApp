package com.example.pizza.service;

import android.util.Log;

import com.example.pizza.beans.Produit;
import com.example.pizza.dao.IDao;

import java.util.ArrayList;
import java.util.List;

public class ProduitService implements IDao<Produit> {

    private List<Produit> produits;
    private static ProduitService instance;
    private ProduitService(){

            produits=new ArrayList<>();
    }

    public static ProduitService getInstance() {
        if(instance==null) {
            instance = new ProduitService();
            return instance;
        }
        else
            return instance;
    }

    @Override
    public boolean create(Produit o) {
        Log.d("create",o.getNom());
        return produits.add(o);
    }

    @Override
    public boolean delete(Produit o) {
        Log.d("delete",o.getNom());
        return produits.remove(o);
    }

    @Override
    public boolean update(Produit o) {
        for(Produit f : produits){
            if(f.getId()==o.getId()){
                f.setNom(o.getNom());
                f.setDescription(o.getDescription());
                f.setPhoto(o.getPhoto());
                f.setDtailsIngred(o.getDtailsIngred());
                f.setDuree(o.getDuree());
                f.setNbrIngredients(o.getNbrIngredients());
                return true;

            }
        }
        return false;
    }

    @Override
    public Produit findById(int id) {
        Log.d("findById",id+"");
        Produit produit =null;
        for(Produit f: produits){
            if(f.getId()==id)
                return f;
        }
        return null;
    }

    @Override
    public List<Produit> findAll() {
        Log.d("findAll", produits.size()+"");
        return produits;
    }

}
