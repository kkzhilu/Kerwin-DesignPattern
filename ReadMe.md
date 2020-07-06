# Kerwin's Super 设计模式篇

------



## 设计模式总篇

- 每种策略模式都会包括《HeadFirst》以及《GOF》两部经典书籍的算法Demo
- 如果JDK中已内部实现同样也会给出实例
- 对于实践意义极高的设计模式，也会给出工作中的例子

地址：https://juejin.im/post/5f021453e51d4534a40d9db2



## 历史文章链接

| 所属类型                              | 设计模式                             | 标题 & 链接                                                  |
| ------------------------------------- | ------------------------------------ | ------------------------------------------------------------ |
| <font color="red">行为型模式</font>   | 策略模式                             | [【一起学系列】之策略模式：好多鸭子啊](https://juejin.im/post/5eb67fc46fb9a043830f597a) |
| <font color="red">行为型模式</font>   | 观察者模式                           | [【一起学系列】之观察者模式：我没有在监控你啊](https://juejin.im/post/5ec2a1dde51d454ddf23697d) |
| <font color="red">行为型模式</font>   | 命令模式                             | [【一起学系列】之命令模式：封装一个简单Jedis？](https://juejin.im/post/5ed5265851882543477c7abf) |
| <font color="red">行为型模式</font>   | 模板方法模式                         | [【一起学系列】之模板方法：写SSO我只要5分钟](https://juejin.im/post/5ede6ce151882543485772ea) |
| <font color="red">行为型模式</font>   | 迭代器模式                           | [【一起学系列】之迭代器&组合：虽然有点用不上啦](https://juejin.im/post/5ee64aade51d45789671b974) |
| <font color="red">行为型模式</font>   | 状态模式                             | [【一起学系列】之状态模式：你听过“流程”模式吗？](https://juejin.im/post/5ee8f64be51d452f9c27e66a) |
| <font color="red">行为型模式</font>   | 职责链模式                           | [【一起学系列】之剩下的设计模式们](https://juejin.im/post/5efe0653e51d4534a81a9121) |
| <font color="red">行为型模式</font>   | 备忘录模式                           | [【一起学系列】之剩下的设计模式们](https://juejin.im/post/5efe0653e51d4534a81a9121) |
| <font color="blue">结构型模式</font>  | 装饰器模式                           | [【一起学系列】之装饰器模式：不改代码增强功能？](https://juejin.im/post/5ec2a87c5188256e9b728e70) |
| <font color="blue">结构型模式</font>  | 适配器模式 & 外观模式                | [【一起学系列】之适配器模式：还有外观模式呢](https://juejin.im/post/5ed688c051882543413c1168) |
| <font color="blue">结构型模式</font>  | 组合模式                             | [【一起学系列】之迭代器&组合：虽然有点用不上啦](https://juejin.im/post/5ee64aade51d45789671b974) |
| <font color="blue">结构型模式</font>  | 代理模式                             | [【一起学系列】之代理模式：是为了控制访问啊！](https://juejin.im/post/5ef2b053f265da02e3401e5c) |
| <font color="green">创建型模式</font> | 工厂模式<br />（工厂方法及抽象工厂） | [【一起学系列】之工厂模式：产品？产品族?](https://juejin.im/post/5ecbcf19e51d4578a475ea5e) |
| <font color="green">创建型模式</font> | 单例模式                             | [【一起学系列】之单例模式：只推荐三种~](https://juejin.im/post/5ecbcabc6fb9a047d070c779) |
| <font color="green">创建型模式</font> | 建造者模式                           | [【一起学系列】之剩下的设计模式们](https://juejin.im/post/5efe0653e51d4534a81a9121) |



## 知识图谱
![知识图谱](https://user-gold-cdn.xitu.io/2020/7/6/17320200913b1cc6?imageView2/0/w/1280/h/960/format/webp/ignore-error/1)

> Processon分享地址：https://www.processon.com/view/link/5f0210aa7d9c0844204b4845
>
> PS：需要源文件的小伙伴可以在文末扫描二维码，发送【设计模式】即可



## 推荐阅读

学习某一种设计模式时，推荐先找到对应的包名，然后进入App.java，内部包含了每种设计模式的推荐阅读顺序，比如：

```java
/***
 * 策略模式推荐代码阅读顺序：
 * @see Duck
 * @see FlyBehavior
 * @see RubberDuck
 */
```





## 策略模式

文章对应地址：https://juejin.im/post/5eb67fc46fb9a043830f597a

```java
@see com.design.strategy
```



## 观察者模式

文章对应地址：https://juejin.im/post/5ec2a1dde51d454ddf23697d

```java
@see com.design.observer
```



## 装饰器模式

文章对应地址：https://juejin.im/post/5ec2a87c5188256e9b728e70

```java
@see com.design.decorator
```



## 工厂模式

文章对应地址：https://juejin.im/post/5ecbcf19e51d4578a475ea5e

推荐按以下顺序阅读：
```java
@see com.design.factory.simplefactory
@see com.design.factory.method
@see com.design.factory.abstractFactory
```



## 单例模式

文章对应地址：https://juejin.im/post/5ecbcabc6fb9a047d070c779

```java
@see com.design.factory.singleton
```



## 命令模式

文章对应地址：https://juejin.im/post/5ed5265851882543477c7abf

```java
@see com.design.command
```



## 适配器与外观模式

文章对应地址：https://juejin.im/post/5ed688c051882543413c1168

```java
// 适配器模式
@see com.design.decorator

// 外观模式
@see com.design.facade
```



## 模板方法模式

文章对应地址：https://juejin.im/post/5ede6ce151882543485772ea

```java
@see com.design.template
```



## 迭代器模式与组合模式

文章对应地址：https://juejin.im/post/5ee64aade51d45789671b974

```java
// 迭代器模式
@see com.design.iterator

// 组合模式
@see com.design.composite
```



## 代理模式

文章对应地址：https://juejin.im/post/5ef2b053f265da02e3401e5c

```java
// 代理模式
@see com.design.proxy
```



## 建造者模式

文章对应地址：https://juejin.im/post/5efe0653e51d4534a81a9121

```java
@see com.design.builder
```



## 责任链模式

文章对应地址：https://juejin.im/post/5efe0653e51d4534a81a9121

```java
@see com.design.chain
```



## 备忘录模式

文章对应地址：https://juejin.im/post/5efe0653e51d4534a81a9121

```java
@see com.design.memento
```



## 如何联系我

关注掘金用户：https://juejin.im/user/5c729b0b5188255cf64b2da6

搜一搜公众号：是Kerwin啊，或者扫描下面的二维码啦~

![微信公众号](img/wechat.png)

