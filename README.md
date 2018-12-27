# filerename  
deMacBook-Air:work $ git clone https://github.com/sxjlinux/filerename.git  
正克隆到 'filerename'...  
remote: Enumerating objects: 16, done.  
remote: Counting objects: 100% (16/16), done.  
remote: Compressing objects: 100% (10/10), done.  
remote: Total 16 (delta 0), reused 10 (delta 0), pack-reused 0  
展开对象中: 100% (16/16), 完成.  


deMacBook-Air:filerename $ mvn package  
[INFO] Scanning for projects...  
[WARNING]   
[WARNING] Some problems were encountered while building the effective model for com.sunxj.filerename.com:filerename:jar:1.0-SNAPSHOT  
[WARNING] 'build.plugins.plugin.(groupId:artifactId)' must be unique but found duplicate declaration of plugin   org.apache.maven.plugins:maven-jar-plugin @ line 19, column 21  
[WARNING]   
[WARNING] It is highly recommended to fix these problems because they threaten the stability of your build.  
[WARNING]   
[WARNING] For this reason, future Maven versions might no longer support building such malformed projects.  
[WARNING]   
[INFO]   
[INFO] ----------------< com.sunxj.filerename.com:filerename >-----------------  
[INFO] Building filerename 1.0-SNAPSHOT  
[INFO] --------------------------------[ jar ]---------------------------------  
[INFO] 
[INFO] --- maven-resources-plugin:2.6:resources (default-resources) @ filerename ---  
[WARNING] Using platform encoding (UTF-8 actually) to copy filtered resources, i.e. build is platform dependent!  
[INFO] skip non existing resourceDirectory /sunxj/work/filerename/src/main/resources  
[INFO]  
[INFO] --- maven-compiler-plugin:3.1:compile (default-compile) @ filerename ---  
[INFO] Changes detected - recompiling the module!  
[WARNING] File encoding has not been set, using platform encoding UTF-8, i.e. build is platform dependent!  
[INFO] Compiling 1 source file to /sunxj/work/filerename/target/classes  
[INFO] 
[INFO] --- maven-resources-plugin:2.6:testResources (default-testResources) @ filerename ---  
[WARNING] Using platform encoding (UTF-8 actually) to copy filtered resources, i.e. build is platform dependent!  
[INFO] skip non existing resourceDirectory /sunxj/work/filerename/src/test/resources  
[INFO] 
[INFO] --- maven-compiler-plugin:3.1:testCompile (default-testCompile) @ filerename ---  
[INFO] No sources to compile  
[INFO] 
[INFO] --- maven-surefire-plugin:2.12.4:test (default-test) @ filerename ---  
[INFO] No tests to run.  
[INFO] 
[INFO] --- maven-jar-plugin:3.1.1:jar (default-jar) @ filerename ---  
[INFO] Building jar: /sunxj/work/filerename/target/filerename-1.0-SNAPSHOT.jar  
[INFO] ------------------------------------------------------------------------  
[INFO] BUILD SUCCESS  
[INFO] ------------------------------------------------------------------------  
[INFO] Total time:  3.941 s  
[INFO] Finished at: 2018-12-27T23:37:32+08:00  
[INFO] ------------------------------------------------------------------------  

deMacBook-Air:filerename $ java -jar target/filerename-1.0-SNAPSHOT.jar
参数不正确
	help			表示帮助文档
	--path=dir		dir表示实际的路径
	--prefix=p		p表示需要在文件名前加的前缀
	--suffix=.jpg	用于表示后缀名如：.jpg .png等等
	--number=0		0表示更改文件名的序号，序号是由10个数字构成加在前缀后
	
