package ru.startandroid.develop.vtbproject.ui.home;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProvider;

import ru.startandroid.develop.vtbproject.R;
import ru.startandroid.develop.vtbproject.StopypayFragment;
import ru.startandroid.develop.vtbproject.databinding.FragmentHomeBinding;

public class HomeFragment extends Fragment implements View.OnClickListener {

    private HomeViewModel homeViewModel;
    private FragmentHomeBinding binding;


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        homeViewModel = new ViewModelProvider(this, new ViewModelProvider.NewInstanceFactory()).get(HomeViewModel.class);
        binding = FragmentHomeBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
        Button btnStory = (Button) root.findViewById(R.id.story);
        Button btnaddChild = (Button) root.findViewById(R.id.addChild);
        btnStory.setOnClickListener(this::onClick);
        return root;
    }



        @Override
        public void onDestroyView () {
            super.onDestroyView();
            binding = null;
        }

    @Override
    public void onClick(View v) {
            switch (v.getId()) {
                case R.id.story:
                    Fragment fragment = new StopypayFragment();
                    FragmentManager fn = getFragmentManager();
                    FragmentTransaction fragmentTransaction = fn.beginTransaction();
                    fragmentTransaction.replace(R.id.home, fragment);
                    

                    fragmentTransaction.commit();
                    break;
                case R.id.addChild:
                    break;
            }
    }
}