package com.yourpet.modules.newRecord;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.yourpet.R;

import butterknife.ButterKnife;

/**
 * A placeholder fragment containing a simple view.
 */
public class NewRecordFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_new_record, container, false);
        ButterKnife.bind(this, rootView);

        return rootView;
    }
}
