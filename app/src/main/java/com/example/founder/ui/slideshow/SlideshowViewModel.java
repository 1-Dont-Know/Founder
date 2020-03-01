package com.example.founder.ui.slideshow;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class SlideshowViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public SlideshowViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Enter your email: " +
                "\n\n\nEnter credit card: " +
                "\n\n\nEnter Password: ");
    }

    public LiveData<String> getText() {
        return mText;
    }
}