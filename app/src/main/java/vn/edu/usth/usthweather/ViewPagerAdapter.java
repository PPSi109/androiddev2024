package vn.edu.usth.usthweather;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class ViewPagerAdapter extends FragmentStateAdapter {

    public ViewPagerAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        // Trả về các Fragment tương ứng cho mỗi tab
        switch (position) {
            case 0:
                return new FragmentOne();  // Tab 1
            case 1:
                return new FragmentTwo();  // Tab 2
            default:
                return new FragmentThree();  // Tab 3
        }
    }

    @Override
    public int getItemCount() {
        return 3;  // Số lượng tab
    }
}

