# order-meal-system
本项目适合对SSM框架有一定了解的同学。

**前端：jsp + BootStrap**

**后端：SSM**

**权限控制：Shiro**

**数据库：MySQL**

项目目录结构如下

![在这里插入图片描述](README.assets/20190606111408718.png)

IDEA选择Maven导入项目后，导入sql文件，修改项目的数据库配置，启动tomcat运行即可。

- 数据库脚本为biyesheji.sql;
- 后台超级管理员：name：小白，password：adminadmin
- 前台客户：name：byh，password：12345

下面是部分运行截图

**管理员后台**

![管理员后台](README.assets/20190606111542150.png)

**前端：**

![在这里插入图片描述](README.assets/20190606111552627.png)



![在这里插入图片描述](README.assets/20190606111643213.png)



![在这里插入图片描述](README.assets/20190606111659521.png)



#### PS：部署过程中可能遇到的问题

建议使用IDEA运行项目。

**（1）登录页面背景图不显示**

很多人反馈启动后，登录页背景图片不显示。如下图设置后，重启项目即可。

![image-20210826222436362](README.assets/image-20210826222436362.png)

![image-20210826222601725](README.assets/image-20210826222601725.png)



**（2）点击登录又跳到了登录页面**

看看你的部署路径对不对，可能请求被重定向了。

![image-20210826222745173](README.assets/image-20210826222745173.png)

#### 另外可以关注我的公众号【秃头哥编程】，佛系更新。

<img src="https://i.ibb.co/5K4Ty8B/image.webp">