package com.chapell.generator;

import cn.hutool.core.io.FileUtil;

import java.io.File;

/**
 *
    静态文件生成器
 */
public class StaticGenerator {
    public static void main(String[] args) {
        String projectPath = System.getProperty("user.dir");
        System.out.println(projectPath);
        //输入路径
        String inputPath = projectPath + File.separator  + "code-share-demo" + File.separator + "acm-template";
        //输出路径
        String outputPath = projectPath;
        //执行复制
        copyFilesByHutool(inputPath,outputPath);
    }

    /**
     *
     * @param inputPath 输入路径
     * @param outputPath 输出路径
     */

    public static void copyFilesByHutool(String inputPath,String outputPath){
        //输入路径
        FileUtil.copy(inputPath,outputPath,false);
    }
}
