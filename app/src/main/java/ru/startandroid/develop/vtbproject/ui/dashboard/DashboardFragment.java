package ru.startandroid.develop.vtbproject.ui.dashboard;

import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProvider;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import ru.startandroid.develop.vtbproject.BlankFragment;
import ru.startandroid.develop.vtbproject.BlankFragment2;
import ru.startandroid.develop.vtbproject.R;
import ru.startandroid.develop.vtbproject.StopypayFragment;
import ru.startandroid.develop.vtbproject.databinding.FragmentDashboardBinding;

public class DashboardFragment extends Fragment implements View.OnClickListener {
    public String s = "800";
    private DashboardViewModel dashboardViewModel;
    private FragmentDashboardBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        dashboardViewModel =
                new ViewModelProvider(this, new ViewModelProvider.NewInstanceFactory()).get(DashboardViewModel.class);

        binding = FragmentDashboardBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
        EditText ed = root.findViewById(R.id.editTextTextPersonName);
        ed.setText(s);
        Button btna = root.findViewById(R.id.button4);
        Button btnb = root.findViewById(R.id.button5);
        Button btnc = root.findViewById(R.id.button);
        btnc.setOnClickListener(this);
        btnb.setOnClickListener(this);
        btna.setOnClickListener(this);

        final TextView textView = binding.textOrg;
        dashboardViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
            }
        });
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.button4:
                Fragment fragment = new BlankFragment();
                FragmentManager fn = getFragmentManager();
                FragmentTransaction fragmentTransaction = fn.beginTransaction();
                fragmentTransaction.replace(R.id.nav_host_fragment_activity_main, fragment);

                fragmentTransaction.commit();
                break;
            case R.id.button5:
                Fragment fragment1 = new BlankFragment2();
                FragmentManager fn1 = getFragmentManager();
                FragmentTransaction fragmentTransaction1 = fn1.beginTransaction();
                fragmentTransaction1.replace(R.id.nav_host_fragment_activity_main, fragment1);

                fragmentTransaction1.commit();
        }


    }
}