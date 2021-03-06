package com.example.whatsapp_application;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

class PagerViewAdapter extends FragmentPagerAdapter {
    public PagerViewAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        Fragment fragment=null;

        switch (position){
            case 0:
                fragment=new camera_fragments();
                break;
            case 1:
                fragment=new chats_fragments();
                break;
            case 2:
                fragment=new status_fragments();
                break;
            case 3:
                fragment=new calls_fragments();
                break;
        }
        return fragment;
    }

    @Override
    public int getCount() {
        return 4;
    }
}
