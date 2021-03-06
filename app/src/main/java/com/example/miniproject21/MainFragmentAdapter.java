package com.example.miniproject21;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.miniproject21.FragmentSet1.AcknowldegementFragment;
import com.example.miniproject21.FragmentSet1.HistoryPageFragment;
import com.example.miniproject21.FragmentSet1.SearchPageFragment;
import com.example.miniproject21.FragmentSet1.UploadPageFragment;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class MainFragmentAdapter extends FragmentPagerAdapter {

    public MainFragmentAdapter(FragmentManager fm)
    {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position)
    {
        if (position==0){
            return new AcknowldegementFragment();
        }
        else if (position == 1) {
            return new HistoryPageFragment();

        }
        else if (position == 2) {
            return new UploadPageFragment();
        }
        else {
            return new SearchPageFragment();
        }
    }

    @Override
    public int getCount()
    {
        return 4;
    }
}