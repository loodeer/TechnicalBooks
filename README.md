# TechnicalBooks



## java

### 《码出高效 Java 开发手册》

### 《Java 编程的逻辑》

#### 第 9 章 列表和队列

##### ArrayList

ArrayList 内部数组默认分配大小是 10，数组扩展时 1.5 倍扩展。

#### 第 10 章 Map 和 Set

##### HashMap

看完书的内容之后当晚凑巧在掘金看到一篇 [HashMap 查漏补缺](https://juejin.im/post/5c332cfff265da611e4dd216)，总结的比较好，记录一下。

##### HashSet 

HashSet 内部维护了一个 HashMap 实例变量（key 不同 value 都为默认空对象），利用 HashMap 来实现的。

总体上理解了 HashMap 也就明白了 HashSet。

##### 排序二叉树

定义：左子树节点 < 根节点 < 右子树节点

排序二叉树最左节点为最小值，最有节点为最大值。

极端情况下，排序二叉树可能退化为一个链表。

平衡二叉树(AVL 树)：任何节点的左右子树高度差最多为 1 。

红黑树通过减弱对平衡的要求，降低保持平衡需要的开销，性能高于 AVL 数。

##### TreeMap

TreeMap 内部是用红黑树实现的。

put 方法：因为 key 是排序的，左 < 根 < 右，从主根节点开始比较，找到要 put key 的父节点，如果发现 key 已经存在，直接更新原有值，否则成为找到父节点的左孩子或右孩子。然后调整保持树平衡（fixAfterInsertion 方法）。

##### LinkedHashMap

LinkedHashMap 是 HashMap 的子类，内部额外维护了一个双向链表储存 key 的顺序。


#### 第 11 章 堆与优先级队列

堆逻辑概念上是一棵完全二叉树，物理存储上是具有一定顺序要求的数组。

##### [用优先级队列求前 K 个最大的元素](https://github.com/loodeer/javaExercise/blob/master/src/main/priorityQueue/GetTopK.java) 

思路：维护前 K 个最大的元素的最小堆，堆的根就是第 K 个最大元素。

网上资料：[拜托，面试别再问我TopK了！！！](https://mp.weixin.qq.com/s?__biz=MjM5ODYxMDA5OQ==&mid=2651961587&idx=1&sn=54bf39db7043cc638315caf70f24d94b&chksm=bd2d0d2f8a5a84395246be4522d10fbfc1f744658047d5fb3fad8e9f3c3d76baab3a2ce84867&mpshare=1&scene=1&srcid=0108WS865DA5nZgIbYPTcHqZ#rd)

##### [用优先级队列求中值](https://github.com/loodeer/javaExercise/blob/master/src/main/priorityQueue/GetMedian.java)

思路：分别维护一个最大堆、最小堆、当前中值。挨个进元素，大于当前中值的放入最小堆，反之放入最大堆。当两个堆的元素数量相差达到 2 ，取出元素数量较多堆的根替换新的当前中值，原有当前中值加进元素数量较少堆成为那个堆的根。
