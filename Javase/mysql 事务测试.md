## 							mysql 事务测试

1、打开mysql的命令行，将自动提交事务给关闭

```sql
--查看是否是否是自动提交 1表示开启，0表示关闭
select @@autocommit;
--设置关闭
set autocommit = 0;

```

2、数据准备

```sql
--创建数据库
create database tran;
--切换数据库 两个仓库都执行
use tran
--准备数据
create table psn(id int primary key,name varchar(10))engine = innodb;
--插入数据
 insert into psn values(1,'zhangsan');
 insert into psn values(2,'lisi');
 insert into psn values(3,'wangwu');
 commit；

```

3、测试事务

```sql
--事务包含四个隔离级别，从上往下，隔离级别越来越高，意味着数据越来越安全
read uncommitted;	-- 读未提交
read commited;	  	-- 读已提交
repeatable read;	-- 可重复读
(searible)			-- 序列化，串行执行
--产生数据不一致情况
脏读
不可重复读
幻读
```

| 隔离级别 | 异常情况 | 异常情况   | 异常情况 |
| :------: | :------: | ---------- | -------- |
| 读未提交 |   脏读   | 不可重复读 | 幻读     |
| 读已提交 |          | 不可重复读 | 幻读     |
| 可重复读 |          |            | 幻读     |
|  序列化  |          |            |          |

4、测试1 脏读 read uncommitted

```sql
set session transaction isolation level read uncommitted;
A:start transaction
A:select * from psn;
B:start transaction
B:select * from psn;
A:update psn set name = 'msb';
A:select * from psn;
B:select * from psn;	--读取的结果是msb，产生了脏读，因为A事务并没有commit，读取到了不存在的数据
A:commit;
B:select * from psn;	--读取的数据是msb，因为A事务已经commit,数据永久的被修改
```

5、测试2：当使用read committed的时候，就不会出现脏读的情况了

```sql
幻读是在插入和删除数据的时候产生的

不可重复读是在读数据的时候产生的

总结：

​	现在学习的是数据库级别的事务，需要掌握的就是事务的隔离级别和产生的数据不一致的情况

后续会学习声明式事务及事务的传播特性以及分布式事务
```

