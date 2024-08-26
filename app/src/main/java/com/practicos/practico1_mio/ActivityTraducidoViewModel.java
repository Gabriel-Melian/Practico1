package com.practicos.practico1_mio;

import android.app.Application;
import android.os.Bundle;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.MutableLiveData;

public class ActivityTraducidoViewModel extends AndroidViewModel {

    //Informa algo a la vista
    private MutableLiveData<String> mensaje;

    public ActivityTraducidoViewModel(@NonNull Application application) {
        super(application);
    }

    public MutableLiveData<String> getMensaje() {
        if(mensaje == null) {
            mensaje = new MutableLiveData<>();
        }
        return mensaje;
    }

    public void setPalabra(Bundle bundle) {
        Palabra palabra = (Palabra) bundle.getSerializable("palabraEncontrada");

        //Log.d("Salida", "setPalabra: " + palabra.getPalabraIngles());
        mensaje.setValue(palabra.getPalabraIngles());
    }
}
