计数排序算法的步骤
------

学习计数排序算法，时间复杂度为O(n)<br>
已知要排序的数组A和A中的最大元素k<br>
新建数组C，大小为k+1<br>
计算A中每个元素出现的个数，并存在C中<br>
将C中的值，改为前几项的累计和<br>
倒序遍历A，将元素对应的位置放在新数组B中<br>
遇到相同的元素向前一位挤<br>
排序完成<br>
