javac -d ./classes src/com/work/movie/xxx.java

因为要调用已生成的Movie.class
javac -d ./classes -classpath ./classes:.  src/com/work/movie/xxx.java

javac -d ./classes -classpath ./classes:.  ./src/App.java
把class文件放到classes目录下

jar cvf libs/jar包名.jar -C classes com/work/movie/xxx.class
生成libs目录下utils.jar

javac -d ./classes -classpath libs/jar包名.jar:. ./src/App.java

java -classpath jar包名.jar:./classes App

执行App:
java -classpath ./classes App