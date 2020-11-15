package com.example.goods.bean;

import com.example.goods.R;

import java.util.ArrayList;

public class GoodsInfo {
    public long rowid; // 行号
    public int sn; // 序号
    public String name; // 名称
    public String desc; // 描述
    public float price; // 价格
    public String thumb_path; // 小图的保存路径
    public String pic_path; // 大图的保存路径
    public int thumb; // 小图的资源编号
    public int pic; // 大图的资源编号

    public GoodsInfo() {
        rowid = 0L;
        sn = 0;
        name = "";
        desc = "";
        price = 0;
        thumb_path = "";
        pic_path = "";
        thumb = 0;
        pic = 0;
    }

    // 声明一个手机商品的名称数组
    private static String[] mNameArray = {
            "索尼（SONY）国行PS4游戏机", "索尼（SONY）PS4 Slim PlayStation", " 索尼（SONY）", "【二手95新】索尼PS4游戏主机", "索尼（SONY）", "小霸王G66/G90游戏机双人手柄","索尼（SONY）国行PS4游戏机","索尼（SONY）PS4游戏主机新款"
    };
    // 声明一个手机商品的描述数组
    private static String[] mDescArray = {
            " PS4 Slim 500GB高清家用电视游戏机 自营同款 支持VR Slim500G+新作必玩套装 对马岛之魂 大镖客 ",
            "国行游戏机 500G主机（黑色）",
            "PlayStation 4 无线游戏手柄（黑色）",
            "11/12型slim/PRO原装手柄娱乐体感游戏机vr 【抢购】11型 500G原装主机-含手柄 【套餐一】主机+单手柄+8重豪礼",
            "PlayStation 4 无线游戏手柄（钢铁黑）",
            "手柄电玩街机PS体感游戏机4K高清电视家用智能机顶盒 小霸王G66游戏机+无线双手柄+体感手柄+遥控器",
            "PS4 PRO家用4K电视游戏机自营同款 Ps4 Pro双手柄 尊贵游戏豪华套装",
            "slim/PRO 电脑家用娱乐体感游戏机二手ps4 PS4 slim500G全套标配"
    };
    // 声明一个手机商品的价格数组
    private static float[] mPriceArray ={240, 259, 268, 213, 259, 215,239,269};
    // 声明一个手机商品的小图数组
    private static int[] mThumbArray = {
            R.drawable.aa, R.drawable.bb, R.drawable.cc,
            R.drawable.dd, R.drawable.ee, R.drawable.ff,R.drawable.gg,R.drawable.hh
    };
    // 声明一个手机商品的大图数组
    private static int[] mPicArray = {
            R.drawable.aa, R.drawable.bb, R.drawable.cc,
            R.drawable.dd, R.drawable.ee, R.drawable.ff,R.drawable.gg,R.drawable.hh
    };

    // 获取默认的手机信息列表
    public static ArrayList<GoodsInfo> getDefaultList() {
        ArrayList<GoodsInfo> goodsList = new ArrayList<GoodsInfo>();
        for (int i = 0; i < mNameArray.length; i++) {
            GoodsInfo info = new GoodsInfo();
            info.name = mNameArray[i];
            info.desc = mDescArray[i];
            info.price = mPriceArray[i];
            info.thumb = mThumbArray[i];
            info.pic = mPicArray[i];
            goodsList.add(info);
        }
        return goodsList;
    }
}
