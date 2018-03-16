package com.android.shivesh.memberappdagger;

import android.app.Application;

import com.android.shivesh.memberapp.DaggerMemberAppComponent;

/**
 * Created by Shivesh on 16-03-2018.
 */

public class App extends Application {

    private static App app;
    private MemberAppComponent memberAppComponent;

    public MemberAppComponent getMemberAppComponent() {
        return memberAppComponent;
    }

    @Override
    public void onCreate() {
        super.onCreate();

        app = this;

        memberAppComponent = DaggerMemberAppComponent.builder()
                .memberDataModule(new MemberDataModule())
                .build();
    }

    public static App getApp() {
        return app;
    }
}
