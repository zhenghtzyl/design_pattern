package com.imooc.design.pattern.creational.simplefactory;

/**
 * @author zht
 * @date 2019/4/6 16:27
 **/
public class Test {

    public static void main(String[] args) {
//        VideoFactory videoFactory = new VideoFactory();
//        //通过工厂对象去调用所需要的相关类
//        Video video = videoFactory.getVideo("java");
//        //防止空指针异常
//        if(video == null) {
//            return ;
//        }
//        video.getVideo();

        VideoFactory videoFactory = new VideoFactory();
        //通过工厂对象去调用所需要的相关类
        Video video = videoFactory.getVideo(JavaVideo.class);
        //防止空指针异常
        if(video == null) {
            return ;
        }
        video.getVideo();
    }
}
