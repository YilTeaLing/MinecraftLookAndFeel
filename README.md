# MinecraftLookAndFeel
![](https://img.shields.io/badge/version-0.0.1-red.svg)
![](https://img.shields.io/github/license/YilTeaLing/MinecraftLookAndFeel.svg)
This is a LookandFeel park on Swing. You can decorate your Swing project by using this LookandFeel park. It support the styles of Java and Bedrock Edition Minecraft now, and we will add more styles about Minecraft in the future. 
这是一个Swing的LookAndFeel包。您可以通过使用本包来装饰您的Swing项目。它目前支持Minecraft Java版和基岩版，并且我们将在未来添加更多有关Minecraft的样式。

[Display video/展示视频]()

## How to use it? 
This is a LookandFeel park, so you just need to add the following code in your Swing project: 
这是一个LookandFeel包，所以您只需要添加如下代码至您的Swing项目：

```
import com.github.yiltealing.mcplaf.MinecraftLookAndFeel;

try {
	UIManager.setLookAndFeel(new MinecraftLookAndFeel());
}
	catch (Exception e) {}
```
Tips: This code should be add before create JFrame or MFrame. 
提示：此代码应在创建JFrame或MFrame之前添加。

If you want your forms also use this LookandFeel, you just need to change the class of Frame from "JFrame" to "MFrame". 
如果您希望窗体也使用这种LookandFeel，只需将Frame的类从"JFrame"更改为"MFrame"。

```
import com.github.yiltealing.mcplaf.MFrame;

~~JFrame frame = new JFrame();~~
MFrame frame = new MFrame();
```

## Characteristic
- Minecraft style App
- Support for all Swing controls
- Support stay highlighting and sound effects
- Open and free, just need to add a little lines of code

+ Minecraft风格的应用
+ 支持所有Swing控件
+ 支持停留高亮和音效
+ 开源且免费，仅需添加少量代码

## About
Contact author: 
联系作者：

[github@YilTeaLing](https://github.com/YilTeaLing)
[bilibili@茶凌儿](https://space.bilibili.com/251608296)
