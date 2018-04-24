package com.example.ayomemilih;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class PagerAdapter2 extends FragmentStatePagerAdapter{

    int mNoOfTabs;

    public PagerAdapter2(FragmentManager fm, int NumberOfTabs)
    {
        super(fm);
        this.mNoOfTabs = NumberOfTabs;
    }

    @Override
    public Fragment getItem(int position){
        switch (position)
        {
            case 0:
                Tab3 tab3 = new Tab3();
                return tab3;
            case 1:
                Tab4 tab4 = new Tab4();
                return tab4;
            default:
                return null;
        }
    }

    @Override
    public int getCount(){
        return mNoOfTabs;
    }
}
