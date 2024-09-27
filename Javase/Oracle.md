# Oracle 

## -- 99语法

/*

cross join

natural join 

using 字句

on字句

left outer join

right outer join 

full outer join 

Inner outer join

*/

```sql
##### crossjoin 等同于92语法中的笛卡尔积

select * from emp cross join dept;

-- natural join 相当于是等值了连接， 不需要写连接条件，会从两张表中找到相同的列做连接

-- 当两张表 不具有相同的列名的时候，会进行笛卡尔积

select * from emp e natural join dept d;

select * from emp e natural join salgrade sg;

--on字句 添加连接条件 可以添加任意的等值条件

select * from emp e join dept d on e.deptno = d.deptno;

--相当于92语法中的非等值连接

select * from emp e join salgrade sa on e.sal between sa.losal and sa.hisal; 

--left outer join  会把左表中的全部数据正常显示，右表没有对应的数据直接显示空即可

select * from emp e left outer join dept d on e.deptno = d.deptno;

select * from emp e,dept d where e.deptno = d.deptno(+);

--right outer join 会把左表中的全部数据正常显示，左表没有对应的数据直接显示空即可

select * from emp e right outer join dept d on e.deptno = d.deptno;

select * from emp e,dept d where e.deptno(+) = d.deptno;

-- full outer join   左外连接和右外连接的合集  不去重  

select * from emp e full outer join dept d on e.deptno = d.deptno;

-- inner join  做了个等值连接

select * from emp e inner join dept d on e.deptno = d.deptno;

select * from emp e join dept d  on e.deptno = d.deptno;

--using 出了可以使用on 表示连接条件之外 也可以使用 using作为连接条件

-- 此时连接条件的列再也不归属于任意一张表

select  from emp e join dept d using(deptno);

select * from emp e join dept d on  e.deptno = d.deptno;

--两种 语法的sql语句没有任何限制 可以任意使用  建议99 

-- 检索雇员名字、所在单位、薪水等级：

select e.ename, d.dname, s.grade

  from emp e

  join dept d

​    on e.deptno = d.deptno

  join salgrade s

​    on e.sal between s.losal and s.hisal;

/*把子查询当做一张表来看待，外层的语句可以把内嵌的子查询返回的结果当成一张表使用 

将子查询放在比较运算符的右边（增强可读性）

*/

--查询那些人的薪水是在整个雇员的平均薪水之上

--1 求平均薪水

--2 把所有人的薪水与平均薪水比较

select avg(sal)from emp 

select * from emp e where e.sal> (select avg(sal)from emp);

--查询雇员中有哪些人是经理人

--1 查询那些人是经理人

distinct 去重

select distinct e.mgr from  emp e;

--2 在雇员表中过滤这些编号

select * from emp e where e.empno in(select distinct e.mgr from  emp e);

--找出部门标号为20的所有员工中收入最高的职员

1 找出标号为20的所有员工的收入

select sal from emp where deptno = 20;

select * from emp where sal>=all(select sal from emp where deptno = 20)and deptno = 20;

--求每个部门平均薪水的等级 

--1 求每个部门平均薪水 

select deptno,avg(sal) from emp group by deptno; 

--2 跟薪水等级表做关联，求出 平均薪水的等级 

select t.deptno, s.grade

  from salgrade s

  join (select deptno, avg(sal) vsal from emp group by deptno) t

​    on t.vsal between s.losal and s.hisal;
```



```sql
练习：

   --1.求平均薪水最高的部门编号  

​     1.求部门的平均薪水 

​     select e.deptno,avg(e.sal) from emp e group by deptno ;  

​     2.求平均薪水的最高部门

​     select max(t.vasl) from (select e.deptno,avg(e.sal) vasl from emp e group by deptno) t;

​     select e.sal from emp where 

​     3.求部门编号

​     

​     select t.deptno

​       from (select e.deptno, avg(e.sal) vasl from emp e group by deptno) t

​      where t.vasl = (select max(t.vasl)

​                        from (select e.deptno, avg(e.sal) vasl

​                                from emp e

​                               group by deptno) t)

   --2.求部门平均薪水的等级 

​     1 求每个部门的平均薪水

​     select deptno,avg(sal) from emp group by deptno; 

​     

​     select t1.deptno, s.grade

​       from salgrade s

​       join (select deptno, avg(sal) vas from emp group by deptno) t1

​         on t1.vas between s.losal and s.hisal;

​    

   

   --3.求部门平均的薪水等级

​      1 求部门每个人的薪水等级 

​      select e.deptno,sg.grade from emp e join salgrade sg on e.sal between sg.losal and sg.hisal;

​      2 按照部门求平均等级

​      select t.deptno ,avg(t.grade) from ( select e.deptno,sg.grade from emp e join salgrade sg on e.sal between sg.losal and sg.hisal)t group by deptno;

--限制输出 limit mysql中用来做限制输出  oracle 不支持 

--在 oracle 中，如果需要使用限制输出和分页 必须使用rownum,但是不能直接使用 rownum 需要嵌套使用 

   --4.求薪水最高的前5名雇员   

select * from (select * from emp order by sal desc)t1 where rownum<=5;

   --5.求薪水最高的第6到第10名雇员 

   

select t1.*, rownum

  from (select * from emp e order by e.sal desc) t1

 where rownum <= 10;

--使用rownum的时候必须在外层添加嵌套， 才能将rownum作为其中的一个列，然后再进行限制输出

select *

  from (select t1.*, rownum rn

​          from (select * from emp e order by e.sal desc) t1

​         where rownum <= 10) t

 where t.rn > 5

   and t.rn <= 10;

   

​    

   select *

​     from (select t1.*, rownum rn

​             from (select * from emp e order by e.sal desc) t1) t

​    where t.rn > 5

​      and t.rn <= 10;
```

