将switch部分代码放置Rental.java
============================
参照03
将已经分离出的switch部分代码转移到class Rental中

将计算频率代码放置Rental.java
=========================
Customer.java中的frequentRenterPoints变为累加
调用Rental.java中的getFrequentRenterPoints()

去除临时变量
==========
替换thisAmount、totalAmount
加入两个方法：
getTotalCharge()、getTotalFrequentRenterPoints()