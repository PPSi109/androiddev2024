import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import vn.edu.usth.usthweather.WeatherFragment;
import vn.edu.usth.usthweather.ForecastFragment;


public class WeatherPagerAdapter extends FragmentStateAdapter {

    private static final int NUM_PAGES = 3;

    public WeatherPagerAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position) {
            case 0:
                return new WeatherFragment();
            case 1:
                return new ForecastFragment();

            default:
                return new WeatherFragment();
        }
    }

    @Override
    public int getItemCount() {
        return NUM_PAGES;
    }
}
