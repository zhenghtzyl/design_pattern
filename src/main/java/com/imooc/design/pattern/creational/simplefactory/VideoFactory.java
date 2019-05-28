package com.imooc.design.pattern.creational.simplefactory;

/**
 * @author zht
 * @date 2019/4/6 16:50
 **/
public class VideoFactory {

    /*public Video getVideo(String type) {

        if("java".equalsIgnoreCase(type)) {
            return new JavaVideo();
        } else if("python".equalsIgnoreCase(type)) {
            return new PythonVideo();
        }

        return null;
    }*/

    public Video getVideo(Class c) {
        Video video = null;
        try {
            video = (Video) Class.forName(c.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return video;
    }
}
