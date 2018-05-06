package com.example.administrator.work3_1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private Button btn1,btn2,btn3,btn4,btn5;
    private TextView txt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.frgment );
        btn1=(Button)findViewById ( R.id.button );
        btn2=(Button)findViewById ( R.id.button2 );
        btn3=(Button)findViewById ( R.id.button3 );
        btn4=(Button)findViewById ( R.id.button4 );
        btn5=(Button)findViewById ( R.id.button5 );
        txt=(TextView) findViewById ( R.id.textView );
        btn1.setOnClickListener ( new listener() );
        btn2.setOnClickListener ( new listener1 (txt) );
        btn3.setOnClickListener ( new View.OnClickListener () {       //
            @Override
            public void onClick(View v) {
               txt.setText ( "匿名内部类" );
            }
        } );
        btn4.setOnClickListener (  this );

    }
    @Override
    public void onClick(View v) {
        txt.setText ( "匿名内部类" );
    }

    public void clickButton(View view) {
        txt.setText ( "直接绑定到标签" );
    }

    class listener implements View.OnClickListener {                  //内部类
        @Override
        public void onClick(View v) {
            txt.setText ( "内部类" );
        }
    }
}