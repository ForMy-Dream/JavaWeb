# JavaWeb知识

目前对于web开发，一般采用的是前后端分离，而java程序员主要负责的就是后端的程序开发，前端一般有前端工程师来进行编写（虽然现在大部分都是一个人做，手动滑稽）

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
<body>
    <input type="button" onclick="on()" value="按钮1">
    <input id="btn" type="button"  value="按钮2">
</body>
<script>
    function on(){
        alert("点击了按钮1")
    };
    document.getElementById("btn").onclick = function(){
        alert("点击了按钮2")
    }
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









# 后端