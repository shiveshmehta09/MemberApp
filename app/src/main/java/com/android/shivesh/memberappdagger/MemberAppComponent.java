package com.android.shivesh.memberappdagger;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by Shivesh on 16-03-2018.
 */


@Singleton
@Component(modules = MemberDataModule.class)
public interface MemberAppComponent {

    void inject(MainActivity mainActivity);
}
