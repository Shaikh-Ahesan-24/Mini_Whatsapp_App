package com.example.whatsapp;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class ViewPageradapter extends FragmentPagerAdapter {
    public ViewPageradapter(@NonNull FragmentManager fm) {
        super(fm);
    }


    @NonNull
    @Override
    public Fragment getItem(int position) {
        if(position==0){
            return new Chat();
        } else if (position==1) {
           return new Status();
        }else{
            return new Call();
        }


    }

    @Override
    public int getCount() {
        return 3;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
       if(position==0){
           return "Chat";
       }else if(position==1){
           return "Status";
       }else{
           return "Call";
       }
    }
}


