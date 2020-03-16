cd rentmovie
javac -d . com/work/movie/xxx.java
-d <目录>  指定放置生成的类文件的位置
生成的class放在当前目录下，并按照package的方式来存放
package com.work.movie

javac App.java

java App


Vector
======
与数组类似，为动态数组
同步访问，不属于集合框架。
Vector v = new Vector(大小，增量)
v.capacity()容量大小
v.addElement()添加数据
打印：
Enumeration enums = v.elements();
while (enums.hasMoreElements()){
    System.out.println(enums.nextElement()); 
}