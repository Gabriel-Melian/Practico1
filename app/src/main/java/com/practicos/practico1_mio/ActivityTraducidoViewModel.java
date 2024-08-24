package com.practicos.practico1_mio;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.MutableLiveData;

public class ActivityTraducidoViewModel extends AndroidViewModel {

    private MutableLiveData<String> palabras;//Informa algo a la vista

    public ActivityTraducidoViewModel(@NonNull Application application) {
        super(application);
    }
}
