package com.example.cuizhichao.broadcastbestpractice;

import android.app.Activity;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * activity管理类
 */
public class ActivityCollector {
    /**
     * activity集合
     */
    public static List<Activity> activityList = new ArrayList<>();

    /**
     * 添加新的activity 到集合
     * @param activity
     */
    public static void addActivity(Activity activity){
        activityList.add(activity);
    }

    /**
     * 从list集合移除activity
     * @param activity
     */
    public static void removeActivity(Activity activity){
        activityList.remove(activity);
    }

    /**
     * 销毁所有的activity
     */
    public static void finishAll(){
        for(Activity activity:activityList){
            if(!activity.isFinishing()){
                activity.finish();
            }
        }
        activityList.clear();
    }
}
