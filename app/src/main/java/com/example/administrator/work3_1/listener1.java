package com.example.administrator.work3_1;

import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.widget.TextView;

public class listener1 extends Activity implements View.OnClickListener  {
    private TextView txt;

    public listener1(TextView textView) {
        this.txt =textView;
    }

    @Override
    public void onClick(View v) {
        txt.setText ( "外部类" );
    }
}
