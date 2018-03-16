package com.android.shivesh.memberappdagger;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.android.shivesh.memberapp.R;

import javax.inject.Inject;

/**
 * Created by Shivesh on 16-03-2018.
 */

public class MainActivity extends AppCompatActivity {

    @Inject
    MemberDataManager memberDataManager;

    private EditText memberId;
    private Button submitButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        App.getApp().getMemberAppComponent().inject(this);

        memberId=(EditText)findViewById(R.id.etMemberId);
        submitButton=(Button)findViewById(R.id.btnSubmit);


        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {



                if ((memberId.getText().toString().equals("")))
                {
                    Toast.makeText(getApplicationContext(), "Member ID is empty", Toast.LENGTH_SHORT).show();
                }else{

                    String input=memberId.getText().toString();
                   // String result=new MemberDataManager().checkMemberStatus(input);
                    String result=memberDataManager.checkMemberStatus(input);
                    Toast.makeText(getApplicationContext(), result, Toast.LENGTH_SHORT).show();
                }






            }
        });
    }
}
