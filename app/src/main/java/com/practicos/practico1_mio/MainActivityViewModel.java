package com.practicos.practico1_mio;

import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.MutableLiveData;

import java.util.ArrayList;
import java.util.List;

public class MainActivityViewModel extends AndroidViewModel {

    //Informa algo a la vista, un mensaje por ejemplo
    private MutableLiveData<String> mutable;
    //Arreglo de palabras
    private List<Palabra> palabras = new ArrayList<>();

    public MainActivityViewModel(@NonNull Application application) {
        super(application);

        Palabra p1 = new Palabra("Hola", "Hello", R.drawable.hola);
        Palabra p2 = new Palabra("Arbol", "Tree", R.drawable.arbol);
        Palabra p3 = new Palabra("Perro", "Dog", R.drawable.perro);
        Palabra p4 = new Palabra("Gato", "Cat", R.drawable.gato);
        palabras.add(p1);
        palabras.add(p2);
        palabras.add(p3);
        palabras.add(p4);
    }
    
    public void buscarPalabra(String palabra) {

        Palabra encontrada = null;

        for (Palabra x : palabras) {
            if (x.getPalabraEspanol().equalsIgnoreCase(palabra)) {
                encontrada = new Palabra(x.getPalabraEspanol(), x.getPalabraIngles(), x.getImg());
                break;//Salgo del bucle si la encuentro
            }
        }

        if (encontrada == null) {
            //Si no la encuentro, asigno el img "roto.png"
            encontrada = new Palabra("Palabra no encontrada", "", R.drawable.roto);
        }

        Bundle bundle = new Bundle();
        bundle.putSerializable("palabraEncontrada", encontrada);
        Intent intent = new Intent(getApplication(), ActivityTraducido.class);
        intent.putExtra("palabraEncontrada", bundle);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        getApplication().startActivity(intent);

    }
    
}
