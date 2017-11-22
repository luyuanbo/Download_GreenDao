package com.lus.download_greendao;

import android.app.Application;

import com.lus.download_greendao.gen.DaoMaster;
import com.lus.download_greendao.gen.DaoSession;
import com.lus.download_greendao.gen.UserDao;

/**
 * Created by 卢总 on 2017/11/22.
 */

public class App extends Application {

    public static UserDao userDao;

    @Override
    public void onCreate() {
        super.onCreate();
        DaoMaster.DevOpenHelper devOpenHelper = new DaoMaster.DevOpenHelper(this, "lenvess.db", null);
        DaoMaster daoMaster = new DaoMaster(devOpenHelper.getWritableDb());
        DaoSession daoSession = daoMaster.newSession();
        userDao = daoSession.getUserDao();
    }
}
