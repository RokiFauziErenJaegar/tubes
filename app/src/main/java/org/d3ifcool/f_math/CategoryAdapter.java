package org.d3ifcool.f_math;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Roki on 3/13/2018.
 */

public class CategoryAdapter extends FragmentPagerAdapter {
    private Context mContext;
    public CategoryAdapter(Context c,FragmentManager fm) {
        super(fm);
        mContext = c;
    }
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0 : return new MainMenuFragment();
            default: return new SubLessonFragment();
        }
    }
    @Override
    public int getCount() {
        return 2;
    }
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position){
            case 0: return mContext.getString(R.string.home);
            default: return mContext.getString(R.string.choose_sub_less);
        }
    }
}
