# TechnicalBooks



## java

### 《码出高效 Java 开发手册》

### 《Java 编程的逻辑》

#### 第 11 章 堆与优先级队列

堆逻辑概念上是一棵完全二叉树，物理存储上是具有一定顺序要求的数组。

##### [用优先级队列求前 K 个最大的元素](https://github.com/loodeer/javaExercise/blob/master/src/main/priorityQueue/GetTopK.java)

思路：维护前 K 个最大的元素的最小堆，堆的根就是第 K 个最大元素。

##### [用优先级队列求中值](https://github.com/loodeer/javaExercise/blob/master/src/main/priorityQueue/GetMedian.java)

思路：分别维护一个最大堆、最小堆、当前中值。挨个进元素，大于当前中值的放入最小堆，反之放入最大堆。当两个堆的元素数量相差达到 2 ，取出元素数量较多堆的根替换新的当前中值，原有当前中值加进元素数量较少堆成为那个堆的根。
