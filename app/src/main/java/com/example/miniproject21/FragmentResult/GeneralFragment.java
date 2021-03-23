package com.example.miniproject21.FragmentResult;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.miniproject21.R;
import com.example.miniproject21.ResultsActivity;

public class GeneralFragment extends Fragment {

    @Override
    public void setUserVisibleHint(boolean isVisibleToUser) {
        super.setUserVisibleHint(isVisibleToUser);

        if (isVisibleToUser) {
            ResultsActivity.getMenu().getItem(0).setChecked(true);
        }
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_general_result, container, false);

        // code here
        TextView mTextView = view.findViewById(R.id.dishName);
        mTextView.setText(ResultsActivity.item);

        return view;
    }
}
