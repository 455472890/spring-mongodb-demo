spring-mongodb-demo
===================

spring与mongodb结合的一个例子

1、封装主键自增逻辑

2、分页类封装

3、基础查询演示，主要是用户、部门两个集合的操作

4、演示位置查询

项目基于JDK1.6+，maven环境，建议mongodb2.0+


QQ：251607355       
email：airfey#126.com (请把#换成@)

详细的程序逻辑请参照wiki内文章以及后续更新

有感兴趣的童鞋欢迎一起参与完善。

2014.1.8 changes

新增mongo-action和mongo-war，使用struts2和httl模板引擎进行页面展示

查看方式很简单：

1、运行程序，访问http://localhost:8080/mongo-war/index.do(具体依你的tomcat设置为准)

运行如下图：
<div class="role-tbody mark-table scrollBar" >
      <table width="800px">  <tbody>
            <tr style="background: none repeat scroll 0% 0% rgb(255, 255, 255); color: rgb(118, 138, 153);height:30px">
                <td width="80px"><span class="mr5">1</td>
                <td width="80px">萝莉4</td>
                <td width="130px">airfey4@126.com</td>
                <td width="120px">male</td>
                <td >研发部1</td>
            </tr>
            <tr style="background: none repeat scroll 0% 0% rgb(255, 255, 255); color: rgb(118, 138, 153);height:30px">
                <td width="80px"><span class="mr5">2</td>
                <td width="80px">萝莉3</td>
                <td width="130px">airfey3@126.com</td>
                <td width="120px">male</td>
                <td >研发部1</td>
            </tr>
            <tr style="background: none repeat scroll 0% 0% rgb(255, 255, 255); color: rgb(118, 138, 153);height:30px">
                <td width="80px"><span class="mr5">3</td>
                <td width="80px">萝莉2</td>
                <td width="130px">airfey2@126.com</td>
                <td width="120px">male</td>
                <td >研发部1</td>
            </tr>
            <tr style="background: none repeat scroll 0% 0% rgb(255, 255, 255); color: rgb(118, 138, 153);height:30px">
                <td width="80px"><span class="mr5">4</td>
                <td width="80px">萝莉1</td>
                <td width="130px">airfey1@126.com</td>
                <td width="120px">male</td>
                <td >研发部1</td>
            </tr>
            <tr style="background: none repeat scroll 0% 0% rgb(255, 255, 255); color: rgb(118, 138, 153);height:30px">
                <td width="80px"><span class="mr5">5</td>
                <td width="80px">萝莉0</td>
                <td width="130px">airfey0@126.com</td>
                <td width="120px">male</td>
                <td >研发部1</td>
            </tr>
            <tr style="background: none repeat scroll 0% 0% rgb(255, 255, 255); color: rgb(118, 138, 153);height:30px">
                <td width="80px"><span class="mr5">6</td>
                <td width="80px">萝莉{1</td>
                <td width="130px">airfey@126.com</td>
                <td width="120px">emale</td>
                <td >研发部1</td>
            </tr>
            <tr style="background: none repeat scroll 0% 0% rgb(255, 255, 255); color: rgb(118, 138, 153);height:30px">
                <td width="80px"><span class="mr5">7</td>
                <td width="80px">萝莉</td>
                <td width="130px">airfey@126.com</td>
                <td width="120px">male</td>
                <td >研发部1</td>
            </tr>
            <tr style="background: none repeat scroll 0% 0% rgb(255, 255, 255); color: rgb(118, 138, 153);height:30px">
                <td width="80px"><span class="mr5">8</td>
                <td width="80px">老李</td>
                <td width="130px">airfey@126.com</td>
                <td width="120px">male</td>
                <td >研发部3</td>
            </tr>
        </tbody>
    </table>
    </div>	 <span class="pre-page disabled">上一页</span> <a class="page-p on">1</a> <span class="next-page disabled">下一页</span>  <span class="ml10">&nbsp;共1页&nbsp;</span> 跳转至第<input type='text' value='1'id='jumpPageBox' size='2' style='width:24px;height:20px;' onblur='checkCurrentPage(document.getElementById("jumpPageBox").value,1)'/>页 <input class='jump' style='cursor:pointer;'  type='button'  value='&nbsp;跳转&nbsp;' onclick='document.getElementById("pages").value=document.getElementById("jumpPageBox").value;window.location.href="index.do?page="+document.getElementById("jumpPageBox").value;'/><input type='hidden' value='1' name='currentPage' id='pages' />
 
 
