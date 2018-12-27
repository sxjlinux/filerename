package com.sunxj.rename;

import java.io.File;

public class FileReName {
    private String prefix="";
    private String suffix="";
    private String path="";
    private int number=0;
    private static String help="\thelp\t\t\t表示帮助文档\n\t--path=dir\t\tdir表示实际的路径\n\t--prefix=p\t\tp表示需要在文件名前加的前缀\n\t--suffix=.jpg\t用于表示后缀名如：.jpg .png等等\n\t--number=0\t\t0表示更改文件名的序号，序号是由10个数字构成加在前缀后\n\t";
    public FileReName(String args[]){
        this.prefix=getKeyValue(args,"--prefix");
        this.suffix=getKeyValue(args,"--suffix");
        this.path=getKeyValue(args,"--path");
        this.number=Integer.parseInt(getKeyValue(args,"--number"));
        multiRename(this.path,this.prefix,this.suffix,this.number);
    }
    public void multiRename(String path,String prefix,String suffix,int number){
        File file = new File(path);

        boolean isDirectory = file.isDirectory();

        /** 如果不是文件夹，就返回* */
        if(!isDirectory){
            System.out.println(path + "不是一个文件夹！");
            return;
        }

        String[] files = file.list();
        File f = null;
        String filename = "";
        String oldFileName = ""; //之前的名字
        /** 循环遍历所有文件* */
        for(String fileName : files){
            oldFileName = fileName;
            f = new File(path + "\\" + oldFileName); //输出地址和原路径保持一致
            fileName=String.format("%s%010d%s",prefix,number++,suffix);
            System.out.println("旧文件名："+oldFileName+"\t新文件名："+fileName);
            f.renameTo(new File(path + "\\" +  fileName));
        }
        System.out.println("恭喜，批量重命名成功！");
    }
    public  String getKeyValue(String args[],String parms){
        String value="";
        for(int i=0;i<args.length;i++){
            int idx=args[i].lastIndexOf(parms);
            if(idx>=0){
                idx=args[i].lastIndexOf("=");
                if(idx>=0){
                    value=args[i].substring(idx+1,args[i].length());
                }
            }
        }
        return value;
    }
    public static void main(String args[]){
        if(args.length<=0){
            System.out.println("参数不正确");
            System.out.println(help);
            return ;
        }
        int count=0;
        boolean isHelp=false;
        for(int i=0;i<args.length;i++){
            isHelp=args[i].equals("hellp");
        }
        if(isHelp){
            System.out.println(help);
        }else{
            if(args.length<4){
                System.out.println("参数个数不正确");
                return;
            }else{
                new FileReName(args);
            }
        }
    }
}
