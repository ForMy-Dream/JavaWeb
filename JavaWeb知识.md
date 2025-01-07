# JavaWeb知识

目前对于web开发，一般采用的是前后端分离，而java程序员主要负责的就是后端的程序开发，前端一般有前端工程师来进行编写（虽然现在大部分都是一个人做，手动滑稽）

理想的开发步骤

需求分析==》接口定义（出API接口文档）==》前后端并行开发（根据api文档）==》测试（前端，后端）==》前后端联调测试

当然，这是理想状态

# 前端

web前端一般负责页面的展示，网页一般由：文字、图片、音频、视频、超链接...组成

我看看到的网页，本质都是程序员写的前端代码

## web标准

web标准也称为网页标准，由一系列的标准组成，大部分由W3C（World Wide Web Consortium，万维网联盟）负责制定

三个部分组成：

Html：负责网页的结构（页面元素和内容）

CSS：负责网页的表现（页面元素的外观、位置等页面样式，如：颜色、大小等）

JavaScript：负责网页的行为（交互效果）

三者被合称为前端三剑客

### HTML

HTML（HyperText Markup Language）：超文本标记语言

超文本：超越了文本的限制，比普通文本更强大。除文字信息，还可以定义图片，音频，视频等内容

标记语言：由标签构成的语言

​	HTML标签都是预定义好的。例如：使用<a>展示超链接，使用<img>展示如片，<video>展示视频。

​	HTML代码直接在浏览器中运行，HTML标签由浏览器解析

特点：

HTML标签不区分大小写

HTML标签属性值单双引号都可以

HTML语法松散

[HTML 标签参考手册](https://www.w3school.com.cn/tags/index.asp)

可以在这个网站查看所有的HTML标签

在HTML中无论输入多少个空格，只会显示一个，可以使用空格占位符：&nbsp

#### 常用标签

##### 标题标签

标签：<h1>....</h1>（h1->h6） 重要程度一次递减

注意：HTML标签都是预定义好的，不能自己随意定义

##### 水平线标签

 < hr>   会生成一条水平线

##### 图片标签

<img src="" width="" height="">

对于图片的src路径：分为绝对路径和相对路径

绝对路径：绝对磁盘路径（D:/xxxx）、绝对网络路径（https：//xxxx）

相对路径：从当前文件开始查找。（./ 代表当前目录，../代表上一级目录）

##### 布局标签

实际开发网页中，会大量频繁使用div和span这两个没有语义的布局标签

###### div标签

一行只显示一个（独占一行）

宽度默认是父元素的宽度，高度默认由内容撑开

可以设置宽高（width、height）

###### span标签

<sapn>是一个在开发网页时大量会用到的没有语义的布局标签

一行可以显示多个（组合行内元素）

宽度和高度默认由内容撑开

不可以设置宽高（width、height）

##### 超链接标签

`` <a href="..." target="...">文字内容</a>``

属性：

href：指定资源访问的url

target：指定在何处打开资源链接

​	_self：默认值，在当前页面打开

​	_blank：在空白页面打开

##### 视频标签

< video>

​	src：规定视频的url

​	controls：显示播放控件

​	width：播放器的宽度

​	height：播放器的高度

##### 音频标签

< audio>

​	src：规定音频

​	controls：显示播放控件

##### 段落标签

< p>

##### 文本加粗标签

< b> /< strong>

##### 表格标签

在网页中以表格（行、列）形式整齐展示数据

| 标签     | 描述                             | 属性/备注                                                    |
| -------- | -------------------------------- | ------------------------------------------------------------ |
| < table> | 定义表格整体，可以包裹多个< tr>  | border:规定表格边框的宽度<br />width：规定表格的宽度<br />cellspacing：规定单元之间的空间 |
| < tr>    | 表格的行、可以包裹多个< td>      |                                                              |
| < td>    | 表格单元格（普通），可以包裹内容 | 如果是表头单元格，可以替换为< th>                            |

##### 表单标签

在网页中主要负责数据采集功能，如注册、登陆等数据采集

< form>

表单项：不同类型的input元素、下拉列表、文本域等

< input>：定义表单项，通过type属性控制输入形式

< select> ：定义下拉列表

< textarea> ：定义文本域

属性：

action ：规定当提交表单时向何处发送表单数据，URL，如果不指定，则默认提交到当前页面

method：规定用于发送表单数据的方式。GET、POST

​	get：在url后面拼接表单数据，如 ？username=Tom&age=12，url长度有限制     （表单默认值）

​	post：在消息体（请求体）中传递的，参数大小无限制的

表单项必须有name属性才可以提交

##### 表单项标签

表单项：

< input> ：表单项，通过type属性控制输入形式

< select>：定义下拉列表，< option> 定义列表项

< textarea>：文本域

| type取值                 | 描述                             |
| ------------------------ | -------------------------------- |
| text                     | 默认值，定义单行的输入字段       |
| password                 | 定义密码字段                     |
| radio                    | 定义单选按钮                     |
| checkbox                 | 定义复选框                       |
| file                     | 定义文件上传按钮                 |
| date/time/datetime-local | 定义日期/时间/日期时间           |
| number                   | 定义数字输入框                   |
| email                    | 定义邮件输入框                   |
| hidden                   | 定义隐藏域                       |
| submit/reset/button      | 定义提交按钮/重置按钮/可点击按钮 |





### CSS

CSS（Cascading Style Sheet）：层叠样式表，用于控制页面的样式（表现）

[CSS 参考手册](https://www.w3school.com.cn/cssref/index.asp)

可以在这个网站查看样式参考

#### CSS选择器

用来选取需要设置样式的元素（标签）

##### 元素选择器

元素名称 {

​	xxx:xxx;

}

```html
h1{
	color:rgb(77,79,83)
}
<!-- 对所有的h1标签都生效-->
<h1>
    hello CSS!
</h1>
```

##### id选择器

#id属性值 {

​	xxx:xxx;

}

```html
<h1 id="hid">
    Hello CSS!
</h1>
<!-- 对id为hid的元素（标签）生效 -->
#hid {
	color:rgb(77,79,83)
}

```

##### 类选择器

.class属性值 {

​	xxx:xxx;

}

```html	
<h1 class="cls">
    Hello CSS!!
</h1>
.cls{
	color:rgb(77,79,83)
}
```

选择器的优先级：id选择器>类选择器>元素选择器

#### CSS页面布局

盒子：页面中所有元素（标签），都可以看作是一个盒子，由盒子将页面中的元素包含在一个矩形区域内，通过盒子的视角更方便的进行页面布局

##### 盒子模型

盒子模型组成：内容区域（content）内边距区域（padding）、边框（border）、外边距区域（margin），外边距不计入盒子大小

![image-20241219141209210](D:\JAVA\JavaWeb\笔记图片\image-20241219141209210-1734588739185-1.png)

对于内外边距的设置，四个值的时候，顺序为：上 右 下 左，三个值为：上 左右 下，两个值为：上下 左右，一个值为：四个方向

想要设置制定位置的边距，则  边距类型-位置  如：margin-top 设置上边距，其他类推

#### CSS样式的引入方式

##### 行内样式

写在标签的style属性中（不推荐）  如：

```html
<h1 style="xxxx: xxxx; xxxx: xxx;">测试</h1>
```

##### 内嵌样式

写在style标签中（可以卸载页面任何位置，但通常约定写在head标签中)，如：

