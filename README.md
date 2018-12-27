# filerename  
git clone https://github.com/sxjlinux/filerename.git  
mvn package  
deMacBook-Air:filerename $ java -jar target/filerename-1.0-SNAPSHOT.jar  
参数不正确  
	help			表示帮助文档  
	--path=dir		dir表示实际的路径  
	--prefix=p		p表示需要在文件名前加的前缀  
	--suffix=.jpg	用于表示后缀名如：.jpg .png等等  
	--number=0		0表示更改文件名的序号，序号是由10个数字构成加在前缀后  
