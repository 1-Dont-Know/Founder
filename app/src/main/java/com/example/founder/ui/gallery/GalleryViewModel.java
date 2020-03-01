package com.example.founder.ui.gallery;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class GalleryViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public GalleryViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is the Organizations/Charities tabs where you can find charities you want " +
                "to support." +
                "\n\n1.WWWF World Wildflife Fund " +
                "-they address global environment issues of animals" +
                "\n\n2. Make-A-Wish Foundation of America" +
                "-grants wishes `to children with life threatening medical conditions." +
                "\n\n3.United States Fund for UNICEF" +
                "-raises funds for emergency relief efforts benefiting children outside of the U.S." +
                "\n\n4.St. Jude Children's Hospital" +
                "-a pediatric treatment and research facility focused on children's catastrophic diseases" +
                "\n\n5. American National Red Cross" +
                "-provides emergency assistance, diaster relief and education inside the United States." +
                "\n\n6. Feeding America" +
                "-national network of more than 200 food banks and food rescue organizations, feeding America is the nation's leading hunger-relief charity" +
                "\n\n7. American Cancer Society" +
                "-committed to creating a world with less cancer" +
                "\n\n8. Planned Parenthood Federation of America" +
                "- proudly reproductive health services, including cancer screening and HIV screening. " +
                "\n\n9. Salvation Army" +
                "- it does charity work in over 120 countries" +
                "\n\n10. Boys & Girls Clubs of America" +
                " - operates after-schoolo programs natioanlly. It aspires to provide all young people with a safe place to learn and grow ");
    }

    public LiveData<String> getText() {
        return mText;
    }

}