```html
<head>
    <style>
        h1{
            xxx:xxx;
            xxx:xxx;
        }
    </style>
</head>
```

##### 外联样式

写在一个单独的.css文件中（需要通过link标签在网页中引入，一般也是在head标签中），如

```html
<head>
    <link rel="stylesheet" href="css/news.css">
</head>
```

#### 颜色的表示形式

通过color属性进行设置

| 表示形式       | 表示含义                          | 取值                                        |
| -------------- | --------------------------------- | ------------------------------------------- |
| 关键字         | 预定义的颜色名                    | red、green、blue...                         |
| reg表示法      | 红绿蓝三原色，每项取值范围：0-255 | rgb(0,0,0)、rgb(255,255,255)、rgb(255,0,0)  |
| 十六进制表示法 | #开头，将数字转换成十六进制表示   | #000000、#ff0000、#cccccc，简写：#000、#ccc |

#### CSS样式

##### 文本样式

line-height：设置行高

text-indent：定义第一个行内容的缩进

text-align：规定元素中的文本的水平对齐方式





### JavaScript

JavaScript（简称：JS）是一门跨平台、面向对象的脚本语言。是用来控制网页行为的，它能使网页可交互

JavaScript和Java是完全不同的语言，不论是概念还是设计。但是基础语法类似

JavaScript在1995年由Brendan Eich发明，并于1997年成为ECMA标准

ECMA：ECMA国际（前身是欧洲计算机制造商协会），指定了标准化的脚本程序设计语言ECMAScript，这种语言得到广泛应用，而JavaScript是遵守ECMAScript的标准的

ECMAScript（ES6）是最新的JavaScript版本 （发布于2015年）

#### JavaScript引入方式

##### 内部脚本

将JS代码定义在HTML页面中

​	JavaScript代码必须位于``<script></script>``标签中

​	在HTML文档中，可以在任意地方，防止任意数量的``<script>``

​	一般会把脚本放在body元素的底部，可改善显示速度

```html
<script>
	alert("Hello World!")
</script>
```

##### 外部脚本

将JS代码定义在外部JS文件中，然后引入到HTML页面中

​	外部JS文件中，只包含JS代码，不包含``<script>``标签

​	``<script>``标签不能自闭和（用于引入外部JS文件时）（即必须要有``</script>``）

```HTML
<script src="./js/demo.js"></script>
```

#### JavaScript书写语法

区分大小写：和Java一样，变量名、函数名以及其他一切东西都是区分大小写的

每行结尾的分号可有可无（和Java不一样，Java必须有）

注释（与Java相同）：

​	单行注释：//注释内容

​	多行注释：/* 注释内容*/

大括号表示代码块

```javascript
//判断
if(count==3){
    alert(count)
}
```

##### 输出语句

使用window.alert（） 写入警告框

使用document.write（） 写入HTML输出

使用console.log（） 写入浏览器控制台

#### 变量

JavaScript中用var关键字来声明变量（过时，现在用let）

JavaScript是一门弱类型语言，变量可以存放不同类型的值

变量名需要遵循如下规则：

​	组成字符可以是字母、数字、下划线（_）或者美元符号

​	数字不能作为开头

​	建议使用小驼峰命名法

var特点：作用域大，是全局变量，可以重复声明

ECMAScript（ES6）新增了let关键字来定义变量，用法类似var，但是所声明的变量，只在let关键字所在的代码块内有效（局部变量），且不能重复声明

ECMAScript（ES6）新增const关键字，用来声明一个只读的常量，一旦声明，常量的值就不能改变

#### 数据类型

JavaScript中分为原始类型和引用类型

##### 原始类型

number：数字（整数、小数、Nan（Not a Number）

string ：字符串，单双引号皆可

boolean：布尔。true，false

null：对象为空

undefined：当声明的变量未初始化时，该变量的默认值是undefined

使用typeof运算符可以获取数据类型

```javas
let a="芜湖"
alert(typeof a)
```

#### 运算符

算数运算符：+、-、*、/、%、++、--

赋值运算符：=、+=、-=、*=、/=、%=

比较运算符：>、<、>=、<=、!=、==、===

逻辑运算符：&&、||、！

三元运算符：条件表达式？true_value：false_value

##### ==和===

==会进行类型转换，===不会

```javascript
let num1=20
let num2="20"
alert(num1==num2)//true
alert(num1===num2)//false
```

#### 类型转换

字符串转为数字：

​	parseInt(变量)；

​	将字符串字面值转为数字，如果字面值不是数字，则转为NaN

其他类型转为boolean：

​	自动类型转换

​	Number：0和NaN为false、其他均为true

​	String：空字符串为false，其他为true

​	Null和undefined：均为false

#### 流程控制

流程控制

和Java中一样， if--else if ---else、switch、for、while、do...while都支持

