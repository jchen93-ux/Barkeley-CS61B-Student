public class Important_marks {
}

/*So we know the first point is static is mostly using in the Static Variable,
It means we only have one fixed space in our system memory, if we change the dat
we got more objects or datas, we do not have any more spaces for saving those
datas and information. So the data in that fixed space is always changing.

But for instance Variable, it has so many space for every datas, the memory system
would creat more space for each new data.


1. 为什么叫“静态”？（内存的角度）

static相当于是给整体的，non static 相当于是对特定的可能多个的
在 Java 中，当你创建一个类（比如 Dessert）时：

非静态变量 (Instance Variable)：像 flavor，每当你 new 一个甜点，内存里就会开辟一块新空间存这个口味。

静态变量 (Static Variable)：像 numDesserts，无论你 new 多少个对象，内存里永远只有这一块空间。

“静态”的真正含义是：它的生命周期是固定的。它在程序一运行、类被加载时就存在了，直到程序结束才消失。它不随对象的创建而产生，也不随对象的销毁而消失。

2. 为什么说它“不能用于循环对比”？
这里的“不能”并不是语法上禁止你写 if (numDesserts == 10)，而是指在逻辑上，用静态变量作为循环或对比的条件往往会引发“全场大乱”。

场景 A：如果你想对比每个对象的特性
假设你想写一个循环，对比哪种口味的甜点最贵：

如果 price 是 static 的：那么所有甜点的价格永远是一样的（改一个，全改了）。你没法对比，因为大家共享同一个值。

结论：需要体现“个体差异”的属性，绝对不能用 static。

场景 B：多线程下的“对比”风险
这是更高级的原因。因为静态变量是全局共享的：

如果你在一个循环里不断对比静态变量 numDesserts 的值。

与此同时，另一个程序（线程）偷偷改了 numDesserts。

你的循环对比可能会瞬间失效，或者出现不可预知的错误。

3. 什么时候用 static 才是对的？
static 就像是**“班级的公款”，而实例变量（非静态）是“每个学生的钱包”**。

可以用在循环对比的情况：你想知道“现在班里总人数是否超过了 50 人？” 这种宏观统计。

不能用的情况：你想循环对比“每个学生的钱包里有多少钱？” 这种微观差异。

总结
你听到的“不允许用于循环对比”，本质上是提醒你：不要试图用一个“全局唯一”的变量去代表“多个不同”的个体。

在 2048 项目中：

棋盘上的数字（Tile value）绝对不能是 static，否则一个格子变 4，全屏幕都变 4。

游戏中的最高分（Highest Score）可以是 static，因为它对整个游戏逻辑来说是唯一的。



* */



/*
对于单项链表的代码： public void addLast(int x){
                     last.next = new IntNode(x, null);
                     last = last.next;
                     size += 1;

 在java里面，last相当于定位的雷达

 每建造一个新的节点，我们的构造函数大概会长这个样子：
 IntNode(InNode prev, int item, IntNode next)
 如果我们想在末尾再加上一个数字x：
 last.next = new IntNode(last, x, null);

 */
