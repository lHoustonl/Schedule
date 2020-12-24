package com.example.schedule;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.EditText;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link ScheduleBlankFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ScheduleBlankFragment extends Fragment {

    EditText editText;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View inf = inflater.inflate(R.layout.fragment_schedule_blank, container, false);
        editText = inf.findViewById(R.id.BlankEditText);
        final WebView webView = inf.findViewById(R.id.BlankWebView);

        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                webView.loadUrl("https://oksei.ru/studentu/raspisanie_uchebnykh_zanyatij?group=" + s.toString());
            }
        });


        return inf;
    }

    public void setGroup(String group)
    {
        editText.setText(group);
    }

}