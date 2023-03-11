有三个模块：
    view：
        主控模块：负责菜单的显示以及用户处理操作；
    
    service:实体对象的管理模块
        namelistservice：管理公司员工
        teamservice：管理开发团队对象

    domain:
        实体类所在包

设备接口以及其实现子类的设计：
    interface:equitment
    实现子类：
        pc:
        notebook:
        printer:
    
    属性解释：
        model：机器型号
        diplay：显示器名称
        type：机器类型


员工以及其实现子类的设计：
    员工：
    程序猿：
    设计师：
    架构师



namelistservice：
    主要功能：将数据封装到Employee[]数组中，同时提供相关操作的方法！

Object.toString:输出一个对象的引用时，会自动调用此方法。


teamService：
主要功能:开发团队人员的管理!


TeamView:主控模块


项目总结：
    注：调试技巧当前已经够用了，当前不需要再深入了解这个问题！（养成这种自信的习惯，不然成不了事！）


项目的一个流程：
    进入团队管理模块页面并显示所有员工信息，选择以下4个功能：
            查看团队信息:
            添加团队成员:
                值得一提的地方：使用了 “instanceof”与向下转型的操作！很有创意。
            移除团队成员；
            退出；



