package com.example.founder.ui.home;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class HomeViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public HomeViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Welcome to Founder \n" +
                "\nThis is the best app that can help you donate money to organization/charities that" +
                " right for you. The best thing is that you don't need to worry about us taking your" +
                " money that is meant for the charity you want. We are a non-profit organization so " +
                "all your money will go to where you want it to.");
    }

    public LiveData<String> getText() {
        return mText;
    }
}