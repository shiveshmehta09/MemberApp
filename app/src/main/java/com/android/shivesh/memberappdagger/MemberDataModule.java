package com.android.shivesh.memberappdagger;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Shivesh on 16-03-2018.
 */


@Module
public class MemberDataModule {

    @Singleton
    @Provides
    MemberDataManager provideMemberDataManager() {
        return new MemberDataManager();
    }
}
