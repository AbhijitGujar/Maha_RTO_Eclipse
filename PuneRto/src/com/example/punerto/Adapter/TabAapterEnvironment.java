package com.example.punerto.Adapter;

import com.example.punerto.Activity.EnvironmentTaxCalculation;
import com.example.punerto.Activity.EnvironmentTaxInformation;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class TabAapterEnvironment extends FragmentStatePagerAdapter {

private int TOTAL_TABS = 2;
    public TabAapterEnvironment(FragmentManager fm) {
        super(fm);
       
    }
    
    @Override
    public Fragment getItem(int index) {
        // TODO Auto-generated method stub
         switch (index) {
            case 0:
                return new EnvironmentTaxCalculation();
                
            case 1:
                return new EnvironmentTaxInformation();
                
            case 2:
                return new EnvironmentTaxInformation();
            }
     
            return null;
    }

     @Override
    public int getCount() {
        // TODO Auto-generated method stub
        return TOTAL_TABS;
    }
}
