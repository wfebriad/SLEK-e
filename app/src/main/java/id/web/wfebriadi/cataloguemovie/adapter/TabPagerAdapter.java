package id.web.wfebriadi.cataloguemovie.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import id.web.wfebriadi.cataloguemovie.fragment.NowPlayingFragment;
import id.web.wfebriadi.cataloguemovie.fragment.PopularFragment;
import id.web.wfebriadi.cataloguemovie.fragment.UpcomingFragment;

public class TabPagerAdapter extends FragmentPagerAdapter {

    private static final int NUM_TABS = 3;

    public TabPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new UpcomingFragment();
            case 1:
                return new NowPlayingFragment();
            case 2:
                return new PopularFragment();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return NUM_TABS;
    }
}