详细看W3C网站[JavaScript 语法](https://www.w3school.com.cn/js/js_syntax.asp)

#### 函数

函数（方法）是被设计为执行特定任务的代码块

JavaScript函数通过function关键字进行定义，语法为：

```javascript
//方式一
function 函数名(参数1,参数2...){
    //要执行的代码
};
//方式二
let 函数名=function(参数1,参数2...){
    //要执行的代码
}
```

注意：

​	形参不需要类型。因为JavaScript是弱类型语言

​	返回值也不需要定义类型，可以在函数内部直接使用return返回即可

​	在JS中，函数调用可以传任意个实参

调用方式： 函数名称(实参列表)

#### 对象

##### Array

JavaScript中Array对象用于定义数组

特点：

​	长度可变

​	类型可变

###### 定义形式

```javascript
let 变量名=new Array(元素列表);//方式一
let arr1=new Array(1,2,3,4)

let 变量名=[元素列表]//方式二
let arr2=[1,2,3,4]
```

###### 访问形式

```javascript
变量名[索引]=值
arr[1]="芜湖"//为索引为1的数组元素赋值
```

###### 主要属性

length：设置或返回数组中元素的数量

###### 常用方法

forEach（）：遍历数组中的每个有值的元素，并调用一次传入的函数，例如：

```javascript
let arr = [1, 2, 3, 4]
        arr[10] = 10
        arr.forEach(function(e){
            alert(e)
        })
//lambda表达式简化
let arr = [1, 2, 3, 4]
        arr[10] = 10
        arr.forEach(e=>{
            alert(e)
        })

```



push（）：将新元素添加到数组的末尾，并返回新的长度

splice（）：从数组中删除元素（两个参数，从哪个索引开始删除，删除几个）

##### String

String字符串创建方式有两种

```javascript
let 变量名= new String("..")//方式一
let str1=new String("芜湖，起飞！")

let 变量名="..."//方式二
let str2="芜湖，芜湖！！";//使用单引号也可以
let str2='芜湖，芜湖！！'
```

###### 主要属性

length   字符串的长度

###### 常用方法

charAt（）：返回在指定位置的字符，入参为索引值

indexOf（）：检索字符串，入参为字符串，出参为索引值，不存在返回-1

trim（）：去除字符串左右两侧的空格，中间的空格不会去除

substring（）：提取字符串中两个指定的索引号之间的字符，包前不包后，[start,end)

#### JavaScript自定义对象

定义格式：

```javascript
var 对象名={
    属性名1:属性值1,
    属性名2:属性值2,
    属性名3:属性值3,
    函数名称:function(形参列表){
        
    }
};
```

实例：

```javascript
var user={
    name:"Tom",
    age=20,
    gender="male",
    eat:function(){
        alert("函数方法！");
    }
	eats(){
        alert("简写方法！")
    }
};
```

调用格式：

对象名.属性名；					``console.log(user.name)``

对象名.函数名();					``user.eat();``

#### JSON

Json（JavaScript Object Notation）JavaScript对象标记法

JSON是通过JavaScript对象标记书写的文本

由于其语法简单，层次结构鲜明，现多用于作为数据载体，在网络中进行数据传输

JSON基础语法

定义：  ``let 变量名='{"key1":value1,"key2":value2}'``

示例：

```javascript
let userStr='{
    "name":"Tom"，
    "age":12,
    "gender":"male"
}'
```

value的数据类型为：数字（整数或浮点数）、字符串（在双引号中）、逻辑值（true或false）、数组（在方括号中[]）、对象（在花括号中{}）、null

JSON字符串转JS对象

``let jsObj=JSON.parse(userStr);``

JS对象转JSON字符串

``let jsonStr=JSON.stringify(jsObj);``

#### BOM

BOM（Browser Object Model）浏览器对象模型，运行JavaScript与浏览器对话，JavaScript将浏览器的各自组成部分封装为对象

组成：

​	Window：浏览器窗口对象

​	Navigator：浏览器对象

​	Screen：屏幕对象

​	History：历史记录对象

​	Location：地址栏对象

##### Window

介绍：浏览器窗口对象

获取：直接使用window，其中，window.可以省略 ``window.alert("msg")``可以简写为``alert("msg")``

属性：

​	history：对History对象的只读引用 

​	location：用于窗口或框架的Location对象

​	navigator：对Navigator对象的只读引用

方法：

​	alert（）：显示带有一段消息和一个确认按钮的警告框

​	confirm（）：显示带有一段信息以及确认按钮和取消按钮的对话框，返回值为true或false

​	setInterval（）：按照指定的周期（以毫秒计）来调用函数或计算表达式，两个参数，第一个是函数名（或者直接定义一个），第二	个是时间，单位为毫秒。即多少时间调用一次函数，只要满足条件就会一直调用

​	setTimeout（）：在指定的毫秒数后调用函数或计算表达式，参数和上面的一样，但是这个只会调用一次函数

##### Location

介绍：地址栏对象

获取：使用Window.location获取，其中Window.可以省略

``window.location.属性``可简化为：``location.属性``

属性：

​	href：设置或返回完整的URL	``location.href="https://baidu.com" ``设置了之后，会重定向跳转到这个网址

#### DOM

DOM（Document Object Model），文档对象模型

DOM是W3C（万维网联盟）的标准，定义了访问HTML和XML文档的标准，分为三个不同部分

1、Core DOM-所有文档类型的标准模型

将标记语言的各个组成部分封装成对象的对象：
	Document：整个文档的对象

​	Element：元素对象，即各种标签

​	Attribute：属性对象，标签里的属性

​	Text：文本对象，标签里的文本

​	Comment：注释对象

2、XML DOM-XML文档的标准模型

3、HTML DOM-HTML文档的标准模型

​	Image：< img>

​	Button：< input type='button'>

DOM树示例如下：

![image-20241223163752858](D:\JAVA\JavaWeb\笔记图片\image-20241223163752858-1734943075241-1-1734943082370-3.png)

JavaScript通过DOM，就能够对HTML进行操作：

​	改变HTML元素的内容

​	改变HTML元素的样式（CSS）

​	对HTML DOM时间做出反应

​	添加和删除HTML元素

##### DOM对象获取

HTML中的Element对象可以通过Document对象获取，而Document对象是通过window对象获取的

Document对象中提供了以下获取Element元素对象的函数：

1、根据id属性值获取，返回单个Element对象

``let h1=document.getElemengById("h1")``

2、根据标签名称获取，返回Element对象数组

``let divs=document.getElementsTagName('div')``

3、根据name属性值获取，返回Element对象数组

``let hobbys=document.getElementByName('hobby')``

4、根据class属性值获取，返回Element对象数组

``let clss =document.getElementsByClassName('cls')``

#### 事件监听

事件：HTML事件是发生在HTML元素上的“事情”，如：

​	按钮被点击

​	鼠标移动到元素上

​	按下键盘按键

事件监听：JavaScript可以在事件被侦测到的时候执行代码

事件绑定：

方式一：通过HTMl标签中的时间属性进行绑定

方式二：通过DOM元素属性绑定

```html
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=in, initial-scale=1.0">
    <title>Document</title>
</head>
<body onload="load()">
    <form action="" onsubmit="fSubmit()">
    <label>用户名：</label><input type="text" name="username" onblur="fOnblur()" onfocus="fOnfocus()"><br>
    
    <input type="submit" value="提交" >
</form>
<img src="../resource/img/huawei.jpg" onmouseout="onMouseout()"  onmouseover="onMouseover()" alt="">
    <input type="button" onclick="on()" value="按钮1">
    <input id="btn" type="button"  value="按钮2">
</body>
<script>
    function load(){
        alert("页面加载完毕")
    };
    function on(){
        alert("点击了按钮1")
    };
    document.getElementById("btn").onclick = function(){
        alert("点击了按钮2")
    };
    function fSubmit(){
        alert("提交了表单")
    };
    function fOnblur(){
        console.log("失去焦点了")
    };
    function fOnfocus(){
        console.log("获得焦点了")
    };
    function onMouseout(){
        console.log("鼠标移开了")
    };
    function onMouseover(){
        console.log("鼠标移入了")
    };
</script>
</html>
```

常见事件：

| 事件名      | 说明                     |
| ----------- | ------------------------ |
| onclick     | 鼠标单击事件             |
| onblur      | 元素失去焦点             |
| onfocus     | 元素获得焦点             |
| onload      | 某个页面或图像被完成加载 |
| onsubmit    | 当表单提交时触发该事件   |
| onkeydown   | 某个键盘的键被按下       |
| onmouseover | 鼠标被移到某元素之上     |
| onmouseout  | 鼠标从某元素移开         |

```html
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <img id="img1" src="../resource/JS&VUE/图片素材/off.gif" alt="">
    <div>赣神魔</div>
    <div>小老板</div>
    <input type="checkbox" value="1" name="hobby">电影
    <input type="checkbox" value="2" name="hobby">旅游
    <input type="checkbox" value="3" name="hobby">游戏
    <button id="btn" type="button">切换</button>
    <input type="text" name="box" id="box" value="HELLO" onblur="fOnblur()" onfocus="fOnfocus()">
    <script>
        function fOnblur(){
            //转换成小写
            document.getElementById("box").value = document.getElementById("box").value.toLowerCase()
        };
        function fOnfocus(){
            //转换成大写

            document.getElementById("box").value = document.getElementById("box").value.toUpperCase()
       
        };
        // 页面加载时保存原始内容
        window.onload = function() {
            let divs = document.getElementsByTagName("div");
            for (let i = 0; i < divs.length; i++) {
                divs[i].setAttribute('data-original-content', divs[i].innerHTML);
            }
        };

        document.getElementById("btn").onclick = function() {
            let img = document.getElementById("img1");
            if (img.src.indexOf("off") != -1) {
                img.src = "../resource/JS&VUE/图片素材/on.gif";
            } else {
                img.src = "../resource/JS&VUE/图片素材/off.gif";
            }

            // 切换复选框状态
            let hobby = document.getElementsByName("hobby");
            for (let i = 0; i < hobby.length; i++) {
                hobby[i].checked = !hobby[i].checked;
            }

            // 处理 div 内容
            let divs = document.getElementsByTagName("div");
            for (let i = 0; i < divs.length; i++) {
                let divContent = divs[i].innerHTML;
                let originalContent = divs[i].getAttribute('data-original-content');
                if (divContent.indexOf("芜湖起飞！") == -1) {
                    divs[i].innerHTML += "<font color='red'>芜湖起飞！</font>";
                } else {
                    divs[i].innerHTML = originalContent;
                }
            }
        };
    </script>
</html>
```

### Vue

Vue是一套前端框架，免除原生JavaScript中的DOM操作，简化书写

基于MVVM（Model-View-ViewModel）思想，实现数据的双向绑定，将编程的关注点放在数据上

框架：是一个半成品软件，是一套可重用的、通用的、软件基础代码模型，基于框架进行开发，更加快捷高效

[介绍 — Vue.js](https://v2.cn.vuejs.org/v2/guide/)这是Vue2的地址

快速入门

1、引入Vue.js文件

2、在JS代码区域，创建Vue核心对象，定义数据模型

3、编写视图

```html
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <script src="./js/vue.js"></script>
</head>
<body>
    <div id="app">
    <input type="text" v-model="msg">

    {{msg}}
</div>
</body> 
<script>
    new Vue({
       el:"#app",
       data:{
           msg:"hello vue"
       }
   })
</script>
</html>
```

#### 插值表达式

形式： {{表达式}}

内容可以是：

​	变量

​	三元运算符

​	函数调用

​	算术运算

#### 常用指令

指令：在HTML标签上带有v-前缀的特殊属性，不同的指令具有不同含义，例如：v-if、v-for..

| 指令      | 作用                                                         |
| --------- | ------------------------------------------------------------ |
| v-bind    | 为HTML标签绑定属性值，如设置href，css样式等，可以直接简写为一个冒号（：） |
| v-model   | 在表单元素上创建双向数据绑定                                 |
| v-on      | 为HTML标签绑定事件，可以简写为@符号（@）                     |
| v-if      |                                                              |
| v-else-if | 条件性的渲染某元素，判断为true时渲染，否则不渲染             |
| v-else    |                                                              |
| v-show    | 根据条件展示某元素，区别在于切换的是display属性的值          |
| v-for     | 列表渲染，遍历容器的元素或者对象的属性                       |

注意：通过v-bind或者v-model绑定的变量，必须在数据模型中声明

各指令示例：

```html
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <script src="./js/vue.js"></script>
</head>
<body>
    <!-- v-bind和v-model -->
    <div id="app">
        <a :href="url">链接1</a>
        <input type="text" v-model="url" >
        <button  @click="btn1">按钮1</button><br>
        <input v-model="age" type="text" name="" id="">
        <span v-if="age<=25">少年</span>
        <span v-else-if="age>25&&age<40">青年</span>
        <span v-else="age>=40">老年</span>
        <div v-for="(item,index) in addrs">
            <table>
                <tr>
                    <td>{{index+1}}</td>
                    <td>{{item}}</td>
                </tr>
            </table>
        </div>
    </div>
</body>
<script>
   new Vue({
       el:"#app",
       data:{
           msg:"hello vue",
           url:"https://www.baidu.com",
           age:10,
           addrs:['芜湖','合肥', '宿州','池州']
       },
       methods: {
        btn1(){
            alert("按钮1被点击了")
        }
       }
   })
</script>
</html>
```

表格测试v-for

```html
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <script src="./js/vue.js"></script>
    <style>
    body{
        text-align: center;
    }
    </style>
</head>

<body>
    <div id="app">
        <table border="1px" cellspacing="0" width="500px">
            <tr>
                <th>编号</th>
                <th>姓名</th>
                <th>年龄</th>
                <th>性别</th>
                <th>分数</th>
                <th>成绩</th>
            </tr>

            <tr v-for="(item,index) in list">
                <td>{{index+1}}</td>
                <td>{{item.name}}</td>
                <td>{{item.age}}</td>
                <td>{{item.gender==1?"男":"女"}}</td>
                <td>{{item.score}}</td>
                <td v-if="item.score>=60&&item.score<=70">及格</td>
                <td v-else-if="item.score>70&&item.score<=100">优秀</td>
                <td v-else="item.score<60" style="color: red;">不及格</td>
            </tr>

        </table>
    </div>
</body>
<script>
    new Vue({
        el: "#app",
        data: {
            list: [{
                name: "张三",
                age: 20,
                gender: 1,
                score: 88
            }, {
                name: "李四",
                age: 20,
                gender: 1,
                score: 69
            }, {
                name: "网二",
                age: 29,
                gender: 1,
                score: 39
            }, {
                name: "芜湖",
                age: 26,
                gender: 0,
                score: 11
            }, {
                name: "六五",
                age: 18,
                gender: 1,
                score: 98
            },
            ]
        }
    })
</script>

</html>
```

#### 生命周期

指一个对象从创建到销毁的整个过程

生命周期的八个阶段：每出发一个生命周期时间，会自动执行一个生命周期方法（钩子）

| 状态          | 阶段周期   |
| ------------- | ---------- |
| beforeCreate  | 创建前     |
| create        | 创建后     |
| beforeMount   | 挂载前     |
| mounted       | 挂载完成后 |
| beforeUpdate  | 更新前     |
| updated       | 更新后     |
| beforeDestroy | 销毁前     |
| destroyed     | 销毁后     |

![image-20241224151149402](D:\JAVA\JavaWeb\笔记图片\image-20241224151149402-1735024315041-1.png)

一般常用mounted：挂载完成，Vue初始化成功，HTML页面渲染成功（发送请求到服务端，加载数据）

### Ajax

Ajax（Asynchronous JavaScript And XML），异步的JavaScript和XML

作用：

​	数据交换：通过Ajax可以给服务器发送请求，并获取服务器响应的数据

​	异步交互：可以在不重新加载整个页面的情况下，与服务器交换数据并更新部分网页的技术，如：搜索联想，用户名校验等

#### 原生Ajax

原生Ajax较为繁琐，步骤为：

​	1、创建XMLHttpRequest对象：用于和服务器交换数据

​	2、向服务器发送请求

​	3、获取服务器响应数据

![image-20241224155253380](D:\JAVA\JavaWeb\笔记图片\image-20241224155253380-1735026779036-4-1735026798727-6.png)

### Axios

Axios是对原生的Ajax进行了封装，简化书写，快速开发

一个api，可以用来测试：[jsonplaceholder.typicode.com/users](https://jsonplaceholder.typicode.com/users)

[Axios中文文档 | Axios中文网](https://www.axios-http.cn/)

#### Axios快速入门

1、引入Axios的Js文件

```html
<script src="./js/axios-0.18.0.js"></script>
```

2、使用Axios发送请求，并获取响应结果

```html
<script>
axios({
    method:"get",
    url:"地址"
}).then((r)=>{
    console.log(r.data)
});
axios({
    method:"post",
    url:"地址",
    data:{
        数据：JSON格式  
    }//或者data:"id=1"类似这种单个参数
}).then((r)=>{
    console.log(r.data)
})
</script>
```

#### 请求方法别名

axios.get（url[ ,config]）

axios.delete（url[ ,config]）

axios.post（url[ ,data,config]）

axios.put（url[ ,data,config]）

方括号里面内容是可选的

```html
<script>
	axios.get("地址").then((r)=>{
        console.log(r.data)
    });
    axios.post("地址",'参数').then((r)=>{
        console.log(r.data)
    })
</script>
```

示例

```html
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <script src="./js/axios-0.18.0.js"></script>
</head>
<body>
    <input type="button" value="获取get" onclick="get()">
    <input type="button" value="获取post" onclick="post()"><br>
    <div id="d"></div>
</body>
<script>
    let divInfo = document.getElementById("d");

    function get() {
        axios.get("https://jsonplaceholder.typicode.com/users").then(function(response) {
            console.log(response.data);
            let html = response.data.map(user => `<p>ID: ${user.id}, Name: ${user.name}, Email: ${user.email}</p>`).join('');
            divInfo.innerHTML = html;
        }).catch(function(error) {
            console.error('There was an error!', error);
        });
        /* axios({
            method: "get",
            url: "https://jsonplaceholder.typicode.com/users"
        }).then(function(response) {
            console.log(response.data);
            let html = response.data.map(user => `<p>ID: ${user.id}, Name: ${user.name}, Email: ${user.email}</p>`).join('');
            divInfo.innerHTML = html;
        }).catch(function(error) {
            console.error('There was an error!', error);
        }); */
    };
    let param={
        name: 'John Doe',
        email: 'john.doe@example.com'
    }
    function post() {
        axios.post("https://jsonplaceholder.typicode.com/users", param).then(function(response) {
            console.log(response.data);
            divInfo.innerHTML = `<p>ID: ${response.data.id}, Name: ${response.data.name}, Email: ${response.data.email}</p>`;
        }).catch(function(error) {
            console.error('There was an error!', error);
        });
        
        /* axios({
            method: "post",
            url: "https://jsonplaceholder.typicode.com/users",
            data: {
                name: 'John Doe',
                email: 'john.doe@example.com'
            }
        }).then(function(response) {
            console.log(response.data);
            divInfo.innerHTML = `<p>ID: ${response.data.id}, Name: ${response.data.name}, Email: ${response.data.email}</p>`;
        }).catch(function(error) {
            console.error('There was an error!', error);
        }); */
    }
</script>
</html>
```

获取数据放到表格中

```html
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <script src="../VUE/js/vue.js"></script>
    <script src="./js/axios-0.18.0.js"></script>
</head>

<body>
    <div id="app">
        <table border="1px"  cellspacing="0">
            <tr>
                <th>ID</th>
                <th>姓名</th>
                <th>用户名</th>
                <th>邮箱</th>
                <th>地址</th>
                <th>手机号</th>
            </tr>
            <tr v-for="(item, index) in users">
                <td>{{item.id}}</td>
                <td>{{item.name}}</td>
                <td>{{item.username}}</td>
                <td>{{item.email}}</td>
                <td>{{item.address.street}}</td>
                <td>{{item.phone}}</td>
            </tr>
        </table>
    </div>
</body>
<script>
    var app = new Vue({
        el: '#app',
        data: {
            users:[]
        },
        mounted () {
            this.getData();
        },
        methods: {
            getData(){
                axios.get("https://jsonplaceholder.typicode.com/users").then((r) => {
                    this.users = r.data;    
                }).catch((err) => {
                    
                });
            }
        }
    })
</script>
<style>
    body{
        text-align: center;
    }
</style>

</html>
```

### 前端工程化

指在企业级的前端项目开发中，把前端开发所需的工具、技术、经验等进行规范化、标准化

#### vue-cli

Vue-cli是Vue官方提供的一个脚手架，用于快速生成一个Vue的项目模板

Vue-cli提供了如下功能：

​	统一的目录结构

​	本地调试

​	热部署

​	单元测试

​	集成打包上线

依赖环境：NodeJs

[全网最细！使用nvm管理node（从node卸载到node安装使用一文搞定）nrm管理npm源_node管理-CSDN博客](https://blog.csdn.net/m0_59415345/article/details/141496413)

[Vue-Cli(脚手架)安装及如何创建Vue-Cli项目-保姆级别教程,手把手教会你-CSDN博客](https://blog.csdn.net/m0_72568513/article/details/131123225)

参考这个来搭建依赖环境

#### Vue的创建

找到对应的目录，cmd进入命令行，输入 ``vue  ui``即可打开图形化页面来进行xue项目的创建和管理

Vue的目录结构

![image-20241226160104313](D:\JAVA\JavaWeb\笔记图片\image-20241226160104313.png)

想要运行该项目，对应目录下进入命令行，运行``npm run serve``即可运行，在运行状态下，如果修改了Vue的文件，会自动更新显示到页面上，这就是vue的热部署

#### Vue发布端口修改

修改最外层的vue.config.js文件

改为：

```javascript
const { defineConfig } = require('@vue/cli-service')
module.exports = defineConfig({
  transpileDependencies: true,
    //修改端口号
  devServer: {
    port: 9999
  }
})

```

#### Element-UI

Element：是饿了么团队研发的，一套为开发者、设计师和产品经理准备的基于Vue2.0的桌面端组件库

组件：组成网页的部件，例如：超链接、按钮、图片、表单、表格、分页条等等

官网：[Element - 网站快速成型工具](https://element.eleme.cn/#/zh-CN)

当然不止这一个组件库，还有其他很多开源的，也可以自由选择

##### 快速使用

安装ElementUI组件库（在当前工程的目录下），命令行执行

``npm install element-ui@2.15.3``

src目录下的main.js中引入ElementUI组件库

```javascript
import Vue from 'vue'
import App from './App.vue'
import router from './router'
import ElementUI from 'element-ui';//ElementUI引入
import 'element-ui/lib/theme-chalk/index.css';//ElementUI引入


Vue.config.productionTip = false
Vue.use(ElementUI);//ElementUI引入

new Vue({
  router,
  render: h => h(App)
}).$mount('#app')

```

访问官网，赋值组件代码，调整

示例代码（ElementView.vue）

```vue
<template>
    <div>
        <el-button @click="showmsg2">默认按钮</el-button>
        <el-button type="primary" @click="showMsg">主要按钮</el-button>
        <el-table :data="paginatedTableData" stripe style="width: 100%">
            <el-table-column prop="date" label="日期" width="180"></el-table-column>
            <el-table-column prop="name" label="姓名" width="180"></el-table-column>
            <el-table-column prop="address" label="地址"></el-table-column>
            <el-table-column prop="msg" label="消息"></el-table-column>
        </el-table>
        <div class="block">
            <el-pagination layout="prev, pager, next" :total="tableData.length" :page-size="pageSize"
                :current-page="currentPage" @current-change="handlePageChange"></el-pagination>
        </div>
    </div>
</template>

<script>
export default {
    name: 'ElementView',
    data() {
        return {
            tableData: [
                { date: '2016-05-02', name: '王小虎', address: '上海市普陀区金沙江路 1518 弄', msg: '112' },
                { date: '2016-05-04', name: '王小虎', address: '上海市普陀区金沙江路 1517 弄', msg: '1122' },
                { date: '2016-05-01', name: '王小虎', address: '上海市普陀区金沙江路 1519 弄', msg: '11222' },
                { date: '2016-05-03', name: '王小虎', address: '上海市普陀区金沙江路 1516 弄', msg: '1124' }
            ],
            currentPage: 1, // 当前页码
            pageSize: 2 // 每页显示的条目数
        }
    },
    computed: {
        paginatedTableData() {
            const start = (this.currentPage - 1) * this.pageSize;
            const end = start + this.pageSize;
            return this.tableData.slice(start, end);
        }
    },
    methods: {
        showMsg() {
            alert('主要按钮')
        },
        showmsg2() {
            alert('默认按钮')
        },
        handlePageChange(newPage) {
            this.currentPage = newPage;
        }
    }
}
</script>

<style scoped></style>
```

### Vue中使用Axios

在项目目录下安装axios：``npm install axios``

需要使用axios时，导入axios：``import axios from 'axios'``

EmpView.vue

```vue
<template>
 <div class="full-screen">
        <el-container style="height: 100%; border:1px solid #eee;">
            <el-header style="font-size: 40px; background-color: rgb(238, 241, 246)">我的测试系统</el-header>
            <el-container>
                <el-aside width="230px" style=" border :1px solid #eee" >
                    <el-menu :default-openeds="['1', '2']">
                        <el-submenu index="1">
                            <template slot="title"><i class="el-icon-message"></i>系统信息管理</template>
                            <el-menu-item index="1-1">部门管理</el-menu-item>
                            <el-menu-item index="1-2">人员管理</el-menu-item>
                        </el-submenu>
                    </el-menu>
                </el-aside>
                <el-container>
                    <el-main>
                        <el-form :inline="true" :model="userForm" class="demo-form-inline">
                            <el-form-item label="姓名">
                                <el-input v-model="userForm.name" placeholder="姓名"></el-input>
                            </el-form-item>
                            <el-form-item label="性别">
                                <el-select v-model="userForm.sex" placeholder="性别">
                                    <el-option label="男" value="1"></el-option>
                                    <el-option label="女" value="0"></el-option>
                                </el-select>
                            </el-form-item>
                            <el-form-item label="入职日期">
                                <el-date-picker v-model="userForm.date" type="date" placeholder="选择日期"></el-date-picker>
                            </el-form-item>
                            <el-form-item>
                                <el-button type="primary" @click="onSubmit">查询</el-button>
                            </el-form-item>
                        </el-form>
                        <el-table :data="paginatedTableData" stripe style="width: 100% " >
                            <el-table-column prop="id" label="ID" width="180"></el-table-column>
                            <el-table-column prop="name" label="姓名" width="180"></el-table-column>
                            <el-table-column prop="address.street" label="地址" width="180"></el-table-column>
                            <el-table-column prop="phone" label="电话号码" width="180"></el-table-column>
                            <el-table-column label="操作" width="180">
                                <template #default="scope">
                                    <el-button size="mini" @click="handleEdit(scope.$index, scope.row)">编辑</el-button>
                                    <el-button size="mini" type="danger"
                                        @click="handleDelete(scope.$index, scope.row)">删除</el-button>
                                </template>
                            </el-table-column>
                        </el-table>
                        <br><br>
                        <div class="block">
                            <el-pagination layout="prev, pager, next" :total="tableData.length" :page-size="pageSize"
                                :current-page="currentPage" @current-change="handlePageChange" ></el-pagination>
                        </div>
                    </el-main>
                </el-container>
            </el-container>
        </el-container>
    </div>
</template>
<script>
import axios from 'axios';
export default {
    data() {
        return {
            userForm: {
                name: '',
                sex: '',
                date: ''
            },
            tableData: [],
        
            sourceTable:[],
            dialogTableVisible: false,
            currentPage: 1, // 当前页码
            pageSize: 5 // 每页显示的条目数

        }
    },
    mounted() {
        this.getData();
    },
    computed: {
        paginatedTableData() {
            const start = (this.currentPage - 1) * this.pageSize;
            const end = start + this.pageSize;
            return this.tableData.slice(start, end);
        }
    },
    methods: {
        getData(){
            axios.get("https://jsonplaceholder.typicode.com/users").then(res=>{
              
                this.tableData = res.data;
                this.sourceTable = res.data;
                console.log(this.tableData);
            })
        },
        onSubmit() {
            const name = this.userForm.name.toLowerCase();           
            this.tableData = this.sourceTable.filter(item => 
                item.name.toLowerCase().includes(name)
            );
            this.currentPage = 1; // 重置页码
            
        },
        handlePageChange(newPage) {
            this.currentPage = newPage;
        },
        handleEdit(index, row) {
            console.log('编辑', index, row);
            // 在这里添加编辑逻辑
        },
        handleDelete(index, row) {
            console.log('删除', index, row);
            // 在这里添加删除逻辑
            this.tableData.splice(index, 1);
        }
    }
}
</script>
<style>
body{
    overflow: hidden; /* 隐藏滚动条 */

}

.full-screen {
    width: 100%;
    height: 100vh; /* 使用视口高度 */
    margin: 0;
    padding: 0;
}
</style>
```

### Vue路由

Vue Router：是Vue的官方路由

使用需要安装路由，一般创建项目的时候就有勾选的有，如果没有，则执行命令``npm install vue-router@3.5.1``

组成：

​	VueRouter：路由器类，根据路由请求在路由视图中动态渲染选中的组件

​	``<router-link>``：请求链接组件，浏览器会解析成< a>

​	``<router-view>``：动态视图组件，用来渲染展示与路由路径对应的组件

在router文件夹下的index.js中添加对应的路由信息及路径

在需要跳转的功能点处添加``<router-link>``标签，里面的to属性指向跳转的信息

在App.vue中添加``<router-view></router-view>``

Vue打包部署

在项目目录下执行命令``npm run build``即可将前端项目打包到dist目录下

部署到Nginx

### Nginx

Nginx是一款轻量级的Web服务器/反向代理服务器及电子邮件（IMAP/POP3）代理服务器，特点是占用内存少，并发能力强

官网：https://nginx.org/

目录结构如下：

config：配置文件目录

html：静态资源文件目录

logs：日志文件目录

temp：临时文件目录

nginx.exe：Nginx可执行文件，运行nginx

要部署前端工程，一般将生成的dist文件夹内的所有内容复制到html目录下，然后启动Nginx，访问即可，默认80

如果80端口被占用，可以在nginx.config中修改端口号

``netstat -ano|findStr 端口号``用来查询端口是否被占用

# 后端

## Maven

Maven是Apache旗下的一个开源项目，是一款用于java项目管理和构建的工具，基于项目对象模型（POM：Project Object Model）的概率

### Maven的作用

#### 依赖管理

方便快捷的管理项目依赖的资源（jar包），避免版本冲突问题，在pox.xml文件中进行配置

#### 统一项目结构

解决不同开发工具java项目构造结构不同的问题，统一了项目结构

![image-20241230113404182](D:\JAVA\JavaWeb\笔记图片\image-20241230113404182.png)

#### 项目构建

标准跨平台（Windows、Linux、MacOs）的自动化项目构建方式

清理、编译、测试、打包、发布等功能均集成在idea中有体现

### Maven介绍

![image-20241230114351437](D:\JAVA\JavaWeb\笔记图片\image-20241230114351437.png)

优先从本地仓库去获取依赖，根据``<dependency>``中的groupId来寻找，是文件路径，还有版本号等信息也在同一级节点

### Maven安装

1、获取安装包，并解压

下载地址：[Download Apache Maven – Maven](https://maven.apache.org/download.cgi)

[Maven-安装与环境配置-CSDN博客](https://blog.csdn.net/xhmico/article/details/144596988)详细可以看这个

idea中集成Maven

在最外面所有设置中进行设置，将Maven信息进行添加

![image-20241230160141804](D:\JAVA\JavaWeb\笔记图片\image-20241230160141804.png)

![image-20241230160327596](D:\JAVA\JavaWeb\笔记图片\image-20241230160327596.png)

### Maven坐标

什么是坐标？

​	Maven中的坐标是资源的唯一标识，通过该坐标可以唯一定位资源位置

​	使用坐标来定义项目货引入项目中需要的依赖

Maven坐标主要组成

​	groupId：定义当前Maven项目隶属组织名称（通常是域名反写，如：com.alibaba）

​	artifactId：定义当前Maven项目名称（通常是模块名称，如：order-service、goods-service）

​	version：定义当前项目版本号

```xml
<groupId>com.alibaba</groupId>
<artifactId>maven-project01</artifactId>
<version>1.0</version>

<dependency>
	<groupId>ch.qos.logback</groupId>
	<artifactId>logback-classic</artifactId>
	<version>1.2.3</version>
</dependency>
```

### Maven依赖配置

依赖：指当前项目运行所需要的jar包，一个项目中可以引入多个依赖

配置：

​	1、在pom.xml中编写< dependencies>标签

​	2、在< denpendencies>标签中使用< denpendency>引入坐标

​	3、定义坐标的groupId、artifactId、version

​	4、点击刷新按钮，引入最新加入的坐标

```xml
<dependencies>
	<dependency>
		<groupId>ch.qos.logback</groupId>
		<artifactId>logback-classic</artifactId>
		<version>1.2.3</version>
	</dependency>
</dependencies>
```

如果引入的依赖，本地仓库没有，将会连接远程仓库/中央仓库，然后下载依赖（过程较为耗时，需耐心等待）

可以在这个网站快速的添加坐标依赖：[Maven Repository: Search/Browse/Explore](https://mvnrepository.com/)

### 依赖传递

依赖具有传递性

​	直接依赖：在当前项目中通过依赖配置建立的依赖关系

​	间接依赖：被依赖的资源如果依赖其他资源，当前项目间接依赖其他资源

![image-20241231113317107](D:\JAVA\JavaWeb\笔记图片\image-20241231113317107.png)

即ProjectA直接依赖B和一个Jar包，其他都是间接依赖

#### 排除依赖

排除依赖指主动断开依赖的资源，被排除的资源无需指定版本

```xml
<dependency>
	<groupId></groupId>
    <artifactId>ProjectB</artifactId>
    <version>1.0</version>
    <!--想要排除的依赖-->
	<exclusions>
    	<exclusion>
            <groupId>junit</groupId>
            <artifactId>junit</artifactId>
        </exclusion>
    </exclusions>
</dependency>
```

### 依赖范围

依赖的jar包，默认情况下，可以在任何地方使用，可以通过``<scope>...</scope>``设置其作用范围，一般写在dependency标签内

作用范围：

​	主程序范围有效（main文件夹范围内）

​	测试程序范围有效（test文件夹范围内）

​	是否参与打包运行（package指令范围内）

| scope值  | 主程序 | 测试程序 | 打包（运行） | 范例        |
| -------- | ------ | -------- | ------------ | ----------- |
| compile  | Y      | Y        | Y            | log4j       |
| test     | -      | Y        | -            | junit       |
| provided | Y      | Y        | -            | servlet-api |
| runtime  | -      | Y        | Y            | jdbc驱动    |

### 生命周期

Maven的生命周期就是为了对所有的Maven项目构建过程进行抽象和统一

Maven中有3套相互独立的生命周期：

clean：清理工作,主要使用 clean（清理）

default：核心工作，主要使用compile（编译）、test（测试）、package（打包）、install（安装）

site：生成报告、发布站点等

每套生命周期包含一些阶段（phase），阶段是有顺序的，后面的阶段依赖于前的阶段（在同一套生命周期中）

## Spring

官网：[Spring | Home](https://spring.io/)

Spring发展到现在已经形成了一种开发生态圈，Spring提供了若干个子项目，每个项目用于完成特定的功能

Spring Framework 是所有Spring项目的基础框架，而Spring Boot 是对于Spring Framework的简化版

## Http协议

概念：Hyper Text Transfer Protocol，超文本传输协议，规定了浏览器和服务器之间数据传输的规则

特点：

​	1、基于TCP协议：面向连接，安全

​	2、基于请求-响应模型的：一次请求对应一次响应

​	3、HTTP协议是无状态的协议：对于事务处理没有记忆能力。每次请求-响应都是独立的

​		缺点：多次请求间不能共享数据（利用Cookie、Session会话技术解决）

​		优点：速度快

### HTTP请求协议

#### 请求行

请求数据的第一行：由请求方式、资源路径、协议组成

#### 请求头

格式为： key: value 

常见请求头如下： 

| Host            | 请求的主机名                                                 |
| --------------- | ------------------------------------------------------------ |
| User-Agent      | 浏览器版本，例如Chrome浏览器的标识类似Mozilla/5.0 ...Chrome/79，IE浏览器的标识类似Mozilla/5.0（Windows NT ...） like Gecko |
| Accept          | 表示浏览器能够接受的资源类型，如text/*表示文本，image/ *表示图片,  * /*表示所有类型 |
| Accept-Language | 表示浏览器偏好的语言，服务器可以据此返回不同语言的网页       |
| Accept-Encoding | 表示浏览器可以支持的压缩类型，如gzip，deflate等              |
| Content-Type    | 表示主体的数据类型                                           |
| Content-Length  | 请求主体的大小（单位：字节）                                 |

#### 请求体

Get方式：请求参数在请求行中，没有请求体，如：/login?username=xxx%pwd=xxx  Get请求的大小是有限制的

Post请求：请求参数在请求体中，



![image-20250106155612689](D:\JAVA\JavaWeb\笔记图片\image-20250106155612689.png)

### HTTP响应协议

#### 响应行

响应数据第一行（协议、状态码、描述）

状态码

| 1xx  | 响应中-临时状态码，表示请求已经接收，告诉客户端应该继续请求或者它已经完成则忽略它 |
| ---- | ------------------------------------------------------------ |
| 2xx  | 成功-表示请求已经被成功接收，处理已完成                      |
| 3xx  | 重定向-重定向到其他地方，让客户端再发起一次请求以完成整个处理 |
| 4xx  | 客户端错误-处理发生错误，责任在客户端，如：请求了不存在的资源（404），客户端未被授权（401） |
| 5xx  | 服务器错误-处理发生错误，责任在服务端，如：程序抛出异常等    |

#### 响应头

第二行开始，格式 key: value

常见响应头

| Content-Type     | 表示该响应内容的类型，例如text/html,application/json |
| ---------------- | ---------------------------------------------------- |
| Content-Length   | 表示该响应内容的长度（字节数）                       |
| Content-Encoding | 表示该响应压缩算法，例如gzip                         |
| Cache-Control    | 指示客户端应如何缓存，例如max-age=300表示            |
| Set-Cookie       | 告诉浏览器为当前页面所在的域设置Cookie               |

#### 响应体

最后一部分，存放响应数据，可以是JSON数据，文本，图片等

### HTTP协议解析

可以自己来实现HTTP的协议解析，借助server socket来进行实现，读取请求行，请求头，请求体，然后响应回传数据，将请求行，请求头，请求体返回回去。

一般都有现成的Web服务器来实现对HTTP协议操作进行封装，简化web程序开发，部署Web项目，对外提供网上信息流量服务。Java中常用的为：Tomcat

## Tomcat

概念：Tomcat是Apache软件基金会一个核心项目，是一个开源免费的轻量级Web服务器，支持Servlet/JSP少量JavaEE规范

JavaEE：Java Enterprise Edition，Java企业版。指Java企业级开发的技术规范总和，包含13项技术规范：JDBC、JNDI、EJB、RMI、JSP、Servlet、XML、JMS、Java IDL、JTS、JTA、JavaMail、JAF

Tomcat也被称为Web容器、Servlet容器。Servlet程序需要依赖于Tomcat才能运行

官网：[Apache Tomcat® - Welcome!](https://tomcat.apache.org/)

安装部署推荐：[Tomcat安装和配置（超详细）_apache tomcat下载安装及配置教程-CSDN博客](https://blog.csdn.net/m0_74824112/article/details/144774801)

## Springboot

Springboot内置有tomcat服务器，基于Springboot开发的应用程序，内置了tomcat服务器，当启动类运行时，会自动启动内嵌的tomcat

服务器。

对于Springboot项目，起步依赖一般有spring-boot-starter-web、spring-boot-starter-test等

### 传参

#### 简单参数

对应普通参数（即Get方式传参或者POST传键值对），三种方式获取

1、原始方式获取请求参数

​	Controller方法形参中声明HttpServletRequest对象

​	调用对象的getParameter（参数名）方法来获取，需要手动进行类型转换，较为麻烦

2、Springboot中接收简单参数

​	请求参数名与方法形参名相同

​	会自动进行类型转换

3、@RequestParam注解

​	方法形参名与请求参数名称不匹配，通过该注解完成映射

​	改注解的required属性默认是true，代表请求参数必须传递

#### 实体参数

复杂实体对象：请求参数名与形参对象属性名相同，按照对象层次结构关系即可接收嵌套POJO属性参数

#### 数组集合参数

数组：请求参数名与形参中数组变量名相同，可以直接使用数组封装

集合：请求参数名与形参中集合变量名相同，通过@RequestParam绑定参数关系

#### 日期参数

日期参数：使用@DateTimeFormat注解完成日期参数格式转换

#### JSON参数

JSON参数：JSON数据键名与形参对象属性名相同，定义POJO类型形参即可接收参数，需要使用@RequestBody标识

这个最常用

#### 路径参数

路径参数：通过请求URL直接传递参数，使用{参数名}来表示该路径参数，需要使用@PathVariable获取路径参数

```java
package jha.spring.springquicklystart.controller;

import jakarta.servlet.http.HttpServletRequest;
import jha.spring.springquicklystart.pojo.User;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

@RestController
public class TestController {
    @RequestMapping("/old")
    public String getDate1(HttpServletRequest request){
        String name = request.getParameter("name");
        String ageStr = request.getParameter("age");
        Integer age=Integer.parseInt(ageStr);
        return name+"今年"+age+"岁！";
    }
    @RequestMapping("/auto")
    public String getDate2(String name,Integer age){

        return name+"今年"+age+"岁！";
    }
    @RequestMapping("/diff")
    public String getDate3(@RequestParam(name = "name") String username, Integer age){

        return username+"今年"+age+"岁！";
    }

    @RequestMapping("/noParam")
    public String getDate4(@RequestParam(name = "name" ,required=false) String username, Integer age){

        return username+"今年"+age+"岁！";
    }

    @RequestMapping("/simplePojo")
    public String getPojo(User user){

        return user.toString();
    }
    @RequestMapping("/array")
    public String getArray(String[] hobby){

        return Arrays.toString(hobby);
    }
    @RequestMapping("/list")
    public String getArray(@RequestParam(name = "hobbys") List<String> hobby){

        return hobby.toString();
    }
    @RequestMapping("/date")
    /*public String getDateTime(@DateTimeFormat(pattern ="yyyy-MM-dd HH:mm:ss")LocalDateTime date){*/
    public String getDateTime(@DateTimeFormat(pattern ="yyyy年MM月dd日 HH时mm分ss秒")LocalDateTime date){
        return date.toString();
    }
    @RequestMapping("/json")
    public String getJson(@RequestBody User user){

        return user.toString();
    }
    @RequestMapping("/jsonList")
    public String getJson(@RequestBody List<User> user){

        return user.toString();
    }
    @RequestMapping("/path/{id}/{name}")
    public String getPathData(@PathVariable Integer id,@PathVariable String name){

        return "id为："+id+"，名字为："+name;
    }

}

```

